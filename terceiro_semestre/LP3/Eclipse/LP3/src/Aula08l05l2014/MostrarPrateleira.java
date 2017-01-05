package Aula08l05l2014;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class MostrarPrateleira {
	String mensagem = new String();
	
	public MostrarPrateleira() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public void Vizualizar(Prateleira prateleira){
		if(prateleira.size()== 0){
			mensagem = "N�o h� produto cadastrado";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		else {
			Produto produto;
			Iterator<Produto> i = prateleira.iterator();			
			mensagem = "Cod      Pre�o            Nome\n";	
			while(i.hasNext()){
				produto = i.next();
				mensagem +=   	+produto.getCod()+"          R$ " 
								+produto.getPreco()+"            "
								+produto.getNome()+"\n";
			}
		JOptionPane.showMessageDialog(null, mensagem);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void VizualizarOrdemNome(Prateleira prateleira){
		//Verifica se a prateleira possui itens atraves do if ... else prateleira.size
		if(prateleira.size()== 0){
			mensagem = "N�o h� produto cadastrado";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		else {
			Produto produto;
			
			Comparator comparador = new ComparadorProdutoPorNome();
			Collections.sort(prateleira, comparador);
			Iterator<Produto> i = prateleira.iterator();
			mensagem = "Cod      Pre�o            Nome\n";	
			while(i.hasNext()){
				produto = i.next();
				mensagem +=   	+produto.getCod()+"          R$ " 
								+produto.getPreco()+"            "
								+produto.getNome()+"\n";
			}
		JOptionPane.showMessageDialog(null, mensagem);
		}

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void VizualizarOrdemPreco(Prateleira prateleira){
		//Verifica se a prateleira possui itens atraves do if ... else prateleira.size
		if(prateleira.size()== 0){
			mensagem = "N�o h� produto cadastrado";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		else {
			Produto produto;
			
			Comparator comparador = new ComparadorProdutoPorNumero();
			Collections.sort(prateleira, comparador);
			Iterator<Produto> i = prateleira.iterator();
			mensagem = "Cod      Pre�o            Nome\n";	
			while(i.hasNext()){
				produto = i.next();
				mensagem +=   	+produto.getCod()+"          R$ " 
								+produto.getPreco()+"            "
								+produto.getNome()+"\n";
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}

	}
	
	@SuppressWarnings("unchecked")
	public void embaralharPrateleira(Prateleira prateleira){		
		if(prateleira.size()== 0){
			mensagem = "N�o h� produto cadastrado";
			JOptionPane.showMessageDialog(null, mensagem);
		}
		else {
			Produto produto;
			Collections.shuffle(prateleira);
			Iterator<Produto> i = prateleira.iterator();
			mensagem = "Cod      Pre�o            Nome\n";	
			while(i.hasNext()){
				produto = i.next();
				mensagem +=   	+produto.getCod()+"          R$ " 
								+produto.getPreco()+"            "
								+produto.getNome()+"\n";
			}
		JOptionPane.showMessageDialog(null, mensagem);
		}
	}
		
}
