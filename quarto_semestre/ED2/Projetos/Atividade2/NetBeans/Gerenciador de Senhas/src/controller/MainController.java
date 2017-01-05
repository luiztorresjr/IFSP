package controller;

import model.Fila;

public class MainController {
	//instacia a fila do tipo fila
	Fila fila = new Fila();
	public MainController (){
		
	}
	
	//metodo para retirada de senha normal recebe um valor da tela para criar a senha
	public void retirarSenhaNormal (String senha){		
		//apresenta o system para verificar se esta funcionando o sistema
		System.out.println("Clicou no botÃ£o Normal");
		//indica que senha recebe a string NORMAL e 
		fila.addNormal(senha);
	}
	
	public void retirarSenhaPreferencial(String senha){
		System.out.println("Clicou no botÃ£o Preferencial");
		fila.addPrioridade(senha);
	}
	
	public void chamarSenha (){
		System.out.println("Clicou no botÃ£o Chamar Senha");
		atualizarSenhaAtual();
		fila.chamarSenha();
	}
	public String atualizarSenhaAtual(){
		return fila.atualizarSenha();		
	}

}
