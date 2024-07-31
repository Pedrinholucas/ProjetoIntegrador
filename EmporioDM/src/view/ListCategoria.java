/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.CategoriaController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Categoria;

/**
 * Lista de Categorias
 */
public class ListCategoria extends JFrame {
    public ListCategoria(List<Categoria> categorias) {
        setTitle("Lista de Categorias");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "Nome", "Descrição"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona categorias ao modelo da tabela
        for (Categoria categoria : categorias) {
            Object[] rowData = {
                    categoria.getId(),
                    categoria.getNome(),
                    categoria.getDescricao()
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
        // Exemplo de categorias
        CategoriaController control = new CategoriaController();

        List<Categoria> categorias = control.listarTodasCategorias();

        // Criação e exibição do JFrame
        ListCategoria frame = new ListCategoria(categorias);
        frame.setVisible(true);
    }
}
