public class PessoaFisica extends Cliente {
    private String cpf;
    private int quantidadeParcelas;

    public PessoaFisica(String nome, String endereco, String dataCadastro, String cpf, int quantidadeParcelas) {
        super(nome, endereco, dataCadastro);
        setCpf(cpf);
        setQuantidadeParcelas(quantidadeParcelas);
    }

    public String getCpf() {
        return cpf;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
}