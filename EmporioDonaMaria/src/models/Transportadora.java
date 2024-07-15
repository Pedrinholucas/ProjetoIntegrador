package models;

public class Transportadora {
    private Integer codTransportadora;
    private String cnpj;
    private String nome;
    
    public Transportadora( String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public Integer getCodTransportadora() {
        return codTransportadora;
    }

    public void setCodTransportadora(Integer codTransportadora) {
        this.codTransportadora = codTransportadora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
