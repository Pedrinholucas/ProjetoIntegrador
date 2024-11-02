package br.com.emporiodm.models;

public class Reconhecimento {
    private Integer id;
    private Integer quantidade;
    private Produto produto;
    private Encomenda encomenda;
    
    public Reconhecimento(){}
    
    public Reconhecimento(Integer quantidade, Produto produto, Encomenda encomenda) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.encomenda = encomenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
