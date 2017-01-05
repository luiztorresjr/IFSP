algoritmo "CATEGORIA DE FRENQUENCIA"
// Função : descobrir a categoria da frequencia do aluno.
// Autor :  luiz torres junior
// Data : 13/09/2013
// Seção de Declarações
var
freq:inteiro
inicio
escreva("Digite a frequencia: ")
leia(freq)
escolha freq
caso 10
   escreva("Assiduo")
caso 8,9
   escreva("Boa frequencia")
caso 6,7
   escreva("Frequencia regular")
caso 3,4,5
   escreva("Baixa frequencia")
caso 0,1,2
   escreva("Baixissima frequencia")
outrocaso
se(freq>10)entao
   escreva("Frequencia nao pode ser maior que 10")
senao
   se(freq<0) entao
      escreva("Frequencia nao pode ser menor que 0")
   fimse
fimse
fimescolha
fimalgoritmo
