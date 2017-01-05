/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luiz
 */

//essa classe faz a interação entre os comando sql, pede a conexão e pede qual o comando será usado
public class ProdutoDAO {
    
    public void insert(Produto produto) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("insert into produto (codigo, nome, descricao, preco)");
            sql.append("values (?,?,?,?)");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produto.getCodigo());
            psmt.setString(2, produto.getNome());
            psmt.setString(3, produto.getDescricao());
            psmt.setFloat(4, produto.getPreco());
            psmt.execute();
        }finally{
            psmt.close();
            con.close();
        }        
    }
    public void update(Produto produto) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("update produto(codigo, nome, descricao, preco)");
            sql.append("values(?,?,?,?) where codigo = ?");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produto.getCodigo());
            psmt.setString(2, produto.getNome());
            psmt.setString(3, produto.getDescricao());
            psmt.setFloat(4, produto.getPreco());
            psmt.setInt(5, produto.getCodigo());
            psmt.execute();
        }finally{
            psmt.close();
            con.close();
        }        
    }
    public void delete(Produto produto) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("delete from produto where codigo = ?");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produto.getCodigo());
            psmt.execute();
        }finally{
            psmt.close();
            con.close();
        }   
    }
    
    public List list() throws Exception{
       Connection con = ConnectionFactory.getFirebirdConnection();
       ResultSet rs = null;
       PreparedStatement psmt = null;
       String sql = "select * from produto";
        ArrayList ArrayPro = new ArrayList();
        try{
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();
            Produto produto = null;
            while(rs.next()){
                produto = new Produto();
                produto.setCodigo(rs.getInt("Codigo"));
                produto.setNome(rs.getString("Nome"));
                produto.setDescricao(rs.getString("Descricao"));
                produto.setPreco(rs.getFloat("Preco"));
                ArrayPro.add(produto);
            }
        }finally{
            psmt.close();
            rs.close();
            con.close();
        }
        return ArrayPro;
    }    
    
}
