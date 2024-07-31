package controller;

import models.Avaliacao;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoController {
    private Connection con;

    public AvaliacaoController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirAvaliacao(Avaliacao avaliacao) {
        String sql = "INSERT INTO avaliacao (nota, idProduto) VALUES (?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, avaliacao.getIdProduto());
            stmt.setFloat(2, avaliacao.getNumero());
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

    public boolean atualizarAvaliacao(Avaliacao avaliacao) {
        String sql = "UPDATE avaliacao SET nota = ?, idProduto = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setFloat(1, avaliacao.getNumero());
            stmt.setInt(2, avaliacao.getIdProduto());
            stmt.setInt(5, avaliacao.getId());
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

    public boolean deletarAvaliacao(int id) {
        String sql = "DELETE FROM avaliacao WHERE id = ?";
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

    public Avaliacao buscarAvaliacaoPorId(int id) {
        String sql = "SELECT * FROM avaliacao WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setNumero(rs.getFloat("nota"));
                avaliacao.setIdProduto(rs.getInt("idProduto"));
                return avaliacao;
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

    public List<Avaliacao> listarTodasAvaliacoes() {
        String sql = "SELECT * FROM avaliacao";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Avaliacao> avaliacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setNumero(rs.getFloat("nota"));
                avaliacao.setIdProduto(rs.getInt("idProduto"));
                avaliacoes.add(avaliacao);
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
        return avaliacoes;
    }
    
        public List<Avaliacao> listarTodasAvaliacoesPorProduto(int idProduto) {
        String sql = "SELECT * FROM avaliacao where id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Avaliacao> avaliacoes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idProduto);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setNumero(rs.getFloat("nota"));
                avaliacao.setIdProduto(rs.getInt("idProduto"));
                avaliacoes.add(avaliacao);
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
        return avaliacoes;
    }
}

