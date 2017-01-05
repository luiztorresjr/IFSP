package Aula08l05l2014;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class ComparadorProdutoPorNome implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Produto produto1 = (Produto) ob1;
		Produto produto2 = (Produto) ob2;
		String nomeProduto1 = produto1.getNome();
		String nomeProduto2 = produto2.getNome();
		return nomeProduto1.compareTo(nomeProduto2);

	}

}