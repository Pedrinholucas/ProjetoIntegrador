package models;

public class Produto{
    Integer codProduto;
    String nome;
    Double valor;
    String descricao;
    Integer quantidadeEstoque;
    String img;
    String detalhesGarantia;
    Integer codFornecedor;
    Integer codCategoria;
    
    public Produto(String nome, Double valor, String descricao, Integer quantidadeEstoque,
            String img, String detalhesGarantia, Integer codFornecedor, Integer codCategoria) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.img = img;
        this.detalhesGarantia = detalhesGarantia;
        this.codFornecedor = codFornecedor;
        this.codCategoria = codCategoria;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
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

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    
}
