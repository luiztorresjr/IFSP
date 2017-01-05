package Main;

import javax.swing.JOptionPane;

public class VisualizarProduto {
    
    public void ver(Produto p ){     
        /*
        System.out.println("Nomedo produto:"+p.getNome());
        System.out.println("Descricaodo produto:"+p.getDescricao());
        System.out.println("Preco do produto:"+p.getPreco());
        System.out.println("Cod. do produto:"+p.getCodigo()); 
        */
        
       JOptionPane.showMessageDialog(null, "Nome :"+p.getNome()+"\n   Descricao:"+p.getDescricao() +  "\n  Produto:"+p.getPreco() +"\n  Cod. do produto:"+p.getCodigo());
}
}