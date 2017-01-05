/*
21-10-2014 Luiz Torres Junior 
Pilha 
*/

//Verifica se qalista esta vazia
#include <stdio.h>
#include <stdlib.h>

#define max 5
struct PILHA{
	int topo;
	int dados[max];
};

struct PILHA p;

void empilhar(int x, PILHA *p){

	if(p->topo==max-1) printf("Impossivel empilhar: pilha cheia");
	else{
		p->topo++;
		p->dados[p->topo] = x;
	}		
}

void exibir(PILHA *p){			
	for(int i=0; i<=p->topo;i++){		
		printf("%d\n ", p->dados[i]);
	}
}
/*  Remove o ultimo elemento e nao o topo*/
void desempilhar(PILHA *p){
	
	if(p->topo==-1) printf("Pilha vazia");
	
	else{		
		p->topo=p->topo-1;		
	}	
}

int main(){	
	int op, v;
	p.topo=-1;
	do{			
		printf("Entre com a opçao:\n1-Empilhar\n2-Exibir\n3-Desempilhar");
		printf("\n4-Sair\nDigite a opcao: ");
		scanf("%d", &op);
		switch(op){
			case 1:
				printf("Entre com o valor a inserir na PILHA: ");
				scanf("%d", &v);
				empilhar(v, &p);
				system("cls");
			break;
			case 2:
				system("cls");
				printf("Pilha:\n ");
				exibir(&p);
				system("pause");
				break;
			case 3:
				system("cls");
				desempilhar(&p);
				system("cls");
			case 4:
				system("cls");
				printf("Saindo\n");
				system("pause");
			break;
		}
	} while(op != 4);
	
}
