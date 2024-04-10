import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int anoAtual;
        int anoNasc;
        int idade;
        int idade2024;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ano atual: ");
        anoAtual = entrada.nextInt();
        System.out.println("Ano de nascimento: ");
        anoNasc = entrada.nextInt();

        idade = anoAtual - anoNasc;
        idade2024 = 2024 - anoNasc;

        System.out.println("Idade: " + idade);
        System.out.println("Idade em 2024: " + idade2024);
    }
}
