/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author a132067x
 */
public class LocalizadorProduto {
    
    //instacia o arraylist
    Prateleira prat;
    
    public LocalizadorProduto(){ 
        
    }  
     public void localizarExibirProdutoCodigo(Prateleira prat){
         
        //instacia um auxiliar para a busca
        Produto mockup = new Produto();
        
        //pede o codigo para porcuara
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser procurado" ));
        
        
        //ordena a prateleira
        Collections.sort(prat.getPrateleira());
        //seta o valor do codigo no auxiliar
        mockup.setCodigo(Codigo);
        
        //faz uma busca binaria no arraylist usando o auxiliar como parametro
        int resultado = Collections.binarySearch(prat.getPrateleira() ,mockup);
        
        //caso não encontre um
        if(resultado<0)            
            //exibe essa mensagem
              JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   nao encontrado");
        //caso encontre
        else {
            //mostrar o produto encontrado
            VisualizarProduto vp = new VisualizarProduto();
            vp.ver((Produto) prat.get(resultado));
        }
    }
    //metodo para localizar e remover o produto 
    public void localizarEremoverProdutoCodigo(Prateleira prat){
        //instacia um auxiliar para procura
        Produto mockup = new Produto();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser removido" ));
        mockup.setCodigo(Codigo);   
        
        //informa que caso encontre o produto remova o da arraylist
        boolean resultado = prat.getPrateleira().remove(mockup);
        if(resultado){
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   Removido");
        }
        else {
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   não encontrado");
        }
    }
}
