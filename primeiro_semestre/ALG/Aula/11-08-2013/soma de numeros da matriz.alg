algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/11/2013
// Se��o de Declara��es
var
matriz1: vetor[1..4,1..4] de real
soma:real
cont, cont1:inteiro
inicio
para cont de 1 ate 4 faca
soma<-0
   para cont1 de 1 ate 3 faca
      leia( matriz1[ cont,cont1 ])
      soma<- matriz1[ cont,cont1]+soma
   fimpara
     matriz1[cont,4]<-soma/3
fimpara
soma<-0
para cont de 1 ate 4 faca
   para cont1 de 1 ate 4 faca
      soma<- matriz1[ cont,cont1]+soma
      escreva( matriz1[ cont,cont1 ]," ")
   fimpara
   escreval()

fimpara
    escreva("a soma total=",soma)
fimalgoritmo
