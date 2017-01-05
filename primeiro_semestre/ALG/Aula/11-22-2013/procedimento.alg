algoritmo "semnome"

//Procedimento para Preeencher um vetor vet de 10 posições com numeros digitados pelo usuario.

procedimento preenchercomnumerosusuario
var

   i: inteiro
inicio
escreval("Entre com 10 numeros em um vetor")
para i de 1 ate 10 faca
	leia(vet[i])
fimpara
fimprocedimento

procedimento imprimirvetor
var

   i: inteiro
inicio
escreva("os numeros no vetor sao: ")
para i de 1 ate 10 faca
     escreva(vet[i])
fimpara
escreval()
fimprocedimento
var
   vet: vetor[1..10] de inteiro
inicio
   preenchercomnumerosusuario
   imprimirvetor


fimalgoritmo
