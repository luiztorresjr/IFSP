algoritmo "matriz inversa"
// Fun��o :modifique o algoritmo anterior para copiar os dados da matriz para outra matriz 4x4, inventerndo a linha pela coluna
// Autor : Luiz Torres Junior
// Data : 08/11/2013
// Se��o de Declara��es
var
matriz1: vetor[1..4,1..4] de real
cont,cont1:inteiro
soma:real
inicio
para cont de 1 ate 4 faca
   soma<-0
   para cont1 de 1 ate 3 faca
      leia( matriz1[ cont,cont1 ])
      soma<-matriz1[ cont,cont1 ]+soma
   fimpara
   matriz1[cont,4]<-soma/3
fimpara
escreval("Matriz :")
para cont de 1 ate 4 faca
   para cont1 de 1 ate 4 faca
      escreva( matriz1[ cont,cont1 ]," ")
   fimpara
   escreval()
fimpara
fimalgoritmo
