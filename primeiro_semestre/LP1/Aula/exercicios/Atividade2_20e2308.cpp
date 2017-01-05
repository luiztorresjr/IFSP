/*
   Atividade desenvolvida em 20/08
   Programa que ira calcular o valor a ser pago
   a partir de R$ 550,00 sendo a vista com 
   10% de desconto e a prazo o valor sendo pago
   em 3 parcelas
*/

#include "stdio.h"
#include "stdlib.h"
main(){
        system("cls");
	printf("Valor da compra = R$ 550,00\n\n");
	printf("Valor a ser pago a vista com 10% desconto= ");
	
	//Calculando o valor a vista
        printf("%.2f\n\n",550-(550*0.10));

	printf("Valor a ser pago em 3 vezes= ");
	
	//Calculando o valor a prazo	
	printf("%.2f",550/3);
	
        system("pause");
}