public class Compra {
    private int quantidade;
    private String nomeProduto;
    private double precoUnitario;
    private  double valorTotal;
    private String identificador;
    private String dataCompra;
    private String documentoComprador;
    private double totalPagoMomento;

    public Compra(int quantidade, String nomeProduto, double precoUnitario, double valorTotal, String identificador,
                  String dataCompra, String documentoComprador, double totalPagoMomento) {
        setQuantidade(quantidade);
        setNomeProduto(nomeProduto);
        setPrecoUnitario(precoUnitario);
        setValorTotal(valorTotal);
        setIdentificador(identificador);
        setDataCompra(dataCompra);
        setDocumentoComprador(documentoComprador);
        setTotalPagoMomento(totalPagoMomento);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDocumentoComprador() {
        return documentoComprador;
    }

    public void setDocumentoComprador(String documentoComprador) {
        this.documentoComprador = documentoComprador;
    }

    public double getTotalPagoMomento() {
        return totalPagoMomento;
    }

    public void setTotalPagoMomento(double totalPagoMomento) {
        this.totalPagoMomento = totalPagoMomento;
    }
}
