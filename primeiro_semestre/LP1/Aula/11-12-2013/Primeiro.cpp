/* 
12-11-2013-IFSP HTO
ler uma matriz e verificar se os valores dela são divisivel por 5, enviar para a outra matriz.
criado por luiz torres junior
programa-65
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
       int vet1[6],vet2[6];
       int cont;
       
       printf("Entre com 5 numeros:\n");    
       for(cont=0;cont<=5;cont++){
          scanf("%d",&vet1[cont]);
          if (vet1[cont]%5==0){
             vet2[cont]=vet1[cont];
                              }
          else
              vet2[cont]=0;
                                  }
       system("cls");
       printf("VETOR 1 :\n");                          
       for(cont=0;cont<=5;cont++){
           printf("%d\n",vet1[cont]); 
                                 }
       printf("\nVETOR 2:\n");
       for(cont=0;cont<=5;cont++){
           printf("%d\n",vet2[cont]);
                                  }
       printf("\n");          
       system("pause");                                                                                                          
}
