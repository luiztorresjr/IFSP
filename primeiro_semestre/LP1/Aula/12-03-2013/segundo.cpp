/* 
03-12-2013-IFSP HTO
segundo
criado por luiz torres junior
programa-74
*/
#include <stdio.h>
#include <stdlib.h>

int a, b, c;//declaracao de variaveis global

void soma()
{
     c=a+b;
     printf("\n\nO resultado da soma = %i\n\n", c);
}

void entrada()
{
      printf("Digite o primeiro numero:  ");scanf("%i",&a);
      printf("Digite o segundo numero:  ");scanf("%i",&b);
}

main()
{
      entrada();
      soma();
      system("pause");
}
      
     
