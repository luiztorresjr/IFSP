package loja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import loja.Produto;
import java.util.List;

/**
 *
 * @author Luiz
 */
public class ProdutoBS {
    public ProdutoBS(){

}
public void insert(Produto produtoDTO) throws Exception{
    if(produtoDTO.getCodigo() <0){
        throw new Exception("Por favor digite o codigo do produto");
    }
    if(produtoDTO.getNome() == null || produtoDTO.getNome().equals("")){
        throw new Exception("Por favor digite o nome do produto");
    }
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.insert(produtoDTO);
}

public void update(Produto produtoDTO) throws Exception{
      if(produtoDTO.getCodigo() <0){
        throw new Exception("Por favor digite o codigo do produto");
    }
    if(produtoDTO.getNome() == null || produtoDTO.getNome().equals("")){
        throw new Exception("Por favor digite o nome do produto");
    }
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.update(produtoDTO);
}
public void delete(Produto produtoDTO) throws Exception{
    if(produtoDTO.getCodigo() < 0){
        throw new Exception("Por favor digite o codigo do produto");
    }    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    produtoDAO.delete(produtoDTO);
    }
public List list() throws Exception{
    ProdutoDAO produtoDAO = new ProdutoDAO();
    return produtoDAO.list();
    }
}
