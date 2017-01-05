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
public class CadastroProduto {
     Produto p = new Produto();
    public CadastroProduto(){
        
    }
    public Produto Cadastro(){         
        p.setNome(JOptionPane.showInputDialog("Entre com o nome do produto: "));
        p.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preço do produto: ")));
        p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto: ")));  
        p.setDescricao(JOptionPane.showInputDialog("Descrição do produto: "));    
        
        return p;
    }
   

}
