/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author pedro
 */
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
        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Produto A");
        produto1.setValor(10.5f);
        produto1.setDescricao("Descrição do Produto A");
        produto1.setQuantidadeEstoque(100);
        produto1.setDetalhesGarantia("Garantia de 1 ano");
        produto1.setIdFornecedor(1);
        produto1.setIdCategoria(1);

        Produto produto2 = new Produto();
        produto2.setId(2);
        produto2.setNome("Produto B");
        produto2.setValor(20.0f);
        produto2.setDescricao("Descrição do Produto B");
        produto2.setQuantidadeEstoque(50);
        produto2.setDetalhesGarantia("Garantia de 2 anos");
        produto2.setIdFornecedor(2);
        produto2.setIdCategoria(2);

        List<Produto> produtos = List.of(produto1, produto2);

        // Criação e exibição do JFrame
        ListProduto frame = new ListProduto(produtos);
        frame.setVisible(true);
    }
}

