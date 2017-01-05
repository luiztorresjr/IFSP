
package Backup;

//import java.util.Iterator;

import loja.*;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;


public class Loja {
    
    public static void main(String[] args) {
        /*int op=0;
        /*
        Produto produto;               
        VisualizarPrateleira verPorCodigo = new VisualizarPrateleiraCodigo();
        VisualizarPrateleira  verPrateleira = new VisualizarPrateleira();
        VisualizarPrateleiraCodigo localizar = new VisualizarPrateleiraCodigo();
        Prateleira prateleira = new Prateleira();        
        Cadastro novoprod = new Cadastro(); 
        VisualizarProduto verProduto = new VisualizarProduto();
        
        Produto Prod1 = new Produto();
        Prod1.setCodigo(2);
        Prod1.setNome("Lapis");
        Prod1.setDescricao("Lapis Preto");
        Prod1.setPreco((float) 1.50);
        prateleira.add(Prod1);
        
        Produto Prod2 = new Produto();
        Prod2.setCodigo(1);
        Prod2.setNome("Apontador");
        Prod2.setDescricao("Apontador de Lapis");
        Prod2.setPreco((float) 5.50);
        prateleira.add(Prod2); 
        
        Produto Prod3 = new Produto();
        Prod3.setCodigo(5);
        Prod3.setNome("Borracha");
        Prod3.setDescricao("Redonda e branca");
        Prod3.setPreco((float) 0.50);
        prateleira.add(Prod3); 
        
        Produto Prod4 = new Produto();
        Prod4.setCodigo(4);
        Prod4.setNome("Caneta");
        Prod4.setDescricao("Cor rosa");
        Prod4.setPreco((float) 2.00);
        prateleira.add(Prod4); 
        
        
        Produto Prod5 = new Produto();
        Prod5.setCodigo(3);
        Prod5.setNome("Corretivo");
        Prod5.setDescricao("Branco");
        Prod5.setPreco((float) 2.60);
        prateleira.add(Prod5); 
        
        
        do{
            String mensagem="Entre com opção\n1-Criar um novo Produto\n2-Vizualizar a Estante\n3-Vizualizar em Ordem\n4-Vizualizar em ordem alfabetica"
                    +"\n5-Vizualizar prateleira por preço\n6-O produto mais barato\n7-O Produto mais caro\n10-Sair";
            op=Integer.parseInt(JOptionPane.showInputDialog(mensagem));
        switch(op){
            case 1:
                for(int i=0; i<3 ;i++){
                produto = novoprod.cadastrar();
                prateleira.add(produto);
                }
                break;
            case 2:
                verPrateleira.mostrarProdutos(prateleira);
                break;
            case 3:
                verPorCodigo.mostrarProdutos(prateleira);
                break;
            case 4:
                break;
            localizar.mostrarProdutos(prateleira);
            localizar.mostrarProdutos(prateleira);
            case 10:
                String info ="Saindo...";
                JOptionPane.showMessageDialog(null, info);
                break;
            default:
                String invalida ="Opção Invalida.";
                JOptionPane.showMessageDialog(null, invalida);
                break;
        /*Comparator comparador = new ComparadorProdutoPorPreco();
        produto = (Produto) Collections.max(prateleira,comparador);
        
        verproduto.ver(produto);
        
        
        Comparator comparar = new ComparadorProdutoPorNome();
        produto = (Produto) Collections.min(prateleira,comparar);
        verproduto.ver(produto);*/
        
        /*
        //verprateleira.exibirProdutosPrateleiraEmbaralhar(prateleira);
        verPrateleira.exibirProdutosPrateleiraEmbaralhar(prateleira);
        
        
        
        
        
        
        
        
        /*for(int i=0; i<3 ;i++){
            produto = novoprod.cadastrar();
            prateleira.add(produto);
        } */  
        
        /*
        VisualizarProduto visualiza = new VisualizarProduto();
           Iterator i = prateleira.iterator();
           while (i.hasNext()){
               produto = (Produto) i.next();
               visualiza.ver(produto);
           }
        */
        
        /*VisualizarPrateleira visualprat = new VisualizarPrateleiraCodigo();
        visualprat.mostrarProdutos(prateleira);
        
        visualprat.exibirProdutosPrateleiraPorNome(prateleira);
        
        visualprat.exibirProdutosPrateleiraPorPreco(prateleira);
        */
        /*
        }
        }while( op!=10 );     
    */
}
}
