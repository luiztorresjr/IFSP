package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Arvore {
	int info;	
	private ArvoreNo raiz;
	
	public Arvore(){
		raiz=null;
	}
	public void inserirNo(int valor){
		if(raiz ==null){
			raiz = new ArvoreNo(valor);
		}else{
			raiz.inserir(valor);
		}
	}
	
	public Iterator<Integer> preOrdem(){		
		return preOrdemManter(raiz).iterator();
	}
	public ArrayList<Integer> preOrdemManter(ArvoreNo no){ 
		ArrayList<Integer> array= new ArrayList<Integer>();
		if(no == null)
			return null;
		array.add(no.dado);
		System.out.printf("%d ", no.dado);
		preOrdemManter(no.esquerda);
		preOrdemManter(no.direita);
		return array;
		
	}
	
	public ArrayList<Integer> inOrdem(){
		ArrayList<Integer> array= new ArrayList<Integer>();
		array.add(inOrdemManter(raiz));
		return array;
	}
	public Integer inOrdemManter(ArvoreNo no){
		if(no == null)
			return null;
		inOrdemManter(no.esquerda);
		info= no.dado;
		System.out.printf("%d ", no.dado);		
		inOrdemManter(no.direita);
		return info;			
	}
	
	public ArrayList<Integer> posOrdem(){
		ArrayList<Integer> array= new ArrayList<Integer>();
		array.add(posOrdemManter(raiz));
		return array;
	}
	public Integer posOrdemManter(ArvoreNo no){		
		if(no == null)
			return null;
		posOrdemManter(no.esquerda);
		posOrdemManter(no.direita);
		info= no.dado;
		System.out.printf("%d ", no.dado);			
		return info;		
	}
	
	
}
