package model;

public class Fila {
	
	public Item inicio;
	
	public Fila() {
		inicio = null;
	}
	
	public boolean filaVazia(){
		if(inicio == null)
			return true;
		else
			return false;		
	}
	
	public void addNormal(String senha){
		Item item = new Item();
		item.proximo=null;
		item.senha=senha;
		
		if(filaVazia()){
			inicio = item;
		}
		else{
			Item lugar = inicio;
			while(lugar.proximo != null){
				lugar=lugar.proximo;
			}
			lugar.proximo=item;
		}
	}
	
	public void addPrioridade(String senha){
		Item item = new Item();
		item.proximo=null;
		item.senha=senha;
		
		if(filaVazia())
			inicio=item;
		else if(inicio.senha.contains("NORMAL ")){
			item.proximo=inicio;
			inicio=item;
		}else{
			Item lugar = inicio;
			while(lugar.senha.contains("PRIOR ")){
				lugar=lugar.proximo;
			}
			item.proximo=lugar;
			lugar=item;
		}
		
	}
	
	public void chamarSenha(){
            if(filaVazia()) {
            } else
                inicio = inicio.proximo;		
	}
	
	public String atualizarSenha(){
		if(filaVazia()){
			return "Fila Vazia";
		}else{
			return inicio.senha;
		}
	}
}
