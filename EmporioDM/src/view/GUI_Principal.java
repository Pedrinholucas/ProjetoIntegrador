/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
       
import javax.swing.JDesktopPane;


/**
 *
 * @author janai
 */
public class GUI_Principal extends javax.swing.JFrame {

    private JDesktopPane desktop;
    /**
     * Creates new form GUI_Principal
     */
    public GUI_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NA = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicialDM = new javax.swing.JMenu();
        ConsultarDM = new javax.swing.JMenu();
        ConClienteDM = new javax.swing.JMenuItem();
        ConFornecedorDM = new javax.swing.JMenuItem();
        ConProdutoDM = new javax.swing.JMenuItem();
        ConCategoriaDM = new javax.swing.JMenuItem();
        ConEncomendaDM = new javax.swing.JMenuItem();
        InserirDM = new javax.swing.JMenu();
        InsCategoriaDM = new javax.swing.JMenuItem();
        InsClienteDM = new javax.swing.JMenuItem();
        InsFornecedorDM = new javax.swing.JMenuItem();
        InsProdutoDM = new javax.swing.JMenuItem();
        InsTransportadoraDM = new javax.swing.JMenuItem();
        ListarDM = new javax.swing.JMenu();
        ListClienteDM = new javax.swing.JMenuItem();
        ListFornecedorDM = new javax.swing.JMenuItem();
        ListProdutoDM = new javax.swing.JMenuItem();
        ListTransportadoraDM = new javax.swing.JMenuItem();
        ListEncomendaDM = new javax.swing.JMenuItem();
        RemoverDM = new javax.swing.JMenu();
        RemovClienteDM = new javax.swing.JMenuItem();
        RemovFornecedorDM = new javax.swing.JMenuItem();
        RemovProdutoDM = new javax.swing.JMenuItem();
        RemovTransportadoraDM = new javax.swing.JMenuItem();

        NA.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bem vindo ao Banco de dados pertencendo ao\nEmpório Dona Mária\n\nEste é o Menu Principal\n\t\t888888888888888___88888888888888\n\t\t88888888888888_____8888888888888\n\t\t88888888888888_____8888888888888\n\t\t8888888888888______8888888888888\n\t\t888888888888_______8888888888888\n\t\t_______88888888888888\n\t\t888888888________888888888888888\n\t\t8888888__________888888888888888\n\t\t8888_________________________888\n\t\t888__________88888888_________88\n\t\t888_________8_________________88\n\t\t____________8_________________88\n\t\t_____________8888888888888888888\n\t\t___________88__________________8\n\t\t___________8___________________8\n\t\t____________88888888888888888888\n\t\t_____________8________________88\n\t\t_____________8________________88\n\t\t______________888888888888888888\n\t\t________________8___________8888\n\t\t888_____________8___________8888\n\t\t88888888888888888888888888888888\n\n\n\n\n\n\n\n\n\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuInicialDM.setText("Menu Inicial");
        jMenuBar1.add(MenuInicialDM);

        ConsultarDM.setText("Consultar");
        ConsultarDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarDMActionPerformed(evt);
            }
        });

        ConClienteDM.setText("Consultar Cliente");
        ConClienteDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConClienteDMActionPerformed(evt);
            }
        });
        ConsultarDM.add(ConClienteDM);

        ConFornecedorDM.setText("Consultar Fornecedor");
        ConFornecedorDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConFornecedorDMActionPerformed(evt);
            }
        });
        ConsultarDM.add(ConFornecedorDM);

        ConProdutoDM.setText("Consultar Produto");
        ConProdutoDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConProdutoDMActionPerformed(evt);
            }
        });
        ConsultarDM.add(ConProdutoDM);

        ConCategoriaDM.setText("Consultar Categoria");
        ConCategoriaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConCategoriaDMActionPerformed(evt);
            }
        });
        ConsultarDM.add(ConCategoriaDM);

        ConEncomendaDM.setText("Consultar Encomenda");
        ConEncomendaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConEncomendaDMActionPerformed(evt);
            }
        });
        ConsultarDM.add(ConEncomendaDM);

        jMenuBar1.add(ConsultarDM);

        InserirDM.setText("Inserir");

        InsCategoriaDM.setText("Inserir Categoria");
        InsCategoriaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsCategoriaDMActionPerformed(evt);
            }
        });
        InserirDM.add(InsCategoriaDM);

        InsClienteDM.setText("Inserir Cliente");
        InsClienteDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsClienteDMActionPerformed(evt);
            }
        });
        InserirDM.add(InsClienteDM);

        InsFornecedorDM.setText("Inserir Fornecedor");
        InsFornecedorDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsFornecedorDMActionPerformed(evt);
            }
        });
        InserirDM.add(InsFornecedorDM);

        InsProdutoDM.setText("Inserir Produto");
        InsProdutoDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsProdutoDMActionPerformed(evt);
            }
        });
        InserirDM.add(InsProdutoDM);

        InsTransportadoraDM.setText("Inserir Transportadora");
        InsTransportadoraDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsTransportadoraDMActionPerformed(evt);
            }
        });
        InserirDM.add(InsTransportadoraDM);

        jMenuBar1.add(InserirDM);

        ListarDM.setText("Listar");

        ListClienteDM.setText("Listar Cliente");
        ListClienteDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListClienteDMActionPerformed(evt);
            }
        });
        ListarDM.add(ListClienteDM);

        ListFornecedorDM.setText("Listar Fornecedor");
        ListFornecedorDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListFornecedorDMActionPerformed(evt);
            }
        });
        ListarDM.add(ListFornecedorDM);

        ListProdutoDM.setText("Listar Produto");
        ListProdutoDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListProdutoDMActionPerformed(evt);
            }
        });
        ListarDM.add(ListProdutoDM);

        ListTransportadoraDM.setText("Listar Transportadora");
        ListTransportadoraDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListTransportadoraDMActionPerformed(evt);
            }
        });
        ListarDM.add(ListTransportadoraDM);

        ListEncomendaDM.setText("Listar Encomenda");
        ListEncomendaDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListEncomendaDMActionPerformed(evt);
            }
        });
        ListarDM.add(ListEncomendaDM);

        jMenuBar1.add(ListarDM);

        RemoverDM.setText("Remover");

        RemovClienteDM.setText("Remover Cliente");
        RemovClienteDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovClienteDMActionPerformed(evt);
            }
        });
        RemoverDM.add(RemovClienteDM);

        RemovFornecedorDM.setText("Remover Fornecedor");
        RemovFornecedorDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovFornecedorDMActionPerformed(evt);
            }
        });
        RemoverDM.add(RemovFornecedorDM);

        RemovProdutoDM.setText("Remover Produto");
        RemovProdutoDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovProdutoDMActionPerformed(evt);
            }
        });
        RemoverDM.add(RemovProdutoDM);

        RemovTransportadoraDM.setText("Remover Transportadora");
        RemovTransportadoraDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovTransportadoraDMActionPerformed(evt);
            }
        });
        RemoverDM.add(RemovTransportadoraDM);

        jMenuBar1.add(RemoverDM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConFornecedorDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConFornecedorDMActionPerformed
        ConsultarFornecedor ConsultarFornecedor = new ConsultarFornecedor();
        ConsultarFornecedor.setVisible(true);
        desktop.add(ConsultarFornecedor);
    }//GEN-LAST:event_ConFornecedorDMActionPerformed

    private void InsClienteDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsClienteDMActionPerformed
        InserirCliente InserirCliente = new  InserirCliente();
        InserirCliente.setVisible(true);
        desktop.add(InserirCliente);
    }//GEN-LAST:event_InsClienteDMActionPerformed

    private void ListTransportadoraDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListTransportadoraDMActionPerformed
        ListTransportadora ListTransportadora = new ListTransportadora();
        ListTransportadora.setVisible(true);
        desktop.add(ListTransportadora);
    }//GEN-LAST:event_ListTransportadoraDMActionPerformed

    private void RemovProdutoDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovProdutoDMActionPerformed
        RemoverProduto RemoverProduto = new RemoverProduto();
        RemoverProduto.setVisible(true);
        desktop.add(RemoverProduto);
    }//GEN-LAST:event_RemovProdutoDMActionPerformed

    private void ConsultarDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarDMActionPerformed
        // é pra ser o Consultar normal, mas ignora (não tem como retirar pra mim) :(
    }//GEN-LAST:event_ConsultarDMActionPerformed

    private void ConClienteDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConClienteDMActionPerformed
        ConsultarCliente ConsultarCliente = new ConsultarCliente();
        ConsultarCliente.setVisible(true);
        desktop.add(ConsultarCliente);
    }//GEN-LAST:event_ConClienteDMActionPerformed

    private void ConProdutoDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConProdutoDMActionPerformed
        ConsultarProduto ConsultarProduto = new ConsultarProduto();
        ConsultarProduto.setVisible(true);
        desktop.add(ConsultarProduto);
    }//GEN-LAST:event_ConProdutoDMActionPerformed

    private void InsCategoriaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsCategoriaDMActionPerformed
        InserirCategoria InserirCategoria = new  InserirCategoria();
        InserirCategoria.setVisible(true);
        desktop.add(InserirCategoria);
    }//GEN-LAST:event_InsCategoriaDMActionPerformed

    private void InsFornecedorDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsFornecedorDMActionPerformed
        InserirFornecedor InserirFornecedor = new  InserirFornecedor();
        InserirFornecedor.setVisible(true);
        desktop.add(InserirFornecedor);
    }//GEN-LAST:event_InsFornecedorDMActionPerformed

    private void InsProdutoDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsProdutoDMActionPerformed
        InserirProduto InserirProduto = new  InserirProduto();
        InserirProduto.setVisible(true);
        desktop.add(InserirProduto);
    }//GEN-LAST:event_InsProdutoDMActionPerformed

    private void InsTransportadoraDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsTransportadoraDMActionPerformed
        InserirTransportadora InserirTransportadora = new  InserirTransportadora();
        InserirTransportadora.setVisible(true);
        desktop.add(InserirTransportadora);
    }//GEN-LAST:event_InsTransportadoraDMActionPerformed

    private void ListClienteDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListClienteDMActionPerformed
        ListCliente ListCliente = new ListCliente();
        ListCliente.setVisible(true);
        desktop.add(ListCliente);
    }//GEN-LAST:event_ListClienteDMActionPerformed

    private void ListFornecedorDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListFornecedorDMActionPerformed
        ListFornecedor ListFornecedor = new ListFornecedor();
        ListFornecedor.setVisible(true);
        desktop.add(ListFornecedor);
    }//GEN-LAST:event_ListFornecedorDMActionPerformed

    private void ListProdutoDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListProdutoDMActionPerformed
        ListProduto  ListProduto = new ListProduto();
        ListProduto.setVisible(true);
        desktop.add(ListProduto);
    }//GEN-LAST:event_ListProdutoDMActionPerformed

    private void RemovClienteDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovClienteDMActionPerformed
        RemoverCliente RemoverCliente = new RemoverCliente();
        RemoverCliente.setVisible(true);
        desktop.add(RemoverCliente);
    }//GEN-LAST:event_RemovClienteDMActionPerformed

    private void RemovFornecedorDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovFornecedorDMActionPerformed
        RemoverFornecedor RemoverFornecedor = new RemoverFornecedor();
        RemoverFornecedor.setVisible(true);
        desktop.add(RemoverFornecedor);
    }//GEN-LAST:event_RemovFornecedorDMActionPerformed

    private void RemovTransportadoraDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovTransportadoraDMActionPerformed
        RemoverTransportadora RemoverTransportadora = new RemoverTransportadora();
        RemoverTransportadora.setVisible(true);
        desktop.add(RemoverTransportadora);
    }//GEN-LAST:event_RemovTransportadoraDMActionPerformed

    private void ConEncomendaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConEncomendaDMActionPerformed
        ConsultarEncomenda ConsultarEncomenda = new ConsultarEncomenda();
        ConsultarEncomenda.setVisible(true);
        desktop.add(ConsultarEncomenda);
    }//GEN-LAST:event_ConEncomendaDMActionPerformed

    private void ConCategoriaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConCategoriaDMActionPerformed
        ConsultarCategoria  ConsultarCategoria = new  ConsultarCategoria();
        ConsultarCategoria.setVisible(true);
        desktop.add(ConsultarCategoria);
    }//GEN-LAST:event_ConCategoriaDMActionPerformed

    private void ListEncomendaDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListEncomendaDMActionPerformed
        ListEncomenda  ListEncomenda  = new ListEncomenda ();
        ListEncomenda .setVisible(true);
        desktop.add(ListEncomenda );
    }//GEN-LAST:event_ListEncomendaDMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConCategoriaDM;
    private javax.swing.JMenuItem ConClienteDM;
    private javax.swing.JMenuItem ConEncomendaDM;
    private javax.swing.JMenuItem ConFornecedorDM;
    private javax.swing.JMenuItem ConProdutoDM;
    public javax.swing.JMenu ConsultarDM;
    private javax.swing.JMenuItem InsCategoriaDM;
    private javax.swing.JMenuItem InsClienteDM;
    private javax.swing.JMenuItem InsFornecedorDM;
    private javax.swing.JMenuItem InsProdutoDM;
    private javax.swing.JMenuItem InsTransportadoraDM;
    private javax.swing.JMenu InserirDM;
    private javax.swing.JMenuItem ListClienteDM;
    private javax.swing.JMenuItem ListEncomendaDM;
    private javax.swing.JMenuItem ListFornecedorDM;
    private javax.swing.JMenuItem ListProdutoDM;
    private javax.swing.JMenuItem ListTransportadoraDM;
    private javax.swing.JMenu ListarDM;
    private javax.swing.JMenu MenuInicialDM;
    private javax.swing.JMenuItem NA;
    private javax.swing.JMenuItem RemovClienteDM;
    private javax.swing.JMenuItem RemovFornecedorDM;
    private javax.swing.JMenuItem RemovProdutoDM;
    private javax.swing.JMenuItem RemovTransportadoraDM;
    private javax.swing.JMenu RemoverDM;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
