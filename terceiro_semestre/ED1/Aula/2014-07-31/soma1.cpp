// ler 2 número inteiros e mostrar a soma

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

int div(int a , int b){
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
	
	int a,b,so,di,mu,su;
	
	printf("Digite o valor de A ?\n");
	scanf("%d",&a);
	printf("Digite o valor de B ?\n");
	scanf("%d",&b);
	so = som(a,b);
	su = sub(a,b);	
	mu = mul(a,b);	
	di = div(a,b);	
	printf("A soma eh : %d\n\nA subtracao eh : %d\n\nA multiplicacao eh : %d\n\nA divisao eh : %d\n\n",so,su,mu,di);	
	getch();
	
}
