
package com.br.DAO;

import com.br.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection con;
    
    public ResultSet loginUsuario(UsuarioDTO objUsuarioDTO) throws ClassNotFoundException{
        
        con = new ConexaoDAO().conexaoBD();
        
        try {
            String sql = "select * from login where usuario_login = ? and senha_login = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getUsuario_login());
            pstm.setInt(2, objUsuarioDTO.getSenha_login());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar " + e);
            return null;
        }
        
    }
    
}
