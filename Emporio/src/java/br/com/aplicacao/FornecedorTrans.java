package br.com.aplicacao;

public class FornecedorTrans {
    Integer id;
    Fornecedor fornecedor; 
    Transportadora transportadora;
    
    public FornecedorTrans(){}
    
    public FornecedorTrans( Fornecedor fornecedor, Transportadora transportadora) {
        this.fornecedor = fornecedor;
        this.transportadora = transportadora;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Transportadora getTransportadora() {
        return transportadora;
    }
    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }
}
