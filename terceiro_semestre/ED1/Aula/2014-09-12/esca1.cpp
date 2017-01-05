/*
18-09-2014-IFSP lista alocação dinamica #10
luiz torres junior 
*/
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

int inserir_direita(int valor)
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
	if(p){
    p->dados = valor;
    p->proximo = inicio;
    inicio = p;
	}
	else	printf("Erro de alocacao");
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

void pesquisar(int valor){

	struct nodo *aux;
	int cont=0;
	aux = inicio;
	if(inicio == NULL){
		printf("\nLista vazia\n");
	}
	else{
		
		while (aux != NULL){
			if(valor == aux->dados){
				cont = cont +1;
			}			
			aux = aux->proximo;	
		}
		
		if(cont !=0)	
			printf("\nA lista tem %d tanta %d vezes\n", valor, cont);		
		else 	
			printf("Não encontrado");
		
	}
}

void quant_elemento()//exibe umaq lista dinamica
{
	int cont=0;
	struct nodo *aux;
	aux = inicio;
	if(inicio == NULL){
		printf("\nLista vazia\n");
	}
	else{		
		while (aux != NULL){
			cont = cont + 1;
			aux = aux->proximo;	
		}
		printf("\nA Lista tem %d elementos\n", cont);
	}
}

void removerInicio()
{	
	struct nodo *aux;6
	aux = inicio;
		inicio = inicio->proximo;	
		free(aux);
		aux = inicio;
	
}

int main(){
	inicio = NULL;
	fim = NULL;
	int v,op=0;
	do{
		printf("-----MENU------\n1-Inserir na lista \n2-Inserir a direita ");
		printf("\n3-Inserir a esquerda\n4-Exibir\n5-Apagar lista\n6-Pesquisar");
		printf("\n7-Contar quanto elemento tem na lista\n8-Remover elemento do inicio");
		printf("\n9-Sair\nEntre com a opcao: "); 
		scanf("%d",&op);
		switch(op){
			
			case 1:
				printf("Entre com o valor:");
				scanf("%d",&v);
				inserir(v);
				system("cls");
			break;
			
			case 2:
				printf("Entre com o valor para inserir a direita:");
				scanf("%d",&v);
				inserir_direita(v);
				system("cls");
			break;
			
			case 3:
				system("cls");
				printf("Entre com o valor para inserir a esquerda:");
				scanf("%d",&v);
				inserir_esquerda(v);
				system("cls");
			break;	
			
			case 4:
				system("cls");
				exibir();
				printf("\n");
				system("pause");
				system("cls");
			break;	
				
			case 5:
				system("cls");
				apagar();
				printf("\n");
				system("pause");
				system("cls");
				break;
			
			case 6:
				system("cls");
				printf("\nDigite o numero que deseja procurar :");
				scanf("%d",&v);
				pesquisar(v);
				printf("\n");
				system("pause");
				system("cls");
				break;
			
			case 7:
				system("cls");
				quant_elemento();
				printf("\n");
				system("pause");
				system("cls");
				break;
			
			case 8:
				system("cls");
				removerInicio();
				printf("\n");
				system("pause");
				system("cls");
				break;
							
			case 9:
				system("cls");
				printf("\nSAINDO........\n");
				printf("\n");
				system("pause");
				system("cls");
				break;
				
			default:
				system("cls");
				printf("Opcao invalida\n");
				printf("\n");
				system("pause");
				system("cls");
			break;
		}
	}while(op != 9);
}
