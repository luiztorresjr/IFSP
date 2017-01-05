algoritmo "Procedimentos sem operacoes com numeros"

procedimento somarDoisNumerosEImprimir
var
    resultado, n1, n2: inteiro
inicio
      escreva("Digite o primeiro numero: ")
      leia(n1)
      escreva("Digite o segundo numero: ")
      leia(n2)
      resultado <- n1 + n2
      escreval("A soma de ", n1, " e ", n2, " e: ", resultado)
fimprocedimento

procedimento subtrairDoisNumerosEImprimir
var
    resultado,n1, n2: inteiro
inicio
      escreva("Digite o primeiro numero: ")
      leia(n1)
      escreva("Digite o segundo numero: ")
      leia(n2)
      resultado <- n1 - n2
      escreval("A subtracao de ", n1, " por ", n2, " e: ", resultado)
fimprocedimento

procedimento multiplicarDoisNumerosEImprimir
var
    resultado, n1, n2: inteiro
inicio
      escreva("Digite o primeiro numero: ")
      leia(n1)
      escreva("Digite o segundo numero: ")
      leia(n2)
      resultado <- n1 * n2
      escreval("A multiplicacao de ", n1, " por ", n2, " e: ", resultado)
fimprocedimento

procedimento dividirDoisNumerosEImprimir
var
    n1, n2: inteiro
    resultado: real
inicio
      escreva("Digite o primeiro numero: ")
      leia(n1)
      escreva("Digite o segundo numero: ")
      leia(n2)
      resultado <- n1 / n2
      escreval("A divisão de ", n1, " por ", n2, " e: ", resultado)
fimprocedimento

procedimento fatorial
var
    resultado, n, contador: inteiro
inicio
      escreva("Digite o primeiro numero: ")
      leia(n)
      resultado <- 1
      para contador de n ate 2 passo -1 faca
          resultado <- resultado * contador
      fimpara
      escreval("O fatorial de ", n, " e: ", resultado)
fimprocedimento


procedimento menu
var
   opcao: inteiro
inicio
   enquanto opcao <> 6 faca
       escreval()
       escreval("     MENU")
       escreval("1. Somar dois números")
       escreval("2. Subtrair dois números")
       escreval("3. Multiplicar dois números")
       escreval("4. Dividir dois números")
       escreval("5. Fatorial do numero")
       escreval("6. Sair")
       escreval("Escolha uma opcao: ")
       leia(opcao)
       escolha opcao
               caso 1
                    somarDoisNumerosEImprimir
               caso 2
                    subtrairDoisNumerosEImprimir
               caso 3
                    multiplicarDoisNumerosEImprimir
               caso 4
                    dividirDoisNumerosEImprimir
               caso 5
                    fatorial
               caso 6
                    escreval("Saindo do programa...")
               outrocaso
                    escreval("Opcao invalida. Digite novamente qual opcao deseja.")
       fimescolha
   fimenquanto
fimprocedimento

var

inicio
    menu
fimalgoritmo
