package br.com.emporiodm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emporiodm.dao.ClienteDAO;
import br.com.emporiodm.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteDAO clienteDAO;

    @Autowired
    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @PostMapping
    public ResponseEntity<String> createCliente(@RequestBody Cliente cliente) {
        clienteDAO.save(cliente);
        return ResponseEntity.ok("Cliente criado com sucesso!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Integer id) {
        Cliente cliente = clienteDAO.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> clientes = clienteDAO.findAll();
        return ResponseEntity.ok(clientes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        clienteDAO.update(cliente);
        return ResponseEntity.ok("Cliente atualizado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Integer id) {
        clienteDAO.delete(id);
        return ResponseEntity.ok("Cliente deletado com sucesso!");
    }
}
