package controller;

import models.Cliente;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteControle {
    private Connection con;

    public ClienteControle() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, senha, email, telefone) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf().toString());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSenha());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone().toString());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean atualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET cpf = ?, nome = ?, senha = ?, email = ?, telefone = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf().toString());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getSenha());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefone().toString());
            stmt.setInt(6, cliente.getCod_cliente());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public boolean deletarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public Cliente buscarClientePorId(int id) {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCod_cliente(rs.getInt("id"));
                cliente.setCpf( Integer. valueOf(rs.getString("cpf")));
                cliente.setNome(rs.getString("nome"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone( Integer. valueOf(rs.getString("telefone")));
                return cliente;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public List<Cliente> listarTodosClientes() {
        String sql = "SELECT * FROM cliente";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCod_cliente(rs.getInt("id"));
                cliente.setCpf( Integer. valueOf(rs.getString("cpf")));
                cliente.setNome(rs.getString("nome"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone( Integer. valueOf(rs.getString("telefone")));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return clientes;
    }
}
