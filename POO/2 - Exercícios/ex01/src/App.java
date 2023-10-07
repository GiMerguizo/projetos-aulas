import java.util.*;

public class App {
    public static void main(String[] args) {
        String sexo;
        double peso;
        double altura;
        int homens = 0;
        int pessoas = 0;
        double somaAlturas = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Insira os dados solicitados");
            System.out.println("Sexo (m ou f): ");
            sexo = input.next();
            System.out.println("Peso: ");
            peso = input.nextDouble();
            System.out.println("Altura: ");
            altura = input.nextDouble();

            if (sexo.equalsIgnoreCase("m")) {
                homens++;
            }
            else {
                somaAlturas = somaAlturas + altura;
            }

            if (peso > 90 && altura < 1.5) {
                pessoas ++;
            }

            sexo = input.nextLine();
        }

        System.out.println("Quantidade de Homens: " + homens);
        System.out.println("Quantidade de pessoas com mais de 90kg e < 1,5: "+ pessoas);
        System.out.println("Média das alturas das mulheres: " + (somaAlturas / (10 - homens)));

    }
}
