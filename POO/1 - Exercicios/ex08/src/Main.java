import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Salário Líquido do Profesor -----");
        Scanner input = new Scanner(System.in);

        double valorAula;
        int aulas;
        int inss;
        double salario;
        double salarioComDesconto;

        System.out.println("Valor da hora aula: R$ ");
        valorAula = input.nextDouble();
        System.out.println("Quantidade de aulas no mês: ");
        aulas = input.nextInt();
        System.out.println("Desconto no INSS (%): ");
        inss = input.nextInt();

        salario = valorAula * aulas;
        salarioComDesconto = salario - (salario * ((double) inss /100));

        System.out.println("Valor total: R$ " + salario);
        System.out.println("Valor com desconto do INSS: R$ " + (salarioComDesconto));
    }
}