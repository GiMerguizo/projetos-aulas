import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declarações
        Aluno a = new Aluno();
        Scanner input = new Scanner(System.in);
        
        // Leitura
        System.out.println("Digite o nome do aluno: ");
        a.nome = input.nextLine();
        System.out.println("Digite a altura: ");
        a.altura = input.nextDouble();
        System.out.println("Digite o peso: ");
        a.peso = input.nextDouble();

        // Saída
        System.out.println("Dados dos Alunos: ");
        a.imprimir();
        System.out.println("IMC: " + a.calcularIMC());
        System.out.println("Situação do Aluno: ");
        a.mostrarIMC();
    }
}
