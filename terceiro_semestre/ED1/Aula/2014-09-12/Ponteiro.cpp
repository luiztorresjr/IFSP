#include <stdio.h>
#include <stdlib.h>
#include <iostream>

int main ()
{
	 int a,b,c,x;
	 //declara��o de ponteiro
	 int *p;
	 //o ponteiro aponta para o endere�o de a
	 p = &a;
	 //o emdere�o apontado pelo ponteiro recebe 2
	 *p = 2;
	 printf("\n%d \n",a);
	 //monstrando o valor do endere�o da memoria
	 printf("\n%p \n",&p);
	 //monstrando o valor do endere�o de memoria de A
	 printf("\n%d \n",&a);
	 system("pause"); 	
	 system ("cls");
	//somando variaveis usando ponteiro 
	//provavelmente dara erro nesse metodo
	printf("~Primeiro tipo de soma usando ponteiro provavel erro~ \n");
	c = 2;
	*p = 3;
	//declara��o de ponteiro para usar em opere��es matematicas
	b = c + (*p);
	printf("\n%d\n",b);
	system("pause");
	system("cls");
	
	//usando metodo de aponta o ponteiro 
	printf("~Segundo tipo de soma usando ponteiro provevel sucesso~ \n");
	a = 2;
	p = &c;
	*p = 3;
	b = a + (*p);
	printf("\n%d\n",b);
	system("pause");
	system("cls");			 
	//visualisando o valor da variavel atraz de ponteiro
	x= 10;
	p =&x;
	//mostra o valor que tem no endere�o de X
	printf("\n *p %d \n",*p);
	//mostra o endere�o da memoria de X
	printf("\n *p %d \n",&p);
	//somando + 1 no Ponteiro
	*p = *p + 1;
	//resultado de soma 
	printf("\n *p + 1 =  %d \n",*p);
	system("pause");
	system("cls");
	//lendo dua variaveis inteiras
	printf("Digite o valor de A :  \n");
	scanf("%i",&A);
	printf("Digite o valor de B : \n");
	scanf("%i",&B);
 	 
}
