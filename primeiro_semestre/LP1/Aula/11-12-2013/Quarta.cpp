/* 
12-11-2013-IFSP HTO
14 alunos ler a altura e apresentar quantos alunos tem mais de 1,69.
criado por luiz torres junior
programa-69
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      float altura[14];
      int cont,maior=0;
      char nome;
      /*
      printf("Entre com nome dos alunos: \n");
      for(cont=0;cont<=1;cont++){      
      scanf("%s", &nome[cont]);
      }*/
      for(cont=0;cont<=1;cont++){
      printf("Entre com a altura do %s : \n"/*,nome[cont]*/);
            scanf("%f",&altura[cont]);
      if (altura[cont]>1.69){
                             maior++;
                             }
                             }
      printf("\nA quantidade de alunos maiores de 1.69 m e: %i\n\n",maior);
      system("pause");
}
