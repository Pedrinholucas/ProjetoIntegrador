package models;

public class Produto{
    Integer id;
    String nome;
    Float valor;
    String descricao;
    Integer quantidadeEstoque;
    String img;
    String detalhesGarantia;
    Integer idFornecedor;
    Integer idCategoria;
    
    public Produto(){
        
    }
    
    public Produto(String nome, Float valor, String descricao, Integer quantidadeEstoque,
            String img, String detalhesGarantia, Integer idFornecedor, Integer idCategoria) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.img = img;
        this.detalhesGarantia = detalhesGarantia;
        this.idFornecedor = idFornecedor;
        this.idCategoria = idCategoria;
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetalhesGarantia() {
        return detalhesGarantia;
    }

    public void setDetalhesGarantia(String detalhesGarantia) {
        this.detalhesGarantia = detalhesGarantia;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    
}
