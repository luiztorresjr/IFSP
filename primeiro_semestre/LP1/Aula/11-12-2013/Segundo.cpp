/* 
12-11-2013-IFSP HTO
Busca sequencial: ler o vetor, Em seguida perguntar um numero e verificar se este existe no vetor. Se existir ele da a mensagem encontrou e abandona a busca.
criado por luiz torres junior
programa-66
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int num[9],x,i;
      printf("Entre com os numeros:");  
      for(i=0; i<=8; i++){
               scanf("%i",&num[i]);
               }
      printf("Entre com um numero qualquer :");
      scanf("%i",&x);
      i=0;
      do{
          if(x==num[i]){
             printf("O numero %i encontrado",x);
             i=i+8;
                  }
          else
              i++;
                 }while(i<=8);
                 printf("\n\n");
               
      system("pause");             
}
