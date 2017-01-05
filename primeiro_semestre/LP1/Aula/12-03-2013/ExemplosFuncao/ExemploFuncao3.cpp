#include "stdio.h"
#include "stdlib.h"
void relacaonumeros2(int n){
    int a;
    for(a=n;a>=1;a--)
        printf("%i",a);
    printf("%i",n);
}

main(){
       int numero;
       scanf("%i",&numero);
       relacaonumeros2(numero);
       system("pause");
}
        
