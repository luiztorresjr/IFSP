/*faca um programa que leia o codigo dos produtos pedidos e as quantidades desejadas. calcule e mostre o valor a ser pago por produto
(preco*quantidade) e o total do pedido. considere q o cliente deve informar quando o pedido deve ser encerrado.
produto          codigo   preco(unitario)
cachorro quente    1       R$3.50
hamburger          2       R$4.00
cheeseburger       3       R$4.50
eggcheeseburger    4       R$5.00
refrigerante       5       R$3.50
programa 36=
Luiz torres junior
24/09/2013 IFSP
*/
#include <stdio.h>
#include <stdlib.h> 

main(){
       int  ped,quant,cod;
       float  val,total=0;
       do{
       printf("MENU PRINCIPAL\n\n");
       printf("1-Chachoro quente ------->R$ 3,50\n");
       printf("2-hamburger ------------->R$ 4,00\n");
       printf("3-cheeseburger ---------->R$ 4,50\n");
       printf("4-eggcheeseburger ------->R$ 5,00\n");
       printf("5-refrigerante ---------->R$ 3,50\n");              
       printf("codigo do produto: ");       scanf("%i",&cod);
       printf("quantidade: ");              scanf("%i",&quant);
       if (cod==1 || cod==5)
          val=quant*3.50;
       else if (cod==2)
          val=quant*4.00; 
       else if (cod==3)
          val=quant*4.50;
       else if (cod==4)
          val=quant*5.00;
       else
          printf("Codigo invalido");
          total=val+total;
       printf("Encerrar o pedido:\n");
       printf("1- SIM\n"); 
       printf("2- NAO\n");
       scanf("%i",&ped);
           }while(ped==2);
           printf("O valor total e: %.2f\n",total);
       system("pause");                     
       }
       
       
       
       
