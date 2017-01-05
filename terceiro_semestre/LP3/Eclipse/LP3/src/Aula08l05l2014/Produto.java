package Aula08l05l2014;

@SuppressWarnings("rawtypes")
public class Produto implements Comparable{
	String nome, descricao;
	int cod;
	float preco;
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	public void setNome(String n){
		nome = n;
	}
	public void setDescricao(String d){
		descricao = d;
	}
	public void setCod(int c){
		cod = c;
	}
	public void setPreco(float p){
		preco = p;
	}
	public String getNome(){
		return nome;
	}
	public String getDescricao(){
		return descricao;
	}
	public int getCod(){
		return cod;
	}
	public float getPreco(){
		return preco;
	}
	
	@Override
	
	public int compareTo(Object p){
		Produto produto =(Produto) p;
		if(this.cod == produto.getCod()){
			return 0;
		}
		if(this.cod < produto.getCod()){
			return -1;
		}
		else
			return 1;
	}
	
	public boolean equals(Object obj) {
		Produto produto = (Produto) obj;
		if(this.getCod() == produto.getCod())
			return true;
		else 
			return false;
	}
	/*Compara os preços dos produtos
	 * 
	 * public float compareTo(Object p) {
//			Produto p1 = (Produto)p;
//			if(this.preco == p1.getpreco()){
//			return 0;
//			}
//			else if(this.preco < p1.getpreco()){
//				return -1;
//			}
//			else
//				return 1;
//		}
 * 
 * 		compara textos
 * 		  public int compareTo(Object p) {
			Produto p1 = (Produto)p;
			return this.nome.compareTo(((Produto) p).getnome());
		}
 * 
	 */
	
}
