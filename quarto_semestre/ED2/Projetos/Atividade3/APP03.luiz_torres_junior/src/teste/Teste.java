package teste;

import model.Arvore;

public class Teste {
	public static void main(String args[]){
		String mensagem= new String();
		//Instaciar a arvore
		Arvore arvore = new Arvore();
		//teste de arvore vazia resultado = true
		mensagem = "A arvore esta vazia: "+ arvore.arvoreVazia();
		System.out.println(mensagem);
		//arvore.addNo(10);
		mensagem = "A arvore esta vazia: "+ arvore.arvoreVazia();
		System.out.println(mensagem);
	}
}