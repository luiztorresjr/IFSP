package CalculadoraTroco;

import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    private static Scanner s;
	//Inicia o scanner para ler a entrada do usuario
	public static void main(String[] args) {
			
			float troco;
			//cria a variavel float para receber o valor que o usuario entre
			boolean verifica = true;
			//variavel boolean para verifica��o
			System.out.printf("Oi. Quanto troco voc� deve?\n");
			do{
			// para o programa rodar enquanto n�o entrar com um valor valido
				try{				
				//inicia o try para a exce��es
					s = new Scanner(System.in);
					//variavel s de um novo Scanner
					s.useLocale(Locale.ENGLISH);
					//indica que variavel s � do tipo que usa o modelo americano de valor decimal
					String valor =s.next();					
                    if(valor.contains(",")){
					// if para saber se esta entrando com um valor com modelo n�o americano de decimal
                    	throw new Excecao("Desculpe? Quanto voc� disse?");
                    }
					//else caso seja uma decimal no formato americano
                    else {
                    	troco = Float.parseFloat(valor);
                        //converte o valor uma String em um float e troco recebe esse valor
                        if(troco < 0f){
                        	 // if para saber se o valor do troco eh negativo
                        	throw new Excecao("Desculpe? Quanto voc� disse?");
                                                }
							Calcula c = new Calcula();
						//chama a classe calcula e inicaliza uma variavel deste tipo para usar os metodos
							c.calcula(troco*100);
						//chama o metodo calcula da classe calcula
							verifica = false;
						//a variavel booleana recebe false para acaber o do...while
					}
				}				
				catch(NumberFormatException e){
						//catch para saber se entrou com letra e n�o um valor float
					System.out.println("Ahh... Tente de novo\n");			
					//apresenta a mensagem para caso o usuario entre com letra
				}
				catch(Exception a){
						//uma exce��o generica para uso comum
					System.out.println("Desculpe? Quanto voc� disse?");
				}
			
			}while(verifica);
	}
}
