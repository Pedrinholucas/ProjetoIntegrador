/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cu;

import common.Common;
import connection.ConnectionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Avaliacao;

/**
 *
 * @author janai
 */
public class cu {
    if(Common.isInteger(IntInput.getText())){
        Classe obj = new Classe(Integer.parseInt(IntInput.getText()),StringInput.getText());
        ConnectionMySQL teste = new ConnectionMySQL();
        Connection db = null;
        PreparedStatement pStatement = null;
        try {
            db = teste.conectar();
            String query = "INSERT INTO Tabela(Int,String) VALUES ("+Integer.parseInt(IntInput.getText())+", '"+StringInput.getText()+"')";
            pStatement = db.prepareStatement(query);
            int rows = pStatement.executeUpdate();
            if(rows > 0){
                JOptionPane.showMessageDialog(null, "Classe registrada com exito!");
            }else JOptionPane.showMessageDialog(null, "algo deu errado");
        } catch(SQLException err){
            System.err.println(err);                
       }    
    } else{
        JOptionPane.showMessageDialog(null, "põe numero nas coisa 🎸");
    }
}
