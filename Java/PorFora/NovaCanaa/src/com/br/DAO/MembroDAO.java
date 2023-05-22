
package com.br.DAO;

import com.br.DTO.MembroDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MembroDAO {
    
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<MembroDTO> lista_membro = new ArrayList<>();
    
    public void cadastrarMembro(MembroDTO objMembroDTO) throws ClassNotFoundException{
        
        String sql = "insert into membro (cpf_membro, nome_membro, sobrenome_membro, pai_membro, mae_membro, nascimento_membro, batismo_membro, id_membro) values (?,?,?,?,?,?,?,?)";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objMembroDTO.getCpf_membro());
            pstm.setString(2, objMembroDTO.getNome_membro());
            pstm.setString(3, objMembroDTO.getSobrenome_membro());
            pstm.setString(4, objMembroDTO.getPai_membro());
            pstm.setString(5, objMembroDTO.getMae_membro());
            pstm.setDate(6, (Date) objMembroDTO.getNascimento_membro());
            pstm.setDate(7, (Date) objMembroDTO.getBatismo_membro());
            pstm.setInt(8, objMembroDTO.getId_membro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Membro " + e);
            
        }
    }
    
    public ArrayList<MembroDTO> pesquisarMembro() throws ClassNotFoundException{
        String sql = "select * from membro";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                MembroDTO objMembroDTO = new MembroDTO();
                objMembroDTO.setCpf_membro(rs.getString("cpf_membro"));
                objMembroDTO.setNome_membro(rs.getString("nome_membro"));
                objMembroDTO.setSobrenome_membro(rs.getString("sobrenome_membro"));
                objMembroDTO.setPai_membro(rs.getString("pai_membro"));
                objMembroDTO.setMae_membro(rs.getString("mae_membro"));
                objMembroDTO.setNascimento_membro(rs.getDate("nascimento_membro"));
                objMembroDTO.setBatismo_membro(rs.getDate("batismo_membro"));
                
                lista_membro.add(objMembroDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Litar Membros " + e);
            
        }
        
        return lista_membro;
    }
    
}
