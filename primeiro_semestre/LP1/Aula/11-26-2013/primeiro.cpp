/* 
11-26-2013-IFSP HTO
Estrutura de dado 
criado por luiz torres junior
programa-66
*/

#include <stdio.h>
#include <stdlib.h>
struct produtos{
       int codproduto;
       char nomeproduto[30];
       int qtdeestoque;
       float valor;
};

struct produtos p;
 
main()
{
      printf("\tCadastro de Produtos\n");
      printf("Codigo: ");
      scanf("%i",&p.codproduto);
      printf("Produto: ");
      scanf("%s",&p.nomeproduto);
      printf("Quantidade: ");
      scanf("%i",&p.qtdeestoque);
      printf("Valor: R$ ");
      scanf("%f",&p.valor);   
      system("cls");  
      printf("Codigo do produto.............. %i\nNome do produto................ %s\n",p.codproduto,p.nomeproduto);
      printf("valor do produto..............R$%.2f\nQuantidade em estoque.......... %i u.",p.valor,p.qtdeestoque);      
      printf("\n\n");
      system("pause");
}
