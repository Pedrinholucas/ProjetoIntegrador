package controller;

import models.Interesse;
import models.Cliente;
import models.Categoria;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InteresseController {
    private Connection con;

    public InteresseController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirInteresse(Interesse interesse) {
        String sql = "INSERT INTO interesse (idCliente, idCategoria) VALUES (?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, interesse.getCliente().getId());
            stmt.setInt(2, interesse.getidCategoria().getId());
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

    public boolean atualizarInteresse(Interesse interesse) {
        String sql = "UPDATE interesse SET idCliente = ?, idCategoria = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, interesse.getCliente().getId());
            stmt.setInt(2, interesse.getidCategoria().getId());
            stmt.setInt(3, interesse.getid());
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

    public boolean deletarInteresse(int id) {
        String sql = "DELETE FROM interesse WHERE id = ?";
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

    public Interesse buscarInteressePorId(int id) {
        String sql = "SELECT * FROM interesse WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Interesse interesse = new Interesse();
                interesse.setid(rs.getInt("id"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                interesse.setCliente(cliente);
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idCategoria"));
                interesse.setidCategoria(categoria);
                return interesse;
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

    public List<Interesse> listarTodosInteresses() {
        String sql = "SELECT * FROM interesse";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Interesse> interesseList = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Interesse interesse = new Interesse();
                interesse.setid(rs.getInt("id"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                interesse.setCliente(cliente);
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idCategoria"));
                interesse.setidCategoria(categoria);
                interesseList.add(interesse);
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
        return interesseList;
    }
}
