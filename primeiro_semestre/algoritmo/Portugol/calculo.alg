algoritmo "calculo"
// Função :ler um numero positivo, calcule e escreva o triplo do mesmo, seu quadrado e a metade do mesmo.
// Autor : Luiz Torres Junior
// Data : 21/08/2013
// Seção de Declarações 
var  numero, triplo, quadrado: inteiro
metade: real

inicio

// Seção de Comandos
escreva("Digite um numero inteiro positivo:")
     leia(numero)
     triplo <- numero*3
     escreva("O triplo do numero digitado é:",triplo)
     quadrado<- numero*numero
     escreva( "O quadrado do numero digitado é:",quadrado )
     metade<- numero/2
     escreva( "A metade do numero digitado é:",metade )
fimalgoritmo
