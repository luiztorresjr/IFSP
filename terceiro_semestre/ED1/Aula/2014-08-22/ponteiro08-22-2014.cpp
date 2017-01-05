#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
void troca (int *px, int *py){
	int temp;
	temp = *px;
	*px = *py;
	*py = temp;
}

int main(){
	int a =5, b = 7;
	troca(&a, &b);
	printf("O valor de B era = %i \nTornou = %i",b ,a);
	printf("\nO valor de B era = %i \nTornou = %i",a ,b);
	puts("\n");
	system("pause");
}
