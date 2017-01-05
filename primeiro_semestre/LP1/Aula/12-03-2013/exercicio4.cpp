/* 
03-12-2013-IFSP HTO
exercicio 4
criado por luiz torres junior
programa-72
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      int d,num,som;
      float me=0;
      som=0;
      d=0;
      while(num!=0){
          printf("Entre com um numero: ");
          scanf("%i",&num);
          if(num%3==0 && num!=0){
                       som=num+som;
                       d++;
                       }
      }
      me=som/d;
      printf("A media dos multiplos de 3 e: %.2f",me);
      printf("\n\n");
      system("pause");
}     

      
      
      
