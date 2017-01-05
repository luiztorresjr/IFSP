#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

float aumento(float valor, int por){
	 float aum,p;
	 p=por/100;
	 aum = valor +(valor *p);
	 return aum;
}

struct funcionario{

		char nome[30];
		char funcao[30];
		float salario;
		float porcentagem;
	};
funcionario gerente[2];


main(){
	int i, por;
	for(i=0;i<2;i++){
		puts("Digite o nome: \n");
		scanf("%s",&gerente[i].nome);
		puts("Digite a funcao: \n");
		scanf("%s",&gerente[i].funcao);
		puts("Digite o salario: \n");
        scanf("%f",&gerente[i].salario);
       
	}
	 puts("Digite a porecentagem do aumento: ");
    scanf("%d", &por);
       
	for(i=0;i<2;i++){
		printf("Nome: %s\nFuncao: %s\nSalario sem aumento: %.2f\nSalario com aumento: %.2f\n", gerente[i].nome, gerente[i].funcao, gerente[i].salario, aumento(gerente[i].salario, por));
	}
	system("pause");
	}

