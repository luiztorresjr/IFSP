#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct nodo
{
	int dados;
	struct nodo *proximo;
};

struct nodo *inicio, *fim, *p;
//para fazer inserção na lista apartir do fim 
int insere_direita(int valor)
{
	struct nodo *p;
	p=(struct nodo*)malloc(sizeof( struct nodo));
	if(p)
	{
		p->dados = valor;
		p->proximo= NULL;
		if(inicio == NULL)
			inicio=p;
		else	fim->proximo=p;
		fim=p;
	}
	else	printf("Erro de alocacao");
}

void inserir_esquerda(int valor)
{
	struct nodo *p;
    p=(struct nodo*)malloc(sizeof( struct nodo));
    p->dados = valor;
    p->proximo = inicio;
    inicio = p;
}

void inserir(int valor)
{	
	if(inicio == NULL){
		inicio = (struct nodo*)malloc(sizeof(struct nodo));
		if(inicio){
			inicio->dados=valor;
			inicio->proximo=NULL;
			fim=inicio;
		}
		else
			printf("\nErro de alocacao\n");
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
			printf("\nErro de alocacao\n");
	}
}

void exibir()//exibe umaq lista dinamica
{
	struct nodo *aux;
	aux = inicio;
	if(inicio == NULL){
		printf("\nLista vazia\n");
	}
	else{
		printf("\nLista \n");
		while (aux != NULL){
			printf("%d ",aux->dados);
			aux = aux->proximo;	
	}
}
}

void apagar()
{	
	
	struct nodo *aux;
	aux = inicio;
	while (aux){
		inicio = inicio->proximo;	
		free(aux);
		aux = inicio;
	}
}
int main(){
	inicio = NULL;
	fim = NULL;
	int v,op=0;
	do{
		printf("-----MENU------\n1-Inserir na lista \n2-Inserir a direita \n3-Inserir a esquerda\n4-Exibir\n5-Apagar lista\n6-Sair\nEntre com a opcao: ");
		scanf("%d",&op);
		switch(op){
			case 1:
				printf("Entre com o valor:");
				scanf("%d",&v);
				inserir(v);
				system("cls");
			break;
			
			case 2:
				printf("Entre com o valor:");
				scanf("%d",&v);
				insere_esquerda(v);
				system("cls");
			break;
			
			case 3:
				system("cls");
				scanf("%d",&v);
				insere_esquerda(v);
				system("pause");
				system("cls");
			break;	
			
			case 4:
				system("cls");
				exibir();
				system("pause");
				system("cls");
			break;	
				
			case 5:
				system("cls");
				apagar();
				system("pause");
				system("cls");
			break;
			
			case 6:
				system("cls");
				printf("\nSaindo...\n");
				system("pause");
				system("cls");
			break;
			
			default:
				system("cls");
				printf("Opcao invalida\n");
				system("pause");
				system("cls");
			break;
		}
	}while(op != 6);

}
