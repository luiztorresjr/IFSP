/*Campinas 15-09-2013
criado por LTJ
programa 30 calcular a media de 4 numeros e decidir se esta aprova ou exame
*/

#include <stdio.h>
#include <stdlib.h>

main(){
       float n1,n2,n3,n4,me;
       printf ("entre com as notas:\n");
       scanf("%f",n1);
       scanf("%f",n2);
       scanf("%f",n3);
       scanf("%f",n4);
       me=(n1+n2+n3+n4)/4;
       if(me>=7)
       printf("Aprovado");
       else
       ("Exame");
	printf("\n\n");
       system("pause");
       }
