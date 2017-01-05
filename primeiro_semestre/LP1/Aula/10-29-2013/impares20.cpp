/*
29-10-2013-IFSP HTO
ler um vetor de 20 posiçoes. apresentar quantos numeros lidos sao impares
criado por luiz torres junior
programa-54
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
     int num[20], cont,i=0;//impar;
     printf("Entre com os numeros:");
     for(cont=0;cont<=19;cont++){
                                 scanf("%i",&num[cont]);

                                  if(num[cont] % 2 != 0){
                                             i++;//soma impares
                                             }
                                 }

     printf("A quantidade de impares e: %i\n", i);
     system("pause");
}
