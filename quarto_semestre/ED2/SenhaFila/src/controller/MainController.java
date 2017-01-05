package controller;

import model.Fila;

public class MainController {
	//instacia a fila do tipo fila e inicaliza como uma nova
	Fila fila = new Fila();
	public MainController (){
		
	}
	
	//metodo para retirada de senha normal recebe um valor da tela para criar a senha
	public void retirarSenhaNormal (String senha){		
		//apresenta o system para verificar se esta funcionando o sistema e qual a senha
		System.out.println("Clicou no bot�o Normal a senha � :"+senha);
		//indica que senha recebe a string NORMAL e 
		fila.senhaNormal(senha);
	}
	//metodo para senha preferencial
	public void retirarSenhaPreferencial(String senha){
		//mensagem de sistema para saber se o bot�o esta sendo acionado e qual a senha
		System.out.println("Clicou no bot�o Preferencial a senha � :"+senha);
		fila.senhaPreferencial(senha);
	}
	//metodo para chamar as senha na sequencia de prioridade e depois as normais na ordem de chegada
	public void chamarSenha (){
		//mensagem de sistema para saber se o bot�o
		System.out.println("Clicou no bot�o Chamar Senha");
		//mensagem de sistema para saber qual a senha chamada
		System.out.println(atualizarSenhaAtual());
		//chama o metodo
		fila.chamarSenha();
	}
	//metodo para atualizar o label de chamada da senha
	public String atualizarSenhaAtual(){
		//retorna o valor da senha para a label da frame 
		return fila.atualizarSenha();		
	}

}
