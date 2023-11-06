import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        String nome, dataCadastro;
        Endereco vEndereco[] = new Endereco[1];
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("[1] Cadastro Cliente");
            System.out.println("[2] Deletar cliente pelo CPF ou CNPJ");
            System.out.println("[3] Deletar cliente pelo nome");
            System.out.println("[4] Cadastro de Produtos");
            System.out.println("[5] Efetuação de uma compra");
            System.out.println("[6] Atualização de pagamento");
            System.out.println("[7] Relatórios");
            System.out.println("[8] Sair");
            System.out.println("-------------");

            System.out.println("Opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o seu endereço");
                for(int i = 0; i < vEndereco.length; i++) {
                    System.out.println("Rua: ");
                    String rua = inputStr.nextLine();
                    System.out.println("Número: ");
                    int numero = input.nextInt();
                    System.out.println("Bairro: ");
                    String bairro = inputStr.nextLine();
                    System.out.println("CEP: ");
                    String cep = inputStr.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = inputStr.nextLine();
                    System.out.println("Estado: ");
                    String estado = inputStr.nextLine();

                    vEndereco[i] = new Endereco(rua, numero, bairro, cep, cidade, estado);
                }
            }
            else
                if (opcao == 8){
                    System.out.println("Encerrando programa...");
                    break;
                } else
                    System.out.println("Algo deu errado! Tente novamente!");

        }
    }
}