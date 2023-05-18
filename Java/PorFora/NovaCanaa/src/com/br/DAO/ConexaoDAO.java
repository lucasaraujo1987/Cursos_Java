package com.br.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conexaoBD() throws ClassNotFoundException {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/nova_canaa?user=root&password=";
            con = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar" + e);
 
        }
        return con;
    }

}
