package controller;

import models.Fornecedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connection.ConnectionMySQL;

public class FornecedorController {
    private Connection con;

    public void FornecedorController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirFornecedor(Fornecedor fornecedor) {
        String sql = "INSERT INTO Fornecedor (cnpj, nome, email, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        con = new ConnectionMySQL().conectar();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getNome());
            stmt.setString(3, fornecedor.getEmail());
            stmt.setString(4, fornecedor.getSenha());
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

    public Fornecedor buscarFornecedorPorId(int id) {
        String sql = "SELECT * FROM Fornecedor WHERE id = ?";
        System.out.println("amo penis");
                
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Fornecedor fornecedor = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                fornecedor = new Fornecedor(rs.getString("cnpj"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
                fornecedor.setId(rs.getInt("id"));
            }
            return fornecedor;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
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
    }
    
    public Fornecedor buscarFornecedorPorCnpj(String cnpj) {
        String sql = "SELECT * FROM fornecedor WHERE cnpj = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        System.out.println("amo cenis");

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cnpj);
            rs = stmt.executeQuery();
            System.out.println("amo penis");
            if (rs.next()) {
                System.out.println("amo denis");
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                return fornecedor;
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

    public List<Fornecedor> listarTodosFornecedores() {
        String sql = "SELECT * FROM Fornecedor";
        Statement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor(rs.getString("cnpj"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
                fornecedor.setId(rs.getInt("id"));
                fornecedores.add(fornecedor);
            }
            return fornecedores;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
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
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        String sql = "UPDATE Fornecedor SET cnpj = ?, nome = ?, email = ?, senha = ?, WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fornecedor.getCnpj());
            stmt.setString(2, fornecedor.getNome());
            stmt.setString(3, fornecedor.getEmail());
            stmt.setString(4, fornecedor.getSenha());
            stmt.setInt(5, fornecedor.getId());
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

    public boolean deletarFornecedor(String id) {
        String sql = "DELETE FROM Fornecedor WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1,id);
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
    public void main(String args[]) {
        buscarFornecedorPorCnpj("1");
    }
}
