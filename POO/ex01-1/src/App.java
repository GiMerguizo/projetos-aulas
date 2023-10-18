import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, tipo, branco;
        int anoFabricacao;
        double preco;

        Vinho vetVinho[] = new Vinho[3];

        for(int i = 0; i < vetVinho.length; i++)
        {
            System.out.println("-- Vinho [" + (i + 1) + "] --");
            System.out.println("Nome: ");
            nome = input.nextLine();
            System.out.println("Tipo: ");
            tipo = input.nextLine();
            System.out.println("Ano de Fabricação: ");
            anoFabricacao = input.nextInt();
            System.out.println("Preço: ");
            preco = input.nextDouble();

            branco = input.nextLine();  //para arrumar o buffer

            vetVinho[i] = new Vinho(nome, tipo, anoFabricacao, preco);
        }

        System.out.println("--- Vinhos ---");
        for(int i = 0; i < vetVinho.length; i++) {
            System.out.println("\nVinho " + (i + 1));
            System.out.println("Nome: " + vetVinho[i].getNome());
            System.out.println("Tipo: " + vetVinho[i].getTipo());
            System.out.println("Ano de Fabricação: " + vetVinho[i].getAnoFabricacao());
            System.out.println("Preço: " + vetVinho[i].getPreco());
        }

        double precoMaisAlto = vetVinho[0].getPreco();
        int posicao = 0;
        int ano = vetVinho[0].getAnoFabricacao();
        int posicaoMaisVelho = 0;

        for(int i = 1; i < vetVinho.length; i++) {
            if(precoMaisAlto < vetVinho[i].getPreco()) {
                precoMaisAlto = vetVinho[i].getPreco();
                posicao = i;
            }

            if(ano > vetVinho[i].getAnoFabricacao()) {
                ano = vetVinho[i].getAnoFabricacao();
                posicaoMaisVelho = i;
            }
        }

        System.out.println("\nVinho mais caro: ");
        System.out.println(vetVinho[posicao].paraString());
        System.out.println("Vinho mais velho: ");
        System.out.println(vetVinho[posicaoMaisVelho].paraString());
    }
}
