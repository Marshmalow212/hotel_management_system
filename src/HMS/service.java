/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import javax.swing.ImageIcon;
import javax.swing.JLabel;  
/**
 *
 * @author hp
 */
public class service extends javax.swing.JFrame {

    /**
     * Creates new form service
     */
    public service() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        fasbtn = new javax.swing.JButton();
        bookbtn = new javax.swing.JButton();
        roombtn = new javax.swing.JButton();
        serviceLabel = new javax.swing.JLabel();
        ravLavel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        fasbtn.setBackground(new java.awt.Color(51, 0, 153));
        fasbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fasbtn.setForeground(new java.awt.Color(255, 255, 255));
        fasbtn.setText("Fascilities");
        fasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasbtnActionPerformed(evt);
            }
        });
        jPanel1.add(fasbtn);
        fasbtn.setBounds(90, 240, 200, 50);

        bookbtn.setBackground(new java.awt.Color(51, 0, 153));
        bookbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookbtn.setForeground(new java.awt.Color(255, 255, 255));
        bookbtn.setText("Booking");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookbtn);
        bookbtn.setBounds(90, 310, 200, 50);

        roombtn.setBackground(new java.awt.Color(51, 0, 153));
        roombtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roombtn.setForeground(new java.awt.Color(255, 255, 255));
        roombtn.setText("Rooms");
        roombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombtnActionPerformed(evt);
            }
        });
        jPanel1.add(roombtn);
        roombtn.setBounds(90, 160, 200, 50);

        serviceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        serviceLabel.setForeground(new java.awt.Color(51, 0, 153));
        serviceLabel.setText("SERVICES");
        jPanel1.add(serviceLabel);
        serviceLabel.setBounds(430, 0, 140, 40);

        ravLavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ravLavel.setForeground(new java.awt.Color(51, 0, 153));
        ravLavel.setText("Room Availibility Info");
        jPanel1.add(ravLavel);
        ravLavel.setBounds(570, 110, 160, 40);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(340, 160, 570, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("<");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 20, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roombtnActionPerformed
        // TODO add your handling code here:
//        room rm=new room();
//        rm.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_roombtnActionPerformed

    private void fasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasbtnActionPerformed
        // TODO add your handling code here:
//        facilities fsclts=new facilities();
//        fsclts.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_fasbtnActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
        // TODO add your handling code here:
        booking bk=new booking();
        bk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookbtn;
    private javax.swing.JButton fasbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ravLavel;
    private javax.swing.JButton roombtn;
    private javax.swing.JLabel serviceLabel;
    // End of variables declaration//GEN-END:variables
}
