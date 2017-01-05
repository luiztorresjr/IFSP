/*Bubblesort 
05-11-2013-IFSP
criado por luiz torres junior  
Organizar vetor dos numeros 5-4-3-1-2
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
      int VETO [5]={5,4,3,1,2};
      int x,y,temp;
      for(x=0;x<=4;x++){
                        for(y=0;y<=4;y++){
                                          if(VETO[y]>VETO[y+1]){
                                                             temp=VETO[y];
                                                             VETO[y]=VETO[y+1];
                                                             VETO[y+1]=temp;
                                                             }
                                          }  
                        }
      
      system("pause");
}
