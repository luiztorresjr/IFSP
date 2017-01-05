/* 
19-11-2013-IFSP HTO
armazenamento em struct em arquivo.
criado por luiz torres junior
programa-65
*/
#include <stdio.h>
#include <stdlib.h>

struct signo_aluno{
       char signo[20];
       };
struct signo_aluno s;

main()

{
      int op;
      FILE  *arq;  //FILE = variavel externa
      arq = fopen("I:/IFSP/linguagem de programação 1/aulas/19-11-2013","a");//"Exemplo: I:\jas. é o caminho onde vai criar 
      do{
      op=0;
      printf("Entre com o signo: ");
      fflush(stdin);
      gets(s.signo);
      fprintf(arq,"%s\n",s.signo); //gravar  arq = arquivo, %s = tipo que ira gravar, s.signo = campo p/ gravar
      printf("\n\n Novamente (1 = SIM / 2 = NAO): ");
      scanf("%i",&op);
      }while(op==1);
      fclose(arq);// fechar aquivo
      
      system("pause");
}
