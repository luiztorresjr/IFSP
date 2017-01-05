#include <stdio.h>
#include "stdlib.h"

void SOMA(int x, int y)
{
   int result;
   result = x+y;
   printf("A soma de %i com %i  %i\n", x,y,result);
}

main()
{
    int a,b;

    a = 10;
    b = 12;
    SOMA(a,b);
    printf("%i",soma(a,b));
    system("pause");
}
