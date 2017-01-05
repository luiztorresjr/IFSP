struct formulario {
      char nome[20],sobre[30],signo[12],m[12];
      int idade, dian,nasc,atua, peso;
      float altura;
      };
struct formulario x;

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
FILE *arq;
char resp[1];

main()
{
	arq=fopen("I:/IFSP/linguagem de programação 1/aulas/11-26-2013/formulario.txt","a" );
    printf("Entre com o nome: "); fflush(stdin);
	gets(x.nome);
    printf("Entre com o sobrenome: "); fflush(stdin);
	gets(x.sobre);
    printf("Entre com o signo: "); fflush(stdin);
	gets(x.signo);
    printf("Entre com a idade: "); fflush(stdin);
	scanf("%i",&x.idade);
    printf("Entre com o mes de nascimento: "); fflush(stdin);
	gets(x.m);
    printf("Entre com o dia do nascimento: "); fflush(stdin);
	scanf("%i",&x.dian);
    printf("Entre com o ano de nascimento: "); fflush(stdin);
	scanf("%i",&x.nasc);
    printf("Entre com o ano atual: "); fflush(stdin);
	scanf("%i",&x.atua);
    printf("Entre com o seu peso: "); fflush(stdin);
	scanf("%i",&x.peso);
    printf("Entre com a sua altura: "); fflush(stdin);
	scanf("%f",&x.altura);
    fprintf("Nome: %s\n",x.nome);
    fprintf(arq,"Sobrenome: %s\n",x.sobre);
    fprintf(arq,"Signo: %s\n",x.signo);
    fprintf(arq,"Idade: %i\n",x.idade);
    fprintf(arq,"Data de nascimento: %i de %s de %i\n",x.dian,x.m,x.nasc);
    fprintf(arq,"Entre com o ano atual: %i\n",x.atua);
    fprintf(arq,"Peso: %i Kg\n",x.peso);
    fprintf(arq,"A sua altura: %f m.\n",x.altura);
   // printf("\n\nEfetuar um novo cadastro?"); fflush(stdin);
//	scanf("%c",&resp);
    fclose(arq);
    printf("\n\n");
    system("pause");

}
