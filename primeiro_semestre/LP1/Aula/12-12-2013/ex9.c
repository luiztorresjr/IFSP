/*
12-12-2013-IFSP HTO
ler uma matriz 5 X 5. Em seguida somar os elementos da primeira linha com os da ultima.
criado por luiz torres junior
programa-76
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
	int l,c,matriz[5][5],soma;
	soma=0;
	printf("Entre com os valores de uma matriz 5X5: \n");
	for(l=0;l<=4;l++){
		for(c=0;c<=4;c++){
			scanf("%i",&matriz[l][c]);
		}
	}
	printf("A matriz: \n");
	for(l=0;l<=4;l++){
		for(c=0;c<=4;c++){
			printf("%i",matriz[l][c]);
		}
		printf("\n");
	}
	for(c=0;c<=4;c++){
			soma=matriz[0][c]+matriz[4][c];
			}
	printf("O total da soma da primeira linha com a ultima e: %i",soma);
	printf("\n\n");
	system("pause");
}
