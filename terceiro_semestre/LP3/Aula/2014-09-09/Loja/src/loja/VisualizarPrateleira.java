
package loja;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class VisualizarPrateleira {
    public void mostrarProdutos (Prateleira prat) {
        
        // Verificar se a prateleira está vazia.
        if (prat.size()== 0){
            //Exibir mensagem Prat Vazia
        }
        else {
            
        String informacoes = new String();
        Produto produto;
        
        Iterator i = prat.iterator();
        informacoes = "Codigo  Nome               Preço  \n";
        //ietragir entre produtos da pateleira  / Percorrer a prateleira.
        while (i.hasNext()){
            produto = (Produto) i.next();
            
            //Adicionar as informaçoes em Informaçoes
            informacoes += produto.getCodigo() + "             " + produto.getNome() + "         " +  produto.getPreco() + '\n';
        }
        JOptionPane.showMessageDialog(null, informacoes);
        }
    }
        
        
   public void exibirProdutosPrateleiraPorNome (Prateleira prateleira){
       //verificar se a prateleira contém produtos
       if (prateleira.size()  == 0)
           JOptionPane.showMessageDialog(null, "Não há produto na prateleira");
       else{
           Produto p;   //declaracao de variavel
           String informacao = new String();
           informacao = "Codigo      Nome               Preço  \n";
           // Cria um comparador que compara por Nome
           Comparator comparador = new ComparadorProdutoPorNome();
           //Solicitar ao framework ordenar a colecao por nome
           Collections.sort(prateleira,comparador);
           Iterator<Produto> i = prateleira.iterator();
           // Visitar cada um dos produtos na prateleira
           while (i.hasNext()){
               //pega o proximo produto
               p = i.next();
               informacao += p.getCodigo() + "         "   + p.getNome() + "         " +  p.getPreco() + '\n';
            }
           //exibe os Dados do produto
           JOptionPane.showMessageDialog(null, informacao);
        }     
    }
   
    public void exibirProdutosPrateleiraPorPreco (Prateleira prat){
        if (prat.size() == 0)
            JOptionPane.showMessageDialog(null, "Não há produto na prateleira");
        else{
            Produto prod;
            String informacao = new String();
            informacao = "Codigo      Nome               Preço  \n";
        
            Comparator comparador = new ComparadorProdutoPorPreco();
            Collections.sort(prat,comparador);
            Iterator<Produto> i = prat.iterator();
            while (i.hasNext()){
                   prod =i.next();
                   informacao += prod.getCodigo() + "         "   + prod.getNome() + "         " +  prod.getPreco() + '\n';
            }
            JOptionPane.showMessageDialog(null, informacao);
        }
    }
    
    public void exibirProdutosPrateleiraMaxPreco (Prateleira prat){
        if (prat.size() == 0)
            JOptionPane.showMessageDialog(null, "Não há produto na prateleira");
        else{
            Produto prod;
            String informacao = new String();
            informacao = "Codigo      Nome               Preço  \n";
        
            Comparator comparador = new ComparadorProdutoPorPreco();
            Collections.sort(prat,comparador);
            Iterator<Produto> i = prat.iterator();
            while (i.hasNext()){
                   prod =i.next();
                   informacao += prod.getCodigo() + "         "   + prod.getNome() + "         " +  prod.getPreco() + '\n';
            }
            JOptionPane.showMessageDialog(null, informacao);
        }
    }
    
    public void exibirProdutosPrateleiraMinPreco (Prateleira prat){
        if (prat.size() == 0)
            JOptionPane.showMessageDialog(null, "Não há produto na prateleira");
        else{
            Produto prod;
            String informacao = new String();
            informacao = "Codigo      Nome               Preço  \n";
        
            Comparator comparador = new ComparadorProdutoPorNome();
            Collections.sort(prat,comparador);
            Iterator<Produto> i = prat.iterator();
            while (i.hasNext()){
                   prod =i.next();
                   informacao += prod.getCodigo() + "         "   + prod.getNome() + "         " +  prod.getPreco() + '\n';
            }
            JOptionPane.showMessageDialog(null, informacao);
        }
    }
    public void exibirProdutosPrateleiraEmbaralhar (Prateleira prat){
        if (prat.size() == 0)
            JOptionPane.showMessageDialog(null, "Não há produto na prateleira");
        else{
            Produto prod;
            String informacao = new String();
            informacao = "Codigo      Nome               Preço  \n";
        
            Collections.shuffle(prat);
            Iterator<Produto> i = prat.iterator();
            while (i.hasNext()){
                   prod =i.next();
                   informacao += prod.getCodigo() + "         "   + prod.getNome() + "         " +  prod.getPreco() + '\n';
            }
            JOptionPane.showMessageDialog(null, informacao);
        }
    }
    
    public void localizarExibirProdutoCodigo(Prateleira prat){
        Produto mockup = new Produto();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser procurado" ));
        Collections.sort(prat);
        mockup.setCodigo(Codigo);
        int resultado = Collections.binarySearch(prat ,mockup);
        
        if(resultado<0)
              JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   nao encontrado");
        else {
            VisualizarProduto vp = new VisualizarProduto();
            vp.ver((Produto) prat.get(resultado));
        }
    }
    
    public void localizarEremoverProdutoCodigo(Prateleira prat){
        Produto mockup = new Produto();
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Forneca o codigo do produto a ser removido" ));
        mockup.setCodigo(Codigo);
        boolean resultado = prat.remove(mockup);
        
        if(resultado)
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   Removido");
        else {
            JOptionPane.showMessageDialog(null, "Produto de codigo :" +Codigo+ "   não encontrado");
        }
    }  
   
}