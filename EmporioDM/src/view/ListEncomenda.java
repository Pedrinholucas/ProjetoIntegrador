/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.EncomendaController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Cliente;
import models.Encomenda;

/**
 * Lista de Encomendas
 */
public class ListEncomenda extends JFrame {
    public ListEncomenda(List<Encomenda> encomendas) {
        setTitle("Lista de Encomendas");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "Endereço de Entrega", "Frete", "Valor Total", "Data de Aquisição", "Data de Entrega", "Cliente", "Transportadora"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona encomendas ao modelo da tabela
        for (Encomenda encomenda : encomendas) {
            Cliente client = encomenda.getCliente();
            Object[] rowData = {
                    encomenda.getId(),
                    encomenda.getEnderecoEntrega(),
                    encomenda.getFrete(),
                    encomenda.getValorTotal(),
                    encomenda.getDataAquisicao(),
                    encomenda.getDataEntrega(),
                    client.getNome(),
                    encomenda.getTransportadora().getNome()
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
        // Exemplo de encomendas
        EncomendaController control = new EncomendaController();

        List<Encomenda> encomendas = control.listarTodasEncomendas();

        // Criação e exibição do JFrame
        ListEncomenda frame = new ListEncomenda(encomendas);
        frame.setVisible(true);
    }
}
