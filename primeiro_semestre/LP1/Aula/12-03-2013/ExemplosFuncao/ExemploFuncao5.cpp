#include "stdio.h"
#include "stdlib.h"
void ordena(int n[5]){
    int a,b,aux=0;
    for(a=0;a<=4;a++){
        for(b=1;b<=4;b++){
            if(n[b-1]>n[b]){
                aux=n[b-1];
                n[b-1]=n[b];
                n[b]=aux;     
            }
        }             
    }
    for(a=0;a<=4;a++)
        printf("%i",n[a]);
}

main(){
       int vetor[5]={4,2,5,3,1};
       ordena(vetor);
       system("pause");
}
