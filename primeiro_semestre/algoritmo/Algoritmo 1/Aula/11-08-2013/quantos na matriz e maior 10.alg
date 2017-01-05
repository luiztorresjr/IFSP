algoritmo "numeros de uma matriz maior que 10"
// Função : contar quantos numeros em uma matriz e maior que 10
// Autor : luiz torres junior
// Data : 08/11/2013
// Seção de Declarações
var
matriz1: vetor[1..4,1..4] de real
soma:real
cont, cont1,maior:inteiro
inicio
para cont de 1 ate 4 faca
   soma<-0
   para cont1 de 1 ate 3 faca
      leia( matriz1[ cont,cont1 ])
      soma<- matriz1[ cont,cont1]+soma
   fimpara
   matriz1[cont,4]<-soma/3
fimpara
escreval("A matriz e:")
maior<-0
para cont de 1 ate 4 faca
   para cont1 de 1 ate 4 faca
      escreva( matriz1[ cont,cont1 ]," ")
      se matriz1[cont,cont1]>10 entao
         maior<-maior+1
      fimse
   fimpara
   escreval()
fimpara
escreva("quantidade de maiores que 10 e:", maior)
fimalgoritmo
