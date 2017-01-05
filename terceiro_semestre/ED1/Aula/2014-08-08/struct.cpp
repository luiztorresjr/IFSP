#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void aumento(){
	pro= pro+pro*per
}
struct funcionario{
	
		char nome[30];
		char funcao[30];
		int salario;
	};
	funcionario gerente[2];
	
	
main(){
	int i;
	for(i=0;i<2;i++){
		puts("Digite o nome: \n");
		scanf("%s",&gerente[i].nome);
		puts("Digite a funcao: \n");
		scanf("%s",&gerente[i].funcao);
		puts("Digite o salario: \n");
		scanf("%d",&gerente[i].salario);
	}
	system("pause");
	}
