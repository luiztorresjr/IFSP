algoritmo "exercicio 6"
// Função :atraves de tres vetores criar um para cod, pre, e qtd e calc o valor total e o valor de cada prod em estoque
// Autor : Luiz Torres Junior
// Data : 02/11/2013
// Seção de Declarações 
var
    COD: vetor[1..5] de inteiro
    QTD: vetor[1..5] de inteiro
    PRE: vetor[1..5] de real
    valor:vetor[1..5] de real
    cont:inteiro
    estoque: real
inicio

    para cont de 1 ate 5 faca
    escreva("Enter com o codigo do produto ",cont," : ")
    leia(COD[cont])
    escreva("Enter com o preco do produto ",cont," : ")
    leia(PRE[cont])
    escreva("Enter com a quantidade do produto ",cont," : ")
    leia(QTD[cont])
    valor[cont]<-PRE[cont]*QTD[cont]
    fimpara
    estoque<-0
    para cont de 1 ate 5 faca
    escreval("0 valor total do produto " ,cont, " em estoque e: " ,valor[cont])
    estoque<-valor[cont]+estoque
    fimpara
    escreva("0 valor total em estoque e: ",estoque)
fimalgoritmo
