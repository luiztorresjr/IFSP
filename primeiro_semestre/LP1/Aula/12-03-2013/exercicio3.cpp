/* 
03-12-2013-IFSP HTO
exercicio 3
criado por luiz torres junior
programa-71
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()
{
      float sal,pres,emp;
      printf("Entre com o salario: ");
      scanf("%f",&sal);      
      printf("Entre com o valor da prestacao: ");
      scanf("%f",&pres);   
      if (pres>sal*0.2)
      printf("Emprestimo nao pode ser concedido");
      else
      printf("Emprestimo concedido");
            
      printf("\n\n");
      system("pause");
}     
         
      
      
