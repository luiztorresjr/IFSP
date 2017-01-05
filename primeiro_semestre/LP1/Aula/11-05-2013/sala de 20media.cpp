/* 
05-11-2013-IFSP HTO
ler nome do aluno notas do 1º e do segundo semestre. cada informação devera ficar em um vetor. calcular a media do aluno e guardar em outor vetor
, no final mostrar o nome do aluno e a media final sabe-se que a turnam tem 20 alunos.
criado por luiz torres junior
programa-60
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      char nome[20][25];
      float nota1[20], nota2[20],media[20];
      int cont;
            
      for(cont=0;cont<=19;cont++){
          printf("Entre com o nome do aluno %i :\n",cont+1);
          gets(nome[cont]);
          printf("\nEntre com a nota do 1 semestre do aluno %i :\n",cont+1);
          scanf("%f",&nota1[cont]);
          printf("\nEntre com a nota do 2 semestre do aluno %i :\n",cont+1);
          scanf("%f",&nota2[cont]);
          }
    for(cont=0;cont<=19;cont++){
          media[cont]=(nota1[cont]+nota2[cont])/2;
          printf("O %s obteve media: %.2f\n",nome[cont],media[cont]);
          }      
      system("pause");
}
