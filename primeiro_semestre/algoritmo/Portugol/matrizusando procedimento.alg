algoritmo "Matriz usando procedimento"
// Função : Usara matriz solicitado ao usuario, descobri quantos impares te na matriz, encontrar o menor numero da matriz e guardar em uma outra matriz trocando
// a coluna por linha.
// Autor :  Luiz Torres Junior
// Data : 30/11/2013
// Seção de Declarações 

procedimento matrizusuario
var
   l,c:inteiro //l=linha, c=coluna
inicio
      para l de 1 ate 4 faca
           para c de 1 ate 4 faca
            escreva("Entre com o numeros da linha ", l," e coluna ", c," da matriz")
            leia(matriz[l,c])
            fimpara
      fimpara
      para l de 1 ate 4 faca
           para c de 1 ate 4 faca
            escreva(" " ,matriz[l,c]," ")
           fimpara
            escreval()
      fimpara
fimprocedimento

procedimento impares
var
   l,c,i:inteiro //l=linha, c=coluna e i=impares
inicio
   i<-0
   para l de 1 ate 4 faca
           para c de 1 ate 4 faca
           se ( matriz[l,c]mod 2 = 1) entao
           i<-i+1
           fimse
           fimpara
   fimpara
   escreval("A quantidade de impares na matriz e: ",i)
fimprocedimento

procedimento menor
var
   l,c,m:inteiro //l=linha, c=coluna e m=menor
inicio
   m<-matriz[1,1]
   para l de 1 ate 4 faca
           para c de 1 ate 4 faca
           se ( matriz[l,c]<m) entao
           m<-matriz[l,c]
           fimse
            fimpara
   fimpara
   escreva("O menor valor e: ",m)
fimprocedimento

var
   matriz:vetor[1..4,1..4] de inteiro
inicio
matrizusuario
impares
menor
fimalgoritmo
