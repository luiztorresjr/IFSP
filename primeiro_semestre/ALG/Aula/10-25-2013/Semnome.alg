algoritmo "semnome"
// Função : escreva um algoritmo para preencher um vetor de 10 pos1ções com numeros digitados pelo usuario.
// Autor :
// Data : 25/10/2013
// Seção de Declarações
var
   pos1:vetor[1..10] de inteiro
   pos2:vetor[1..10] de inteiro
   pos3:vetor[1..10] de inteiro
   contador, quant,i,x : inteiro
   inicio
   i<-0
   quant<-0
   x<-0
   para contador de 1 ate 10 faca
   escreva("Entre com o numero: ")
   leia(pos1[contador])
   fimpara
   escreval("sao pares:")
   para i de 1 ate 10 faca
   se (pos1[i]%2=0) entao
   pos2[i]<-pos1[i]
   quant<-quant+1
   escreval("vet2[",i,"]= ",pos2[i]," ")
   fimse
   fimpara
   escreval("quantidade de pares ",quant)
   escreval("A inversa dos numeros digitados: ")
   para contador de 10 ate 1  passo-1 faca
   x<-x+1
   pos3[x]<-pos1[contador]
   escreval("vet3[",x,"]= ", pos3[x]," ")
   fimpara
   fimalgoritmo

