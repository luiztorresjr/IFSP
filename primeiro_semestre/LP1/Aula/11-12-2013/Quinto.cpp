/* 
12-11-2013-IFSP HTO
ler uma matriz de 5 X 5 e apresentar na tela.
criado por luiz torres junior
programa-70
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int matriz [5][5],lin,col;
      
      for(lin=0;lin<=4;lin++){
          for(col=0;col<=4;col++){
             printf("Entre com os valor da linha %i e coluna %i: ", lin+1,col+1);                     
             scanf("%i",&matriz[lin][col]);
                                       }
                                }
      system("cls");
      printf("  A matriz: \n\n  ");                         
      for(lin=0;lin<=4;lin++){
         for(col=0;col<=4;col++){
          printf(" %i", matriz[lin][col]);                    
             }
             printf("\n");
             }
      system("pause");
}
          
             
