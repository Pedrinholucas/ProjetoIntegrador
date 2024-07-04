package db;
import java.sql.*;

import models.Cliente;
public class DbHandler {
	public DbHandler () { } // construtor de classe
	public Connection conectar() {
		Connection con = null;
		try {
			System.out.println("Conectando ao banco...");
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver
			String ip = "127.0.0.1"; // IP do servidor de banco
			String us = "root"; // usu�rio do banco
			String bd = "EmporioDonaMaria"; // nome do banco de dados
			String pw = ""; // senha do usu�rio
			con = DriverManager.getConnection("jdbc:mysql://" + ip +"/" + bd,us,pw); // instru��o para conectar com o BD
			//passamos o IP do servidor de Banco
			//nome do banco, usu�rio e senha
			con.createStatement();
			System.out.println("Conectado.");
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex);
		}
		return con;
	}
	public static void main(String[] args) {
		DbHandler teste = new DbHandler();
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
	        	int id = resultSet.getInt("id");
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
		
	}
}