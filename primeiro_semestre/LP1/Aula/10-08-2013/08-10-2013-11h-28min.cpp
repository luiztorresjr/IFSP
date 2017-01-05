/*
programa 41 08-10-2013
Luiz Torres Junior

*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      int mar=0,sam=0,mari=0,bran=0,nul=0,totalaluno=1,voto;
      while(totalaluno<=13){
                           system("cls");
                           printf("1-Marcio\n");
                           printf("2-Samuel\n");
                           printf("3-Mariana\n");
                           printf("4-Branco\n");
                           printf("5-Nulo\n");
                           printf("Vote: "); 
                           scanf("%i",&voto);
                           if(voto==1){
                                       mar++;
                                       }
                           if(voto==2){
                                sam++;
                                }
                           if(voto==3){
                                       mari++;
                                       }
                           if(voto==4){
                                       bran++;
                                       }
                           if(voto==5){
                                       nul++;
                                       }
                           totalaluno++;
                           }
                           system("cls");
                           printf("____________________________\n");
                           printf("| Total de votos apurados: |\n");
                           printf("| Marcio................%i |\n",mar);
                           printf("| Samuel................%i |\n",sam);
                           printf("| Mariana...............%i |\n",mari);
                           printf("| Branco................%i |\n",bran);
                           printf("| Nulo..................%i |\n",nul);
                           printf("____________________________\n");
                                                      
      system("pause");
}
