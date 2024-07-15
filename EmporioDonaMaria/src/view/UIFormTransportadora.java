/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import common.Common;
import connection.ConnectionMySQL;
import controller.TransportadoraController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Transportadora;

/**
 *
 * @author pedro
 */
public class UIFormTransportadora extends javax.swing.JFrame {

    /**
     * Creates new form UIForm
     */
    public UIFormTransportadora() {
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

        nomeInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salvarTransportadoraBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        cnpjInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjInputActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

        salvarTransportadoraBtn.setText("Salvar");
        salvarTransportadoraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarTransportadoraBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvarTransportadoraBtn)
                    .addComponent(jLabel2)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(617, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarTransportadoraBtn)
                .addContainerGap(567, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void cnpjInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjInputActionPerformed

    private void salvarTransportadoraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarTransportadoraBtnActionPerformed
    if(Common.isInteger(cnpjInput.getText())) {

        TransportadoraController transportadoraControle = new TransportadoraController();

        // Inserir transportadora
        Transportadora novaTransportadora = new Transportadora();
        novaTransportadora.setCnpj(cnpjInput.getText());
        novaTransportadora.setNome(nomeInput.getText());

        boolean inserido = transportadoraControle.inserirTransportadora(novaTransportadora);
        if (inserido) {
            JOptionPane.showMessageDialog(null, "Transportadora inserida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao inserir a transportadora.");
        }

    } else {
        JOptionPane.showMessageDialog(null, "CNPJ inválido.");
    }

    }//GEN-LAST:event_salvarTransportadoraBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UIFormTransportadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIFormTransportadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIFormTransportadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIFormTransportadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIFormTransportadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnpjInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JButton salvarTransportadoraBtn;
    // End of variables declaration//GEN-END:variables
}
