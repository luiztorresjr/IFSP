/* 
03-12-2013-IFSP HTO
exemplo de funcao com a passagem de parametro.
criado por luiz torres junior
programa-75
*/
#include <stdio.h>
#include <stdlib.h>

//funcao com variavel que ira receber de onde esta sendo chamada.
void quadrado(int n)//aqui a variavel n recebera o valor da variavel numero
{
     int numero_ao_quadrado;
     numero_ao_quadrado= n * n;
     printf("\n\n\O resultado do numero ao quadrado = %i",numero_ao_quadrado);
     system("pause");
}     

main()
{
      int numero;//variavel local, ou seja, declarada dentro da funcao 
      printf("Entre com o numero: ");
      scanf("%i",&numero);
      quadrado(numero);//chamado funcao com a passagem do numero lido
}
      
