 package Aula_06_08;

//import java.util.ArrayList;
//import java.util.Iterator;
//import javax.swing.JOptionPane;


public class Loja_j {
      public static void main(String[] args) {
//
//      Produto p  ;
//
    	  Prateleira p1 = new Prateleira();
//  	  //Iterator<Produto> x = p1.iterator();

//  	  CadastroProduto cp = new CadastroProduto();
//          p = cp.CadProduto();
//
//  	//para x produtos
//  	for(int i = 0; i<=3-1;i++)
//  	{
//   		p = cp.CadProduto();
//           p1.add(p);
//   	}
//   	Mostrar mt = new Mostrar ();
//  	while(x.hasNext())
//   	{
//    		p = (Produto) x.next();
//   		mt.amostra(p);
//  	}
//
//  	MostrarPrateleira mp = new MostrarPrateleira();
//  	mp.Vizualizar(p1);

    	  Produto p2 = new Produto();
    	  p2.setcodigo(2);
    	  p2.setnome("Lapis");
    	  p2.setdescricao("Lapis Preto");
    	  p2.setpreco((float) 1.50);
    	  p1.add(p2);

    	  Produto p3 = new Produto();
    	  p3.setcodigo(1);
    	  p3.setnome("Apontador");
    	  p3.setdescricao("Apontador de Lapis");
    	  p3.setpreco((float) 5.50);
    	  p1.add(p3);

    	  MostrarOrdem mp = new MostrarOrdem();
    	  mp.Vizualizar(p1);

   }
}
