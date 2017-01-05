/*
12-12-2013-IFSP HTO
ler uma matriz 5 X 5. Em seguida somar os elementos da primeira linha com os da ultima.
criado por luiz torres junior
programa-77
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
	int l,c,matriz[5][5],num;

	printf("Entre com os valores de uma matriz 5X5: \n");
	l=0;
	while(l<=4){
	c=0;
		while(c<=4){
			scanf("%i",&num);
			if(num%5==0 && num!=0){
			matriz[l][c]=num;
			c++;
			printf("Faltam %i numeros na linha %i-\n",5-c,l+1);
		}
			else
			printf("\n-Faltam %i numeros na linha %i-\n",5-c,l+1);
		}
		l++;
	}
	printf("A matriz: \n");
	for(l=0;l<=4;l++){
		for(c=0;c<=4;c++){
			printf("%i",matriz[l][c]);
		}
		printf("\n");
	}
	printf("\n\n");
	system("pause");
}
