algoritmo "Procedimentos e funções"
// Função :
// Autor :
// Data : 09/12/2013
// Seção de Declarações

procedimento ex17
var
   num,c,fat:inteiro
inicio
      fat<-1
      escreva("Entre com o numero: ")
      leia(num)
      para c de num ate 1 passo -1 faca
      fat<-fat*c
      fimpara
      escreva("O fatorial de ",num," e: ",fat)
fimprocedimento

procedimento ex18
var
   a,b:inteiro
inicio
      escreva("Entre com o valor de A: ")
      leia(a)
      escreva("Entre com o valor de B: ")
      leia(b)
      escreval("O valor da Soma de A+B e: ",a+b)
      escreval("O valor da Subtracao de A-B e: ",a-b)
      escreval("O valor da multiplicacao de A*B e: ",a*b)
      escreval("O valor da Divisao de A/B e: ",a/b)
fimprocedimento

funcao  ex19(a:inteiro):inteiro
var
   soma,c:inteiro
inicio
      soma<-0
      para c de 1 ate a faca
      soma<-soma+c
      fimpara
      retorne soma
      escreva("A soma do ",a, " ate 1 e: ",soma)

fimfuncao

procedimento ex20
var
matriz:vetor[1..10,1..30] de inteiro
l,c,calc,men,mai:inteiro
inicio
//a)
      calc<-0
      para l de 1 ate 10 faca
           escreval("Entre com os 30 numeros da linha ",l,":")
           para c de 1 ate 30 faca
           leia(matriz[l,c])
           calc<-calc+matriz[l,c]
           fimpara
      fimpara
//b)
      escreval("A media da matriz e: ",calc/(10*30))
//c e d)
      mai<-matriz[1,1]
      para l de 1 ate 10 faca
           para c de 1 ate 30 faca
                se (mai<matriz[l,c]) entao
                   mai<-matriz[l,c]
                fimse
                se (men>matriz[l,c]) entao
                   men<-matriz[l,c]
                   fimse

           fimpara
      fimpara
      escreval("O maior valor da matriz e: ",mai)
      escreval("O menor valor da mtriz e: ",men)
fimprocedimento

funcao ex21(n:inteiro):inteiro
var
   i,calc,divis,re:inteiro
inicio
      calc<-1
      para i de n ate 1 passo -1 faca
      calc<-calc*i
      fimpara
      retorne calc
fimfuncao
var
   a,b,re,exa,exb:real
inicio
      leia(a)
      leia(b)
      exa<-ex21(a)
      exb<-(ex21(b)*(ex21(a-b)))
      re<-ex21(a)/(ex21(b)*(ex21(a-b)))
      escreva("O resultado e :",re)
fimalgoritmo
