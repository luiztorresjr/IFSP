/*programa 35
criado por Luiz Torres Junior
02-10-2013
*/
#include <stdio.h>
#include <stdlib.h>
main()
{
      int num;
      printf("Digite um numero:");
      scanf("%d",&num);
      if(num>10)
         printf("\n\nO numero maior que 10");
         if(num==10){
         printf("\n\nVoce acertou!\n");
         printf("O numero e igual a 10.");
         }
         if(num<10)
            printf("\n\nO numero e menor que 10");
        return(0);

}
