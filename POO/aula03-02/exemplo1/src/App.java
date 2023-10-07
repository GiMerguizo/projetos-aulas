import java.util.*;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Scanner input = new Scanner(System.in);

        /* a1.nome = "Luciano";
        System.out.println("Nome: " + a1.nome); */

        a1.setNome("Luciano");
        System.out.println("Nome: " + a1.getNome());

        System.out.println("Digite o nome da pessoa: ");
        a1.setNome(input.nextLine());
        System.out.println("Nome: " + a1.getNome());
    }
}
