public class App {
    public static void main(String[] args) {
        double raio = 5;
        // double pi = 3.14159;
        double ac;

        //ac = pi * (raio * raio);
        ac = Math.PI * Math.pow(raio, 2);

        // System.out.println("Área da circunferência: " + ac + " cm²");
        System.out.printf("Área: %.2f", ac);
    }
}
