/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11l08l2014;

import java.util.Iterator;

/**
 *
 * @author a132067x
 */
public class Loja_j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Prateleira p1 = new Prateleira();
        CadastroProduto c = new CadastroProduto(); 
        Produto produto = new Produto();
        for(int i = 0; i<=2; i++){
        produto = c.Cadastro();
        p1.add(produto);
        }        
        
        Iterator i = p1.iterator();
        while(i.hasNext()){
        produto = (Produto) i.next();        
        VerProduto vp= new VerProduto();     
        vp.mostra(produto);
        }
    }    
}
