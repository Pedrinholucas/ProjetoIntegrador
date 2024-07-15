package models;

public class FornecedorTrans {
    Integer id;
    Integer idFornecedor; 
    Integer idTransportadora;
    
    public FornecedorTrans(Integer id, Integer idFornecedor, Integer idTransportadora) {
        this.id = id;
        this.idFornecedor = idFornecedor;
        this.idTransportadora = idTransportadora;
    }
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public Integer getCliente() {
        return idFornecedor;
    }
    public void setCliente(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    public Integer getidTransportadora() {
        return idTransportadora;
    }
    public void setidTransportadora(Integer idTransportadora) {
        this.idTransportadora = idTransportadora;
    }
}
