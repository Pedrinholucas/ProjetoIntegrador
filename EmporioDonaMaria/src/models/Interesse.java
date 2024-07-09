package models;

public class Interesse{
    Integer id;
    Integer idCliente; 
    Integer idCategoria;
    
    public Interesse(Integer id, Integer idCliente, Integer idCategoria) {
        this.id = id;
        this.idCliente = idCliente;
        this.idCategoria = idCategoria;
    }
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public Integer getCliente() {
        return idCliente;
    }
    public void setCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getidCategoria() {
        return idCategoria;
    }
    public void setidCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
};