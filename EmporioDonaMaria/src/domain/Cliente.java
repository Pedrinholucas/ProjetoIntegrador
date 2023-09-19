package domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer codCliente;
    private Integer cpf;
    private String nome;
    private String senha;
    private String email;
    private Integer telefone;
    private List<String> cartoes = new ArrayList<>();
    private String interesses;
    
    public Cliente(Integer codCliente, Integer cpf, String nome, String senha, String email, Integer telefone,
            List<String> cartoes, String interesses) {
        this.codCliente = codCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.cartoes = cartoes;
        this.interesses = interesses;
    }

    public Integer getCod_cliente() {
        return codCliente;
    }

    public void setCod_cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
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

    public List<String> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<String> cartoes) {
        this.cartoes = cartoes;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    
}
