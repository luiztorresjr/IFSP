algoritmo "matriz inversa"
// Função :modifique o algoritmo anterior para copiar os dados da matriz para outra matriz 4x4, inventerndo a linha pela coluna
// Autor : Luiz Torres Junior
// Data : 08/11/2013
// Seção de Declarações
var
matriz1: vetor[1..4,1..4] de real
matriz2: vetor[1..4,1..4] de real
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
      escreva( matriz1[ cont,cont1 ],"   ")
      matriz2[cont1,cont]<-matriz1[ cont,cont1 ]
   fimpara
   escreval()
fimpara
escreval("MAtriz invertida:")
para cont de 1 ate 4 faca
   para cont1 de 1 ate 4 faca
      escreva( matriz2[ cont,cont1 ],"   ")
   fimpara
   escreval()
fimpara

fimalgoritmo
