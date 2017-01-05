/* 
03-12-2013-IFSP HTO
exercicio 5 Solicitar a idade de várias pessoas e imprimir na 
finalização do programa: total de pessoas com 
menos de 21 anos. Total de pessoas com mais de 50 anos. 
O programa termina quando idade for =-99.
criado por luiz torres junior
programa-73
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      int id,vint=0,cinq=0;
      while(id!=-99){
          printf("Entre com a sua idade: ");
          scanf("%i",&id);
          if(id<21 && id!=-99){
             vint=vint+1;
             }
          else if(id>50){
               cinq=cinq+1;
               }
               }
          printf("total de pessoas com menos de 21 anos e: %i\n",vint);
          printf("Total de pessoas com mais de 50 anos e : %i",cinq);
            printf("\n\n");
      system("pause");
} 
      
