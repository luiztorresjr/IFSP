/*
12-12-2013-IFSP HTO
ler uma matriz inteira de 4X4. imprimir os elementos da diagonal principal.
criado por luiz torres junior
programa-75
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
	int matriz[4][4],c,l;
	printf("Entre com os valores de uma matriz e 4X4:\n");
	for (l=0;l<=3;l++){
		for(c=0;c<=3;c++){
			scanf("%i",&matriz[l][c]);
			}
		}
	printf("Diagonal Principal: \n");
	for (l=0;l<=3;l++){
		for(c=0;c<=3;c++){
			if(c==l)
			printf(" %i,",matriz[l][c]);
			}
		}
	printf("\n\n");
	system("pause");
	}
