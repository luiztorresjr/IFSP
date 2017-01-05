#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct nodo{
	int dados;
	struct nodo *proximo;
};
struct nodo *inicio, *fim, *p;

void inserir(int valor){	
	if(inicio == NULL){
		inicio = (struct nodo*)malloc(sizeof(struct nodo));
		if(inicio){
			inicio->dados=valor;
			inicio->proximo=NULL;
			fim=inicio;
		}
		else
			printf("Erro de alocacao");
	}
	else{
		p = (struct nodo*)malloc(sizeof(struct nodo));
		if(p){
			p->dados=valor;
			p->proximo=NULL;
			fim->proximo=p;
			fim=p;
		}
		else
			printf("Erro de alocacao");
	}
}

void exibir(nodo *inicio){
	if(inicio == NULL){
		printf("Lista vazia");
	}
	else if(inicio != NULL){
		printf("%",p->proximo);
	}


}
int main(){
	inicio = NULL;
	fim = NULL;
	int v,op=0;
	do{
		printf("MENU\n1-Inserir\n2-Exibir\n3-Sair\nEntre com a opcao: ");
		scanf("%d",&op);
		switch(op){
			case 1:
				printf("Entre com o valor:");
				scanf("%d",&v);
				inserir(v);
			break;
			case 2:
				Imprime(inicio);
			break;
			
			case 3:
				system("cls");
				printf("\nSaindo...\n");
				system("pause");
			break;
			default:
				printf("Opcao invalida\n");
			break;
		}
	}while(op != 3);
//inicio = (struct nodo*)malloc(sizeof(struct nodo))
}
