/*
26-09-2014-IFSP HTO
Luiz Torres Junior
Lista duplamente encadeada #1
*/
#include <stdio.h>
#include <stdlib.h>

struct nodo{
	struct nodo *anterior;
	int dados;
	struct nodo *proximo;
};

struct nodo *inicio, *fim, *p;
		
/*
Insere o numero no fim da lista.
*/
void insereDireita(int valor)										//insere o valor como paramentro
{
	p=(struct nodo*)malloc(sizeof( struct nodo));					//indica o tipo de struct q o p recebe o para seu tamanho
	if(p)
	{
		p->dados=valor;											//p aponta pro campo dado q recebe o valor que foi colocado no parametro quando a função eh chamada	
		p->proximo= NULL;
		p->anterior=p;												//p aponta pro campo proximo q recebe o NULL 
		if( fim == NULL)												//verifica se a lista esta vazia porque se estiver vazia
			inicio=p;												//o p eh colocado direto no inicio
		else	fim->proximo=p;										//se não o fim aponta pro campo proximo  q recebe o p, pois o proximo de fim era NULL
		fim=p;														// entao o fim recebe  o p para poder o trocar o fim de lugar;
		printf("Numero %i inserido no fim com sucesso", p->dados);	//escreve o que confirma o que aonteceu na função
	}
	else	printf("Erro de alocacao");								//caso tenha um problema para colocar o p na lista
}

/*
Exibe a lista 
*/
void exibir()
{
	struct nodo *aux;					//cria o struct nodo auxiliar
	aux = inicio;						//auxiliar recebe o inicio 
	if(inicio==NULL){					//verifica se a lista esta vazia como a lista tem tres campo por elemento tem que verificar o dado
		printf("\nLista vazia\n");		//escreve q a lista esta vazia para o usuario
	}
	else{
		printf("Lista \n");				//escreve lista
		while (aux!=NULL){			//verifica a condição enquato o auxiliar for diferente de NULL
			printf("%d ",aux->dados);	//escreve o campo dado do auxiliar
			aux = aux->proximo;			//move o auxiliar para o proximo fazendo que o aux recebe o proximo 
		}
	}
}
/*
Insere o numero um a um na lista 
*/
void insereEsquerda(int valor)										//insere o valor como paramentro
{
	struct nodo *p;														//cria o nodo p
    p=(struct nodo*)malloc(sizeof( struct nodo));					
	if(p){								
    p->dados = valor;													//p aponta para o campo dado q recebe o valor inserido quando chamar a função	
    p->proximo = inicio;												//p aponta para o proximo que recebe o inicio para indiacar que o inicio movel de lugar
    inicio = p;															//por fim move o inicio para o p fazendo com q inicio receba o p		
    printf("Numero %i inserido no inicio com sucesso", inicio->dados);	//confirma o que aconteceu
	}
	else	printf("Erro de alocacao");									//se der problema aparesenta essa frase
}

int main(){
	inicio = NULL;																					//inicializa o nodo inicio com NULL;
	fim = NULL;																						//inicializa o nodo fim com NULL;
	int v,op=0;																						//cria duas variaveis uma para usar no switch e outra para usar para o paramentro das funções
	do{																								//usa o do para criar o arco de repetição
		printf("-----MENU------\n1-exibir\n2-Inserir no fim\n3-Inserir no Inicio");	//imprime o menu
		printf("\n4-Sair\nEntre com a opcao: "); 													//imprime o menu deixar sempre o sair e o entre a opcao separado dos demais 
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
				printf("Entre com o valor:");
				scanf("%d",&v);						///usa a função cria para inserir o valor
				insereDireita(v);				
				printf("\n");
				system("pause");
				system("cls");
			break;
			
			case 3:
				system("cls");
				printf("Entre com o valor para inserir a esquerda:");
				scanf("%d",&v);
				insereEsquerda(v);		//chama a funcao inserirEsquerda para colocar o numero no inicio
				printf("\n");
				system("pause");
				system("cls");
				break;
				
			case 4:
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
	}while(op != 4);//encerra o laço de repetição
}
