/* 
12-11-2013-IFSP HTO
Armazenar em um vetor de 10 posiçoes apenas os numeros 1 ou 0. Se for digitado um numero que não seja 1 ou 0 nao armazenar no vetor.
criado por luiz torres junior
programa-67
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
        int vet[10],num,x=0;
        voltar:   
        system("cls");   
           printf("Faltam %i numeros para preencher o vetor \n\n",10-x);
           printf("Entre com o numero 0 ou 1: ");
           scanf("%i",&num);
           if(num==0 || num==1){
                     while(x<=9){
                     vet[x]= num;
                     x++;
                     goto voltar;
                     }
                     }
          else {
              printf("Numero invalido !!!! So e permitido numero 0 ou 1\n");
              system("pause");
              goto voltar;
               }
               system("cls"); printf("Valores armazenados no vetor: \n");
               for(x=0;x<=9;x++){
                                 printf("%i - ",vetor[x]);
                                 }
                                          printf("\n\n");
           system("pause");
           
}
      
