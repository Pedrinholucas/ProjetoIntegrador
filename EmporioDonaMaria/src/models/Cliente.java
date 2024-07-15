package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer codCliente;
    private String cpf;
    private String nome;
    private String senha;
    private String email;
    private Integer telefone;
    private String interesses;
    
    public Cliente() {}

    public Cliente( String cpf, String nome, String senha, String email, Integer telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getCod_cliente() {
        return codCliente;
    }

    public void setCod_cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    
}
