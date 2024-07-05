package models;

public class Categoria{
    Integer codCategoria;
    String nome; 
    String descricao;
    
    public Categoria( String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public Integer getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
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