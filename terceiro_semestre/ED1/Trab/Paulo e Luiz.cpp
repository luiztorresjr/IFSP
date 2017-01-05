//Luiz Torres Junior
//Paulo Teruo Izumi
#include <stdlib.h>
#include <stdio.h>


struct cadastro {
	int pront;
	char nome[30],titu[10],cargo[10];
	float sala,porc;
	};
 cadastro prof;
 cadastro adm;
 
 void cadastroProf(){
 	printf("Digite o nome:");
 	scanf("%s",&prof.nome);
 	printf("Digite o prontuario:");
 	scanf("%d",&prof.pront);
 	printf("Digite o Titulacao:");
 	scanf("%s",&prof.titu);
 	printf("Digite o salario:");
 	scanf("%f",&prof.sala);
 }
 void cadastroAdm(){
 	printf("Digite o nome:");
 	scanf("%s",&adm.nome);
 	printf("Digite o prontuario:");
 	scanf("%d",&adm.pront);
 	printf("Digite o Cargo:");
 	scanf("%s",&adm.cargo);
 	printf("Digite o salario:");
 	scanf("%f",&adm.sala);
 }
 
 void mostra(cadastro s,int op){
 	if(op==4){
 	printf("\n\n\nTitulacao: %s\n",s.titu);
 }
 	if(op==5){
 		printf("\n\nCargo:%s\n",s.cargo);
 		
 	}
 	printf("Nome: %s\n",s.nome);
 	printf("Prontuario: %d\n",s.pront);
 	printf("Salario:R$ %f\n",s.sala);
 	printf("Salario reajustado:R$ %f\n\n\n\n\n\n\n",((s.sala*s.porc)+s.sala));
 
 }
 
 
 	void aumento(cadastro s){			
			printf("Digite a porcentagem de aumento:");
			scanf("%f",&s.porc);
			s.porc = s.porc/100;
		
		}

main(){
	
	int op,sai=1;
	
	do{
	
	printf("-----Menu------\n");
	printf("1-Cadastro de professores\n2-Cadastrar Funcionarios Administrativos\n3-Porcentagem de Reajuste\n4-Relatorios de Professores\n5-Relatorios de Funcionario\n6-Sair\n\n");
	printf("Digite a opcao desejada:");
	scanf("%d",&op);
	
	
	switch(op){
	case 1:cadastroProf();
	break;
	case 2:cadastroAdm();
	break;
	case 3:aumento(prof);
	break;
	case 4:mostra(prof,op);
	break;
	case 5:mostra(adm,op);
	break;
	case 6:sai = 0;break;
	default:printf("\nopcao invalida\n\n");
	break;
	system("cls");
}
}while(sai!=0);
	}


