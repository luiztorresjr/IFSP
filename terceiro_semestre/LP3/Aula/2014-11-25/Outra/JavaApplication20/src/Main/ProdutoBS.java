/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;
/**
 *
 * @author Luiz
 */

//essa classe deve ter uma metodo para cada metodo do ProdutoDAO
//ela informa as excessões que devem ser tratadas quando for cadastrar um valor produto
public class ProdutoBS {
    public ProdutoBS(){

}
public void insert(Produto produto) throws Exception{
    if(produto.getCodigo() < 0){
        throw new Exception("Por favor digite o codigo do produto");
    }
    if(produto.getNome() == null || produto.getNome().equals("")){
        throw new Exception("Por favor digite o nome do produto");
    }
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.insert(produto);
}

public void update(Produto produto) throws Exception{
      if(produto.getCodigo()<0){
        throw new Exception("Por favor digite o codigo do produto");
    }
    if(produto.getNome() == null || produto.getNome().equals("")){
        throw new Exception("Por favor digite o nome do produto");
    }
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.update(produto);
}
public void delete(Produto produto) throws Exception{
    if(produto.getCodigo()<0){
        throw new Exception("Por favor digite o codigo do produto");
    }    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.delete(produto);
    }
public List list() throws Exception{
    ProdutoDAO produtoDAO = new ProdutoDAO();
    return produtoDAO.list();
    }
}
