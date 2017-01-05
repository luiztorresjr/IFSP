#include <stdio.h>
#include <stdlib.h>
#include <iostream>
int soma(int *c, int *d )
{
	int s;
	//fasendo o soma usando parametros tipo ponteiro
	s = *c + *d;
	return s;
	
}
int main ()
{
	//lendo dua variaveis inteiras
	int a,b,res;
	printf("Digite o valor de A :  \n");
	scanf("%i",&a);
	printf("Digite o valor de B : \n");
	scanf("%i",&b);
	//passando parametros tipo endereço por ponteiro
	res = soma(&a,&b);
	printf("\nO resultado de e: %i\n",res);
	system("pause");
}
