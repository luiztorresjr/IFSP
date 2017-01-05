#include <stdio.h>
#include <stdlib.h>
#include <iostream>

int main ()
{
	 int a,b,c,x;
	 //declaração de ponteiro
	 int *p;
	 //o ponteiro aponta para o endereço de a
	 p = &a;
	 //o emdereço apontado pelo ponteiro recebe 2
	 *p = 2;
	 printf("\n%d \n",a);
	 //monstrando o valor do endereço da memoria
	 printf("\n%p \n",&p);
	 //monstrando o valor do endereço de memoria de A
	 printf("\n%d \n",&a);
	 system("pause"); 	
	 system ("cls");
	//somando variaveis usando ponteiro 
	//provavelmente dara erro nesse metodo
	printf("~Primeiro tipo de soma usando ponteiro provavel erro~ \n");
	c = 2;
	*p = 3;
	//declaração de ponteiro para usar em opereções matematicas
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
	//mostra o valor que tem no endereço de X
	printf("\n *p %d \n",*p);
	//mostra o endereço da memoria de X
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
