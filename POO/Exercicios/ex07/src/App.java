import java.util.*;

public class App {
    public static void main(String[] args) {
        double raio;
        double altura;
        double volume;
        Scanner input = new Scanner(System.in);

        System.out.println("----- Calcular o Volume de uma lata de óleo -----");
        System.out.println("Raio (m): ");
        raio = input.nextDouble();
        System.out.println("Altura (m): ");
        altura = input.nextDouble();
        volume = 3.14159 * raio * altura;

        System.out.println("Volume da lata de óleo: " + volume);
    }
}
