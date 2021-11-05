package HMS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class prebook extends javax.swing.JFrame {

    public prebook() {
        initComponents();
        this.setLocationRelativeTo(null);
        gDate();
        
        String cmd = "select * from cust_info join record join prebook where cust_info.ID = record.customer_id and prebook.rec_id = record.ID and record.in_date = '"+Dateset()+"' ";
        bookchecktable.setModel(dataret.getbookrecord(fcn(), cmd));
        
    }
    
    
    public void gDate(){
        Date cd = new Date();
        prebookdate.setDate(cd);
        
    }
    
    public String Dateset(){
        Date val = prebookdate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        return date;        
    }
    
    public String[] fcn(){
        int c = bookchecktable.getColumnCount();
        System.out.println(c);
        int i=0;
        String[] colname= new String[bookchecktable.getColumnCount()];
        while(i<c){
            colname[i] = bookchecktable.getColumnName(i++); //storing column name
        }
        return colname;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookchecktable = new javax.swing.JTable();
        prebookcheckbtn = new javax.swing.JButton();
        checkintodashboardbtn = new javax.swing.JButton();
        prebookdate = new org.jdesktop.swingx.JXDatePicker();
        tohomebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("Booking Check");

        bookchecktable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bookchecktable);

        prebookcheckbtn.setBackground(new java.awt.Color(51, 0, 204));
        prebookcheckbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prebookcheckbtn.setForeground(new java.awt.Color(255, 255, 255));
        prebookcheckbtn.setText("Booking Check");
        prebookcheckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prebookcheckbtnActionPerformed(evt);
            }
        });

        checkintodashboardbtn.setBackground(new java.awt.Color(51, 0, 204));
        checkintodashboardbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkintodashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkintodashboardbtn.setText("Check In");
        checkintodashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkintodashboardbtnActionPerformed(evt);
            }
        });

        tohomebtn.setText("<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tohomebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prebookcheckbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(prebookdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkintodashboardbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(tohomebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prebookdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prebookcheckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkintodashboardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkintodashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkintodashboardbtnActionPerformed
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkintodashboardbtnActionPerformed

    private void prebookcheckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prebookcheckbtnActionPerformed
        String cmd = "select * from cust_info join record join prebook where cust_info.ID = record.customer_id and prebook.rec_id = record.ID and record.in_date = '"+Dateset()+"' ";
        bookchecktable.setModel(dataret.getbookrecord(fcn(), cmd));
    }//GEN-LAST:event_prebookcheckbtnActionPerformed


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
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookchecktable;
    private javax.swing.JButton checkintodashboardbtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prebookcheckbtn;
    private org.jdesktop.swingx.JXDatePicker prebookdate;
    private javax.swing.JButton tohomebtn;
    // End of variables declaration//GEN-END:variables
}
