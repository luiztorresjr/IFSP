/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import loja.ProdutoBS;
import loja.Produto;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class ProdutoDelegate {

    public ProdutoDelegate() {
    }
    
    public void insert(Produto produtoDTO) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.insert(produtoDTO);
    }
     public void update(Produto produtoDTO) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.update(produtoDTO);
    }
     public void delete(Produto produtoDTO) throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        produtoBS.delete(produtoDTO);
    }
      public List list() throws Exception{
        ProdutoBS produtoBS = new ProdutoBS();
        return produtoBS.list();
    }
}
