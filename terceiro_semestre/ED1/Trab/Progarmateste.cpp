/*
Escrever textos com informa��es variadas obtidas em varias fun��es
Campinas 23-08-2014
Criado por Luiz Torres Junior
Programa 300
*/

void texto(char texto[255]){
/* 
11-26-2013-IFSP HTO
Estrutura de dado 
criado por luiz torres junior
programa-67
*/

#include <stdio.h>
#include <stdlib.h>


FILE *arq; //variavel do tipo de arquivo


      /*
      fopen indica o local que ira gravar o arquivo texto ex: ("c:/ lembrar que a barra deve ser todas nesta dire��o e deve e
      estar entre aspas","a");
      a - caso o arquivo nao exista ele cria e abre para leitura e grava��o
      w - ele cria, porem se ja existir ele sobrep�e o arquivo
      r - ele abre apenas para leitura, n�o permitindo grava��o.
       */
      arq=fopen("I:/IFSP/linguagem de programa��o 1/aulas/11-26-2013/criatexto.txt","a");
      
      printf("Entre com um texto qualquer:\n");
      gets(texto);
      
      //gravando a variavel no arquvo texto que definimos o diretorio
      fprintf(arq,"%s \n",texto);
      
	  fclose(arq);//fechar o arquivo
      
      printf("\n\n");      
      system("pause");

}
