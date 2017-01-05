algoritmo "semnome"
// Função :Preencher um vetor de 10 posições com numeros digitados pelo usuario.
//posicao deste vetor seja igual a soma dos elementos na mesma posicao dos vetores prencgidos
// Autor :Luiz Torres Junior
// Data : 22/11/2013
// Seção de Declarações
var
vet1:vetor [1..10] de inteiro
contador :inteiro

inicio
escreval("Entre com 10 valores do Vetor:")
para contador de 1 ate 10 faca
leia(vet1[contador])
fimpara
escreval()
para contador de 1 ate 10 faca
escreva(vet1[contador])
fimpara
fimalgoritmo
