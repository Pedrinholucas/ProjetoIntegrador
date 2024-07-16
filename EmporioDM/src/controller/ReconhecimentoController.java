package controller;

import models.Reconhecimento;
import models.Produto;
import models.Encomenda;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReconhecimentoController {
    private Connection con;

    public ReconhecimentoController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirReconhecimento(Reconhecimento reconhecimento) {
        String sql = "INSERT INTO reconhecimento (quantidade, idProduto, idEncomenda) VALUES (?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reconhecimento.getQuantidade());
            stmt.setInt(2, reconhecimento.getProduto().getId());
            stmt.setInt(3, reconhecimento.getEncomenda().getId());
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

    public boolean atualizarReconhecimento(Reconhecimento reconhecimento) {
        String sql = "UPDATE reconhecimento SET quantidade = ?, idProduto = ?, idEncomenda = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reconhecimento.getQuantidade());
            stmt.setInt(2, reconhecimento.getProduto().getId());
            stmt.setInt(3, reconhecimento.getEncomenda().getId());
            stmt.setInt(4, reconhecimento.getId());
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

    public boolean deletarReconhecimento(int id) {
        String sql = "DELETE FROM reconhecimento WHERE id = ?";
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

    public Reconhecimento buscarReconhecimentoPorId(int id) {
        String sql = "SELECT * FROM reconhecimento WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Reconhecimento reconhecimento = new Reconhecimento();
                reconhecimento.setId(rs.getInt("id"));
                reconhecimento.setQuantidade(rs.getInt("quantidade"));
                Produto produto = new Produto();
                produto.setId(rs.getInt("idProduto"));
                reconhecimento.setProduto(produto);
                Encomenda encomenda = new Encomenda();
                encomenda.setId(rs.getInt("idEncomenda"));
                reconhecimento.setEncomenda(encomenda);

                return reconhecimento;
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

    public List<Reconhecimento> listarTodosReconhecimentos() {
        String sql = "SELECT * FROM reconhecimento";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Reconhecimento> reconhecimentoList = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Reconhecimento reconhecimento = new Reconhecimento();
                reconhecimento.setId(rs.getInt("id"));
                reconhecimento.setQuantidade(rs.getInt("quantidade"));
                Produto produto = new Produto();
                produto.setId(rs.getInt("idProduto"));
                reconhecimento.setProduto(produto);
                Encomenda encomenda = new Encomenda();
                encomenda.setId(rs.getInt("idEncomenda"));
                reconhecimento.setEncomenda(encomenda);

                reconhecimentoList.add(reconhecimento);
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
        return reconhecimentoList;
    }
}
