	#include <stdio.h>
	#include <stdlib.h>
	#include <conio.h>
void entrada(int f[]){
	int j;
	for(j = 0; j<=4;j++){
		printf("\nEntre valor da posicao [%d]: ",(i+1));
		scanf("%d",&a[i]);
	}
}

void soma(int c[], int d[]){
	int s, j;
	for (j=0;j<=4;j++)
		s=s+c[j]+d[j];
	printf("\nA soma eh: %d",s);

}

void saida(int e[]){
	int j;
	for(j = 0; j<=4;j++){
		printf("\nValor da posicao [%d]: %d",(j+1),e[j]);
	}

}

int main(){
	int i ,j , a[5],b[5];
	printf("Vetor A:\n");
		entrada(a);
	printf("Vetor B:\n");
		entrada(b)
	system("cls");
	printf("\nVetor A:\n");
    saida(a);
	printf("\nVetor B:\n");
    saida(b);
	soma(a,b);
	system("pause");
}
