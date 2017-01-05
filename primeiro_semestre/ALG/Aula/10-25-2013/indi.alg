algoritmo "semnome"
// Função :escreva um algoritmo que leia 10 numeros e guarde-os em um vetor. Em seguida analise o vetor. imprimindo o indices dos elementos a direita sao os maiores
//que o elemento a sua esquerda.
// Autor :
// Data : 25/10/2013
// Seção de Declarações 
var
  vet1: vetor [1..10]  de inteiro
  cont,i : inteiro
inicio
escreval("entre com 10 numeros:")
para cont de 1 ate 10 faca
leia(vet1[cont])
fimpara
i<-2
para cont de 1 ate 9 faca
se (vet1[i]>vet1[cont])entao
escreval(i)
fimse
i<-i+1
fimpara
fimalgoritmo
