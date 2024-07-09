/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import models.Fornecedor;
import common.Common;
import connection.ConnectionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class UIFormFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form UIForm
     */
    public UIFormFornecedor() {
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
        emailInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        salvarFornecedorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeInput.setText("Mim de o nome");
        nomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        cnpjInput.setText("Mim de o CNPJ");
        cnpjInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjInputActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

        emailInput.setText("Mim de o email");
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jLabel4.setText("Senha");

        salvarFornecedorBtn.setText("Salvar");
        salvarFornecedorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarFornecedorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvarFornecedorBtn)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarFornecedorBtn)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void cnpjInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjInputActionPerformed

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void salvarFornecedorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarFornecedorBtnActionPerformed
        if(Common.isInteger(cnpjInput.getText())){
            Fornecedor obj = new Fornecedor(Integer.parseInt(cnpjInput.getText()), nomeInput.getText(), emailInput.getText(), senhaInput.getText());
            ConnectionMySQL teste = new ConnectionMySQL();
            Connection db = null;
            PreparedStatement pStatement = null;
            try {
		db = teste.conectar();
		String query = "INSERT INTO Fornecedor(cnpj, nome, email, senha) VALUES ("+Integer.parseInt(cnpjInput.getText())+", '"+ nomeInput.getText()+ "', '"+ emailInput.getText()+ "', '"+ senhaInput.getText() + "')";
		pStatement = db.prepareStatement(query);
		int rows = pStatement.executeUpdate();
                if(rows > 0){
                    JOptionPane.showMessageDialog(null, "conta fornecedor registrada com exito!");
                }else JOptionPane.showMessageDialog(null, "algo deu errado");
            } catch(SQLException err){
                System.err.println(err);                
            }    
        } else{
            JOptionPane.showMessageDialog(null, "põe numero nas coisa 🎸");
        }        
    }//GEN-LAST:event_salvarFornecedorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UIFormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIFormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIFormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIFormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIFormFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnpjInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JButton salvarFornecedorBtn;
    private javax.swing.JPasswordField senhaInput;
    // End of variables declaration//GEN-END:variables
}