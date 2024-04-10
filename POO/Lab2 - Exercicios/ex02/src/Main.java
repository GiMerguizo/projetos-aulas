import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cargo;
        double salAtual;
        double aumento;
        double salNovo;
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione seu cargo: ");
        System.out.println("\n[1] Escrituário \n[2] Secretário \n[3] Caixa \n[4] Gerente \n[5] Diretor \n\n[0] Sair \n");
        System.out.println("Opção: ");
        cargo = input.nextInt();
        System.out.println("Salário atual: R$");
        salAtual = input.nextDouble();

        System.out.println("Funcionário");
        System.out.println("\nCargo: " + cargo + "\nSalário Atual: R$" + salAtual);

    }
}