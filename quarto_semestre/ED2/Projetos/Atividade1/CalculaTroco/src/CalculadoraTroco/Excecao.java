package CalculadoraTroco;

@SuppressWarnings("serial")
public class Excecao extends Exception{
		//classe criada para uso das exceções
    public Excecao(){
		//metodo construtor vazio        
    }
    public Excecao(String mensagem){
		//metodo construtor para receber a mensagem das exceções
        super(mensagem);
		//o metodo chama a ele a si mesmo
    }
}