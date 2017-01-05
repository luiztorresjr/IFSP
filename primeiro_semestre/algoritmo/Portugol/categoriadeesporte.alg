algoritmo "faixa etaria por categoria"
// Função : descobrir a categoria que se deve a faixa etaria
// Autor Luiz Torres Junior
// Data : 09/09/2013
// Seção de Declarações 
var
    idade :inteiro
inicio
         escreva("Entre com a idade:")
leia(idade)
se((idade>=2) e (idade<=5)) entao
         escreva("Sua categoria é DENTE DE LEITE")
fimse
se((idade>=6) e (idade<=10)) entao
         escreva("Sua categoria é INFANTIL")
fimse
se((idade>=11) e (idade<=16)) entao
         escreva("Sua categoria é JUVENIL")
fimse
se((idade>=17) e (idade<=20)) entao
         escreva("Sua categoria é SUB-20")
fimse
se((idade>=21)) entao
         escreva("Sua categoria é ADULTO")
fimse
fimalgoritmo
