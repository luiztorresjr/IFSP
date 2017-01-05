/*
	Name: programa 22= numero é 50<n<100
	Copyright: 
	Author: 
	Date: 05/09/13 22:20
	Description: verificar se um numero esta entre o intervalo de 50 a 100
*/
#include <stdio.h>
#include <stdlib.h>
main(){
       int num;
       inicio:
       printf("Entre com o um numero:");
       scanf("%i",&num);
       if((num>=50)&&(num<=100)){
            printf("Esta entre 50 e 100\n");
                               }
       else if(num<50){
            printf("O numero e menor que 50\n");
                      }
       else{
            printf("O numero e maior que 100\n");
            }
        system("pause");
        system("cls");
        goto inicio;
        }                                   
