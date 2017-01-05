algoritmo "exercicio 4"
// Função :ler um conjunto de 10 valores calcular media, e imprimir todos os valores do conjunto a media a diferença entre cada valor
//individual e a media calculada.
// Autor : Luiz Torres Junior
// Data : 01/11/2013
// Seção de Declarações
var  valor:vetor [1..10] de inteiro
     soma,cont,i:inteiro
     media, dif: real
inicio
           soma<-0
           cont<-0
           i<-0
           dif<-0
           para cont de 1 ate 10 faca
           escreva("Entre com o numero de ordem ",cont,":")
           leia(valor[cont])
           soma<-soma+valor[cont]
           fimpara
           media<-soma/cont
           para cont de 1 ate 10 faca
           escreval("vetor ", cont,"=",valor[cont])
           fimpara
           cont<-1
           enquanto (cont<=10) faca
           para i de 1 ate 10 faca
           dif<-valor[cont]-valor[i]
           escreval("A diferenca entre vetor ", cont," e vetor ", i, " e: ", dif)
           fimpara
           cont<-cont+1
           fimenquanto
           escreva("A media dos valores e: ", media)

fimalgoritmo
