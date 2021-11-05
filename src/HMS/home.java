/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 import java.awt.Graphics;  
 import java.awt.Image;  
 import java.awt.Toolkit;  
 import javax.swing.JPanel;  
/**
 *
 * @author hp
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home(){
        initComponents();
        this.setLocationRelativeTo(null); //to center the windows
        dbconnection.getConnection();               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelnull = new JPanel() {      public void paintComponent(Graphics g) {        Image img = Toolkit.getDefaultToolkit().getImage(        home.class.getResource("/resources/home.png"));        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);        }    }; ;
        servicebtn = new javax.swing.JButton();
        hostbtn = new javax.swing.JButton();
        helpbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelnull.setLayout(null);

        servicebtn.setBackground(new java.awt.Color(51, 0, 153));
        servicebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        servicebtn.setForeground(new java.awt.Color(255, 255, 255));
        servicebtn.setText("Services");
        servicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicebtnActionPerformed(evt);
            }
        });
        panelnull.add(servicebtn);
        servicebtn.setBounds(600, 250, 220, 60);

        hostbtn.setBackground(new java.awt.Color(51, 0, 153));
        hostbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hostbtn.setForeground(new java.awt.Color(255, 255, 255));
        hostbtn.setText("Host");
        hostbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostbtnActionPerformed(evt);
            }
        });
        panelnull.add(hostbtn);
        hostbtn.setBounds(600, 170, 220, 60);

        helpbtn.setBackground(new java.awt.Color(51, 0, 153));
        helpbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        helpbtn.setForeground(new java.awt.Color(255, 255, 255));
        helpbtn.setText("Help");
        helpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpbtnActionPerformed(evt);
            }
        });
        panelnull.add(helpbtn);
        helpbtn.setBounds(20, 460, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelnull, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelnull, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpbtnActionPerformed

    private void hostbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostbtnActionPerformed
        // TODO add your handling code here:
        host hst=new host();
        hst.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_hostbtnActionPerformed

    private void servicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicebtnActionPerformed
        // TODO add your handling code here:
        service srvc=new service();
        srvc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_servicebtnActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //imageshow.setIcon(new javax.swing.ImageIcon("E:\\Projects\\Desktop Application\\Hotel Management System\\home.png")); // NOI18N
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpbtn;
    private javax.swing.JButton hostbtn;
    private javax.swing.JPanel panelnull;
    private javax.swing.JButton servicebtn;
    // End of variables declaration//GEN-END:variables
}