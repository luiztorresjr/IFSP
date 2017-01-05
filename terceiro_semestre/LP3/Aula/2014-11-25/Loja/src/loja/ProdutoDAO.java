/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import loja.ConnectionFactory;
import loja.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luiz
 */
public class ProdutoDAO {
    
    public void insert(Produto produtoDTO) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("insert into produto(codigo, nome, descricao, preco)");
            sql.append("values(?,?,?,?)");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produtoDTO.getCodigo());
            psmt.setString(2, produtoDTO.getNome());
            psmt.setString(3, produtoDTO.getDescricao());
            psmt.setFloat(4, produtoDTO.getPreco());
            psmt.execute();
        }finally{
            psmt.close();
            con.close();
        }        
    }
    public void update(Produto produtoDTO) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("update from produto( codigo, nome, descricao, preco");
            sql.append("values(?,?,?,? where Codigo = ?");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produtoDTO.getCodigo());
            psmt.setString(2, produtoDTO.getNome());
            psmt.setString(3, produtoDTO.getDescricao());
            psmt.setFloat(4, produtoDTO.getPreco());
            psmt.setInt(5, produtoDTO.getCodigo());
            psmt.execute();
            
        }finally{
            
            psmt.close();
            con.close();
        }        
    }
    public void delete(Produto produtoDTO) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("delete from produto where Codigo = ?");
            psmt=con.prepareStatement(sql.toString());
            psmt.setInt(1, produtoDTO.getCodigo());
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
        ArrayList produto = new ArrayList();
        try{
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();
            Produto produtoDTO = null;
            while(rs.next()){
                produtoDTO = new Produto();
                produtoDTO.setCodigo(rs.getInt("codigo"));
                produtoDTO.setNome(rs.getString("nome"));
                produtoDTO.setDescricao(rs.getString("descricao"));
                produtoDTO.setPreco(rs.getFloat("preco"));
                produto.add(produtoDTO);
            }
        }finally{
            psmt.close();
            rs.close();
            con.close();
        }
        return produto;
    }    
}
