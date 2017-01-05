/* 
05-11-2013-IFSP HTO
ler uma matriz.
criado por luiz torres junior
programa-61
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int MAT[4][4],col,lin;
      
      for(lin=0;lin<=3;lin++){
          for(col=0;col<=3;col++){
             scanf("%i",&MAT[lin][col]);
                                 }
                              }
//imprimir:
      for(lin=0;lin<=3;lin++){
          for(col=0;col<=3;col++){
              printf("| %i |",MAT[lin][col]);
                             }
              printf("\n");
                        }
              system("pause");          
}
