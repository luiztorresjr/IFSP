/* 29-10-2013-IFSP HTO
le um vetor de tamanha 10. verificar se houver a leitura do numero 4 ou 11 em
alguma posição do vetor. Apresentar as posiçoes em que has os numeros 4 ou 11
criado por luiz torres junior
programa-52
*/

#include <stdlib.h>
#include <stdio.h>

main()
{
      int num[10], pos;
      for(pos=0;pos<=9;pos++){
          printf("Entre com o numero da posicao %i: ", pos);
          scanf("%i", &num[pos]);
          }
      printf("\n\nA posicao do vetor que possui o numero 4 ou 11 e:\n");
      for(pos=0;pos<=9;pos++){
          if(num[pos]==4 || num[pos]==11)
          printf("posicao (%i)",pos);
          }
      system("pause");
}

