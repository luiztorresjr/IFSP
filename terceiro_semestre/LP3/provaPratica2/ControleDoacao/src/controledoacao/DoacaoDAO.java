package controledoacao;

/**
 *
 * @author a132067x
 */
 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoacaoDAO {
    
    public void insert(Doacao doacao) throws Exception{
        Connection con = ConnectionFactory.getFirebirdConnection();
        PreparedStatement psmt = null;
        try{
            StringBuffer sql = new StringBuffer();
            sql.append("insert into doacao (nome_doador, telefone_doador, valor)");
            sql.append("values (?,?,?)");
            psmt=con.prepareStatement(sql.toString());
            psmt.setString(1, doacao.getNomeDoador());
            psmt.setString(2, doacao.getTelefone());
            psmt.setDouble(3, doacao.getValor());           
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
       String sql = "select * from doacao";
        ArrayList aDoacao = new ArrayList();
        try{
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();
            Doacao doacao = null;
            while(rs.next()){
                doacao = new Doacao();                
                doacao.setNomeDoador(rs.getString("nome_doador"));
                doacao.setTelefone(rs.getString("telefone_doador"));
                doacao.setValor(rs.getDouble("valor"));
                aDoacao.add(doacao);
            }
        }finally{
            psmt.close();
            rs.close();
            con.close();
        }
        return aDoacao;
    }        
}
