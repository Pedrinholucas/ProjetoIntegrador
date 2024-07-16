
package controller;

import connection.ConnectionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import models.Transportadora;

public class TransportadoraController {
    private Connection con;

    public TransportadoraController() {
        con = new ConnectionMySQL().conectar();
    }

    public boolean inserirTransportadora(Transportadora transportadora) {
        String sql = "INSERT INTO transportadora (cnpj, nome) VALUES (?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, String.valueOf(transportadora.getCnpj()));
            stmt.setString(2, transportadora.getNome());
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

    public Transportadora buscarTransportadoraPorCnpj(String cnpj) {
        String sql = "SELECT * FROM transportadora WHERE cnpj = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cnpj);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("id"));
                transportadora.setCnpj(rs.getString("cnpj"));
                transportadora.setNome(rs.getString("nome"));
                return transportadora;
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

    public Transportadora buscarTransportadoraPorId(int id) {
        String sql = "SELECT * FROM transportadora WHERE id = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("id"));
                transportadora.setCnpj(rs.getString("cnpj"));
                transportadora.setNome(rs.getString("nome"));
                return transportadora;
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

    public boolean atualizarTransportadora(Transportadora transportadora) {
        String sql = "UPDATE transportadora SET nome = ? WHERE cnpj = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, transportadora.getNome());
            stmt.setString(2, String.valueOf(transportadora.getCnpj()));
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
    
    public List<Transportadora> listarTransportadoras() {
        String sql = "SELECT * FROM transportadora";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Transportadora> transportadoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Transportadora transportadora = new Transportadora();
                transportadora.setId(rs.getInt("id"));
                transportadora.setCnpj(rs.getString("cnpj"));
                transportadora.setNome(rs.getString("nome"));
                transportadoras.add(transportadora);
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
        return transportadoras;
    }

    public boolean deletarTransportadora(String cnpj) {
        String sql = "DELETE FROM transportadora WHERE cnpj = ?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cnpj);
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
