/* Atividade 4 - material 2
   Correção: 23/08/2013
   Versão 01
*/

#include "stdio.h"
#include "stdlib.h"
main(){
	int num,calc;
	printf("Qual sera o numero para apresentar a tabuada?");
	scanf("%i",&num);
	calc=num*0;
	system("cls");
	printf("Tabuada do numero %i\n\n",num);
	printf("%i X 0  = %i\n",num,calc);
	calc=num*1;
	printf("%i X 1  = %i\n",num,calc);
	calc=num*2;
	printf("%i X 2  = %i\n",num,calc);
	calc=num*3;
	printf("%i X 3  = %i\n",num,calc);
	calc=num*4;
	printf("%i X 4  = %i\n",num,calc);
	calc=num*5;
	printf("%i X 5  = %i\n",num,calc);
	calc=num*6;
	printf("%i X 6  = %i\n",num,calc);
	calc=num*7;
	printf("%i X 7  = %i\n",num,calc);
	calc=num*8;
	printf("%i X 8  = %i\n",num,calc);
	calc=num*9;
	printf("%i X 9  = %i\n",num,calc);
	calc=num*10;
	printf("%i X 10 = %i\n",num,calc);
	system("pause");
}


