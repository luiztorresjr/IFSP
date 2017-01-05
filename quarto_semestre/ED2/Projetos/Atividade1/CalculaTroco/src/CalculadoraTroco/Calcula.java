package CalculadoraTroco;

public class Calcula {
	//esta classe ira calcular a quantia de moedas necessarias para o troco
	private int moeda;

	public void calcula(float troco){
		//esta classe recebe o valor troco da entrada
		moeda = 0;
		//inicializa a variavel moeda que será usada para armazenar a quantia de moedas do troco
		int valor;
		// a variavel valor ira receber o inteiro do troco;
		valor = (int) troco;	
		do{
			// if para verificar se o valor é maior que 25 para subtrair do valor
			if(valor>=25){
					
				valor=valor-25;
				//valor recebe o o valor menos 25 para retirar um moeda do valor
				moeda++;	
				//acrescenta moeda
			}
			//else if para verificar se o valor esta entre 25 e 10
			else if(valor<25 && valor >= 10){
				valor=valor-10;
				moeda++;				
			}
			//else if para verificar se o valor esta entre 10 e 5
			else if(valor < 10 && valor>=5){
				valor=valor-5;
				moeda++;				
			}
			//para verificar se o valor eh menor de 5 para calcular a quantia de moedas de 1
			else{
				valor=valor-1;
				moeda++;				
			}
		}while(valor>0);			
		System.out.printf(""+moeda);
	}
}
