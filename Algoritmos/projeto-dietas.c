#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <ctype.h>

main (){
	
	setlocale(LC_ALL,"Portuguese");
	
	float peso, altura, mediacalorica, mediacaloricaC, idade, taxaB;
	int op;
	char sexo;
	char treino;
	
	
	
	printf("Simulador de dieta\n [1]Cadastrar uma nova dieta\n [2]Sair\n");
	scanf("%i", &op);
	
	while(op != 2)
	{
		printf("Insira o seu sexo: M - masculino F - feminino: ");
    	scanf(" %c", &sexo);
    	sexo = toupper(sexo);
		printf("Voc� realiza algum treino de muscula��o? [S/N] ");
		scanf(" %c", &treino);
		treino = toupper(treino);
		printf("Digite sua idade: ");
		scanf("%f", &idade);
		printf("Digite sua altura em cm : ");
		scanf("%f", &altura);
		printf("Digite seu peso: ");
		scanf("%f", &peso);
		printf("Digite sua taxa basal? ");
		scanf("%f", &taxaB);
		if(sexo == 'M')
		{
			mediacalorica = 2000 + taxaB; 
		}
		else if(sexo == 'F')
		{
			mediacalorica = 1200 + taxaB;
		}
		if(treino == 'S')
		{
			mediacalorica += 400;
		}
		printf("%f\n",mediacalorica);
		if(mediacalorica <= 2000)
		{
			printf("DIETA DE 2000 CALORIAS\n");
			printf("__________________________\n");
			printf("\nCafe da manha (07:00) - 545 kcal\n");
		    printf("1 Misto quente;\n1 X�cara grande de caf� com leite desnatado com ado�ante;\n1/2 Mamao papaia;\n1 Iogurte para beber\n");
		    printf("Lanche(09:00) - 90 kcal\n");
		    printf("1 Banana\n");
		    printf("Almo�o(12:00) - 581 kcal\n");
		    printf("1 Suco natural de laranja (200ml);\n4 Colheres de sopa d arroz branco;\n1 Concha de feij�o;\n1 Fil�  de carne bovina pequeno;\n1 Prato de sobremesa com salada de alface, tomate e repolho roxo com shoyu;\n3 Colheres de sopa de cenoura cozida;\n");
		    printf("Lanche da tarde(18:00) - 245 kcal\n");
		    printf("1 Sandu�che de p�o intgral com peito de peru, queijo branco, tomate e alface;\n1 Suco de melancia(200ml);\n");
		    printf("Jantar(21:00) - 440 kcal");
		    printf("1 Peito de frango grelhado;\n4 Colheres de sopa de arroz com cenoura;\n1 Prato de sobremesa de alface, tomate e repolho roxo com shoyu;\n1 Suco de melancia;");
		    printf("Total: 1901 kcal\n");
		}
		else if((mediacalorica > 2000) && (mediacalorica <= 3000))
		{
			printf("DIETA DE 3000 CALORIAS\n");
            printf("\nCafe da manha (07:00) - 480 kcal\n");
            printf("1 X�cara de caf� com leite e a��car;\n4 Fatias de p�o de forma com 2 colheres de sopa de margarina;\n4 Fatias de peito de peru light e 1 kiwi;\n");
            printf("Lanche (09:00) - 189 kcal\n");
            printf("200 ml de �gua de coco;\n1 Torrada integral;\n1 X�cara de uva it�lia;\n");
            printf("\nAlmo�o (12:00) - 1149 kcal\n");
            printf("1 X�cara de couve refogada;\n5Colheres de sopa de arroz branco cozido;\n2 Conchas de feij�o preto cozido;\n1 Fil� m�dio de salm�o grelhado;\n1 X�cara de mel�o\n1 P�ssego grande para a sobremesa.\n");
            printf("\nLanche da tarde (18:00) - 316 kcal\n");
            printf("1 fatia de bolo de fub�;\n1 potinho de 170 gramas de iogurte natural.\n");
            printf("\nJantar (21:00) - 820 kcal\n");
            printf("1 x�cara de repolho refogado;\n1 x�cara de couve-flor em peda�os cozida1 x�cara de beterraba cozida em fatias;\n4 colheres de sopa de arroz integral cozido1 concha de feij�o carioca cozido;\n1 sobrecoxa grande assada de frango;\n� mam�o papaia m�dio e 1 pera grande como sobremesa.\n");
            printf("Total: 2954 kcal\n");
		}
		else if(mediacalorica > 3000)
		{
			printf("DIETA DE 4000 CALORIAS\n");
			printf("\nCafe da manha (07:00) - 725 kcal\n");
        	printf("1 X�cara de granola integral;\n150 g de queijo cottage;\n1 X�cara de morangos;\n1 X�cara de framboesas;\n200 ml de suco de laranja.\n");
	        printf("\nLanche (09:00) - 880 kcal\n");
	        printf("100 g de aveia em flocos;\n4 Colheres (sopa) de pasta de amendoim integral;\n30 g de am�ndoas naturais.\n");
	        printf("\nAlmo�o (12:00) - 907 kcal\n");
	        printf("3 Colheres (sopa) de arroz integral;\n120 g de peito de frango assado;\n100 g de couve manteiga refogada;\n200 ml de suco de melancia;\n1 Abacate e 25 g (� de tablete) de chocolate amargo 70%.\n");
	        printf("\nLache da tarde (18:00) - 508 kcal\n");
	        printf("1 P�o franc�s integral com 2 colheres (sopa) de requeij�o cremoso;\n1 Ma�� grande;200 ml de leite integral.\n");
	        printf("\nJantar (21:00) - 962 kcal\n");
	        printf("100 g de costela bovina assada;\n1 Batata doce grande cozida (com casca);\n1 Concha de feij�o carioca cozido;\n2 Tomates grandes fatiados;\n1 X�cara de couve-flor cozida;\n1 Colher (sopa) de azeite de oliva;\n200 ml de suco integral de uva.");
	        printf("Total: 3982 kcal\n");
		}
		printf("\nSimulador de dieta\n[1]Cadastrar uma nova dieta\n[2]Sair\n");
		scanf("%i", &op);
		
	}
}
