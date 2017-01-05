/* 
19-11-2013-IFSP HTO
faca uma matriz de 4 x 4 que cada linha vira um vetor.
criado por luiz torres junior
programa-63
*/
#include <stdio.h> vbn
#include <stdlib.h>

main()
{
      int m[4][4], l  ,c , v1[4], v2[4], v3[4], v4[4];
      for(l=0;l<=3;l++){
          for(c=0;c<=3;c++){
              scanf("%i",&m[l][c]);
              }
              }
      for(c=0;c<=3;c++){
         v1[c]= m[0][c];
         v2[c]= m[1][c];
         v3[c]= m[2][c];
         v4[c]= m[3][c];
         }
         system("cls");
      printf("Matriz\n\n");
      for(l=0;l<=3;l++){
          for(c=0;c<=3;c++){
              printf("| %i |",m[l][c]);
              }
              printf("\n");
               }             
      printf("\n\n");
      printf(" Vetor por linha:\n");
      for(l=0;l<=3;l++){
          printf("V1 = %i V2 = %i V3 = %i V4 = %i",v1[l],v2[l],v3[l],v4[l]); 
          printf("\n"); 
          }   
      printf("\n\n");
      system("pause");
} 
      
