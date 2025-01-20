package br.com.aplicacao;

import java.util.Date;

public class Encomenda {
    private Integer id;
    private String enderecoEntrega;
    private Float frete;
    private Float valorTotal;
    private Date dataAquisicao;
    private Date dataEntrega;
    private Cliente cliente;
    private Transportadora transportadora;

    public Encomenda(){}
    
    public Encomenda(Integer id, String enderecoEntrega, Float frete,
            Float valorTotal, Date dataAquisicao, Date dataEntrega, Cliente cliente,
            Transportadora transportadora) {
        this.id = id;
        this.enderecoEntrega = enderecoEntrega;
        this.frete = frete;
        this.valorTotal = valorTotal;
        this.dataAquisicao = dataAquisicao;
        this.dataEntrega = dataEntrega;
        this.cliente = cliente;
        this.transportadora = transportadora;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }
    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
    public Float getFrete() {
        return frete;
    }
    public void setFrete(Float frete) {
        this.frete = frete;
    }
    public Float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getDataAquisicao() {
        return dataAquisicao;
    }
    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    public Date getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(Date dataEntrega) {
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
