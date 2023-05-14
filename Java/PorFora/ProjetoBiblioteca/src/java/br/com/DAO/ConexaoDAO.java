
package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conexaoBD() throws ClassNotFoundException{
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sistemabiblioteca?user=root&password=19122009";
            con = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
}
