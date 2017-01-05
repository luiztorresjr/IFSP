/*

Recursividade repetir inumeras vezes
22-08-2014-IFSP
LUIZ TORRES JUNIOR

-DESCRICAO
LER um sequencia de numero intero positivo e exibir a soma 1 ate nº
Ex: nº5
	exibição
1+2+3+4+5 = 15
*/

#include<stdio.h>
//#include<iostream.h>
#include <stdlib.h>

int soma(int num){
	if( num > 0){
		printf("\n%d", num);
		return (num+soma(num-1));
	}
	else{
		return (0);
	}
}

int main(){
	int numero;
	printf("Digite um numero: ");
	scanf("%d", &numero);
	printf("\nA soma eh: %i\n",soma(numero));
	system("pause");
}
