/*loop,la�o 17-09-2013
criado por: Luiz Torres Junior 
imprimir de 1 a 100
programa33= wma professora esta ensinado as crian�as a contart de 1 ate 10. sendo assim, fa�a um  progrma que a crian�a digite um numero e montre a quantidade em caracteres (*)
*/
#include <stdio.h>
#include <stdlib.h>

main(){
       int numero,a=1;
       inicio:
       printf("qual o numero:");
       scanf("%i",&numero);
       if(numero>=1 && numero<=10){
               printf("%i -",numero);
               while(a<=numero){
                      printf("*");
                      a++;
                      }
                                   }
       else {
             printf("numero invalido");
             printf("\n");
             system("pause");
             goto inicio;
            }
       system("pause");
       }
       
