package acessoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoBD {

    private Connection con;
    private Statement stm;

    public AcessoBD() {
        con = null;
        stm = null;
    }

    public void conecta() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dw2_i6? user=root&password=");
            System.out.println("AcessoBD> Conexão bem sucedida!!");
            stm = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Excessão: " + e.toString());
        }
    }

    public void executa(String sql) {
        try {
            stm.executeUpdate(sql);
            // int res = stm.executeUpdate(sql);
            // System.out.println("AcessoBD> Resultado da execução: " + res);
        } catch (SQLException e) {
            System.err.println("Excessão: " + e.toString());
        }
    }

    public ResultSet consulta(String sql) {
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Excessão: " + e.toString());
        }
        return rs;
    }

    public void desconecta() {
        try {
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Excessão: " + e.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("AcessoBD> Teste de conexão JDBC...");
        AcessoBD acessoBD = new AcessoBD();
        acessoBD.conecta();
        String sql;
        sql = "insert into cliente values(null,'Lucas Silva','Rua Brasil, 256','8978','989','lucas@gmail.com')";
        acessoBD.executa(sql);
        sql = "select * from cliente";
        ResultSet rs = acessoBD.consulta(sql);
        String codigo, nome, endereco;
        try {
            while (rs.next()) {
                codigo = rs.getString("clienteID");
                nome = rs.getString("nome");
                endereco = rs.getString("endereco");
                System.out.println("Codigo: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Endereco: " + endereco);
                System.out.println("");
            }
        } catch (SQLException e) {
            System.err.println("Excessão: " + e.toString());
        }
    }
}
