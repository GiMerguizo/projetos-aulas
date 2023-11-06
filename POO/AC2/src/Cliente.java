public class Cliente {
    private String nome;
    private String endereco;
    private String dataCadastro;

    public Cliente(String nome, String endereco, String dataCadastro) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String paraString() {
        String dadosCliente = "Nome: " + nome + "\nEndereco: " + endereco + "\nData do Cadastro: " + dataCadastro;
        return dadosCliente;
    }
}
