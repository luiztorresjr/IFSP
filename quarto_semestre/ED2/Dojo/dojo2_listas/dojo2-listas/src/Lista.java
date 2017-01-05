
public class Lista {

	public Item inicio;
	
	public Lista() {
		inicio = null;
	}
	public boolean estaVazio(){
		if (inicio == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void adicionarItemComeco(int valor){
		Item item = new Item();
		item.valor=valor;
		
		if (inicio == null){
			inicio=item;
			item.proximo=null;
		}
		else{
			item.proximo=inicio;
			inicio=item;
		}
	}
	
	public void imprimirLista (){
		if (estaVazio()){
			System.out.println("A lista esta vazia!!");
		}
		else{
			Item pos = inicio;
			while (pos != null) {
				System.out.println(pos.valor);
				pos=pos.proximo;
		
			}
		}
	}
	
	public void adicionarItemFim(int valor){
		Item item = new Item();
		item.proximo=null;
		item.valor=valor;
		if (estaVazio()){
			inicio=item;
		}else{
			Item pos = inicio;
			while (pos.proximo != null) {
				pos=pos.proximo;
		
			}
			pos.proximo=item;
			
		}
		}
		
	}
	


