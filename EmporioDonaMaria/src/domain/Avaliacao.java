package domain;

public class Avaliacao {
    private Integer id;
    private Float numero;
    private String idProduto;
    
    public Avaliacao(Integer id, Float numero, String idProduto) {
        this.id = id;
        this.numero = numero;
        this.idProduto = idProduto;
    }

    public Integer getid() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getnumero() {
        return numero;
    }

    public void setnumero(Float numero) {
        this.numero = numero;
    }

    public String getidProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }
    
}
