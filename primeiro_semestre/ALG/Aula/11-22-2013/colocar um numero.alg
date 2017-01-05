algoritmo "Procedimento"

//Procedimento para Preeencher um vetor vet de 10 posições com numeros digitados pelo usuario.

procedimento preenchercomnumerosusuario1
var

   i: inteiro
inicio
escreval("Entre com 10 numeros em um vetor")
para i de 1 ate 10 faca
	leia(vet[i])
fimpara
escreva("Os numeros digitados: ")
fimprocedimento

procedimento impares2
var
   i: inteiro
inicio
escreva("O 10 primeiros numeros impares: ")
para i de 1 ate 10 faca
vet[i]<-2*i-1
fimpara

fimprocedimento

procedimento fibonacci3
var
   i: inteiro
inicio
escreva("Os Numeros de Fibonacci: ")
vet[1]<-1
vet[2]<-1
para i de 3 ate 10 faca
vet[i]<-vet[i-1]+vet[i-2]
fimpara
fimprocedimento


procedimento imprimirvetor4
var

   i: inteiro
inicio
escreva(" ")
para i de 1 ate 10 faca
     escreva(vet[i])
fimpara
escreval()
fimprocedimento

procedimento quantidadeimpares5
var
   i,impares: inteiro
inicio
impares<-0
para i de 1 ate 10 faca
se (vet[i]mod 2 = 1) entao
impares<-impares+1
fimse
fimpara
escreva("quantidade de impares: ")
escreval(impares)

fimprocedimento
procedimento  numeropos6
var
  num, pos1 : inteiro
inicio
escreva("Entre com um numero: ")
leia(num)
escreva("entre com a posicao onde ir guardar em no maximo 10:")
leia(pos1)
se (pos1 >10)entao
   escreva("A posicao nao pode ser maior que 10")
senao
     vet[pos1]<-num
fimse
vet[pos1]<-num
i<-i+1
fimprocedimento

procedimento  menu

var
 opcao:inteiro
inicio
      enquanto (opcao<>7) faca
      escreval("   MENU DE OPCAO  ")
      escreval("1 - Preencher um vetor com numeros do usuario")
      escreval("2 - Preencher um vetor com numeros numeros impares")
      escreval("3 - Preencher um vetor com Fibonacci")
      escreval("4 - Imprimir na tela o vetor")
      escreval("5 - Quantidade de impares no vetor")
      escreval("6 - Colocar o numero digitado pelo usuario na posicao escolhida")
      escreval("7 - Sair")
      leia(opcao)
      
      escolha opcao
      caso 1
           preenchercomnumerosusuario1
           imprimirvetor4
      caso 2
           impares2
           imprimirvetor4
      caso 3
           fibonacci3
           imprimirvetor4
      caso 4
           imprimirvetor4
      caso 5
           quantidadeimpares5
           imprimirvetor4
      caso 6
           numeropos6
           imprimirvetor4
      caso 7
           escreva("Saindo do programa...")
      outrocaso
               escreva("Opcao invalida")
      fimescolha
fimenquanto
fimprocedimento
var
   vet: vetor[1..10] de inteiro
inicio

      menu
fimalgoritmo
