package br.com.aplicacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteModel {
    
    
    public static void main(String[] args) {
        ClienteModel teste = new ClienteModel();
        Cliente ins = new Cliente();
        ins.setNome("Victor Hugo");
        ins.setCpf("12345678901");
        ins.setSenha("12345");
        ins.setEmail("VH@gmail");
        ins.setTelefone(12345);
        String res = teste.inserirCliente(ins);
        System.out.println("Retorno: " + res);
        
        ArrayList<Cliente> cli = teste.consultarCliente();
        teste.imprimirCliente(cli);
    }
    
    public Cliente consultarClienteId(int Id) {
        ConexaoMySQL conexao = new ConexaoMySQL();
        Connection conn = conexao.conectar();
        Cliente cli = new Cliente();
        try {
          String consulta = "select * from cliente where Id = " + Id;

          Statement stm = conn.createStatement();
          ResultSet resultado = stm.executeQuery(consulta);

          while(resultado.next()) {
            cli.setId(resultado.getInt("Id"));
            cli.setNome(resultado.getString("Nome"));
            cli.setCpf(resultado.getString("CPF"));
            cli.setSenha(resultado.getString("Senha"));
            cli.setEmail(resultado.getString("Email"));
            cli.setTelefone(resultado.getInt("Telefone"));
          }
        } catch (SQLException ex) {
          System.out.println("Não conseguiu consultar os dados dos cliente.");
        } 
        return cli;
    }
    
    public  ArrayList<Cliente> consultarCliente() {
        ConexaoMySQL conexao = new ConexaoMySQL();
        Connection conn = conexao.conectar();
        ArrayList<Cliente> geral = new ArrayList<>();
        try {
            String consulta = "select * from cliente order by Nome";
            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            
            while(resultado.next()) {
                Cliente cli = new Cliente();
                cli.setId(resultado.getInt("Id"));
                cli.setNome(resultado.getString("Nome"));
                cli.setCpf(resultado.getString("CPF"));
                cli.setSenha(resultado.getString("Senha"));
                cli.setEmail(resultado.getString("Email"));
                cli.setTelefone(resultado.getInt("Telefone"));
                geral.add(cli);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return geral;
    }
    
    public String inserirCliente(Cliente cliente) {
        ConexaoMySQL conexao = new ConexaoMySQL();
        Connection conn = conexao.conectar();
        String resultado = "";
        try {
            String consulta = "INSERT INTO cliente (nome, cpf, senha, email, telefone) VALUES (?,?,?,?,?)";

            PreparedStatement stm = conn.prepareStatement(consulta);
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getCpf());
            stm.setString(3, cliente.getSenha()+"");
            stm.setString(4, cliente.getEmail());
            stm.setInt(5, cliente.getTelefone());
            
            stm.executeUpdate();
            resultado = "inserido";
        } catch (SQLException ex) {
          System.out.println(ex.getSQLState());
          resultado = "erro";
        } 
        return resultado;
    }
  
    public void imprimirCliente(Cliente cliente){
        System.out.println("Id: " + cliente.getId() + "\n" + 
               "nome: " +  cliente.getNome() + "\n" +  
               "cpf: " +  cliente.getCpf() + "\n" +  
               "senha: " +  cliente.getSenha() + "\n" +  
               "email: " +  cliente.getEmail()+ "\n" +  
               "telefone: " +  cliente.getTelefone());
    }
    
    public void imprimirCliente(ArrayList<Cliente> cliente){
        for (Cliente cli : cliente) { 
            System.out.println(
                "Id: " + cli.getId() + "\n" + 
                "nome: " +  cli.getNome() + "\n" +  
                "cpf: " +  cli.getCpf() + "\n" +  
                "senha: " +  cli.getSenha() + "\n" +  
                "email: " +  cli.getEmail()+ "\n" + 
                "telefone: " +  cli.getTelefone()
            );
        }
    }
    
    public String alterarCliente(Cliente cliente){
        ConexaoMySQL conexao = new ConexaoMySQL();
        Connection conn = conexao.conectar();
        String resultado = "";
        try {
            String consulta = "UPDATE cliente SET nome = ?, cpf = ?, senha = ?, email = ?, telefone = ? WHERE id = ?";
            PreparedStatement stm = conn.prepareStatement(consulta);
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getCpf());
            stm.setString(3, cliente.getSenha()+"");
            stm.setString(4, cliente.getEmail());
            stm.setInt(5, cliente.getTelefone());
            stm.setInt(6, cliente.getId());
            stm.executeUpdate();
            resultado = "alterado";
        } catch (SQLException ex) {
          System.out.println(ex.getSQLState());
          resultado = "erro";
        } 
        return resultado;
    }
    
    public String removerCliente(int cliente){
        ConexaoMySQL conexao = new ConexaoMySQL();
        Connection conn = conexao.conectar();
        String resultado = "";
        try {
            String consulta = "DELETE FROM cliente WHERE id = ?";

            PreparedStatement stm = conn.prepareStatement(consulta);
            stm.setInt(1, cliente);
            
            stm.executeUpdate();
            resultado = "removido";
        } catch (SQLException ex) {
          System.out.println(ex.getSQLState());
          resultado = "erro";
        } 
        return resultado;
    }
    
    
    public ClienteModel(){}
    
    
}
