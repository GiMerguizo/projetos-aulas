import java.util.*;

public class Main {
    public static void main(String[] args) {
        int peso;
        Scanner input = new Scanner(System.in);

        System.out.println("Peso (kg): ");
        peso = input.nextInt();

        System.out.println("Peso inicial: " + peso + "kg");
        System.out.println("Peso em gramas: " + (peso * 1000) + "g");
        System.out.println("Novo peso: " + (peso * 1.12 * 1000) + "g");
    }
}