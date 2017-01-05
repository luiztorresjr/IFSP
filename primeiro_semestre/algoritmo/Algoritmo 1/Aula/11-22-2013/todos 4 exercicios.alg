algoritmo "Procedimento"

//Procedimento para Preeencher um vetor vet de 10 posições com numeros digitados pelo usuario.

procedimento preenchercomnumerosusuario1
var

   i: inteiro
inicio
escreval("Entre com 10 numeros em um vetor")
para i de 1 ate 10 faca
	leia(vet[i])
fimpara
escreva("Os numeros digitados: ")
fimprocedimento

procedimento impares2
var
   i: inteiro
inicio
escreva("O 10 primeiros numeros impares: ")
para i de 1 ate 10 faca
vet[i]<-2*i-1
fimpara

fimprocedimento

procedimento fibonacci3
var
   i: inteiro
inicio
escreva("Os Numeros de Fibonacci: ")
vet[1]<-1
vet[2]<-1
para i de 3 ate 10 faca
vet[i]<-vet[i-1]+vet[i-2]
fimpara
fimprocedimento


procedimento imprimirvetor4
var

   i: inteiro
inicio
escreva(" ")
para i de 1 ate 10 faca
     escreva(vet[i])
fimpara
escreval()
fimprocedimento

procedimento quantidadeimpares
var
   i,impares: inteiro
inicio
impares<-0
para i de 1 ate 10 faca
se vet[i]mod 2 =1 entao
impares<-impares+1
fimse
fimpara
escreva("quantidade de impares: ")
escreval(impares)
fimprocedimento
var
   vet: vetor[1..10] de inteiro
inicio
   preenchercomnumerosusuario1
   imprimirvetor4
   quantidadeimpares
   impares2
   imprimirvetor4
   quantidadeimpares
   fibonacci3
   imprimirvetor4
   quantidadeimpares

fimalgoritmo
