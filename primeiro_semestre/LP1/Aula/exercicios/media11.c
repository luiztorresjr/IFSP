#include <stdio.h>
#include <stdlib.h>

main()
{
      int i, jogador=1;
      float  media, soma=0;

      while (jogador<=11){
            printf("Idade do jogador %i\n", jogador);
            scanf("%i",&i);
            soma=i+soma;
            jogador++;
            }
      media=soma/11;
      printf("A media de idades e:%f",media);
      system("pause");
}
