/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.FornecedorController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Fornecedor;

/**
 * Lista de Fornecedores
 */
public class ListFornecedor extends JFrame {
    public ListFornecedor(List<Fornecedor> fornecedores) {
        setTitle("Lista de Fornecedores");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "CNPJ", "Nome", "Email"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona fornecedores ao modelo da tabela
        for (Fornecedor fornecedor : fornecedores) {
            Object[] rowData = {
                    fornecedor.getId(),
                    fornecedor.getCnpj(),
                    fornecedor.getNome(),
                    fornecedor.getEmail()
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
        // Exemplo de fornecedores
        FornecedorController control = new FornecedorController();

        List<Fornecedor> fornecedores = control.listarTodosFornecedores();

        // Criação e exibição do JFrame
        ListFornecedor frame = new ListFornecedor(fornecedores);
        frame.setVisible(true);
    }
}
