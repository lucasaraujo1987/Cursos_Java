package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();

    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException {

        String sql = "insert into livro(nome_livro) values (?)";
        con = new ConexaoDAO().conexaoBD();

        try {

            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar" + e);

        }

    }

    public ArrayList<LivroDTO> PesquisarLivro() throws ClassNotFoundException {
        
        String sql = "select * from livro";
        con = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            
            while (rs.next()){
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setId_livro(rs.getInt("id_livro"));
                objLivroDTO.setNome_livro(rs.getString("nome_livro"));
                
                lista.add(objLivroDTO);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erroa ao Pesquisar" + e);
        }
        
        return lista;
    }

}
