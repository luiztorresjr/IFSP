/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provalp3;

import java.util.Comparator;

/**
 *
 * @author a132067x
 */
public class CompararPorTitulo implements Comparator{
    public int compare(Object ob1 , Object ob2){
        Livro  objeto1 =(Livro)ob1;
        Livro  objeto2 =(Livro)ob2;
        
        
        /*String nomeProduto1 = objeto1.getNomeProduto();
        String nomeProduto2 = objeto2.getNomeProduto();
        return nomeProduto1.compareTo(nomeProduto1);
        
        OU da para fazer assim*/
        
        return objeto1.getTitulo().compareTo(objeto2.getTitulo());
    }
    
}
