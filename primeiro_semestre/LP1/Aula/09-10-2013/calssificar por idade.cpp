/* 10/09/2013-Homework
Fazer o programa que classifique as pessoas atraves da idade, conforme a tabela.
Luiz Torres Junior
programa=27
*/
#include<stdio.h>
#include<stdlib.h>

main(){
       int idade;
       inicio:
       printf(" Entre com a sua idade:\n");
       scanf("%i",&idade);
       if(idade<=10){
                     printf("Crianca\n");
                     }
       else if(idade>10 && idade<18){
                     printf("Adolecente\n");
                     }
       else if (idade>=18 && idade<70){
            printf("Adulto\n");
            }
       else {
            printf("Idoso\n");
            }
       system("pause");
       system("cls");
       goto inicio;
      }
       
