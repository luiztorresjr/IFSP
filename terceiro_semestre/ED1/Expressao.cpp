/*Projetado por:
      Bruno Chrisostomo
      Luiz Torres
	  Mariana Matias
      Marcio Diogenes
      Paulo Izumi
      Renato Barbosa
      e... 
	  Thiago 
*/      
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

// define o tamanho da pilha
#define max 100
struct PILHA{
	int topo;
	char dados[max];
};
PILHA p;
// Inserir um novo elemento no topo da pilha
void empilhar(char simb,PILHA*p){
	if(p->topo==max-1)
	    printf("Impossivel empilhar: Pilha Cheia");
	else{
	    p->topo++;
		p->dados[p->topo]=simb;
	}	    
}
// Retirar elementos da pilha - Ele só mostra visual
void desempilhar(){
	if(p.topo==-1)
		printf("A pilha esta vazia");
	else{
	    p.topo--;
    }	
		
}	
// Exibir os valores inseridos da pilha
void exibir(){
	if(p.topo==-1)
	    printf("A Pilha esta vazia");
	else{
	     int i;
		 for(i = 0;i <=p.topo;i++){
		 	printf("%c \n ",p.dados[i]);
		 }	
		
	}    
}
int main(){
	char expressao[50];	//PARA ENTRAR A EXPRESSÃO A SER AVALIADA
	bool valido = true;	//VERIFICA SE A EXPRESSAÕ É VALIDA
	int i=0; 			//CONTADOR
	p.topo= -1;			//INICIALIZA A PILHA
	printf("Digite a expressao:\n");//PEDE PARA INSERIR UMA EXPRESSAO
	scanf("%s",&expressao);	//LE A EXPRESSÃO 
	fflush(stdin);	
	//laço de repetição para verificar todas as casa da expressão	
    while (expressao[i] != '\0' && valido==true) { 
        // condição para empilhar chaves abrindo 
		if  (expressao[i] == '['  || expressao[i] == '('  || expressao[i] == '{' )
        	 empilhar(expressao[i],&p);
        //condição para verificar chaves fechando 	 
   		if  (expressao[i] == ']' || expressao[i] == ')' || expressao[i] == '}' ){
            	//condições para verificar se uma chave abrindo é igual a uma fechando	
			 	if (expressao[i] == ']'&& p.dados[p.topo]=='['){
			 
		 	   		desempilhar();	      
                }else
				if (expressao[i] == '}'&& p.dados[p.topo]=='{'){
			 	
		 	   		desempilhar();	      
                }else
				if (expressao[i] == ')'&& p.dados[p.topo]=='('){
		 	   		desempilhar();	
				//se forem diferentes sai do loop		      
                }else
					valido=false;		 
        }    
        i++;   
    }
    //verificar se tem sinal sobrando
    if(p.topo>-1)
    valido=false;
	//CONFERE SE A EXPRESSÃO É VALIDA SE FOR TRUE ELA É VALIDA SE NÃO NÃO É VALIDA
    if(valido==true){
    	printf("\nA expressao e valida! =D ");
    }else
       printf("\nNao e valida =/");
}
    

