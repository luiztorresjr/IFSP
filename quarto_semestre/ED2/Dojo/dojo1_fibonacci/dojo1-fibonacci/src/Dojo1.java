
public class Dojo1 {

	public Dojo1() {
 
	}
	
	public static int  fibo (int posicao) {
		
		
		if(posicao == 1 ){
			return 0;
		}
		else if(posicao == 2){
			return 1;
		}
		else{
			return fibo(posicao-1)+fibo(posicao-2);
	}		
	
}

	public static void main(String[] args) {
		
		int qtde = 100;
		for(int i=0;i<qtde;i++) {
			System.out.println(fibo(i+1));
		}
		
	}

}
