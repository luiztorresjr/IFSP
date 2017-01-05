package model;

public class Fila {
	//intancia o inicio do tipo item como publico
	public Item inicio;
	//o construtor da classe fila 
	public Fila() {
		//indica que o item inicio recebe null
		inicio = null;
	}
	//metodo para verificar se a fila esta vazia
	public boolean filaVazia(){
		//se estiver vazia retorna true
		if(inicio == null)
			return true;
		//senão retorna falso
		else
			return false;		
	}
	//metodo para adicionar senhas normais fila
	public void senhaNormal(String senha){
		//intancia um item do tipo item para recebe o valor da string 
		Item item = new Item();
		item.proximo=null;
		item.senha=senha;
		//verifica se a fila esta vazia se estiver inicio recebe o item
		if(filaVazia()){
			inicio = item;
		}
		//se o inicio não for vazio cai no else
		else{
			//instancia o lugar do tipo item que recebe inicio para poder caminha
			Item lugar = inicio;
			//enquanto o proximo do lugar for diferente de null o lugar recebe seu proximo
			while(lugar.proximo != null){
				lugar=lugar.proximo;
			}
			//terminando o while o proximo do lugar recebe o item 
			//aponta para item que ficara no fim da lista
			lugar.proximo=item;
		}
	}
	
	public void senhaPreferencial(String senha){
		//intancia um item do tipo item para recebe o valor da string 
		Item item = new Item();
		item.senha=senha;
		item.proximo=null;
		//verifica se a fila esta vazia se estiver inicio recebe o item
		if(filaVazia()){
			inicio=item;
		}
		//se o inicio conter NORMAL em seu valor a PRIOR troca de lugar ficando no inicio
		else if(inicio.senha.contains("NORMAL")){
			item.proximo=inicio;
			inicio=item;
		}else{
			 //if(inicio.senha.contains("PRIOR")){
				 Item lugar=inicio;
				 Item anterior=lugar;
				 //enquanto senha conter PRIOR e o proximo do lugar for diferente de null 
				while(lugar.senha.contains("PRIOR") && lugar.proximo != null ){
					//anterio recebe lugar para ficar um passo atras
					anterior=lugar;
					//lugar recebe seu proximo ate que while seja falso
					 lugar=lugar.proximo;
				 }
				//verifica se o proximo for null quer dizer que a lista esta 
				//cheia apenas de prioritario
				if(lugar.proximo==null){
					//então o proximo de lugar que esta no ultimo item da lista recebe 
					//item que sera o novo ultimo 
					lugar.proximo=item;
				}else{
					//se o while termina por causa do prior então eh necesario trocar o lugar 
					// com o  item portanto o proximo do anterior recebe o item
					anterior.proximo=item;
					//e o proximo do item recebe o lugar ficando entre a ultimo senha PRIOR 
					//e a primeira senha  NORMAL
					item.proximo=lugar;
				}
			 }
		//}
	}
	public void chamarSenha(){
		//verifica se a fila esta vazia
		if(filaVazia()){
			inicio=null;
		//remove o primeiro valor e o inicio recebe o proximo do inico ate que esteja vazia a lista
		}else{
			inicio = inicio.proximo;
		}
	}
	
	public String atualizarSenha(){
		//verifica se a fila esta vazia e retorna a menasgem de que a fila esta vazia
		if(filaVazia()){
			return "Fila Vazia";
		//senão retorna o primeiro valor da fila 
		}else{
			return inicio.senha;
		}
	}
}
