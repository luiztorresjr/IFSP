/* 
ler uma estrutura de dados e armazenar emum arquivo texto 
data: 11-26-2013
programa 67
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct carros{
       char placa[8], modelo[30], marca[25], cor[30];
       int ano;
       float valor;
       };
struct carros c;
FILE *arq;
char resp[1];
main()
{
     //int op=0;
      
      //volta:
      arq=fopen("I:/IFSP/linguagem de programação 1/aulas/11-26-2013/carros.txt","a" );
      do{
      printf("\tCadastro de Carros\n");
      printf("Placa....."); scanf("%s",&c.placa);fflush(stdin);
      printf("Modelo... "); scanf("%s",&c.modelo);fflush(stdin);
      printf("Marca.... "); scanf("%s",&c.marca);fflush(stdin);
      printf("Cor......."); scanf("%f",&c.cor);fflush(stdin);   
      printf("Ano......."); scanf("%i",&c.ano);fflush(stdin); 
      printf("Valor......."); scanf("%f",&c.valor);fflush(stdin); 
    //  printf("repetir processo:\1-sim\n2-nao");
      //scanf("%i",&op);fflush(stdin);
      fprintf(arq,"Placa.............. %s\nModelo................ %s\n",c.placa,c.modelo);
      fprintf(arq,"Marca..............%s\nCor.......... %s\n",c.marca,c.cor); 
      fprintf(arq,"Ano.............. %i\nValor................ %.2f\n\n",c.ano,c.valor);
      printf("\n\nEfetuar um novo cadastro?"); fflush(stdin);
      scanf("%c",&resp);
      system("cls");
      }while(strcmp(resp,"s")==0 || strcmp(resp,"S")==0);
      
      //if(strcmp(resp,"s")==0 || strcmp(resp,"S")==0)
      //                       goto volta;
      
      fclose(arq);              
      printf("\n\n");
      system("pause");
}
      

