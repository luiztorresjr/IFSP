
public class MainTeste {

	public MainTeste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Arvore arvore1 =new Arvore();
	    No no1 = new No(7);
	    No no2 = new No(8);
	    No no3 = new No(9);
	    No no4 = new No(8);
	    
	    
	    arvore1.raiz = no1;
		System.out.println(arvore1.altura(no1));
	    
	    no1.direito = no2;
	    no1.esquerdo = no3;
	    System.out.println(arvore1.altura(no1));
	    no2.direito = no4;
 //		System.out.println(arvore1.verificarVazio());
//		System.out.println(arvore1.verificarFolha(no1));
//      verifica numero de nos da sub-arvore no 1
//		System.out.println(arvore1.verificarNnos(no1));
//      verifica numero de nos da sub-arvore no 2
//		System.out.println(arvore1.verificarNnos(no2));
//      verifica numero de nos da sub-arvore no 2 esquerdo
//		System.out.println(arvore1.verificarNnos(no2.esquerdo));
//		verifica altura da sub arvore
		System.out.println(arvore1.altura(no1));


	}
	

}
