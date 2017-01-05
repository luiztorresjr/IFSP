#include "stdio.h"
#include "stdlib.h"
void relacaonumeros(int n){
    int a;
    for(a=n;a>=1;a--)
        printf("%i",a);
    for(a=1;a<=n;a++)
        printf("%i",a);
}

main(){
       int numero;
       scanf("%i",&numero);
       relacaonumeros(numero);
       system("pause");
}
        
