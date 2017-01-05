#include <stdio.h>
#include <stdlib.h>

main(){
       int nu1,nu2;
       printf("Entre com o primeiro numero inteiro:\n");
       scanf ("%i" ,&nu1);
       printf("Entre com o segundo numero inteiro:\n");
       scanf ("%i" ,&nu2);
       if (nu1>nu2){
              printf("O primeiro e o maior: %i", nu1);
              }
       else if (nu2>nu1){
              printf("O segundo e o maior: %i", nu2);
       }
       else {
       printf("Os dois sao iguais.");
       }
       printf("\n\n");
       system("pause");
    }

