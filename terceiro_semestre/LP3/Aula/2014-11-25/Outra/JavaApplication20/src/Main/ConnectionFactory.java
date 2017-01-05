/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class ConnectionFactory {
    
    //metodo para conectar ao banco
    public static Connection getFirebirdConnection() {
        
        //inicializa a Interface de connection
        Connection connection = null;
        try{
            
            //informa o tipo de banco jdbc:nomedosgbd://localhost:porta5432/nomedobancocriado
            String url = "jdbc:postgresql://localhost:5432/loja";  
            //usuario do banco
            String usuario = "postgres";  
            //senha do banco
            String senha = "";
            //informa o driver que vai usar
            Class.forName("org.postgresql.Driver");
            
            //informa os valores que o Driver ira receber
            connection = DriverManager.getConnection(url, usuario, senha);
        }
        //caso não consiga se conectar cai no catch
        catch(Exception e){
            e.printStackTrace();
            
            //exibe mensagem de erro
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco de dados");
        }
        return connection;
    }
}
