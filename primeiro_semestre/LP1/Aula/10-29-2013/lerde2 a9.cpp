/* 
29-10-2013-IFSP HTO
le um numero de 2 a 9 calcular a tabuada e armazenar em um vetor apresentar a tabuada na tela
criado por luiz torres junior
programa-53
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
      int tab[11], num, mult;
      do{
      printf("entre com um numero: ");
      scanf("%i",&num);            
      }while(num<2 || num>9);
      printf("___________Tabuada de %i___________",num);
      for(mult=0;mult<=10;mult++){
           tab[mult]=num*mult;
           printf("\n            %i X %i = %i\n",num,mult,tab[mult]);
                                 }
      system("pause");
}
      
      
