/*
03-12-2013-IFSP HTO
exercicio 7
Preencher um vetor com 5  números e a medida que for
digitando o número, calcular o cubo e
armazenar em outro vetor. Mostrar os dois vetores.
e mostra-los na tela na ordem contrária em que foram lidos
criado por luiz torres junior
programa-72
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
	int vet[5],vetc[5],i;
	printf("Entre com os 5 valores do vetor:\n");
	for(i=0;i<=4;i++){
		scanf("%i",&vet[i]);
		vetc[i]=vet[i]*vet[i]*vet[i];
	}
	printf("vetor :\n");
	for(i=0;i<=4;i++){
		printf("%i ",vet[i]);
	}
	printf("\nO triplo do vetor:\n");
		for(i=0;i<=4;i++){
		printf("%i ",vetc[i]);
	}
	printf("\n\n");
	system("pause");
}
