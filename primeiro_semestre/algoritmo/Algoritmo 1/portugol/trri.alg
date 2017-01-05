algoritmo "identificar triangulos"
// Função :  fazer um algoritmo que o slados de um triangulo a,b e c verificando se os valores fornecidos sao maiores que zero e calcular a area(A) do triangulo atraves da seguite formula
// Autor :
// Data : 20/09/2013
// Seção de Declarações 
var   a,b,c : real

inicio
escreval("Digite os lados do triangulo")
leia(a,b,c)

se(a=b) e (b=c) entao
escreva("Equilatero")
senao
se(a<>b) e (b<>c) entao
escreva("Escaleno")
senao
escreva("Isoceles")
fimse
fimse
fimalgoritmo
