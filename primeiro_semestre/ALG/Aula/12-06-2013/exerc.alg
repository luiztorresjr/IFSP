algoritmo "semnome"
// Função :
// Autor :
// Data : 06/12/2013
// Seção de Declarações 
procedimento ex9
var
   vet:vetor [1..20] de inteiro
   i:inteiro
inicio
      escreval("Entre com o vetor de 20 posicao: ")
      para i de 1 ate 20 faca
           leia(vet[i])
      fimpara
      limpatela
      para i de 1 ate 20 faca
           escreval(vet[i]," ")
      fimpara
fimprocedimento

procedimento ex10
var
   vet:vetor [1..30] de inteiro
   i:inteiro
inicio
      para i de 1 ate 30 faca
           se i mod 2 = 1 entao
              vet[i]<-i*3
           senao
              vet[i]<-i*2
           fimse
      fimpara
      limpatela
      para i de 1 ate 30 faca
           escreval(vet[i]," ")
      fimpara
fimprocedimento

procedimento ex11
var
   vet:vetor [1..100] de inteiro
   i,maior:inteiro
inicio
      para i de 1 ate 100 faca
           se i mod 2 = 1 entao
              vet[i]<-i*3
           senao
              vet[i]<-i*2
           fimse
      fimpara
      maior<-vet[1]
      para i de 1 ate 100 faca
           se maior<vet[i] entao
               maior<-vet[i]
           fimse
      fimpara
      limpatela
      escreva(maior)
fimprocedimento

procedimento ex12
var
   vet:vetor [1..50] de inteiro
   i,maior:inteiro
inicio
      para i de 1 ate 50 faca
           se i mod 2 = 1 entao
              vet[i]<-i*3
              
           senao
              vet[i]<-i*2
              soma<-soma+vet
           fimse
      fimpara
      maior<-vet[1]
      para i de 1 ate 100 faca
           se maior<vet[i] entao
               maior<-vet[i]
           fimse
      fimpara
      limpatela
      escreva(maior)
fimprocedimento

var

inicio
      ex11
fimalgoritmo
