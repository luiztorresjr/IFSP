#include "stdio.h"
#include "stdlib.h"
void tabuada(int n){
    int a,calculatabuada=0;
    for(a=0;a<=10;a++){
        calculatabuada=n*a;
        printf("%i",calculatabuada);
    }
}

main(){
       int numero;
       scanf("%i",&numero);
       tabuada(numero);
       system("pause");
}
        
