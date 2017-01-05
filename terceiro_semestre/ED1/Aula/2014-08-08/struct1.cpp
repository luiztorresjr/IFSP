#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

struct funcionario{

		char nome[30];
		char funcao[30];
		float salario;
	};
	funcionario gerente[2];


main(){
	int i;
	for(i=0;i<2;i++){
		printf("Digite o nome: \n");
		scanf("%s",&gerente[i].nome);
		printf("Digite a funcao: \n");
		scanf("%s",&gerente[i].funcao);
		printf("Digite o salario: \n");
		scanf("%f",&gerente[i].salario);
		}
	system("cls");
	for(i=0;i<2;i++){
		printf("Nome: %s\nFuncao: %s\nSalario: %.2f\n", gerente[i].nome,gerente[i].funcao,gerente[i].salario);
	}
	system("pause");
	}
