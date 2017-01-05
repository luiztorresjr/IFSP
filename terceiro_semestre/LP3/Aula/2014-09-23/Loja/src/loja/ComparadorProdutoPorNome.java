/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loja;

import java.util.Comparator;

public class ComparadorProdutoPorNome implements Comparator{
    public int compare(Object ob1 , Object ob2){
        Produto  objeto1 =(Produto)ob1;
        Produto  objeto2 =(Produto)ob2;
        
        
        /*String nomeProduto1 = objeto1.getNomeProduto();
        String nomeProduto2 = objeto2.getNomeProduto();
        return nomeProduto1.compareTo(nomeProduto1);
        
        OU da para fazer assim*/
        
        return objeto1.getNome().compareTo(objeto2.getNome());
    }
    
}
