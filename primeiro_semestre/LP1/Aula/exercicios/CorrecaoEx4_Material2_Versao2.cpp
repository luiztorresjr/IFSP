/* Atividade 4 - material 2
   Correção: 23/08/2013
   Versão 02
*/

#include <stdio.h>
#include <stdlib.h>
main()
{
	int num,i,mult[11];
	printf("Qual sera o numero para apresentar a tabuada?");
	scanf("%i",&num);
	system("cls");
	printf("A tabuada de %i\n",num);
	for(i=0;i<=10;i++){
	 mult[i]=num*i;
     printf("%i X %i  = %i\n",num,i,mult[i]);
	}
	printf("\n\n");
system("pause");
}