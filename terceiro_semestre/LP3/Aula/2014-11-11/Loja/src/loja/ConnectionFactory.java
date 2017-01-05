/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
class ConnectionFactory {
    public static Connection getFirebirdConnection(){
      Connection connection = null;
      try{
        String url = "jdbc:postgresql://localhost/loja";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","salvador");
        //props.setProperty("ssl","true");
        Connection conn = DriverManager.getConnection(url, props);
        Class.forName("org.postgresql.Driver");            
      }catch(SQLException | ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, "Não foi possivel"+"conectar com o banco de dados");
      }
      return connection;
    }
}
