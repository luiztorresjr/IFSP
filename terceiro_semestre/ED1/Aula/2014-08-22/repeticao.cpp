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

#include <stdio.h>
#include <stdlib.h>

int repertir(int n){
	int temp=1;
		while(n >= temp){
		printf("%d ",temp);
		temp ++;
	}
}

int main(){
	int rep;
	printf("Repetir quantas vezes? ");
	scanf("%d", &rep);
	repertir(rep);
}


