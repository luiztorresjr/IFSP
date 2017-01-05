/* 
03-12-2013-IFSP HTO
exercicio 6 Preencher um vetor com 6 números 
e mostra-los na tela na ordem contrária em que foram lidos
criado por luiz torres junior
programa-72
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      int i,num[6];
      printf("Entre com 6 numeros:\n");
      for (i=0;i<=5;i++){
          scanf("%i",&num[i]);
          }
      i=6;
      system("cls");
      //while(i>=0){
       for (i=5;i>=0;i--){
          printf("%i ",num[i]);
          }
      system("\n\n");
      system("pause");
}
