/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaandre;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

// Error reading included file Templates/Classes/Templates/Licenses/license-gpl30_1.txt


/**
 *
 * @author a1320726
 */


public class ConnectionFactory {

    static Connection getFirebirdConnection() {
        
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chat","postgres","");
        }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Não foi possivel conectar com o banco de dados");
        }
        return connection;
    }
    
}
