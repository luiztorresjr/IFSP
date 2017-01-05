/*
Tabuada v5.0
progrma 42 08-10-2013
luiz torres junior
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int num, a,op;
      do{
      printf("Numero: ");
      scanf("%i",&num);
      for(a=0;a<=10;a++){
                         printf("%i X %i = %i\n", num, a, num*a);
                         }
      printf("Outra tabuada (1-Sim/ 2-Nao");
      scanf("%i",&op);                   
      }while(op==1);
                         system ("pause");
}
