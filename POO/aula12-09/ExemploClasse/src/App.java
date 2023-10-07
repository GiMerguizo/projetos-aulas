import java.util.*;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner input = new Scanner(System.in);

        // Alterando valor dos atributos
        p1.nome = "Luciano";
        System.out.println(p1.nome);
        System.out.println("O nome de p1 é " + p1.nome);

        System.out.println("Digite o nome da pessoa: ");
        p1.nome = input.nextLine();

        System.out.println("Nome lido: " + p1.nome);

        System.out.println("Digite a idade: ");
        p1.idade = input.nextInt();

        System.out.println("Idade: " + p1.idade);

        p1.verificarIdade();
        p1.imprimir();

        int novoValorIdade;
        novoValorIdade = p1.fazerAniversario(1);
        System.out.println("Nova Idade: " + novoValorIdade);

        input.close();
    }
}

