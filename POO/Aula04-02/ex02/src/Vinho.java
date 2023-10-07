public class Vinho {
    private String nome;
    private String tipo;
    private int anoFabricacao;
    private double preco;
    
    public Vinho(String nome, String tipo, int anoFabricacao, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }
}
