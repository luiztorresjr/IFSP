/*O maior de dois numeros
criado por Luiz Torres Junior
14-09-2013
programa 32
*/
#include <stdio.h>
#include <stdlib.h>

main(){
       float nota;
       printf("Enre com a nota: \n");
       scanf("%.2f",&nota);
       if(nota>=8 && nota<=10){
              printf("Conceito A");
              }
       else if(nota>=6 && nota<=7.99){
              printf("Conceito B");
              }
       else if(nota>=4 && nota<=5.99){
              printf("Conceito B");
              }
       else if(nota>=2 && nota<=3.99){
              printf("Conceito B");
              }
       else if(nota>=0 && nota<=1.99){
              printf("Conceito B");
              }
       else
              printf("Nota invalida");

       system("pause");
}

