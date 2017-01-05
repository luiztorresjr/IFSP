/* 
19-11-2013-IFSP HTO
formulario de cadastro.
criado por luiz torres junior
programa-64
*/
#include <stdio.h>
#include <stdlib.h>

struct dados_aluno{
       char prontuario[10], nome[30],email[50], naturalidade[30],sexo[1];
       int idade;
       };
struct dados_aluno X;
main()
{      
      printf("Cadastrando os dados: \n");
       fflush (stdin);
        printf("Prontuario: "); gets (X.prontuario);
         fflush (stdin);
          printf("\nNome: "); gets(X.nome);
           printf("\nIdade: "); scanf("%i", &X.idade);
            fflush (stdin);
             printf("\nE-mail: "); gets(X.email);
              fflush (stdin);
               printf("\nSexo: "); gets(X.sexo);
                fflush (stdin);
                 printf("\nNaturalidade: "); gets(X.naturalidade);
                  system("cls");
      printf("Dados cadastrados: \n");
       printf("Prontuario: "); printf("%s",X.prontuario);
        printf("\nNome: "); printf("%s",X.nome);
         printf("\nIdade: "); printf("%i",X.idade);      
          printf("\nE-mail: "); printf("%s",X.email);      
           printf("\nSexo: "); printf("%s",X.sexo);      
            printf("\nNaturalidade: "); printf("%s",X.naturalidade);
      printf("\n\n");
      
system("pause");
}
