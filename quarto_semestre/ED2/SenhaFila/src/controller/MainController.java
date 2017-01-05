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
		System.out.println("Clicou no botão Normal a senha é :"+senha);
		//indica que senha recebe a string NORMAL e 
		fila.senhaNormal(senha);
	}
	//metodo para senha preferencial
	public void retirarSenhaPreferencial(String senha){
		//mensagem de sistema para saber se o botão esta sendo acionado e qual a senha
		System.out.println("Clicou no botão Preferencial a senha é :"+senha);
		fila.senhaPreferencial(senha);
	}
	//metodo para chamar as senha na sequencia de prioridade e depois as normais na ordem de chegada
	public void chamarSenha (){
		//mensagem de sistema para saber se o botão
		System.out.println("Clicou no botão Chamar Senha");
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
