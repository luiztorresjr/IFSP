algoritmo "semnome"
// Função :escreva um algoritmo que preencha dois vetores de 5 elementos cada um com numeros digitados pelo usuari. Em seguida preencha um terceiro vetor de tamanho 5 onde cada
//posicao deste vetor seja igual a soma dos elementos na mesma posicao dos vetores prencgidos
// Autor :
// Data : 25/10/2013
// Seção de Declarações 
var
vet1:vetor [1..5] de inteiro
vet2:vetor [1..5] de inteiro
vet3:vetor [1..5] de inteiro
contador :inteiro

inicio
escreval("Entre com 5 valores do Vetor 1:")
para contador de 1 ate 5 faca
leia(vet1[contador])
fimpara
escreval()
escreval("Entre com 5 valores do Vetor 2:")
para contador de 1 ate 5 faca
leia(vet2[contador])
fimpara
escreval()
escreva("O vetor 3:")
para contador de 1 ate 5 faca
vet3[contador]<-vet1[contador]+vet2[contador]
escreva(vet3[contador])
fimpara
fimalgoritmo
