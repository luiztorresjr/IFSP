package model;

public class ArvoreNo {
	ArvoreNo esquerda;
	int dado;
	ArvoreNo direita;
	
	public ArvoreNo(int valor){
		dado = valor;
		direita = esquerda = null;
	}
	public void inserir(int valor){
		if(valor <= dado){
			if(esquerda==null)
				esquerda=new ArvoreNo(valor);
			else
				esquerda.inserir(valor);
		}else if(valor > dado){
			if(direita==null)
				direita= new ArvoreNo(valor);
			else
				direita.inserir(valor);
		}
	}	
}