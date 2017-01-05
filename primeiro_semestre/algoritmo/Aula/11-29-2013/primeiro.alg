algoritmo "semnome"
// Função : Fazer um algoritmo que contenha um menu para os seguintes procedimentos:
//A) Ler dois numeros e imprimir a soma.
//B)Ler dois numeros e imprimir a subtração do segundo pelo primeiro.
//C)Ler dois numeros e imprimir a multiplicação.
//D)Ler dois numeros e imprimir a divisao do primeiro pelo segundo.
//E)Ler um numero e imprimir o fatorial deste numero.
// Autor : Luiz Torres Junior
// Data : 29/11/2013
// Seção de Declarações

procedimento soma(a,b:inteiro)
var
   soma:inteiro
inicio

      soma<-a+b
      escreval()
      escreva("A soma e = ",cal)
      
fimprocedimento

procedimento subt(a,b:inteiro)
var
   sub:inteiro
inicio

      sub<-b-a
      escreva("A subtracao = ",sub)
      
fimprocedimento

procedimento mult(a,b:inteiro)
var
   mul:inteiro
inicio

      mul<-a*b
      escreva("A multipicacao = ",mul)
      
fimprocedimento

procedimento divis(a,b:inteiro)
var
   divi:inteiro
inicio

      divi<-a/b
      escreva("A divisao = ",divi)
      
fimprocedimento

procedimento fato(n:inteiro)
var
  fat,i:inteiro
inicio

      fat<-1
      para i de n ate 1 passo -1 faca
      fat<-fat*i
      fimpara
      escreval("O fatoria de ", n ," = ",fat)
      
fimprocedimento

procedimento  elev(a,b:inteiro)

var
   i,el:inteiro
inicio

      el<-1
      para i de 1 ate b faca
      el<-el*a
      fimpara
      escreva("O resultado de", a," elevado a", b," e =", el)
      
fimprocedimento

procedimento menu
var op,a,b:inteiro
inicio
    enquanto (op<>8) faca
             escreval("Entre com o primeiro numero: ")
             leia(a)
             escreval("Entre com o segundo numero: ")
             leia(b)
             escreval("Menu de opcao")
             escreval("1-Ler dois numeros e imprimir a soma")
             escreval("2-Ler dois numeros e imprimir a subtração do segundo pelo primeiro")
             escreval("3-Ler dois numeros e imprimir a multiplicação")
             escreval("4-Ler dois numeros e imprimir a multiplicação")
             escreval("5-Ler um numero e imprimir o fatorial primeiro numero")
             escreval("6-Ler um numero e imprimir o fatorial segundo numero")
             escreval("7-elevado")
             escreval("8-sair")
             escreva("Entre com a opcao: ")
             leia(op)
             escolha op
                     caso  1
                             soma(a,b)
                     caso  2
                             subt (a,b)
                     caso  3
                             mult (a,b)
                     caso  4
                             divis (a,b)
                     caso  5
                             fato (a)
                     caso  6
                             fato(b)
                     caso  7
                             elev(a,b)
                     caso 8
                     escreval("Saindo do programa")
    outrocaso
             escreva("Opcao invalida")
             
    fimescolha
    fimenquanto
fimprocedimento

var

inicio
       menu
fimalgoritmo
