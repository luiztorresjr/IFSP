/*Campinas 22-09-2013
luiz torres junior
Programas 35=
receba dois numeros e receba uma operação matematica e faça o calculo
*/

#include <stdio.h>
#include <stdlib.h>

main(){
       float a,b;
       int c
       printf("Entre com dois numeros reais:");
       scanf("%f",&a);
       scanf("%f"&b);
       printf("Entre com a operação:");
       printf("1 soma, 2 subtração, 3 multiplicacao, 4 divisao.");
       scanf("%i",&c);
       if (c==1){
                 printf("A soma é:%f",a+b);
       		}
	else if (c==2){
			printf("A subtracao e:%f",a-b);
		}
	else if (c==3){
			printf("A multiplicacao e:%f",a*b);
			}
	else if (c==4){
			printf("A divisao e:%f",a/b);
			}
	printf("\n\n");
	system("pause");
}

