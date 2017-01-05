/*
18-09-2014-IFSP lista alocação dinamica #12
luiz torres junior 
Programa completo para lista dinamica. Com as funções: inserir numero na lista, exibir lista, inserir numero a esquerda da ista(inicio), 
inserir a direita da lista(fim), 

*/
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
/*
Cria o nodo com os parametros para guardar um dado e uma pnteiro para o proximo
*/
struct nodo
{
	int dados;						//neste caso eh um inteiro mais pode usar um outro struct com inumero dados tais como um cadastro
	struct nodo *proximo;			//esse parametro e necessario pois indica a posicao do proximo mesmo se criar uma lista dinamica de cadastro eh necessatio esse paramentro
};

struct nodo *inicio, *fim, *p;		
/*
Insere o numero no fim da lista.
*/
int inserirDireita(int valor)										//insere o valor como paramentro
{
	struct nodo *p;													//cria o nodo para auxiliar
	p=(struct nodo*)malloc(sizeof( struct nodo));					//indica o tipo de struct q o p recebe o para seu tamanho
	if(p)
	{
		p->dados = valor;											//p aponta pro campo dado q recebe o valor que foi colocado no parametro quando a função eh chamada	
		p->proximo= NULL;											//p aponta pro campo proximo q recebe o NULL 
		if(inicio == NULL)											//verifica se a lista esta vazia porque se estiver vazia
			inicio=p;												//o p eh colocado direto no inicio
		else	fim->proximo=p;										//se não o fim aponta pro campo proximo  q recebe o p, pois o proximo de fim era NULL
		fim=p;														// entao o fim recebe  o p para poder o trocar o fim de lugar;
		printf("Numero %i inserido no fim com sucesso", p->dados);	//escreve o que confirma o que aonteceu na função
	}
	else	printf("Erro de alocacao");								//caso tenha um problema para colocar o p na lista
}

/*
Insere o numero no inicio da lista 
*/
void inserirEsquerda(int valor)										//insere o valor como paramentro
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

/*
Insere o numero um a um na lista 
*/
void inserir(int valor)															//insere o valor como paramentro
{	
	if(inicio == NULL){															//verifica se a lista esta vazia
		inicio = (struct nodo*)malloc(sizeof(struct nodo));						// inicio recebe o tipo de dado e o proximo
		if(inicio){																//se inicio 
			inicio->dados=valor;												//inicio aponta pro campo dado q recebe o valor 
			inicio->proximo=NULL;												//e ainda eh o primeiro valor o inicio aponta pro campo proximo q recebe NULL
			fim=inicio;															//entao o fim recebe o inicio indicando que o inicio e o fim sao o mesmo elemento
			printf("Numero %i inserido no inicio com sucesso", inicio->dados);	//confirm o que aconteceu visualmente
		}
		else
			printf("\nErro de alocacao\n");
	}
	else{
		p = (struct nodo*)malloc(sizeof(struct nodo));							//ja se inicio nao for NULL ele vai para esta condição
		if(p){			
			p->dados=valor;														//p aponta para o campo dado q recebe o valor 
			p->proximo=NULL;													//p aponta pro campo proximo que recebe NULL
			fim->proximo=p;														//fim aponta pro campo proximo que recebe o valor p
			fim=p;																// fim muda de lugar recebendo o p
			printf("Numero %i inserido com sucesso", p->dados);					//confirma o que a função fez visualmente
		}
		else
			printf("\nErro de alocacao\n");
	}
}

/*
Exibe a lista 
*/
void exibir()
{
	struct nodo *aux;					//cria o struct nodo auxiliar
	aux = inicio;						//auxiliar recebe o inicio 
	if(inicio == NULL){					//verifica se a lista esta vazia
		printf("\nLista vazia\n");		//escreve q a lista esta vazia para o usuario
	}
	else{
		printf("Lista \n");				//escreve lista
		while (aux != NULL){			//verifica a condição enquato o auxiliar for diferente de NULL
			printf("%d ",aux->dados);	//escreve o campo dado do auxiliar
			aux = aux->proximo;			//move o auxiliar para o proximo fazendo que o aux recebe o proximo 
		}
	}
}

/*
Apaga a lista inteira
*/
void apagar()
{	
	struct nodo *aux;					//cria o nodo aux
	aux = inicio;						//aux recebe o inicio
	while (aux){						//verifica o auxiliar 
		inicio = inicio->proximo;		//inicio recebe o inicio que aponta pro proximo para mover o inicio e nao apagar o inicio e perder a lista
		free(aux);						//apaga o auxiliar para nao apagar o inicio e nem o fim
		aux = inicio;					//aux recebe de novo inicio
	}
	printf("Lista Apagada com sucesso");
}

/*
pesquisar se existe um numero perguntado para o usuario na lista
*/
void pesquisar(int valor){

	struct nodo *aux;													//cria o nodo para ajudar a caminha na lista
	int cont=0;															//cria um contador para verificar se a pesquisa encontrou um resultado e inicializa com zero
	aux = inicio;														//aux recebe o inicio para saber de onde começa
	if(inicio == NULL){													//verifica se alista esta vazia para não precisar pesquisar 
		printf("\nLista vazia\n");										//apresenta que alista esta vazia para o usuario
	}
	else{																//se não		
		while (aux != NULL){											//enquanto o auxiliar for diferente de null portando diferente de fim->proximo				
			if(valor == aux->dados){									//se o valor pedido for igual ao aux -> dado ele conta
				cont = cont +1;											//conta quantos numero existem
			}			
			aux = aux->proximo;											//faz o aux caminha numero por numero na lista ate o fim
		}	
		
		if(cont !=0)													//verifica se foi encontrado algum resultado se o contador for diferente de zero 	
			printf("\nA lista tem %d tanta %d vezes\n", valor, cont);	//	apresenta se for verdade q o numero foi entrado e quantas vezes ele aparece
		else 															//se não
			printf("Não encontrado");									//apresenta não encontrado caso não seja verdade a primeira condição de contador diferente de zero	
		
	}
}
/*
Descobre a quantidade de elemento na lista
*/
void quantElemento()
{
	int cont=0;														//Cria um contador e inicializa com zero;
	struct nodo *aux;												//cria o nodo pra percorrer a lista
	aux = inicio;													//auxiliar recebe o inicio para saber onde inicia a lista
	if(inicio == NULL){												//verifica se a lista esta vazia
		printf("\nLista vazia\n");									//escreve se alista estiver vazia
	}
	else{								
		while (aux != NULL){										//conta enquanto o aulixiar não chegar no proximo do fim o num
			cont = cont + 1;										//o contador recebe ele mais um para contar quantos elemento tem na lista
			aux = aux->proximo;										//o auxiliar recebe o proximo dele para caminhar na lista a partir do inicio
		}	
		printf("\nA Lista tem %d elementos\n", cont);				//escreve na tela para ter uma confirmação visual do q aconteceu
	}
}
/*
Remover no inicio
*/
void removerInicio()
{	
	struct nodo *aux;												//Cria o nodo auxiliar para facilitar a exclusao
	aux = inicio;													//auxiliar recebe o inicio para ele saber onde a lista começa
	if(inicio == NULL){												//verifica se a lista esta vazia
		printf("Lista Vazia");
	}
	else{															//se não estiver vazia o que faz													//o nodo auxiliar recebe o inicio
	inicio = inicio->proximo;										//o inicio se recebe o proximo se tiver um elemento so ele se recebe o null
	printf("Numero %i removido no inicio com sucesso", aux->dados);	//só imprime para confirmação visual do qu ocorreu
	free(aux);														//apaga o auxiliar pq não pode apagar o inicio e nem o fim
	}	
}

/*
Remover no fim
*/
void removerFim(){
	struct nodo *penultimo;nodo *ultimo;								//cria dois nodo pois um chegara ate o ultimo valor o fim e outro chegara apenas no penltimo
	ultimo = inicio;													//aux recebe o inicio para saber onde começa a lista
	if(inicio == NULL ){												//veifica se a lista esta vazia
		printf("Lista vazia");											//se for vedade imprime lista vazia
	}
	else if(inicio->proximo == NULL){									//se nao verifica se a lista tem apenas o inicio
		inicio = inicio->proximo;										//se for verdade o inicio recebe o inicio que aponta para o proximo que eh NULL entao o inicio fica NULL
		printf("Numero %i removido no fim com sucesso", ultimo->dados); //imprime o texto para identificar o que aconteceu
		free(ultimo);													//remove o ultimo que tinha recebido o inicio
		fim=inicio;														//identifica que o fim recebe o inicio portanto ambos são NULL
	}
	else{																//se as duas condições anteriores nao forem verdadeiras
		while( ultimo->proximo != NULL){								//ele roda essa condição enquanto o ultimo->proximo diferente de num pois assim sabemos que o ultimo chegou no fim
			penultimo = ultimo;											//o penultimo recebeo o ultimo para que o penultimo fique sempre um passo atras do ultimo
			ultimo= ultimo->proximo;									//o ultimo recebe ele apontado para o proximo para caminhas de elemento em elemento
		}
		penultimo->proximo=NULL;										//quando sair do enquanto o penultimo tem q o campo proximo que apontava paro o fim tem que receer NULL
		fim=penultimo;													//entao o fim recebe o penultimo 
		printf("Numero %i removido no fim com sucesso", ultimo->dados); //imprime o que aconteceu q numero foi eliminado
		free(ultimo);													//removeo o numero de ultimo que era o antigo fim 
		}
}


int main(){
	inicio = NULL;																					//inicializa o nodo inicio com NULL;
	fim = NULL;																						//inicializa o nodo fim com NULL;
	int v,op=0;																						//cria duas variaveis uma para usar no switch e outra para usar para o paramentro das funções
	do{																								//usa o do para criar o arco de repetição
		printf("-----MENU------\n1-Inserir na lista \n2-Inserir a direita\n3-Inserir a esquerda");	//imprime o menu
		printf("\n4-Exibir\n5-Apagar lista\n6-Pesquisar\n7-Contar quanto elemento tem na ");		//imprime o menu
		printf("lista\n8-Remover elemento do inicio\n9-Remover elemento do fim");					//imprime o menu
		printf("\n10-Sair\nEntre com a opcao: "); 													//imprime o menu deixar sempre o sair e o entre a opcao separado dos demais 
																									//e no fim para o caso de ser necessario o acrescimo de mais funções
		scanf("%d",&op);																			//pede que o usuario entre com a opçao desejada
		switch(op){																					//escolhe atraves do valor qual o caso que vai usar
			//insere um valor que sera pedido ao usuario 
			case 1:																				
				printf("Entre com o valor:");
				scanf("%d",&v);
				inserir(v);		///usa a função cria para inserir o valor
				printf("\n");
				system("pause");
				system("cls");
			break;
			//insere um valor no fim da lista 
			case 2:
				system("cls");
				printf("Entre com o valor para inserir a direita:");
				scanf("%d",&v);
				inserirDireita(v);// usa a função criada para inserirAdireita
				printf("\n");
				system("pause");
				system("cls");
			break;
			//insere um valor no inicio da lista
			case 3:
				system("cls");
				printf("Entre com o valor para inserir a esquerda:");
				scanf("%d",&v);
				inserirEsquerda(v);		//chama a funcao inserirEsquerda para colocar o numero no inicio
				printf("\n");
				system("pause");
				system("cls");
			break;	
			//exibe a lista inteira
			case 4:
				system("cls");
				exibir();//chama a funcao exibir
				printf("\n");
				system("pause");
				system("cls");
			break;	
			//apaga a lista inteira
			case 5:
				system("cls");
				apagar();//chama a duncao apagar
				printf("\n");
				system("pause");
				system("cls");
				break;
			//Pesquisa o numero que o usuario pedir verificado se ele exite na lista
			case 6:
				system("cls");
				printf("\nDigite o numero que deseja procurar :");
				scanf("%d",&v);
				pesquisar(v);//chama a funcao pesquisar
				printf("\n");
				system("pause");
				system("cls");
				break;
			//COnta quantos elemento tem a lista
			case 7:
				system("cls");
				quantElemento();//chama a funcao q contara os elementos da lista
				printf("\n");
				system("pause");
				system("cls");
				break;
			//remove o primeiro numero da lista o incio e move o segundo numero para o inicio
			case 8:
				system("cls");
				removerInicio();//chama a funcao para remover do inicio
				printf("\n");
				system("pause");
				system("cls");
				break;
			//remove o ultimo numero portanto o antigo fim e move o fim para o penultimo numero
			case 9:
				system("cls");
				removerFim();//chama a função para remover no fim
				printf("\n");
				system("pause");
				system("cls");
				break;			
			//neste caso imprime que esta saindo e sai da laço de repeticao do programa 
			case 10:
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
	}while(op != 10);//encerra o laço de repetição
}


