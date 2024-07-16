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
 *
 * @author pedro
 */
public class ListTransportadora extends JFrame {



    private JTable table;

    public ListTransportadora(List<Transportadora> transportadoras) {
        setTitle("Lista de Transportadoras");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"ID", "CNPJ", "Nome"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Transportadora t : transportadoras) {
            Object[] row = {t.getId(), t.getCnpj(), t.getNome()};
            model.addRow(row);
        }

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TransportadoraController controle = new TransportadoraController();
        List<Transportadora> transportadoras = controle.listarTransportadoras();

        SwingUtilities.invokeLater(() -> {
            ListTransportadora frame = new ListTransportadora(transportadoras);
            frame.setVisible(true);
        });
    }
}
