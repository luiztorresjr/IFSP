#include "stdio.h"
#include "stdlib.h"
//Biblioteca que trabalha com comandos de data e hora
#include "time.h" 	
main(){
       int palpite, numero_secreto;
       srand (time (NULL)); // a cada execução do programa, será gerado um novo numero
       //Armazena o numero gerado
       //%5 gera o numero de 0 até 5. Poderá aumentar o intervalo alterando o número 5.
       //Por exemplo, alterando para 100, o número em que o computador irá escolher será
       //de 0 até 100.
       numero_secreto=rand() %5;
       printf("Qual e o numero?");
       //Perguntando o número para o usuário
       scanf("%i",&palpite);
       //Se o número que o usuário digitou for igual ao número que o computador sorteou
       //Será apresentada a mensagem "Acertou o número"
       if(palpite==numero_secreto)
           printf("\n\nAcertou! %i e o numero secreto\n\n",palpite);
       //Se o número digitado não é igual ao número sorteado, será verificado se ele
       //é maior ou menor para dar a mensagem ao usuário. 
       else if (palpite>numero_secreto)
           printf("\n\nErrado! %i e muito alto\n\n",palpite);
       else
           printf("\n\nErrado! %i e muito baixo\n\n",palpite);
       system("pause");
}      
