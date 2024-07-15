package connection;

import java.sql.*;

public class ConnectionMySQL {
    public ConnectionMySQL() { } // construtor de classe
    
    public Connection conectar() {
        System.out.println("tentando conecntarao banco...");
        Connection con = null;
        Statement stmt = null;

        try {
            System.out.println("Conectando ao banco...");
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver
            String ip = "127.0.0.1"; // IP do servidor de banco
            String us = "root"; // usuário do banco
            String bd = "EmporioDonaMaria"; // nome do banco de dados
            String pw = "1234"; // senha do usuário
            con = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + bd, us, pw); // instrução para conectar com o BD
            stmt = con.createStatement();
            System.out.println("Conectado.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        } 
        return con;
    }
    
    public static void main(String[] args) {
        ConnectionMySQL teste = new ConnectionMySQL();
        teste.conectar();
    }
}
