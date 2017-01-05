algoritmo "exercicio 7"
// Função :criar um algoritmo para ter o nome de vendedores de uma loja de carros e seus respectivos salario no mes e verificar quem foi o melhor e a media de
//salario do mes
// Autor :Luiz Torres Junior
// Data : 02/11/2013
// Seção de Declarações 
var
    vendedor:vetor[1..5] de caractere
    venda:vetor[1..5] de real
    mes: vetor[1..5] de real
    cont, i:inteiro
    maior, soma, media:real
inicio
   para cont de 1 ate 5 faca
   escreva("Entre com o nome do Vendedor: ")
   leia(vendedor[cont])
   escreva("Entre com o valor das vendas de ", vendedor[cont],": ")
   leia(venda[cont])
   mes[cont] <- 500+(venda[cont]*0.75)
   fimpara
   soma<-0
   maior <- mes[1]
   para cont de 1 ate 5 faca
   se ( maior < mes[cont]) entao
   maior <- mes[cont]
   i <- cont
   fimse
   soma<-soma+mes[cont]
   fimpara
   media<-soma/cont
   escreval("O melhor vendedor e: ", vendedor[i], " e o seu salario e: R$", mes[i])
   escreva("A media de salario do mes foi: R$", media)
fimalgoritmo

