// ler 2 número inteiros e mostrar a soma
/* 
08-12-2014-IFSP HTO
criado por luiz torres junior
programa-200
Estrutura de dados
*/
#include <stdlib.h>
#include<stdio.h>
#include<conio.h>
//#include<iostream>
#
int som(int a , int b){
	int s;	
	s = a+ b;	
	return s;
	//printf("A soma de %i com %i  %i\n", a,b,s);	
}

int divi(int a , int b){
	int s;	
	s = a / b;	
	return s;
	//printf("A soma de %i com %i  %i\n", a,b,s);	
}

int sub(int a , int b){
	int s;	
	s = a - b;	
	return s;
	//printf("A soma de %i com %i  %i\n", a,b,s);	
}

int mul(int a , int b){
	int s;	
	s = a * b;	
	return s;
	//printf("A soma de %i com %i  %i\n", a,b,s);	
}

int main(){
	
	int a,b,res,sair=1,op;
	do{	
	
		printf("1-Somar\n");
		printf("2-Subtrair\n");
		printf("3-Multiplicar\n");
		printf("4-Dividir\n");
		printf("5-Sair");	
			
		printf("\nDigite a opcao: ");
		scanf("%d",&op);
		
		if(op >= 1 && op <=4){	
			printf("Digite o valor de A: ");
			scanf("%d",&a);
			printf("Digite o valor de B: ");
			scanf("%d",&b);	
		}
		
		switch(op){
			case 1:	
				res=som(a,b);
			break;			
			case 2:	
				res=sub(a,b);	
			break;
			case 3: 
				res=mul(a,b);	
			break;
			case 4:	
				res=divi(a,b);
			break;
			case 5:	
				sair=0; 
			break;			
			default: printf("Opcao invalida!");					
				}	
		if(op >= 1 && op <=4){			
			printf("\nO resultado eh: %i\n\n", res);
			getch();
			system("cls");
		}
		if(op == 5){	
			system("cls");		
			printf("!!!!!Saindo!!!!!!");
			getch();			
		}
			
	}while(sair == 1);	
	
}
