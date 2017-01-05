algoritmo "semnome"
// Função :
// Autor :
// Data : 26/10/2013
// Seção de Declarações 
var
valor:vetor [1..20] de inteiro
posi,neg,mediap,n,p,median : real
contador : inteiro
inicio
n<-0
p<-0
escreval("entre com os numero")
para contador de 1 ate 20 faca
leia(valor[contador])
fimpara
para contador de 1 ate 20 faca
se (valor[contador]<0) entao
neg<-valor[contador]+neg
n <- n+1
senao
posi<-posi + valor[contador]
p <- p + 1
fimse

fimpara
mediap<-posi/p
escreval("A media dos numeros posiitivo e: ",mediap)
median<-neg/n
escreval("A media dos numeros negativos e: ",median)

fimalgoritmo
