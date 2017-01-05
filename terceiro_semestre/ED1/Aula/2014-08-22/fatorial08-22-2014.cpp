/*
Fatorial
IFSP - 22-08-2014
Luiz Torres Junior
*/
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int fatorial(int i){
	if ((i==0) || (i==1)){
		return(1);
	}
	else
		return (i*fatorial(i-1));
}

int main(){
	int n,sai =1;
	do{
		printf("\n Digite um numero inteiro positivo: ");
		scanf("%d",&n);
		printf("\n O fatorial deste numero eh: %d", fatorial(n));
		printf("\n Sair do programa\n1-SIM\n2-NAOH:   ");
		scanf("%d", &sai);
		system("cls");
		if(sai == 1) printf("saindo");
	}while(sai == 2);
}
