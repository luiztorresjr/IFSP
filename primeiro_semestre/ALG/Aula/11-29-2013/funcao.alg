algoritmo "semnome"
// Função :
// Autor :
// Data : 29/11/2013
// Seção de Declarações
 
funcao  elev(a,b:inteiro):inteiro

var
   i,el:inteiro
inicio

      el<-1
      para i de 1 ate b faca
      el<-el*a
      fimpara
      retorne el

fimfuncao

var
    a,b,c,re,op:inteiro
inicio
      op<-0
      enquanto (op<>2) faca
      escreva("Digite 3 numeros:")
      leia(a,b,c)
     // 1°escreva(elev(b,c))  primeira forma
      re<-elev(b,c) //segunda forma
     // 1°escreva(elev(a,re))   primeira forma
      re<-elev(a,re) //segunda forma
      // re<-elev(a,elev(b,c)) terceira forma
      escreval(re)
      escreva("Fazer outro calculo 1-sim 2-Nao ")
      leia(op)
      fimenquanto
fimalgoritmo
