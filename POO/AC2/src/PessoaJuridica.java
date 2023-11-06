public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private int prazoMax;

    public PessoaJuridica(String nome, String endereco, String dataCadastro, String cnpj, String razaoSocial, int prazoMax) {
        super(nome, endereco, dataCadastro);
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
        setPrazoMax(prazoMax);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public int getPrazoMax() {
        return prazoMax;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setPrazoMax(int prazoMax) {
        this.prazoMax = prazoMax;
    }
}