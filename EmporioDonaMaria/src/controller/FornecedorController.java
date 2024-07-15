/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import models.Fornecedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connection.ConnectionMySQL;

/**
 *
 * @author pedro
 */
public class FornecedorController {
    private Connection con;

    public void FornecedorController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirFornecedor(Fornecedor fornecedor) {
        String sql = "INSERT INTO Fornecedor (cnpj, nome, email, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getCnpj());
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
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Fornecedor fornecedor = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                fornecedor = new Fornecedor(rs.getInt("cnpj"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
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

    public List<Fornecedor> listarTodosFornecedores() {
        String sql = "SELECT * FROM Fornecedor";
        Statement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor(rs.getInt("cnpj"), rs.getString("nome"), rs.getString("email"), rs.getString("senha"));
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
            stmt.setInt(1, fornecedor.getCnpj());
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

    public boolean deletarFornecedor(Integer id) {
        String sql = "DELETE FROM Fornecedor WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
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
}
