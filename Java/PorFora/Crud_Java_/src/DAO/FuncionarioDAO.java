package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "insert into funcionario (name_funcionario, endereco_funcionario) values (?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionaioDAO" + erro);
        }
    }

}
