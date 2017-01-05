#include <stdio.h>
#include <stdlib.h>

main()
{
      int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
      float media;

      printf("Entre com 11 idades:\n");
      scanf("%i%i%i%i%i%i%i%i%i%i%i",&i1,&i2,&i3,&i4,&i5,&i6,&i7,&i8,&i9,&i10,&i11);
      media=(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10+i11)/11;
      printf("media de idades = %f",media);
      system("pause");
      }
