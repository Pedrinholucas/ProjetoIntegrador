/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author pedro
 */
import controller.ProdutoController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import models.Produto;

public class ListProduto extends JFrame {
    public ListProduto(List<Produto> produtos) {
        setTitle("Lista de Produtos");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do modelo da tabela
        String[] columnNames = {"ID", "Nome", "Valor", "Descrição", "Quantidade Estoque", "Detalhes Garantia", "Fornecedor", "Categoria"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Adiciona produtos ao modelo da tabela
        for (Produto produto : produtos) {
            Object[] rowData = {
                    produto.getId(),
                    produto.getNome(),
                    produto.getValor(),
                    produto.getDescricao(),
                    produto.getQuantidadeEstoque(),
                    produto.getDetalhesGarantia(),
                    produto.getIdFornecedor(), //todo consertar isso
                    produto.getIdCategoria()
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
        // Exemplo de produtos
        ProdutoController control = new ProdutoController();

        List<Produto> produtos = control.listarProdutos();

        // Criação e exibição do JFrame
        ListProduto frame = new ListProduto(produtos);
        frame.setVisible(true);
    }

    ListProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

