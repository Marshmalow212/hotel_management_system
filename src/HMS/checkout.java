package HMS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class checkout extends javax.swing.JFrame {

    public checkout() {
        initComponents();
        this.setLocationRelativeTo(null);
        dateSet();
        
        String cmd = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getoutrecord(fcn(), cmd));
        outrecordtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
    }
    
    public void dateSet(){
        Date ndate = new Date();
        System.out.println(ndate);
        outdatecheck.setDate(ndate);
    }
    
    public String dateGet(){
        Date val = outdatecheck.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);
        return date;
    }
    public String[] fcn(){
        int c = outrecordtable.getColumnCount();
        System.out.println(c);
        int i=0;
        String[] colname= new String[outrecordtable.getColumnCount()];
        while(i<c){
            colname[i] = outrecordtable.getColumnName(i++); //storing column name
        }
        return colname;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tooperatorbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outrecordtable = new javax.swing.JTable();
        checkoutbtn = new javax.swing.JButton();
        outextendbtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        outdatecheck = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tooperatorbtn.setBackground(new java.awt.Color(255, 255, 255));
        tooperatorbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tooperatorbtn.setForeground(new java.awt.Color(51, 0, 153));
        tooperatorbtn.setText("<");
        tooperatorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tooperatorbtnActionPerformed(evt);
            }
        });

        outrecordtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "NID", "Number", "Check_IN", "Check_OUT", "Service_No", "Room_No", "Payment", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(outrecordtable);

        checkoutbtn.setBackground(new java.awt.Color(51, 0, 153));
        checkoutbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutbtn.setText("Check Out");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });

        outextendbtn.setBackground(new java.awt.Color(51, 0, 153));
        outextendbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        outextendbtn.setForeground(new java.awt.Color(255, 255, 255));
        outextendbtn.setText("Extend ");
        outextendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outextendbtnActionPerformed(evt);
            }
        });

        refreshbtn.setBackground(new java.awt.Color(51, 0, 153));
        refreshbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("Check Out");

        outdatecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdatecheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tooperatorbtn)
                        .addGap(286, 286, 286)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outdatecheck, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(refreshbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outextendbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tooperatorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outdatecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(outextendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tooperatorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tooperatorbtnActionPerformed
        new operator().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tooperatorbtnActionPerformed

    private void outextendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outextendbtnActionPerformed
        int r = outrecordtable.getSelectedRow();
        String id = outrecordtable.getModel().getValueAt(r, 0).toString();
        String odate = outrecordtable.getModel().getValueAt(r, 6).toString();
        String cmd = "update checkout set status = 'Extended' , out_date = '"+odate+"' where rec_id = '"+id+"'";        
        dbconnection.getqueryupdate(cmd);        
        String cmd2 = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getoutrecord(fcn(), cmd2));
        JOptionPane.showMessageDialog(this, "Extend Success!");
       
    }//GEN-LAST:event_outextendbtnActionPerformed

    private void currentrecorddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_currentrecorddatePropertyChange
       
    }//GEN-LAST:event_currentrecorddatePropertyChange
/***
 * Date oDate = jXDatePicker1.getDate();        
DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
String szDate = oDateFormat.format(oDate);
 * @param evt 
 */
    private void currentrecorddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentrecorddateActionPerformed
        //coverting date to simpleformat for database from datechooser
        /*Date val = currentrecorddate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);*/
        
    }//GEN-LAST:event_currentrecorddateActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
        
        int r = outrecordtable.getSelectedRow();
        String id = outrecordtable.getModel().getValueAt(r, 0).toString();
        String cmd = "update checkout set status = 'Check_out' where rec_id = '"+id+"'";        
        dbconnection.getqueryupdate(cmd);        
        String cmd2 = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getoutrecord(fcn(), cmd2));
        JOptionPane.showMessageDialog(this, "Check out complete! :) ");
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void outdatecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdatecheckActionPerformed
        Date val = outdatecheck.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
//        System.out.println(date);
    }//GEN-LAST:event_outdatecheckActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        String cmd = "select * from cust_info join record join checkout where cust_info.id = record.customer_id and checkout.rec_id = record.ID and  record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getoutrecord(fcn(), cmd));
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
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker outdatecheck;
    private javax.swing.JButton outextendbtn;
    private javax.swing.JTable outrecordtable;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton tooperatorbtn;
    // End of variables declaration//GEN-END:variables
}
