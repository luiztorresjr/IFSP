/*
05-11-2013-IFSP HTO
10 % de um valor
criado por luiz torres junior
programa-70
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      float valor,rea;
      printf("Entre com um valor:");
      scanf("%f",&valor);
      rea=valor*0.1;
      valor=valor+rea;
      printf("O valor com reajuste eh: %.2f",valor);

      printf("\n\n");
      system("pause");
}
