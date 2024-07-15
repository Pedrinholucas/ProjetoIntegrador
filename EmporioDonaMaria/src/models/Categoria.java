package models;

public class Categoria{
    Integer idCategoria;
    String nome; 
    String descricao;
    
    public Categoria(){};
    
    public Categoria( String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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