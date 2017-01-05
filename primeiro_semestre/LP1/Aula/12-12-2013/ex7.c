/*
12-12-2013-IFSP HTO
ler um vetor de 10 posições. primeiramente imprimir apenas os numeros
localizado em posições impares e em seguida os em posições pares.
criado por luiz torres junior
programa-74
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
	int i, num, vetp[5],veti[5];
	printf("Entre com os numeros do vetor de 10 posições: \n");
	i=1;
	while(i<=10){
		if(i%2==1 && i!=0){
		scanf("%i",&num);
		veti[i]=num;
		}
		else
		scanf("%i",&num);{
		vetp[i]=num;
		}
		i++;
		}
	i=1;
	printf("\nNumeros em indice impares: \n");
	while(i<=10){
	if(i%2==1)
		printf("vetor[%i] = %i\n ",i,veti[i]);
		i++;
	}
	i=1;
	printf("\nNumeros em indice pares: \n");
	while(i<=10){
		if(i%2==0)
		printf("vetor[%i] = %i\n ",i,vetp[i]);
		i++;
	}
	printf("\n\n");
	system("pause");
}
