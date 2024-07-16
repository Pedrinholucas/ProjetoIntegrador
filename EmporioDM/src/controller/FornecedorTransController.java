package controller;

import models.FornecedorTrans;
import models.Fornecedor;
import models.Transportadora;
import connection.ConnectionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorTransController {
    private Connection con;

    public FornecedorTransController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirFornecedorTrans(FornecedorTrans fornecedorTrans) {
        String sql = "INSERT INTO fornecedorTrans (idFornecedor, idFransportadora) VALUES (?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, fornecedorTrans.getFornecedor().getId());
            stmt.setInt(2, fornecedorTrans.getTransportadora().getId());
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

    public boolean atualizarFornecedorTrans(FornecedorTrans fornecedorTrans) {
        String sql = "UPDATE fornecedorTrans SET idFornecedor = ?, idTransportadora = ? WHERE id = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, fornecedorTrans.getFornecedor().getId());
            stmt.setInt(2, fornecedorTrans.getTransportadora().getId());
            stmt.setInt(3, fornecedorTrans.getId());
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

    public boolean deletarFornecedorTrans(int id) {
        String sql = "DELETE FROM fornecedorTrans WHERE id = ?";
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

    public FornecedorTrans buscarFornecedorTransPorId(int id) {
        String sql = "SELECT * FROM fornecedorTrans WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                FornecedorTrans fornecedorTrans = new FornecedorTrans();
                fornecedorTrans.setId(rs.getInt("id"));
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("idFornecedor"));
                fornecedorTrans.setFornecedor(fornecedor);
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("idTransportadora"));
                fornecedorTrans.setTransportadora(transportadora);
                return fornecedorTrans;
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

    public List<FornecedorTrans> listarTodosFornecedorTrans() {
        String sql = "SELECT * FROM fornecedorTrans";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<FornecedorTrans> fornecedorTransList = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                FornecedorTrans fornecedorTrans = new FornecedorTrans();
                fornecedorTrans.setId(rs.getInt("id"));
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("idFornecedor"));
                fornecedorTrans.setFornecedor(fornecedor);
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("idTransportadora"));
                fornecedorTrans.setTransportadora(transportadora);
                fornecedorTransList.add(fornecedorTrans);
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
        return fornecedorTransList;
    }
}
