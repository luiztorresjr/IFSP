algoritmo "semnome"

//Procedimento para preencher um vetor vet de 10 posi��es
//com numeros digitados pelo usuario
procedimento preencherComNumerosUsuario
var
   i: inteiro
inicio
escreva("Digite 10 numeros: ")
para i de 1 ate 10 faca
	leia(vet[i])
fimpara
fimprocedimento

//Procedimento para preencher um vetor vet de 10 posi��es
//com os primeiros 10 numeros impares
procedimento preencherVetorComNumerosImpares
var
   i: inteiro
inicio
   para i de 1 ate 10 faca
       vet[i] <- 2* i - 1
   fimpara
fimprocedimento


//Procedimento para preencher um vetor vet de 10 posi��es
//com os primeiros 10 numeros de Fibonacci
procedimento preencherVetorComNumerosFibonacci
var
   i: inteiro
inicio
   vet[1] <- 1
   vet[2] <- 1
   para i de 3 ate 10 faca
        vet[i] <- vet[i-1] + vet[i-2]
   fimpara
fimprocedimento


//Procedimento para imprimir na tela os elementos de um vetor
//chamado vet de 10 posi��es
procedimento imprimirVetor
var
    i: inteiro
inicio
escreva("Os numeros no vetor sao: ")
para i de 1 ate 10 faca
     escreva(vet[i])
fimpara
escreval()
fimprocedimento

//Procedimento para imprimir a quantidade de n�meros impares em um vetor
procedimento imprimirQuantidadeImpares
var
   i, impar: inteiro
inicio
impar <- 0
para i de 1 ate 10 faca
    se (vet[i] mod 2 <> 0) entao
         impar <- impar + 1
    fimse
fimpara
escreval("A quantidade de numeros impares no vetor e: ", impar)
fimprocedimento

//Procedimento para colocar um numero fornecido pelo usuario em uma
//posi��o escolhida pelo usu�rio
procedimento colocarNumeroVetor
var
    numero, posicao: inteiro
inicio
     escreva("Digite um numero: ")
     leia(numero)
     escreva("Digite a posicao a colocar este numero: ")
     leia(posicao)
     se (posicao > 10) entao
        escreva("A posicao nao pode ser maior que 10")
     senao
        vet[posicao] <- numero
     fimse
fimprocedimento

procedimento menu
var
   opcao: inteiro
inicio
     enquanto (opcao <> 7) faca
          escreval("     MENU DE OP��ES    ")
          escreval("1. Preencher vetor com numeros digitados pelo usu�rio")
          escreval("2. Preencher vetor com numeros �mpares")
          escreval("3. Preencher vetor com numeros Fibonacci")
          escreval("4. Imprimir o vetor")
          escreval("5. Imprimir a quantidade de n�meros impares")
          escreval("6. Colocar numero digitado pelo usu�rio em uma posicao")
          escreval("7. sair")
          leia(opcao)
          
          escolha opcao
          caso 1
               preencherComNumerosUsuario
               imprimirVetor
          caso 2
               preencherVetorComNumerosImpares
               imprimirVetor
          caso 3
               preencherVetorComNumerosFibonacci
               imprimirVetor
          caso 4
               imprimirVetor
          caso 5
               imprimirQuantidadeImpares
          caso 6
               colocarNumeroVetor
               imprimirVetor
          caso 7
               escreva("Saindo do programa...")
          outrocaso
               escreval("Op��o inv�lida, escolha novamente.")
          fimescolha
     fimenquanto
fimprocedimento

var
   vet: vetor[1..10] de inteiro
inicio
    menu
fimalgoritmo
