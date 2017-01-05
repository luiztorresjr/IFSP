/* 
11-26-2013-IFSP HTO
Estrutura de dado 
criado por luiz torres junior
programa-67
*/

#include <stdio.h>
#include <stdlib.h>

char texto[255], texto2[255];
FILE *arq; //variavel do tipo de arquivo

main()
{
      /*
      fopen indica o local que ira gravar o arquivo texto ex: ("c:/ lembrar que a barra deve ser todas nesta direção e deve e
      estar entre aspas","a");
      a - caso o arquivo nao exista ele cria e abre para leitura e gravação
      w - ele cria, porem se ja existir ele sobrepõe o arquivo
      r - ele abre apenas para leitura, não permitindo gravação.
       */
      arq=fopen("I:/IFSP/linguagem de programação 1/aulas/11-26-2013/criatexto.txt","a");
      
      printf("Entre com um texto qualquer:\n");
      gets(texto);
      
      //gravando a variavel no arquvo texto que definimos o diretorio
      fprintf(arq,"%s \n",texto);
      
      printf("Entre com um texto2 qualquer:\n");
      
      gets(texto);
      
      fprintf(arq,"%s \n",texto2);
      
      fclose(arq);//fechar o arquivo
      
      printf("\n\n");      
      system("pause");
}

