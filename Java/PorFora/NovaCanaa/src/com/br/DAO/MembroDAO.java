
package com.br.DAO;

import com.br.DTO.MembroDTO;
import java.sql.Connection;
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
    ArrayList<MembroDTO> lista_mes = new ArrayList<>();
    
    public void cadastrarMembro(MembroDTO objMembroDTO) throws ClassNotFoundException {
        
        String sql = "insert into membro (id_membro, cpf_membro, nome_membro, numeroEnd_membro, pai_membro, mae_membro, nascimento_membro, idade_membro, estadoCivil_membro, nacionalidade_membro, natural_membro, uf_membro, endereco_membro, bairro_membro, cep_membro, celular_membro, email_membro, conjugue_membro) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objMembroDTO.getId_membro());
            pstm.setString(2, objMembroDTO.getCpf_membro());
            pstm.setString(3, objMembroDTO.getNome_membro());
            pstm.setString(4, objMembroDTO.getNumeroEnd_membro());
            pstm.setString(5, objMembroDTO.getPai_membro());
            pstm.setString(6, objMembroDTO.getMae_membro());
            pstm.setString(7, objMembroDTO.getNascimento_membro());
            pstm.setString(8, objMembroDTO.getIdade_membro());
            pstm.setString(9, objMembroDTO.getEstadoCivil_membro());
            pstm.setString(10, objMembroDTO.getNacionalidade_membro());
            pstm.setString(11, objMembroDTO.getNatural_membro());
            pstm.setString(12, objMembroDTO.getUf_membro());
            pstm.setString(13, objMembroDTO.getEndereco_membro());
            pstm.setString(14, objMembroDTO.getBairro_membro());
            pstm.setString(15, objMembroDTO.getCep_membro());
            pstm.setString(16, objMembroDTO.getCelular_membro());
            pstm.setString(17, objMembroDTO.getEmail_membro());
            pstm.setString(18, objMembroDTO.getConjugue_membro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Membro " + e);
            
        }
    }
    
    public void AlterarMembro(MembroDTO objMembroDTO) throws ClassNotFoundException {
        
        String sql = "update membro set cpf_membro = ?, nome_membro = ?, numeroEnd_membro = ?, pai_membro = ?, mae_membro = ?, nascimento_membro = ?, idade_membro = ?, estadoCivil_membro = ?, nacionalidade_membro = ?, natural_membro = ?, uf_membro = ?, endereco_membro = ?, bairro_membro = ?, cep_membro = ?, celular_membro = ?, email_membro = ?, conjugue_membro = ? where id_membro = ?";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objMembroDTO.getCpf_membro());
            pstm.setString(2, objMembroDTO.getNome_membro());
            pstm.setString(3, objMembroDTO.getNumeroEnd_membro());
            pstm.setString(4, objMembroDTO.getPai_membro());
            pstm.setString(5, objMembroDTO.getMae_membro());
            pstm.setString(6, objMembroDTO.getNascimento_membro());
            pstm.setString(7, objMembroDTO.getIdade_membro());
            pstm.setString(8, objMembroDTO.getEstadoCivil_membro());
            pstm.setString(9, objMembroDTO.getNacionalidade_membro());
            pstm.setString(10, objMembroDTO.getNatural_membro());
            pstm.setString(11, objMembroDTO.getUf_membro());
            pstm.setString(12, objMembroDTO.getEndereco_membro());
            pstm.setString(13, objMembroDTO.getBairro_membro());
            pstm.setString(14, objMembroDTO.getCep_membro());
            pstm.setString(15, objMembroDTO.getCelular_membro());
            pstm.setString(16, objMembroDTO.getEmail_membro());
            pstm.setString(17, objMembroDTO.getConjugue_membro());
            pstm.setInt(18, objMembroDTO.getId_membro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar Membro " + e);
            
        }
    }
    
    public ArrayList<MembroDTO> pesquisarMembro() throws ClassNotFoundException {
        String sql = "select * from membro";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                MembroDTO objMembroDTO = new MembroDTO();
                objMembroDTO.setId_membro(rs.getInt("id_membro"));
                objMembroDTO.setCpf_membro(rs.getString("cpf_membro"));
                objMembroDTO.setNome_membro(rs.getString("nome_membro"));
                objMembroDTO.setPai_membro(rs.getString("pai_membro"));
                objMembroDTO.setMae_membro(rs.getString("mae_membro"));
                objMembroDTO.setNascimento_membro(rs.getString("nascimento_membro"));
                objMembroDTO.setIdade_membro(rs.getString("idade_membro"));
                objMembroDTO.setBairro_membro(rs.getString("bairro_membro"));
                objMembroDTO.setCelular_membro(rs.getString("celular_membro"));
                objMembroDTO.setCep_membro(rs.getString("cep_membro"));
                objMembroDTO.setConjugue_membro(rs.getString("conjugue_membro"));
                objMembroDTO.setEmail_membro(rs.getString("email_membro"));
                objMembroDTO.setEndereco_membro(rs.getString("endereco_membro"));
                objMembroDTO.setEstadoCivil_membro(rs.getString("estadoCivil_membro"));
                objMembroDTO.setNacionalidade_membro(rs.getString("nacionalidade_membro"));
                objMembroDTO.setNatural_membro(rs.getString("natural_membro"));
                objMembroDTO.setNumeroEnd_membro(rs.getString("numeroEnd_membro"));
                objMembroDTO.setUf_membro(rs.getString("uf_membro"));
                
                lista_membro.add(objMembroDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Litar Membros " + e);
            
        }
        
        return lista_membro;
    }
    
    public void ExcluirMembro(MembroDTO objMembroDTO) throws ClassNotFoundException{
        String sql = "delete from membro where id_membro = ?";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objMembroDTO.getId_membro());
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Membro" + e);
        }
    }
    
        public ArrayList<MembroDTO> MesAniversarioMembro() throws ClassNotFoundException {
        String sql = "SELECT day(nascimento_membro), nome_membro, idade_membro, month(nascimento_membro) FROM `nova_canaa`.`membro` where nascimento_membro in (select nascimento_membro from nova_canaa.membro where month(nascimento_membro) = month(now())) order by day(nascimento_membro) asc";
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                MembroDTO objMembroDTO = new MembroDTO();
                objMembroDTO.setNascimento_membro(rs.getString("day(nascimento_membro)"));
                objMembroDTO.setNome_membro(rs.getString("nome_membro"));
                objMembroDTO.setIdade_membro(rs.getString("idade_membro"));
                
                lista_mes.add(objMembroDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar Aniversariantes " + e);
            
        }
        
        return lista_mes;
    }
}
