algoritmo "ordernar"
// Função :
// Autor :
// Data : 06/12/2013
// Seção de Declarações 

procedimento ex1
var
   num,i:inteiro
inicio
      escreva("Entre com um numero: ")
      leia(num)
      para i de num ate 1 passo -1 faca
           escreva(i," ")
      fimpara
fimprocedimento

procedimento ex2
var
 num,num1,i:inteiro
inicio
      escreva("Entre com os dois numeros: ")
      leia(num, num1)
      se num>num1 entao
         para i de num ate num1 passo -1 faca
             se i%2=0 entao
                escreva(i," ")
             fimse
         fimpara
      senao
           para i de num1 ate num passo -1 faca
             se i%2=0 entao
                escreva(i," ")
             fimse
           fimpara
      fimse
fimprocedimento

procedimento ex3
var
   num,i:inteiro
inicio
      escreva("Entre com um numero: ")
      leia(num)
      para i de 0 ate 10 faca
           escreval(num," X",i,"=",i*num)
      fimpara
fimprocedimento

procedimento ex4a //Resposta C: 500 numeros
var
   i,j:inteiro
inicio
      para i de 1 ate 100 passo 2 faca
           para j de 1 ate 10 faca
                escreval(i+j)
                c<-c+1
           fimpara
      fimpara
fimprocedimento

procedimento ex4b //Resposta C: 50 numeros
var
   i,j:inteiro
inicio
      para i de 1 ate 5 faca
           para j de i ate 10 faca
                escreval(i+j)
                c<-c+1
           fimpara
      fimpara
fimprocedimento

procedimento ex4c //Resposta C: 150 numeros
var
   i,j:inteiro
inicio
      para i de 10 ate 1 passo -1 faca
           para j de 15 ate 1 passo -1 faca
                escreval(i+j)
                c<-c+1
           fimpara
      fimpara
fimprocedimento

procedimento ex5a
var
   i,j:inteiro
inicio
      i<-100
      enquanto i>=5 faca
      //para i de 100 ate 5 passo -5 faca
                escreval(i)
                i<-i-5
      fimenquanto
      //fimpara
fimprocedimento

procedimento ex5b
var
   i,j:inteiro
   veti: vetor[1..100] de inteiro
inicio
      i<-1
       enquanto i<=100 faca
      //para i de 1 ate 100 faca
           se (veti[i]mod 2=0)  entao
              veti[i]<-i
           senao
                veti[i]<-0
           fimse
      i<-i+1
     // fimpara
      fimenquanto
fimprocedimento

procedimento ex5c
var

   veti: vetor[1..100] de inteiro
inicio
      i<-1
     enquanto i <=20 faca
         j<-0
         enquanto j <=9 faca
              j<-j+1
    //para i de 1 ate 20 faca
        // para j de 1 ate 9 faca
	           escreva(i, " e ", j)	
         //fimpara


         escreval()
         fimenquanto
         i<-i+1
   fimenquanto
   //fimpara

fimprocedimento

//procedimento ex6
//var
//    escol: inteiro
//inicio
//      escol <- 0
//para escol de 0 ate
//enquanto (escol <> 9) faca
//	escreva("Faça uma nova escolha")
//	leia(escolha)
//     fimenquanto

//fimprocedimento

procedimento ex7
var
   i,j,quantidade:inteiro
inicio
      i<-1
      leia(quantidade)
      enquanto i<=quantidade faca
         j<-1
          enquanto j<=i faca
                  escreva(j)
                  j<-j+1
          fimenquanto
               escreva(" Pular linha")
               i<-i+1
      fimenquanto
fimprocedimento



var
   i,j:inteiro
inicio
      ex7
fimalgoritmo
