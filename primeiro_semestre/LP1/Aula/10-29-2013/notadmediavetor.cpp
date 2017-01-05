/* 29-10-2013-IFSP HTO
ler 50 notas e apresentar a media das notas.
criado por luiz torres junior
programa51
*/
#include <stdio.h>
#include <stdlib.h>

main()
{
      float nota[6];
      int pos;
      for(pos=0;pos<=4;pos++){//lendo vetor
                              printf("Entre com a %i nota: ", pos+1);
                              scanf("%f",&nota[pos]);
                              nota[6]=nota[6]+nota[pos];                                                                                    
                              }
      printf("\n\nA media e: %.2f\n",nota[6]/pos );
      system("pause");
}
