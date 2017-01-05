/*
	Name: numero em ordem
	Copyright: KlonSoft
	Author: LTJ
	Date: 07/09/13 20:39
	Description: declare tres numeros decidir qual é a ordem crescente dos numeros.
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
       float num1,num2,num3;
       printf("Entre com o primeiro numero:");
       scanf("%f",&num1);
       printf("Entre com o segundo numero:");
       scanf("%f",&num2);
       printf("Entre com o terceiro numero:");
       scanf("%f",&num3);
       if((num1>num2) && (num2>num3));
       printf("A ordem crescente do numero e: %i %i %i\n",num1,num2,num3);
       system("pause");
       }

