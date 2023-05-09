package DAO;

import DTO.CargoDTO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    ArrayList<CargoDTO> listacargo = new ArrayList();

    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO) {
        String sql = "insert into funcionario (name_funcionario, endereco_funcionario, cod_cargo values (?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());
            pstm.setInt(3, objFuncionarioDTO.getCod_cargo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionaioDAO Cadastrar" + erro);
        }
    }

    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {
        String sql = "select * from funcionario";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                objfuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario"));
                objfuncionarioDTO.setNome_funcionario(rs.getString("name_funcionario"));
                objfuncionarioDTO.setEndereco_funcionario(rs.getString("endereco_funcionario"));

                lista.add(objfuncionarioDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar" + erro);
        }
        return lista;
    }

    public void AltrarFuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "update funcionario set name_funcionario = ?, endereco_funcionario = ? where id_funcionario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            pstm.setInt(3, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionaioDAO Alterar" + erro);
        }
    }

    public void ExcluirFuncionario(FuncionarioDTO objfuncionariodto) {
        String sql = "delete from funcionario where id_funcionario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionaioDAO Excluir" + erro);
        }
    }
    
    public ArrayList<CargoDTO> PesquisarFuncionarioCargo() {
        String sql = "select * from f.id_funcionario, f.name_funcionario, f.endereco_funcionario, f.cod_cargo";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                CargoDTO objcargoDTO = new CargoDTO();
                objcargoDTO.setDescricao_cargo(rs.getString("c.descricao_cargo"));
                listacargo.add(objcargoDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO PesquisarCargo" + erro);
        }
        return listacargo;
    }
    
    public ResultSet listarCargo(){
        conn = new ConexaoDAO().conectaBD();
        String sql = "select * from cargo order by descricao_cargo;";
        
        try {
            
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ListarCargo FuncionarioDAO" + erro.getMessage());
            return null;
        }
    }

}
