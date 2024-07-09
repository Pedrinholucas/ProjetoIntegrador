package domain;

public class FuncionarioTrans {
    Integer id;
    Integer idFuncionario; 
    Integer idTransportadora;
    
    public FuncionarioTrans(Integer id, Integer idFuncionario, Integer idTransportadora) {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.idTransportadora = idTransportadora;
    }
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public Integer getCliente() {
        return idFuncionario;
    }
    public void setCliente(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public Integer getidTransportadora() {
        return idTransportadora;
    }
    public void setidTransportadora(Integer idTransportadora) {
        this.idTransportadora = idTransportadora;
    }
}
