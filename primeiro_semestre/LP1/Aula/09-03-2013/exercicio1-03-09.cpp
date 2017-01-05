/*
	Name: programa 21 = Soma de dois numeros > 0
	Copyright: KlonSoft
	Author: LTJ
	Date: 05/09/13 21:57
	Description: ler dois numero se os dois numeros for >0 , soma-los e apresentar o resultado
*/
#include <stdio.h>
#include <stdlib.h>

main(){
       int a,b,soma;
       inicio:
       printf("Entre com o primeiro numero:\n");
       scanf("%i",&a);
       printf("Entre com o segundo numero:\n");
       scanf("%i",&b);
       if((a>0) && (b>0)){
                     soma=a+b;
                     printf("A soma e: %i\n",soma);
                     }
       else
            printf("O numeros não são maiores que zero\n");
       system("pause");
       system("cls");            
       goto inicio;
                   }
       
