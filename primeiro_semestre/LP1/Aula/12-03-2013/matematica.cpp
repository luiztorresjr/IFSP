/* 
03-12-2013-IFSP HTO
exemplo de funcao com a passagem de parametro.
criado por luiz torres junior
programa-75
*/
#include <stdio.h>
#include <stdlib.h>

int c;

void soma(int n,int n1)
{
     c=n+n1;
     printf("\n\nO resultado da soma = %i\n\n", c);
}
void subtracao(int n,int n1)
{
     c=n-n1;
     printf("\n\nO resultado da subtracao = %i\n\n", c);
}
void divisao(int n,int n1)
{
     c=n/n1;
     printf("\n\nO resultado da divisao = %i\n\n", c);
}
void multicacao(int n,int n1
)
{
     c=n*n1;
     printf("\n\nO resultado da multiplicacao = %i\n\n", c);
}



//funcao com variavel que ira receber de onde esta sendo chamada.
void quadrado(int n)//aqui a variavel n recebera o valor da variavel numero
{
     int numero_ao_quadrado;
     numero_ao_quadrado=n*n;
     printf("\n\n\O resultado do numero ao quadrado = %i",numero_ao_quadrado);
     system("pause");
}     

main()
{
      int numero,numero1;//v2ariavel local, ou seja, declarada dentro da funcao 
      printf("Entre com o numero: ");
      scanf("%i %i",&numero,&numero1);
      soma(numero,numero1);//chamado funcao com a passagem do numero lido
      subtracao(numero,numero1);
      divisao(numero,numero1);
      multicacao(numero,numero1);
      system("pause");
}
      
