package models;

public class Transportadora {
    private Integer codTransportadora;
    private Integer cnpj;
    private String nome;
    
    public Transportadora(Integer codTransportadora, Integer cnpj, String nome) {
        this.codTransportadora = codTransportadora;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public Integer getCodTransportadora() {
        return codTransportadora;
    }

    public void setCodTransportadora(Integer codTransportadora) {
        this.codTransportadora = codTransportadora;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
