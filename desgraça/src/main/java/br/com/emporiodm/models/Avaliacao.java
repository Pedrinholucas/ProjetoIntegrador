package br.com.emporiodm.models;

public class Avaliacao {
    private Integer id;
    private Float numero;
    private Integer idProduto;
    
    public Avaliacao(){}
    
    public Avaliacao( Float numero, Integer idProduto) {
        this.numero = numero;
        this.idProduto = idProduto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getNumero() {
        return numero;
    }

    public void setNumero(Float numero) {
        this.numero = numero;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    
}
