/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.TransportadoraController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Transportadora;

/**
 * Lista de Transportadoras
 */
public class ListTransportadora extends JFrame {
    public ListTransportadora(List<Transportadora> transportadoras) {
        setTitle("Lista de Transportadoras");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "CNPJ", "Nome"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona transportadoras ao modelo da tabela
        for (Transportadora transportadora : transportadoras) {
            Object[] rowData = {
                    transportadora.getId(),
                    transportadora.getCnpj(),
                    transportadora.getNome()
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
        // Exemplo de transportadoras
        TransportadoraController control = new TransportadoraController();

        List<Transportadora> transportadoras = control.listarTransportadoras();

        // Criação e exibição do JFrame
        ListTransportadora frame = new ListTransportadora(transportadoras);
        frame.setVisible(true);
    }

    ListTransportadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
