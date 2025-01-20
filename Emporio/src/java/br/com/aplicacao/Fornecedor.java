package br.com.aplicacao;

public class Fornecedor {
    private Integer id;
    private String cnpj;
    private String nome;
    private String email;
    private String senha;
    
    public Fornecedor() {}
    
    public Fornecedor(String cnpj, String nome, String email, String senha) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
