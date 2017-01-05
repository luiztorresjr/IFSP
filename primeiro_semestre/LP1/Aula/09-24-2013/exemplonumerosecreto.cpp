#include "stdio.h"
#include "stdlib.h"
//Biblioteca que trabalha com comandos de data e hora
#include "time.h" 	
main(){
       int palpite, numero_secreto;
       srand (time (NULL)); // a cada execu��o do programa, ser� gerado um novo numero
       //Armazena o numero gerado
       //%5 gera o numero de 0 at� 5. Poder� aumentar o intervalo alterando o n�mero 5.
       //Por exemplo, alterando para 100, o n�mero em que o computador ir� escolher ser�
       //de 0 at� 100.
       numero_secreto=rand() %5;
       printf("Qual e o numero?");
       //Perguntando o n�mero para o usu�rio
       scanf("%i",&palpite);
       //Se o n�mero que o usu�rio digitou for igual ao n�mero que o computador sorteou
       //Ser� apresentada a mensagem "Acertou o n�mero"
       if(palpite==numero_secreto)
           printf("\n\nAcertou! %i e o numero secreto\n\n",palpite);
       //Se o n�mero digitado n�o � igual ao n�mero sorteado, ser� verificado se ele
       //� maior ou menor para dar a mensagem ao usu�rio. 
       else if (palpite>numero_secreto)
           printf("\n\nErrado! %i e muito alto\n\n",palpite);
       else
           printf("\n\nErrado! %i e muito baixo\n\n",palpite);
       system("pause");
}      
