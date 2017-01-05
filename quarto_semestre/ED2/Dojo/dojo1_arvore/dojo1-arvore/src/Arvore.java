
public class Arvore {

	public No raiz;
	
	public Arvore() {
		raiz = null;
	}
	public boolean verificarVazio(){
		if(raiz == null){
			return true;
		}else{
			return false;
		}
		
	}
	public boolean verificarFolha(No end){
		if(end.direito==null && end.esquerdo==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int verificarNnos(No no){
		if (no == null){
			return 0;
		}else{
			return 1 + verificarNnos(no.esquerdo) + verificarNnos(no.direito);
		}
	}
	
	public int altura(No no){
		if (no == null ){
			return -1;
		}
		else { 
			return 1+Math.max(altura(no.esquerdo),altura(no.direito));
			
		}
	}
	

		
		


}
