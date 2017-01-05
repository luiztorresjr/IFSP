/*
Escrever textos com informações variadas obtidas em varias funções
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
      
	  fclose(arq);//fechar o arquivo
      
      printf("\n\n");      
      system("pause");

}
