algoritmo "calcule a expressao"
// Função :
// Autor :Luiz Torres Junior
// Data : 20/09/2013
// Seção de Declarações programa 20
var  x,y : real

inicio
escreva("Digite o valor de x: ")
leia(x)
se (x>1) entao
y<-(3*x+2)/raizQ(x-1)
escreva("O valor da expressao y=(3*x+2)/(x-1)^-2 :",y)
senao
escreva("nao é possivel calcular")
fimse
fimalgoritmo
