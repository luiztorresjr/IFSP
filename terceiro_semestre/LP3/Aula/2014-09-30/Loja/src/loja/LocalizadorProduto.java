/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author a132067x
 */
public class LocalizadorProduto {
    
    public LocalizadorProduto(){
        
    }
    
     public void localizarExibirProdutoCodigo(Prateleira prat){
        Produto mockup = new Produto();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser procurado" ));
        Collections.sort(prat);
        mockup.setCodigo(Codigo);
        int resultado = Collections.binarySearch(prat ,mockup);
        
        if(resultado<0)
              JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   nao encontrado");
        else {
            VisualizarProduto vp = new VisualizarProduto();
            vp.ver((Produto) prat.get(resultado));
        }
    }
    
    public void localizarEremoverProdutoCodigo(Prateleira prat){
        Produto mockup = new Produto();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser removido" ));
        mockup.setCodigo(Codigo);
        boolean resultado = prat.remove(mockup);
        
        if(resultado)
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   Removido");
        else {
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   não encontrado");
        }
    }
}
