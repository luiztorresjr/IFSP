algoritmo "EncontrarOMaiorNumeroNoVetor"
var
     maior, contador: inteiro
     numeros: vetor [1..5] de inteiro
inicio
//ler os 50 numeros
para contador de 1 ate 5 faca
     escreva("Digite o ", contador, " numero: ")
     leia(numeros[contador])
fimpara

//percorrer o vetor para identificar o maior

     //supor que o primeiro elemento é o maior
     maior <- numeros[1]
     //a partir do segundo, comparar com o maior
     para contador de 2 ate 5 faca
        se (numeros[contador] > maior) entao
             //caso o valor do indice no vetor for maior, este
             //será o novo maior
             maior <- numeros[contador]
        fimse
     fimpara
     //escreve o maior numero encontrado
     escreva("O maior numero é ", maior)
fimalgoritmo
