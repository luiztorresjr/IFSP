algoritmo "semnome"
// Função :
// Autor :
// Data : 25/10/2013
// Seção de Declarações 
var
vet1:vetor[1..10] de inteiro
prod,contador:inteiro
inicio
prod <- 1
escreval ("entre com dez numeros: ")
para contador de 1 ate 10 faca
leia(vet1[contador])
se(contador mod 2 = 0) entao
prod<-vet1[contador]*prod
fimse
fimpara
escreva(" O produto das posicoes pares  e: ",prod)
fimalgoritmo
