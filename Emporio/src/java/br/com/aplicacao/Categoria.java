package br.com.aplicacao;

public class Categoria{
    Integer id;
    String nome; 
    String descricao;
    
    public Categoria(){}
    
    public Categoria( String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
};