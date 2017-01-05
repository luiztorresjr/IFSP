/*
29-10-2013-IFSP HTO
le um numero de 2 a 9 calcular a tabuada e armazenar em um vetor apresentar a tabuada na tela
criado por luiz torres junior
programa-56
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int num[20], cont,trio=0;
      for(cont=0;cont<=19;cont++){
                                 printf("entre com o numero: ");
                                 scanf("%i", &num[cont]);
                                 }
      for(cont=0;cont<=19;cont++){
                                if(num[cont]==1 && num[cont+1]==1 && num[cont+2]==1){
                                trio++;
                                cont=cont+3;
                                }
                                 }
      printf("O numero de 111 e: %i\n", trio);
      system("pause");
}


