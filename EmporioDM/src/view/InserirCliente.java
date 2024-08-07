/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import models.Cliente;

import common.Common;
import connection.ConnectionMySQL;
import controller.ClienteController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Cliente;


/**
 *
 * @author pedro
 */
public class InserirCliente extends javax.swing.JFrame {

    /**
     * Creates new form UIForm
     */
    public InserirCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cpfInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        telefoneInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        salvarInserirClienteBtn = new javax.swing.JButton();
        nomeInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome");

        cpfInput.setBackground(new java.awt.Color(204, 204, 204));
        cpfInput.setForeground(new java.awt.Color(51, 51, 51));
        cpfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfInputActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CPF");

        emailInput.setBackground(new java.awt.Color(204, 204, 204));
        emailInput.setForeground(new java.awt.Color(51, 51, 51));
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Email");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Senha");

        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Inserir dados do cliente");

        telefoneInput.setBackground(new java.awt.Color(204, 204, 204));
        telefoneInput.setForeground(new java.awt.Color(51, 51, 51));
        telefoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneInputActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telefone");

        senhaInput.setBackground(new java.awt.Color(204, 204, 204));
        senhaInput.setForeground(new java.awt.Color(51, 51, 51));

        salvarInserirClienteBtn.setText("Salvar");
        salvarInserirClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarInserirClienteBtnActionPerformed(evt);
            }
        });

        nomeInput.setBackground(new java.awt.Color(204, 204, 204));
        nomeInput.setForeground(new java.awt.Color(51, 51, 51));
        nomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvarInserirClienteBtn)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titulo)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarInserirClienteBtn)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Imagem fofinha de cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void cpfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfInputActionPerformed

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void telefoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneInputActionPerformed

    private void salvarInserirClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarInserirClienteBtnActionPerformed
    if(Common.isInteger(cpfInput.getText()) && Common.isInteger(telefoneInput.getText())){
        
        ClienteController ClienteControle = new ClienteController();

        // Inserir cliente
        Cliente novoCliente = new Cliente();
        novoCliente.setCpf(cpfInput.getText());
        novoCliente.setNome(nomeInput.getText());
        novoCliente.setSenha(senhaInput.getText());
        novoCliente.setEmail(emailInput.getText());
        novoCliente.setTelefone(Integer.valueOf(telefoneInput.getText()));
        boolean inserido = ClienteControle.inserirCliente(novoCliente);
        if (inserido) {
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao inserir o cliente.");
        }
    
    } else{
        JOptionPane.showMessageDialog(null, "põe numero nas coisa 🎸");
    }
    }//GEN-LAST:event_salvarInserirClienteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JButton salvarInserirClienteBtn;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JTextField telefoneInput;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
