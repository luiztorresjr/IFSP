package Aula08l05l2014;

import java.util.Collections;
import javax.swing.JOptionPane;

public class ProcurarProduto {

	public ProcurarProduto() {
	}
	
	String mensagem = new String();
	
	//Algoritmo de procura binary search
	@SuppressWarnings("unchecked")
	public void localizarExibirProdutoCodigo(Prateleira prateleira) {
		Produto mockup = new Produto();
		Collections.sort(prateleira);
		mensagem = "Entre com o codigo procurado :";
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,mensagem));
		mockup.setCod(codigo);
		int resultado = Collections.binarySearch(prateleira, mockup);
		
		if(resultado < 0)
			JOptionPane.showMessageDialog(null, "Produto de codigo "+ codigo+" n�o encontarado");
		
		else {
			MostrarProduto mostrarproduto = new MostrarProduto();
			mostrarproduto.mostrar((Produto) prateleira.get(resultado));						
		}
	}
	
	
	//Algoritmo de procura binary search usando para remover um item
	@SuppressWarnings("unchecked")
	public void removerProdutoCodigo(Prateleira prateleira) {
		Produto mockup = new Produto();
		//ordena os itens para que a busca atraves de arvore binaria seja efetiva
		Collections.sort(prateleira);
		mensagem = "Entre com o codigo que deseja remover :";
		//pergunta qual o codigo que quer remover do arraylist
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,mensagem));
		mockup.setCod(codigo);
		int resultado = Collections.binarySearch(prateleira, mockup);
		
		if(resultado < 0)
			JOptionPane.showMessageDialog(null, "Produto de codigo "+ codigo+" n�o encontarado");
		
		else {
			
			MostrarProduto mostrarproduto = new MostrarProduto();
			mostrarproduto.mostrar((Produto) prateleira.get(resultado));
			//pergunta se quer remover o item do array list prateleira
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja deletar este produto\n1-Sim\n2-N�o"));
			
			if(resp == 1){
				//fun��o usado pra remover item de arraylist
				prateleira.remove(resultado);
				JOptionPane.showMessageDialog(null, "Produto de codigo "+codigo+" foi apagado com sucesso.");
			}
			else
				JOptionPane.showMessageDialog(null, "Produto de codigo "+codigo+" n�o foi apagado.");						
		}
	}

}