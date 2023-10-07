public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ricardo", "Av. ABC", 22, "Masculino", "1234", "Eng. Comp.");
       
        System.out.println("Dados do Aluno: ");
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(a1.getEndereco());
       /*  a1.setNome("Ricardo");
        System.out.println("Nome: " + a1.getNome());

        a1.setIdade(22);
        System.out.println("Idade do " + a1.getNome() + ": " + a1.getIdade()); */
    }
}
