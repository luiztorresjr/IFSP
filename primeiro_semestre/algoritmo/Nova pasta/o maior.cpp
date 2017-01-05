/*
  Name: o maior
  Copyright: KlonSoft
  Author: .L.T.J.
  Date: 06/09/13 22:35
  Description: atraves de tres numeros inteiros decidir o maior dos tres.
*/
#include <stdio.h>
#include <stdlib.h>

 main (){
       int num1, num2, num3;
       inicio:
       printf("Entre com o primeiro numero inteiro:");
       scanf("%i", & num1);
       printf("Entre com o segundo numero inteiro:");
       scanf("%i", & num2);
       printf("Entre com o terceiro numero inteiro:");
       scanf("%i", & num3);
       if(num1>num2 && num1>num3){
                    printf("O primeiro numero e o maior\n");
                    }
       else if (num2>num1 && num2>num3){
                    printf("O segundo numero e o maior\n");
                    }
       else if (num3>num1 && num3>num2){
                    printf("O terceiro numero e o maior\n");
                    }
       else {
            printf("Os numeros sao iguais\n");
       }
       system("pause");
       system("cls");
       goto inicio;
       }
