/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaandre;

import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;
import java.util.Iterator;

/**
 *
 * @author a1320726
 */
public class Aulaandre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MensagemDao mensagemDao = new MensagemDao();
        Mensagem mensagem= new Mensagem();
        mensagem.setDate(Date.valueOf("2015-02-05"));
        mensagem.setNick("Maru");
        mensagem.setMensagem("ola");

        try{
            mensagemDao.insert(mensagem);
            ArrayList mensagens;
        
            mensagens= mensagemDao.SelectALL() ;
            Iterator iterator = mensagens.iterator();
            while(iterator.hasNext()) {
                Mensagem msg = (Mensagem) iterator.next();
                
                if(!msg.equals(mensagem)) {
                    JOptionPane.showMessageDialog(null, "deu ruim");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "deu ruim");
        }
        
        
   }
}
