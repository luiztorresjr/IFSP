/*
Recursividade repetir inumeras vezes
22-08-2014-IFSP
LUIZ TORRES JUNIOR

-DESCRICAO
LER um numero intero positivo e exibir a sequenciade 1 ate nº
Ex: nº5
	exibição
	1	2	3	4	5
*/
#include<stdio.h>
//#include<iostream.h>
#include <stdlib.h>

void escreva(int num){
	if(num > 0){		
		printf("\n%d\n\n" , num);
		escreva(num-1);
	}
}
int main(){
	int numero, i=1;
	do{
		system("cls");
		printf("Digite um numero: ");
		scanf("%d", &numero);
		escreva(numero);
		printf("Repetir programa?\n1-Sim\n2-Nao\n");
		scanf("%d", &i);
		if(i == 2) puts("Saindo");
	}while(i!=2);
		system("pause");
	
}
