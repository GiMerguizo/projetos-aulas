#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

typedef struct aluno{
	char CPF[13];
	char nome[80];
	int numaula;
}aluno;

typedef struct dance{
	int regaula;
	int qaluno;
	char modalidade[20];
	int grau;
	float calor;
}dance;

void alocaAluno(aluno **al, int tam);
void alocaSalas(dance **d, int tam);
void cadastroSalas(dance *d, int tam);
void matricula(dance *d, aluno *al);
int buscaReg(int mod);
void encerra(dance *d, aluno *al, int qtde);

int main (){
	
	setlocale(LC_ALL, "Portuguese");
	
	dance *pd=NULL;
	aluno *pa=NULL;
	int op, cont=0;
	
	printf("Seja Bem-Vindo(a) a Academia de Dança\n\n");
	printf("Nossas modalidades: \n");
	printf("[1] Ballet\n[2] Jazz\n[3] Street\n\n");
	
	printf("Temos aulas no seguintes graus: \n");
	printf("- Iniciante\n- Intermediário\n- Avançado\n\n\n");
	
	alocaSalas(&pd, 3);
	cadastroSalas(pd, 3);
	
	do
	{
		printf("[1] Matrícula\n[2] Encerrar Matrícula\n[3] Fim\nOpção: ");
		scanf("%i", &op);
		fflush(stdin);
		
		switch(op)
		{
			case 1:
				alocaAluno(&pa, cont+1);
				matricula(pd+cont, pa+cont);	
				cont++;
				pa->numaula = (pa->numaula + cont) + 1;
				break;
			case 2:
				encerra(pd, pa, cont);
				break;					
		}
			
	}while(op != 3);
	
	printf("\n\nNúmero de alunos: %i\n\n", pd->qaluno);
	
	return 0;
}

void alocaAluno(aluno **al, int tam)
{
	if((*al=(aluno*)realloc(*al, tam*sizeof(aluno))) == NULL)
	{
		printf("Erro na alocação!");
		exit(1);
	}
}

void alocaSalas(dance **d, int tam)
{
	if((*d=(dance*)realloc(*d, tam*sizeof(dance))) == NULL)
	{
		printf("Erro na alocação!");
		exit(1);
	}
}

void cadastroSalas(dance *d, int tam)
{
	int i;
	
	for(i = 0; i < tam; i++, d++)
	{
		d->regaula = i + 1;
		d->qaluno = 0;
		
		if(d->regaula == 1)
			strcpy(d->modalidade, "Ballet");
		else if (d->regaula == 2)
			strcpy(d->modalidade, "Jazz");
		else
			strcpy(d->modalidade, "Street");
	}
}

void matricula(dance *d, aluno *al)
{
	int grau, numreg, auxmo;
	float valor;
	
	printf("\nNome do Aluno: ");
	gets(al->nome);
	fflush(stdin);
	
	printf("CPF: ");
	gets(al->CPF);
	fflush(stdin);
	
	printf("Modalidade: ");
	gets(d->modalidade);
	//scanf("%i", &(d->modalidade));
	fflush(stdin);
	
	printf("\n[1] Iniciante\n[2] Intermediário\n[3] Avançado\n Grau: ");
	scanf("%i", &(d->grau));
	fflush(stdin);
	
	if(strcmp(d->modalidade, "Ballet"))
	{
		valor = 20;
		//auxmo = d->modalidade;
	}
	else if(strcmp(d->modalidade, "Jazz"))
	{
		valor = 25;
		//auxmo = d->modalidade;
	}
	else
	{
		valor = 30;
		//auxmo = d->modalidade;
	}
	
	numreg = buscaReg(auxmo);
	printf("\nNúmero do Registro: %i\n", numreg);
	
	
	printf("\nValor da aula: R$%.2f\n", valor);
	d->qaluno++;
}

int buscaReg(int mod)
{
	int i;
	
	for(i = 0; i < 3; i++)
	{
		if(mod == i+1)
			return i+1;
	}
	return -1;
}

void encerra(dance *d, aluno *al, int qtde)
{
	int i;
	char cpf[13];
	
	printf("\n-- Encerrar Matrícula --\n");
	printf("\nCPF: ");
	gets(cpf);
	fflush(stdin);
	
	for(i = 0; i < qtde; i++, al++)
	{
		if(strcmp(al->CPF, cpf) == 0)
		{
			printf("\nNome: %s", al->nome);
			printf("\nRegistro: %i", al->numaula);
			printf("\nModalidade: %s", d->modalidade);
			printf("\nGrau: %i", d->grau);		
		}
		
		d->qaluno--;
	}
	system("PAUSE");
}
