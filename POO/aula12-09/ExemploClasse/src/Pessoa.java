public class Pessoa {
    // public tipo <nomeAtributo>;
    public String nome;
    public int idade;
    public String cpf;
    public String endereco;

    public void verificarIdade() {
        if(idade >= 18) {
            System.out.println("Maior de Idade!!");
        }
        else {
            System.out.println("Menor de Idade!!");
        }
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }

    public int fazerAniversario(int qtdAniversario) {
        idade = idade + qtdAniversario;
        return idade; 
    }
}
