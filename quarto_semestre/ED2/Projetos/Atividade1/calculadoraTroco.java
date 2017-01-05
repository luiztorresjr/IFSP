import java.util.Scanner;


public class calculadoraTroco {	
	public static void main(String args[]){	
		int moeda = 0;	
			System.out.print("Oi. Quanto troco você deve?");
			@SuppressWarnings("resource")
			
			Scanner entrada = new Scanner(System.in);
			float troco = entrada.nextFloat();
			troco = troco *100;
			if ((troco - 25) >= 25){
				moeda ++;
			}
			else if((troco - 10) >= 10){
				moeda++;
			}
			else if((troco- 5) >= 0.05){
				moeda++;
			}
			else if((troco- 1) >= 1){
				moeda++;
			}
			System.out.print(moeda);		
	}
}
