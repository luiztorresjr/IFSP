algoritmo "semnome"

//Procedimento para preencher um vetor vet de 10 posições
//com numeros digitados pelo usuario
procedimento preencherComNumerosUsuario
var
   i: inteiro
inicio
escreva("Digite 10 numeros: ")
para i de 1 ate 10 faca
	leia(vet[i])
fimpara
fimprocedimento

//Procedimento para preencher um vetor vet de 10 posições
//com os primeiros 10 numeros impares
procedimento preencherVetorComNumerosImpares
var
   i: inteiro
inicio
   para i de 1 ate 10 faca
       vet[i] <- 2* i - 1
   fimpara
fimprocedimento


//Procedimento para preencher um vetor vet de 10 posições
//com os primeiros 10 numeros de Fibonacci
procedimento preencherVetorComNumerosFibonacci
var
   i: inteiro
inicio
   vet[1] <- 1
   vet[2] <- 1
   para i de 3 ate 10 faca
        vet[i] <- vet[i-1] + vet[i-2]
   fimpara
fimprocedimento


//Procedimento para imprimir na tela os elementos de um vetor
//chamado vet de 10 posições
procedimento imprimirVetor
var
    i: inteiro
inicio
escreva("Os numeros no vetor sao: ")
para i de 1 ate 10 faca
     escreva(vet[i])
fimpara
escreval()
fimprocedimento

var
   vet: vetor[1..10] de inteiro
inicio
   preencherComNumerosUsuario
   imprimirVetor
   preencherVetorComNumerosImpares
   imprimirVetor
   preencherVetorComNumerosFibonacci
   imprimirVetor
fimalgoritmo
