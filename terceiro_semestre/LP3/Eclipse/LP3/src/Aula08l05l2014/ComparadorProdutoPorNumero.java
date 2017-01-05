package Aula08l05l2014;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class ComparadorProdutoPorNumero implements Comparator{

	public ComparadorProdutoPorNumero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object ob1, Object ob2) {
		Produto p1 = (Produto)ob1;
		Produto p2 = (Produto)ob2;
		
		if(p1.getPreco()==p2.getPreco()){
			return 0;
			}
		else if(p1.getPreco() < p2.getPreco()){
			return -1;
		}
		else
			return 1;
	}

}
