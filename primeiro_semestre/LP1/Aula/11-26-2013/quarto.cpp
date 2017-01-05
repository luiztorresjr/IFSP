/* 
11-26-2013-IFSP HTO
funcao 
criado por luiz torres junior
programa-66
*/

#include <stdio.h>
#include <stdlib.h>

int op;
int a, b, calc;
void entradadevalores()
{
                 printf("Entre com o primeiro valor:");scanf("%i",&a);
                 printf("Entre com o segundo valor:");scanf("%i",&b);
}

void soma()
{
      calc=a+b;
      printf("\n\nO resultado da soma e = %i",calc);
      system("pause");
}
main()
{
      system("cls");
      printf("Calculos Matematicos \n\n");
      printf("1 - Somar\n");
      printf("2 - Subtrair\n");
      printf("3 - Multiplicar\n");
      printf("4 - Dividir\n");
      printf("5 - Sair\n");
      printf("Entre com a opcao: "); scanf("%i",op);
      if(op==1){
               entradadevalores();
               soma();
               }
      else if (op==2){
           entradadevalores();   
           }        
      printf("\n");      
      system("pause");
}
