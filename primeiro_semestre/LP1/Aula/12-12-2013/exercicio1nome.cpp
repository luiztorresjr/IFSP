/*
05-11-2013-IFSP HTO
escrever as 4 letra de um nome
criado por luiz torres junior
programa-69
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      int i;
      char nome[20];
      printf("Entre com o nome\n");
      fflush(stdin);
      gets(nome);
      for(i=0;i<=3;i++){
          printf("%c",nome[i]);
      }
      printf("\n\n");
      system("pause");
}
