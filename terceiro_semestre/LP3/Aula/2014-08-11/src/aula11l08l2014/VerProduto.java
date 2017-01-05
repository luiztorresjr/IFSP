/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11l08l2014;

import javax.swing.JOptionPane;

/**
 *
 * @author a132067x
 */
public class VerProduto {
    Produto p = new Produto();    
    public VerProduto(){
    
    }
    public void mostra(Produto p){        
        JOptionPane.showMessageDialog(null, "Codigo: "+p.getCod()+"\nNome: "+p.getNome()+"\nPreço: R$ "+p.getPreco()+"\nDescrição: "+p.getDescricao());
    }
}
