package connection;

import java.sql.*;
//import models.Cliente;

public class ConnectionMySQL {
    public ConnectionMySQL () { } // construtor de classe
    public Connection conectar() {
	Connection con = null;
	try {
            System.out.println("Conectando ao banco...");
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver
            String ip = "127.0.0.1"; // IP do servidor de banco
            String us = "root"; // usuário do banco
            String bd = "EmporioDonaMaria"; // nome do banco de dados
            String pw = "12345678"; // senha do usuário
            con = DriverManager.getConnection("jdbc:mysql://" + ip +"/" + bd,us,pw); // instrução para conectar com o BD
            //passamos o IP do servidor de Banco
            //nome do banco, usuário e senha
            con.createStatement();
            System.out.println("Conectado.");	
	} catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
	}
	return con;
    }
    public static void main(String[] args) {
        ConnectionMySQL teste = new ConnectionMySQL();
        teste.conectar();
        
	/**
        ConnectionMySQL teste = new ConnectionMySQL();
	Connection db = null;
	Statement statement = null;
	ResultSet resultSet = null;
	try {
            db = teste.conectar();
            statement = db.createStatement();
            String query = "SELECT * FROM Cliente";
            resultSet = statement.executeQuery(query);
	    // Processando os resultados
	    while (resultSet.next()) {
	    // Supondo que a tabela Cliente tem colunas id, nome e email
                //int id = resultSet.getInt("id");
	        int cpf = resultSet.getInt("cpf");
	        String nome = resultSet.getString("nome");
	        String email = resultSet.getString("email");
	        String senha= resultSet.getString("senha");
	        int telefone = resultSet.getInt("telefone");
	            
	        Cliente cliente = new Cliente(id, cpf, nome, senha, email, telefone);

	        System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);
	    }
        } catch(SQLException ex) {
            System.out.println(ex);
	}
        **/
    }
}
