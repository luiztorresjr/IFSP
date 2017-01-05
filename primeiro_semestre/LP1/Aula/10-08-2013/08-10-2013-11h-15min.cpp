/*
programa 40 08-10-2013

luiztorres junior
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      float valor, total,compra=0;
      int qtde;
      while(valor!=0){
      printf("Valor: ");scanf("%f",&valor);
      printf("Qtde: "); scanf("%i",&qtde);
      total = valor * qtde;
      compra = total + compra;
      }
      printf("\n\n");
      printf("O total da compra R$ %.2f\n",compra);
      system("pause");
}
      
