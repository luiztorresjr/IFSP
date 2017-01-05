/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author a132067x
 */

class ConnectionFactory {
    public static Connection getFirebirdConnection() {
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/Loja","postgres","salvador");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco de dados");
        }
        return connection;
    }
}

