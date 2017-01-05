algoritmo "exercico 5"
// Função :ler 15 valores de um vetor A e criar um vetor B que receba os valores fatoriais do Vetor A.
// Autor : Luiz Torres Junior
// Data : 01/11/2013
// Seção de Declarações 
var
    vetA: vetor[1..15] de inteiro
    vetB: vetor[1..15] de inteiro
    cont,i,fat: inteiro
inicio
      fat<-1
      i<-1
      para cont de 1 ate 15 faca
      escreva("Entre com o numero de ordem ",cont," do vetor A:")
      leia(vetA[cont])
      enquanto (i<=vetA[cont]) faca
      fat<-i*fat
      i<-i+1
      fimenquanto
      vetB[cont]<-fat
      fimpara
      para cont de 1 ate 15 faca
      escreval("O vetor A de ordem ", cont," e: ", vetA[cont]," E o vetor B de ordem ", cont," e: ",vetB[cont])
      fimpara

fimalgoritmo
