/*
26-09-2014-IFSP HTO
Luiz Torres Junior
Lista duplamente encadeada #2
*/
#include <stdio.h>
#include <stdlib.h>

struct nodo{
	struct nodo *anterior;
	int dado;
	struct nodo *proximo;
};

struct nodo *inicio, *fim, *p;
		
/*
Insere o numero no fim da lista.
*/
void insereFim(int valor)										//insere o valor como paramentro
{
	p=(struct nodo*)malloc(sizeof( struct nodo));					//indica o tipo de struct q o p recebe o para seu tamanho
	if(p)
	{
		p->dado=valor;												//p aponta pro campo dado q recebe o valor que foi colocado no parametro quando a função eh chamada	
		p->proximo= NULL;											//p aponta pro campo proximo q recebe o NULL 
		p->anterior=p;												
		if( inicio == NULL)											//verifica se a lista esta vazia porque se estiver vazia
			inicio=p;												//o p eh colocado direto no inicio
		else	fim->proximo=p;										//se não o fim aponta pro campo proximo  q recebe o p, pois o proximo de fim era NULL
		fim=p;														// entao o fim recebe  o p para poder o trocar o fim de lugar;
		printf("Numero %i inserido no fim com sucesso", p->dado);	//escreve o que confirma o que aonteceu na função
	}
	else	printf("Erro de alocacao");								//caso tenha um problema para colocar o p na lista
}

/*
Exibe a lista 
*/
void exibir()
{	
	if(inicio==NULL){					//verifica se a lista esta vazia como a lista tem tres campo por elemento tem que verificar o dado
		printf("\nLista vazia\n");		//escreve q a lista esta vazia para o usuario
	}
	else{
		struct nodo *aux;					//cria o struct nodo auxiliar
		aux = inicio;						//auxiliar recebe o inicio 
		printf("Lista \n");				//escreve lista
		while (aux!=NULL){			//verifica a condição enquato o auxiliar for diferente de NULL
			printf("%d ",aux->dado);	//escreve o campo dado do auxiliar
			aux = aux->proximo;			//move o auxiliar para o proximo fazendo que o aux recebe o proximo 
		}
	}
}

/*
Insere o numero um a um na lista 
*/
void insereInicio(int valor){
	struct nodo *p;														//cria o nodo p
    p=(struct nodo*)malloc(sizeof( struct nodo));					
	if(p){
		p->dado = valor;
		p->anterior = NULL;
		p->proximo = inicio;
		if(inicio == NULL){
			fim = p;
		}else inicio->anterior=p;
		inicio = p;
		printf("Numero %i inserido no inicio com sucesso", inicio->dado);
	}
	else printf("Erro de alocacao");
}
/*
Funcao para remover do inicio
*/

void removeInicio(){
	struct nodo *aux;		//cria o nodo auxiliar para encontrar o inicio
	if(inicio == NULL){		//verifica se inicio tem algum valor
		printf("\nLista vazia\n");		///se for verdade apresenta lista vazia
	}
	else if( inicio->proximo==NULL ){		
		aux=inicio;				//auxiliar recebe o inicio
		fim->anterior=NULL;
		inicio=inicio->proximo;	
		printf("Numero %i removido no inicio com sucesso", aux->dado);		
		free(aux);			
	}
	else{			
		aux=inicio;
		inicio=inicio->proximo;
		printf("Numero %i removido no inicio com sucesso", aux->dado);	
		free(aux);
}
}

void removeFim(){
	struct nodo *aux;
	if(inicio==NULL)printf("Lista Vazia");
	else if(inicio->proximo==NULL){
		aux=inicio;
		fim->anterior=NULL;
		inicio=inicio->proximo;	
		printf("Numero %i removido no inicio com sucesso", aux->dado);		
		free(aux);	
	}
	else{
		aux=fim;
		fim=NULL;
		fim=aux->anterior;
		fim->proximo=NULL;
		aux->anterior=NULL;
		free(aux);
	}
}

int main(){
	inicio = NULL;																					//inicializa o nodo inicio com NULL;
	fim = NULL;																						//inicializa o nodo fim com NULL;
	int v,op=0;																						//cria duas variaveis uma para usar no switch e outra para usar para o paramentro das funções
	do{																								//usa o do para criar o arco de repetição
		printf("-----MENU------\n1-Exibir\n2-Inserir no Inicio\n3-Inserir no Fim");	//imprime o menu
		printf("\n4-Remover do Inicio\n5-Remove do Fim");
		printf("\n6-Sair\nEntre com a opcao: "); 													//imprime o menu deixar sempre o sair e o entre a opcao separado dos demais 
																									//e no fim para o caso de ser necessario o acrescimo de mais funções
		scanf("%d",&op);																			//pede que o usuario entre com a opçao desejada
		switch(op){																					//escolhe atraves do valor qual o caso que vai usar
			//insere um valor que sera pedido ao usuario 
			case 1:
				system("cls");																				
				exibir();//chama a funcao exibir
				printf("\n");
				system("pause");
				system("cls");
			break;
			
			//exibe a lista inteira
			case 2:
				printf("Entre com o valor para inserir No INICIO:");
				scanf("%d",&v);
				insereInicio(v);		//chama a funcao inserirEsquerda para colocar o numero no inicio
				printf("\n");				
				system("cls");
			break;
			
			case 3:			
				printf("Entre com o valor para inserir No FIM:");
				scanf("%d",&v);						///usa a função cria para inserir o valor
				insereFim(v);				
				printf("\n");
				system("cls");
				break;
			
			case 4:
				system("cls");
				removeInicio();
				printf("\n");
				system("pause");
				system("cls");
				break;
				
			case 5:
				system("cls");
				removeFim();
				printf("\n");
				system("pause");
				system("cls");
				break;	
				
			case 6:
				system("cls");
				printf("\nSAINDO........\n");
				printf("\n");
				system("pause");
				system("cls");
				break;
			//caso seja apertado qualquer valor diferente dos caso apresenta que a opção eh invalida
			//e  retorna pedido que entre com outra opção	
			default:
				system("cls");
				printf("Opcao invalida\n");
				printf("\n");
				system("pause");
				system("cls");
			break;
		}
	}while(op != 6);//encerra o laço de repetição
}
