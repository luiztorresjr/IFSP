algoritmo "semnome"
// Função :
// Autor :
// Data : 20/09/2013
// Seção de Declarações 
var
x,y,z: real
inicio
escreva("Digite o valor de x e y: ")
leia(x,y)
se (x>y) entao
    z<-x-y-5
    escreva("O valor da expressao z=x-y-5 e:",z)
 senao
     se (x<y) entao
     z<-y-x+1
     escreva("O valor da expressao z=y-x+1 e:",z)
  senao
  z<-x
  escreva("O valor da expressao z=x e:",z)
fimse
fimse

fimalgoritmo
