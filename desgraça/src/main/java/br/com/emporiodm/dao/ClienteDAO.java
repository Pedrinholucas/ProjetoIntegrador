package br.com.emporiodm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.emporiodm.models.Cliente;

@Repository
public class ClienteDAO {

    private final JdbcTemplate jdbcTemplate;

    public ClienteDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Cliente cliente) {
        String sql = "INSERT INTO clientes (cpf, nome, senha, email, telefone) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, cliente.getCpf(), cliente.getNome(), cliente.getSenha(), cliente.getEmail(), cliente.getTelefone());
    }

    public Cliente findById(Integer id) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClienteRowMapper());
    }

    public List<Cliente> findAll() {
        String sql = "SELECT * FROM clientes";
        return jdbcTemplate.query(sql, new ClienteRowMapper());
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE clientes SET cpf = ?, nome = ?, senha = ?, email = ?, telefone = ? WHERE id = ?";
        jdbcTemplate.update(sql, cliente.getCpf(), cliente.getNome(), cliente.getSenha(), cliente.getEmail(), cliente.getTelefone(), cliente.getId());
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    private static class ClienteRowMapper implements RowMapper<Cliente> {
        @Override
        public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setNome(rs.getString("nome"));
            cliente.setSenha(rs.getString("senha"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getInt("telefone"));
            return cliente;
        }
    }
}
