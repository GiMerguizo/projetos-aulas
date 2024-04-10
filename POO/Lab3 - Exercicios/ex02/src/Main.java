import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        String op;
        Calculadora c = new Calculadora();
        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Segundo número: ");
        n2 = input.nextInt();
        System.out.println("Operador: ");
        op = input.next();

        c.setNum1(n1);
        c.setNum2(n2);
        c.setOperador(op);

        c.Calcular();
    }
}