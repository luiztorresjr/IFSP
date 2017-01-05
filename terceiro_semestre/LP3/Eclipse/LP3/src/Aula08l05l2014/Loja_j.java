package Aula08l05l2014;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Loja_j {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto;		
		Prateleira prateleira = new Prateleira();		
		Iterator<Produto> i = prateleira.iterator();		
		CadastroProduto cp = new CadastroProduto();
		MostrarProduto mostraProduto = new MostrarProduto();
		MostrarPrateleira mp = new MostrarPrateleira();
		ProcurarProduto pp = new ProcurarProduto();
		
		//		Cria um cadastro para 3 produtos
		//		for(int c = 0; c < 2; c++){
		//			produto = cp.cadastrar();
		//			prateleira.add(produto);// cria uma prateleira para colocar os produtos em um arrayList
		//		}		

		//mp.Vizualizar(prateleira);
		//		while(i.hasNext()){
		//			produto = (Produto)i.next();			
		//			//mp.mostrar(produto);	
		//		}

		Produto p2 = new Produto();
		p2.setCod(2);
		p2.setNome("Lapis");
		p2.setDescricao("Lapis Preto");
		p2.setPreco((float) 1.50);
		prateleira.add(p2);
//
		Produto p3 = new Produto();
		p3.setCod(1);
		p3.setNome("Apontador");
		p3.setDescricao("Apontador de Lapis");
		p3.setPreco((float) 2.50);
		prateleira.add(p3);
//		
		Produto p1 = new Produto();
		p1.setCod(4);
		p1.setNome("Bolsa");
		p1.setDescricao("bolsa escolar");
		p1.setPreco((float) 55.50);
		prateleira.add(p1);
//		
		Produto p4 = new Produto();
		p4.setCod(3);
		p4.setNome("Caneta");
		p4.setDescricao("Caneta azul");
		p4.setPreco((float) 3.50);
		prateleira.add(p4);
//		
		Produto p5 = new Produto();
		p5.setCod(5);
		p5.setNome("Calculador");
		p5.setDescricao("calculadora cientifica");
		p5.setPreco((float) 5.50);
		prateleira.add(p5);
		
		int op=0;
		
		
		String mens = "Selecione a opção\n" +
				"1-Criar produtos\n" +
				"2-Mostrar prateleira\n" +
				"3-Mostrar prateleira em ordem\n" +
				"4-Mostrar em Prateleira Ordenado por nome\n" +
				"5-Mostrar em Prateleira Ordenado por preço\n"+
				"6-Mostrar o Produto mais caro\n" +		
				"7-Mostrar o Produto mais barato\n" +
				"8-Mostrar a prateleira embaralhada\n" +
				"9-Procurar produto por codigo\n" +
				"10-Deletar produto por codigo\n" +
				"11-Sair";
		do{
		op = Integer.parseInt(JOptionPane.showInputDialog(mens));
			switch(op){
				case 1:		
//					Cria um cadastro para 5 produtos
					for(int c = 0; c < 1; c++){
								produto = cp.cadastrar();
								prateleira.add(produto);// cria uma prateleira para colocar os produtos em um arrayList
							}
				case 2:
					//Mostrar a prateleira
					mp = new MostrarPrateleira();
					mp.Vizualizar(prateleira);
					break;
				case 3:
					MostrarOrdem mo = new MostrarOrdem();
					mo.Vizualizar(prateleira);
					break;
				case 4:
					mp = new MostrarPrateleira();
					//Mostrar a prateleira em ordem alfabetica
					mp.VizualizarOrdemNome(prateleira);
					break;
				case 5:
					//Mostrar a prateleira em ordem de preço
					mp = new MostrarPrateleira();
					mp.VizualizarOrdemPreco(prateleira);
					break;
				case 6:
					//Mostra o produto com o maior valor da prateleira
					mostraProduto = new MostrarProduto();
					mostraProduto.produtoCaro (prateleira);					
					break;
					
				case 7:
					//Mostra o produto com o menor valor da prateleira
					mostraProduto = new MostrarProduto();
					mostraProduto.produtoBarato(prateleira);
					break;
				case 8:
					//Mostra o produto com o menor valor da prateleira
					mp = new MostrarPrateleira();
					mp.embaralharPrateleira(prateleira);
					break;	
				case 9:
					//Mostra o produto com o menor valor da prateleira
					pp.localizarExibirProdutoCodigo(prateleira);
					break;							
				case 10:					
					pp.removerProdutoCodigo(prateleira);
					break;
				case 11:
					JOptionPane.showMessageDialog(null, "Saindo....");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida");
					break;					
			}
		}while(op !=11);
		
		


		
		//MostrarOrdem mp = new MostrarOrdem();
		
	}

}
