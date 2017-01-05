algoritmo "O maior de tres numeros"
// Função :  descobir o maio de tres numeros
// Autor : Luiz Torres Junior
// Data : 08/09/2013
// Seção de Declarações
var
    num1,num2,num3 :inteiro
inicio
escreva ("Entre com o primeiro numero:")
leia (num1)
escreva ("Entre com o segundo numero:")
leia (num2)
escreva ("Entre com o terceiro numero:")
leia (num3)
se ((num1>num2) e (num1>num3)) entao
escreva ("O primeiro numero e o maior")
fimse
se ((num1=num2) e (num1>num3)) entao
escreva ("O primeiro numero e o segundo sao iguais e os maiores")
fimse
se ((num1=num3) e (num1>num2)) entao
escreva ("O primeiro numero e o terceiro sao iguais e os maiores")
fimse
se ((num2=num3) e (num2>num1)) entao
escreva ("O segundo numero e o terceiro sao iguais e os maiores")
fimse
se ((num2>num1) e (num2>num3)) entao
escreva ("O segundo numero e o maior")
fimse
se ((num3>num2) e (num3>num1)) entao
escreva ("O terceiro numero e o maior")
fimse
se((num1=num2) e (num1=num3)) entao
escreva ("Os tres são iguais")
fimse
fimalgoritmo
