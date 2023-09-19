package domain;

public class Fornecedor {
    private Integer codFornecedor;
    private Integer cnpj;
    private String nome;
    private String email;
    private String senha;
    private Double avaliacao;
    private String[] meiosPagamento;
    
    public Fornecedor(Integer codFornecedor, Integer cnpj, String nome, String email, String senha, Double avaliacao,
            String[] meiosPagamento) {
        this.codFornecedor = codFornecedor;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.avaliacao = avaliacao;
        this.meiosPagamento = meiosPagamento;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
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

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String[] getMeiosPagamento() {
        return meiosPagamento;
    }

    public void setMeiosPagamento(String[] meiosPagamento) {
        this.meiosPagamento = meiosPagamento;
    }

    
}