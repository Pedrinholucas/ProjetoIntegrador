package domain;

import java.time.LocalDate;

public class Encomenda {
    private Integer codEncomenda;
    private String enderecoEntrega;
    private String formaPagamento;
    private Double frete;
    private Double valorTotal;
    private LocalDate dataAquisicao;
    private LocalDate dataEntrega;
    private Cliente cliente;
    private Transportadora transportadora;

    public Encomenda(Integer codEncomenda, String enderecoEntrega, String formaPagamento, Double frete,
            Double valorTotal, LocalDate dataAquisicao, LocalDate dataEntrega, Cliente cliente,
            Transportadora transportadora) {
        this.codEncomenda = codEncomenda;
        this.enderecoEntrega = enderecoEntrega;
        this.formaPagamento = formaPagamento;
        this.frete = frete;
        this.valorTotal = valorTotal;
        this.dataAquisicao = dataAquisicao;
        this.dataEntrega = dataEntrega;
        this.cliente = cliente;
        this.transportadora = transportadora;
    }
    
    public Integer getCodEncomenda() {
        return codEncomenda;
    }
    public void setCodEncomenda(Integer codEncomenda) {
        this.codEncomenda = codEncomenda;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Double getFrete() {
        return frete;
    }
    public void setFrete(Double frete) {
        this.frete = frete;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }
    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Transportadora getTransportadora() {
        return transportadora;
    }
    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    
}
