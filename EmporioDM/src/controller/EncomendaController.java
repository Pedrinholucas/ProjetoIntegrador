package controller;

import models.Encomenda;
import models.Cliente;
import models.Transportadora;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EncomendaController {
    private Connection con;

    public EncomendaController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirEncomenda(Encomenda encomenda) {
        String sql = "INSERT INTO encomenda (enderecoEntrega, frete, valorTotal, dataAquisicao, dataEntrega, idCliente, idTransportadora) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, encomenda.getEnderecoEntrega());
            stmt.setFloat(2, encomenda.getFrete());
            stmt.setFloat(3, encomenda.getValorTotal());
            stmt.setDate(4, new Date(encomenda.getDataAquisicao().getTime()));
            stmt.setDate(5, new Date(encomenda.getDataEntrega().getTime()));
            stmt.setInt(6, encomenda.getCliente().getId());
            stmt.setInt(7, encomenda.getTransportadora().getId());
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

    public boolean atualizarEncomenda(Encomenda encomenda) {
        String sql = "UPDATE encomenda SET enderecoEntrega = ?, frete = ?, valorTotal = ?, dataAquisicao = ?, dataEntrega = ?, idCliente = ?, idTransportadora = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, encomenda.getEnderecoEntrega());
            stmt.setFloat(2, encomenda.getFrete());
            stmt.setFloat(3, encomenda.getValorTotal());
            stmt.setDate(4, new Date(encomenda.getDataAquisicao().getTime()));
            stmt.setDate(5, new Date(encomenda.getDataEntrega().getTime()));
            stmt.setInt(6, encomenda.getCliente().getId());
            stmt.setInt(7, encomenda.getTransportadora().getId());
            stmt.setInt(8, encomenda.getId());
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

    public boolean deletarEncomenda(int id) {
        String sql = "DELETE FROM encomenda WHERE id = ?";
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

    public Encomenda buscarEncomendaPorId(int id) {
        String sql = "SELECT * FROM encomenda WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Encomenda encomenda = new Encomenda();
                encomenda.setId(rs.getInt("id"));
                encomenda.setEnderecoEntrega(rs.getString("enderecoEntrega"));
                encomenda.setFrete(rs.getFloat("frete"));
                encomenda.setValorTotal(rs.getFloat("valorTotal"));
                encomenda.setDataAquisicao(rs.getDate("dataAquisicao"));
                encomenda.setDataEntrega(rs.getDate("dataEntrega"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                encomenda.setCliente(cliente);
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("idTransportadora"));
                encomenda.setTransportadora(transportadora);
                return encomenda;
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

    public List<Encomenda> listarTodasEncomendas() {
        String sql = "SELECT * FROM encomenda";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Encomenda> encomendaList = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Encomenda encomenda = new Encomenda();
                encomenda.setId(rs.getInt("id"));
                encomenda.setEnderecoEntrega(rs.getString("enderecoEntrega"));
                encomenda.setFrete(rs.getFloat("frete"));
                encomenda.setValorTotal(rs.getFloat("valorTotal"));
                encomenda.setDataAquisicao(rs.getDate("dataAquisicao"));
                encomenda.setDataEntrega(rs.getDate("dataEntrega"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idCliente"));
                encomenda.setCliente(cliente);
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("idTransportadora"));
                encomenda.setTransportadora(transportadora);
                encomendaList.add(encomenda);
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
        return encomendaList;
    }
}
