package controller;

import connection.ConnectionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Produto;

public class ProdutoController {
    private Connection con;

    public ProdutoController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirProduto(Produto produto) {
        String sql = "INSERT INTO produto (nome, valor, descricao, quantidadeEstoque, detalhesGarantia, idFornecedor, idCategoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setString(5, produto.getDetalhesGarantia());
            stmt.setInt(6, produto.getIdFornecedor());
            stmt.setInt(7, produto.getIdCategoria());
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

    public Produto lerProduto(int id) {
        String sql = "SELECT * FROM produto WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getFloat("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setDetalhesGarantia(rs.getString("detalhesGarantia"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
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

        return produto;
    }
    
    public Produto buscarProdutoPorNome(String nome) {
        String sql = "SELECT * FROM produto WHERE nome like ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome+'%');
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getFloat("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidadeEstoque(rs.getInt("estoque"));
                produto.setDetalhesGarantia(rs.getString("detalhesGarantia"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
                return produto;
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


    public boolean atualizarProduto(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, valor = ?, descricao = ?, quantidadeEstoque = ?, detalhesGarantia = ?, idFornecedor = ?, idCategoria = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setString(5, produto.getDetalhesGarantia());
            stmt.setInt(6, produto.getIdFornecedor());
            stmt.setInt(7, produto.getIdCategoria());
            stmt.setInt(8, produto.getId());
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

    public boolean deletarProduto(String id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
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

    public List<Produto> listarProdutos() {
        String sql = "SELECT * FROM produto";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getFloat("valor"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setDetalhesGarantia(rs.getString("detalhesGarantia"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setIdCategoria(rs.getInt("idCategoria"));
                produtos.add(produto);
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

        return produtos;
    }
}
