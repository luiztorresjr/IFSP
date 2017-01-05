/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaandre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1320726
 */
public class MensagemDao {
      public void insert(Mensagem mensagem) throws Exception{
        
      //obtemos uma conexão através de uma fábrica de conexões
        Connection con =  ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;

        try{
            StringBuffer sql = new StringBuffer();
            sql.append("insert into mensagem (data, mensagem, nick)" );
            sql.append("values (?, ?, ?)");
            psmt = con.prepareStatement(sql.toString());
            psmt.setDate(1, mensagem.getDate());
            psmt.setString(2, mensagem.getMensagem());
            psmt.setString(3, mensagem.getNick());
            psmt.execute();
        }
        finally{
            psmt.close();
            con.close();
        }
        }
      
      
       public ArrayList SelectALL()throws Exception{
//obtemos uma conexão através de uma fábrica de conexões
        Connection con = ConnectionFactory.getFirebirdConnection();
        ResultSet rs = null;
        PreparedStatement psmt = null;
        String sql = "select * from Mensagem";
        ArrayList mensagens = new ArrayList(); 
        
        try{
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();
            Mensagem mensagem = null;
            while(rs.next()){
                mensagem = new Mensagem();
                mensagem.setDate(rs.getDate("Data"));
                mensagem.setNick(rs.getString("Nick"));
                mensagem.setMensagem(rs.getString("Mensagem"));
                mensagens.add(mensagem);
                
            }
       }finally{
            psmt.close();
            rs.close();
            con.close();
       }
       return mensagens;
      }
    
    
    
}
