/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;
import Main.Produto;
/**
 *
 * @author Luiz
 */
public class ProdutoDelegate {

    public ProdutoDelegate() {
    }
    
    public void insert(Produto produto) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.insert(produto);
    }
     public void update(Produto produto) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.update(produto);
    }
     public void delete(Produto produto) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.delete(produto);
    }
      public List list() throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        return produtoBS.list();
    }
}
