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
		printf("Você realiza algum treino de musculação? [S/N] ");
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
		    printf("1 Misto quente;\n1 Xícara grande de café com leite desnatado com adoçante;\n1/2 Mamao papaia;\n1 Iogurte para beber\n");
		    printf("Lanche(09:00) - 90 kcal\n");
		    printf("1 Banana\n");
		    printf("Almoço(12:00) - 581 kcal\n");
		    printf("1 Suco natural de laranja (200ml);\n4 Colheres de sopa d arroz branco;\n1 Concha de feijão;\n1 Filé  de carne bovina pequeno;\n1 Prato de sobremesa com salada de alface, tomate e repolho roxo com shoyu;\n3 Colheres de sopa de cenoura cozida;\n");
		    printf("Lanche da tarde(18:00) - 245 kcal\n");
		    printf("1 Sanduíche de pão intgral com peito de peru, queijo branco, tomate e alface;\n1 Suco de melancia(200ml);\n");
		    printf("Jantar(21:00) - 440 kcal");
		    printf("1 Peito de frango grelhado;\n4 Colheres de sopa de arroz com cenoura;\n1 Prato de sobremesa de alface, tomate e repolho roxo com shoyu;\n1 Suco de melancia;");
		    printf("Total: 1901 kcal\n");
		}
		else if((mediacalorica > 2000) && (mediacalorica <= 3000))
		{
			printf("DIETA DE 3000 CALORIAS\n");
            printf("\nCafe da manha (07:00) - 480 kcal\n");
            printf("1 Xícara de café com leite e açúcar;\n4 Fatias de pão de forma com 2 colheres de sopa de margarina;\n4 Fatias de peito de peru light e 1 kiwi;\n");
            printf("Lanche (09:00) - 189 kcal\n");
            printf("200 ml de água de coco;\n1 Torrada integral;\n1 Xícara de uva itália;\n");
            printf("\nAlmoço (12:00) - 1149 kcal\n");
            printf("1 Xícara de couve refogada;\n5Colheres de sopa de arroz branco cozido;\n2 Conchas de feijão preto cozido;\n1 Filé médio de salmão grelhado;\n1 Xícara de melão\n1 Pêssego grande para a sobremesa.\n");
            printf("\nLanche da tarde (18:00) - 316 kcal\n");
            printf("1 fatia de bolo de fubá;\n1 potinho de 170 gramas de iogurte natural.\n");
            printf("\nJantar (21:00) - 820 kcal\n");
            printf("1 xícara de repolho refogado;\n1 xícara de couve-flor em pedaços cozida1 xícara de beterraba cozida em fatias;\n4 colheres de sopa de arroz integral cozido1 concha de feijão carioca cozido;\n1 sobrecoxa grande assada de frango;\n½ mamão papaia médio e 1 pera grande como sobremesa.\n");
            printf("Total: 2954 kcal\n");
		}
		else if(mediacalorica > 3000)
		{
			printf("DIETA DE 4000 CALORIAS\n");
			printf("\nCafe da manha (07:00) - 725 kcal\n");
        	printf("1 Xícara de granola integral;\n150 g de queijo cottage;\n1 Xícara de morangos;\n1 Xícara de framboesas;\n200 ml de suco de laranja.\n");
	        printf("\nLanche (09:00) - 880 kcal\n");
	        printf("100 g de aveia em flocos;\n4 Colheres (sopa) de pasta de amendoim integral;\n30 g de amêndoas naturais.\n");
	        printf("\nAlmoço (12:00) - 907 kcal\n");
	        printf("3 Colheres (sopa) de arroz integral;\n120 g de peito de frango assado;\n100 g de couve manteiga refogada;\n200 ml de suco de melancia;\n1 Abacate e 25 g (¼ de tablete) de chocolate amargo 70%.\n");
	        printf("\nLache da tarde (18:00) - 508 kcal\n");
	        printf("1 Pão francês integral com 2 colheres (sopa) de requeijão cremoso;\n1 Maçã grande;200 ml de leite integral.\n");
	        printf("\nJantar (21:00) - 962 kcal\n");
	        printf("100 g de costela bovina assada;\n1 Batata doce grande cozida (com casca);\n1 Concha de feijão carioca cozido;\n2 Tomates grandes fatiados;\n1 Xícara de couve-flor cozida;\n1 Colher (sopa) de azeite de oliva;\n200 ml de suco integral de uva.");
	        printf("Total: 3982 kcal\n");
		}
		printf("\nSimulador de dieta\n[1]Cadastrar uma nova dieta\n[2]Sair\n");
		scanf("%i", &op);
		
	}
}
