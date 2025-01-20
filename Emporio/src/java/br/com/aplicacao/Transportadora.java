package br.com.aplicacao;

public class Transportadora {
    private Integer id;
    private String cnpj;
    private String nome;
    
    public Transportadora() {}
    
    public Transportadora( String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
