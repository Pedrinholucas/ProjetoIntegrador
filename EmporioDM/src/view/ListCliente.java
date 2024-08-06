/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ClienteController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Cliente;

/**
 * Lista de Clientes
 */
public class ListCliente extends JFrame {
    public ListCliente(List<Cliente> clientes) {
        setTitle("Lista de Clientes");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "CPF", "Nome", "Email", "Telefone"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona clientes ao modelo da tabela
        for (Cliente cliente : clientes) {
            Object[] rowData = {
                    cliente.getId(),
                    cliente.getCpf(),
                    cliente.getNome(),
                    cliente.getEmail(),
                    cliente.getTelefone()
            };
            model.addRow(rowData);
        }

        // Criação da tabela com o modelo
        JTable table = new JTable(model);

        // Adiciona a tabela a um JScrollPane para habilitar a rolagem
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Exemplo de clientes
        ClienteController control = new ClienteController();

        List<Cliente> clientes = control.listarTodosClientes();

        // Criação e exibição do JFrame
        ListCliente frame = new ListCliente(clientes);
        frame.setVisible(true);
    }

    ListCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
