public class Cliente{
	String nome, endereco, telefone, email;
	public Cliente(){
	
	public void setNome(String n){
	nome = n;
	}
	
	public void setEndereco(String e){
	endereco = e;
	}
	
	public void setTelefone(String t){
	telefone = t;
	}
	
	public void setEmail(String e){
	email = e;
	}
	public String getNome(){
	return nome;
	}
	public String getEndereco(){
	return endereco;
	}
	public String getTelefone(){
	return telefone;
	}
	public String getEmail(){
	return email;
	}
	}
}