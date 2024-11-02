package br.com.emporiodm.models;

public class Interesse{
    Integer id;
    Cliente cliente; 
    Categoria categoria;
    
    public Interesse(){}
    
    public Interesse(Cliente cliente, Categoria categoria) {
        this.cliente = cliente;
        this.categoria = categoria;
    }
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Categoria getidCategoria() {
        return categoria;
    }
    public void setidCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}