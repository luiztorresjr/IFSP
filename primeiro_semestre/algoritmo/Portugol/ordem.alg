algoritmo "A ordem de tres numeros"
// Função :  colocar tres numeros em ordem crescente
// Autor : LTJ
// Data : 07/09/2013
// Seção de Declarações 
var  num1,num2,num3: inteiro

inicio
      escreva("Entre com o primeiro numero:")
leia(num1)
      escreva("Entre com o segundo numero:")
leia(num2)
      escreva("Entre com o terceiro numero:")
leia(num3)
se((num1>num2) e (num2>num3)) entao
      escreva("A ordem é:",num1," > ",num2," > ",num3,"")
fimse
se((num1>num3) e (num3>num2)) entao
      escreva("A ordem é:",num1," > ",num3," > ",num2,"")
fimse
se((num2>num1) e (num1>num3)) entao
      escreva("A ordem é:",num2," > ",num1," > ",num3,"")
fimse
se((num2>num1) e (num1<num3)) entao
      escreva("A ordem é:",num2," > ",num3," > ",num1,"")
fimse
se((num3>num1) e (num1>num2)) entao
      escreva("A ordem é:",num3," > ",num1," > ",num2,"")
fimse
se((num3>num1) e (num1<num2)) entao
      escreva("A ordem é:",num3," > ",num2," > ",num1,"")
fimse
se ((num1=num2) e (num3=num2)) entao
      escreva("os tres são iguais")
fimse
se((num1=num2) e (num1>num3))entao
      escreva("A ordem é:",num1," = ",num2," > ",num3,"")
fimse
se((num1>num2) e (num2=num3))entao
      escreva("A ordem é:",num1," > ",num2," = ",num3,"")
fimse
se((num1>num2) e (num1=num3))entao
      escreva("A ordem é:",num1," = ",num3," > ",num2,"")
fimse
se((num2=num3) e (num2>num1))entao
      escreva("A ordem é:",num2," = ",num3," > ",num1,"")
fimse
se((num2>num3) e (num1=num3))entao
      escreva("A ordem é:",num2," > ",num3," = ",num1,"")
fimse
se((num1=num2) e (num3>num1))entao
      escreva("A ordem é:",num3," > ",num2," = ",num1,"")
fimse
fimalgoritmo
