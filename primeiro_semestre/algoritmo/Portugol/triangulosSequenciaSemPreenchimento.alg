algoritmo "triangulosSemPreenchimento"
var
    contador1, contador2, contador3, contador4, numero: inteiro
inicio
    escreva("Digite o numero de asteriscos: ")
    leia(numero)
    para contador3 de 1 ate numero faca
        para contador1 de 1 ate numero faca
             para contador2 de 1 ate contador1 faca
                   escreva(" ")
             fimpara
             escreval("\")
        fimpara
        para contador1 de numero-1 ate 1 passo -1 faca
             para contador2 de contador1 ate 1 passo -1 faca
                  escreva(" ")
             fimpara
             escreval("/")
        fimpara
    fimpara

fimalgoritmo
