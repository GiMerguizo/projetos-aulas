import java.util.*;

public class Main {
    public static void main(String[] args) {
        double quilowatts;
        double salarioMinimo;
        double valorUn;
        Scanner input = new Scanner(System.in);

        // System.out.println("Valor de cada quilowatt (reais): R$" + ((1 / 500) * 1320.00));
        System.out.println("Salário Mínimo: R$ ");
        salarioMinimo = input.nextDouble();
        System.out.println("Consumo (kW): ");
        quilowatts = input.nextDouble();

        valorUn = salarioMinimo / 500;

        //System.out.println(salarioMinimo);
        //System.out.println(quilowatts);
        System.out.println("Valor de cada kW: R$ " + (valorUn));
        System.out.println("Conta da residência: R$ " + (valorUn * quilowatts));
        System.out.println("Com desconto de 15%: R$ " + ((valorUn * quilowatts)*0.85));
    }
}