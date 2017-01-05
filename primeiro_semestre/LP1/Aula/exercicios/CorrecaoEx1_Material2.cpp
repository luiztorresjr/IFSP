/*Correção exercício 1 - material 2
  Correção: 23/08/2013
*/
#include "stdio.h"
#include "stdlib.h"
main(){
	float valor1, valor2, valor3, media;
	printf("\nEntre com o primeiro valor:");
	scanf("%f",&valor1);
	printf("\nEntre com o segundo valor:");
	scanf("%f",&valor2);
	printf("\nEntre com o terceiro valor:");
	scanf("%f",&valor3);
	media=(valor1+valor2+valor3)/3;
	printf("\n\nMedia = %.2f",media);
	system("pause");
}

