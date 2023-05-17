package com.br.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conexaoBD() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://nova_canaa?user=root&password=";
            con = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar" + e);

        }
        return con;
    }

}
