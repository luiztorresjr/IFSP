/*
11-30-2013 Campinas
Formulario de aluno
criado por luiz torres junior
programa-68
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct dados_aluno
{
    char RA[10];
    char nome[50];
    char rua[50];
    int numero;
    char bairro[20];
    char cidade[30];
    char estado[2];
    char cep[13];

};
main()
{
    struct dados_aluno escola;
    strcpy(escola.RA,"0800000000");
    strcpy(escola.nome,"Joao Vicentinho Souza");
    strcpy(escola.rua,"Rua das Flores");
    escola.numero=44;
    strcpy(escola.bairro,"Jd. das Saudades");
    strcpy(escola.cidade,"Souzas");
    strcpy(escola.estado,"SP");
    strcpy(escola.cep,"13000000");
    }
