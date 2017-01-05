/*Para que um aviador pouse ingressar em um determinado
curso de pilotagem ele necessita satisfazer as seguintes condições:
      -altura maior ou igual a 1.65
      -peso entre 60 e 95
      -idade entre 21 e 35
      -hora de voo superior a 1500
*/
#include <stdio.h>
#include <stdlib.h>

main(){
       int id,hor;
       float alt,pes;
       inicio:
       printf("Entre com a idade:");
       scanf("%i",&id);
       printf("Entre com o altura:");
       scanf("%f",alt);
       printf("Entre com o peso");
       scanf("%f",pes);
       printf("Entre com as horas de voo:");
       scanf("%i",&hor);
       if((id>=21 && id<=35) && (alt>=1.65) && (pes>=60 && pes<=95) && (hor>1500)){
                  printf("Aprovado");
                  }
       else
       printf("Reprovado");
       system("pause");
       }
