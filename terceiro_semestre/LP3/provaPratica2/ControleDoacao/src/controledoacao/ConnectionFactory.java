package controledoacao;

/**
 *
 * @author a132067x
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    public static Connection getFirebirdConnection() {
        Connection connection = null;
        try{
            String url = "jdbc:postgresql://localhost:5432/entidade";  
            String usuario = "postgres";  
            String senha = "salvador";  
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com o banco de dados");
        }
        return connection;
    }
}
