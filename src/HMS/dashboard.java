package HMS;

import java.sql.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class dashboard extends javax.swing.JFrame {
    
   

    public dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        dateSet();
        //fcn();
        
        String cmd = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+gdate()+"'";
        //for(int j=0;j<colname.length;j++)System.out.println(colname[j]);
        
        dashrecordtable.setModel(dataret.getinforecord(fcn(),cmd)); //dashboard table update using dataret class
        dashrecordtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
    }
    
    public void dateSet(){
        Date curdate = new Date();
        dashdate.setDate(curdate);
        
    }
    
    public String gdate(){
        Date val = dashdate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);       
        return date;
    }
    
    public String[] fcn(){
        int c = dashrecordtable.getColumnCount();
        System.out.println(c);
        int i=0;
        String[] colname= new String[dashrecordtable.getColumnCount()];
        while(i<c){
            colname[i] = dashrecordtable.getColumnName(i++); //storing column name
        }
        return colname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tooperatorbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashrecordtable = new javax.swing.JTable();
        checkinbtn = new javax.swing.JButton();
        toprebookbtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dashdate = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tooperatorbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tooperatorbtn.setText("<");
        tooperatorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tooperatorbtnActionPerformed(evt);
            }
        });

        dashrecordtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "NID", "Number", "Check_IN", "Check_OUT", "Service_No", "Room_No", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dashrecordtable);

        checkinbtn.setText("Check In");
        checkinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinbtnActionPerformed(evt);
            }
        });

        toprebookbtn.setText("Booking Check");
        toprebookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toprebookbtnActionPerformed(evt);
            }
        });

        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tooperatorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(jLabel3)
                        .addContainerGap(373, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toprebookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tooperatorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dashdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(checkinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(toprebookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tooperatorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tooperatorbtnActionPerformed
        new operator().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tooperatorbtnActionPerformed

    private void toprebookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toprebookbtnActionPerformed
        // TODO add your handling code here:
        new prebook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toprebookbtnActionPerformed

    private void currentrecorddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_currentrecorddatePropertyChange
       
    }//GEN-LAST:event_currentrecorddatePropertyChange
/***
 * Date oDate = jXDatePicker1.getDate();        
DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
String szDate = oDateFormat.format(oDate);
 * @param evt 
 */
    private void dashdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentrecorddateActionPerformed
        //coverting date to simpleformat for database from datechooser
        Date val = dashdate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);
        
    }//GEN-LAST:event_currentrecorddateActionPerformed

    private void checkinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinbtnActionPerformed
        new instant().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkinbtnActionPerformed
/*
    private void currentrecorddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashdateActionPerformed
*/
    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        
        String cmd = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+gdate()+"'";
        dashrecordtable.setModel(dataret.getinforecord(fcn(), cmd));
        
    }//GEN-LAST:event_refreshbtnActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkinbtn;
    private org.jdesktop.swingx.JXDatePicker dashdate;
    private javax.swing.JTable dashrecordtable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton tooperatorbtn;
    private javax.swing.JButton toprebookbtn;
    // End of variables declaration//GEN-END:variables
}
