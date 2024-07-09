package models;

public class Reconhecimento {
    private Integer codReconhecimento;
    private Integer quantidade;
    private Produto produto;
    private Encomenda encomenda;
    
    public Reconhecimento(Integer codReconhecimento, Integer quantidade, Produto produto, Encomenda encomenda) {
        this.codReconhecimento = codReconhecimento;
        this.quantidade = quantidade;
        this.produto = produto;
        this.encomenda = encomenda;
    }

    public Integer getCodReconhecimento() {
        return codReconhecimento;
    }

    public void setCodReconhecimento(Integer codReconhecimento) {
        this.codReconhecimento = codReconhecimento;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    
}
