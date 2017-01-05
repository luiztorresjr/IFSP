/* 
05-11-2013-IFSP HTO
ler uma matriz.
criado por luiz torres junior
programa-61
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      int i;
      char nome[20];
      printf("Entre com o nome"); 
      fflush(stdin);           
      gets(nome);
      for(i=0;i<=3;i++){      
          printf("%c",nome[i]);
      }
      printf("\n\n");
      system("pause");      
}
