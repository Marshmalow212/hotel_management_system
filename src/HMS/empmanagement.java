package HMS;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class empmanagement extends javax.swing.JFrame {

   
    public empmanagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableupdate();
    }
    
    Connection con;
    PreparedStatement pst; 
    public void connect(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
        } 
        catch (SQLException ex){
         Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        empname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empaddrs = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        empphone = new javax.swing.JTextField();
        empnid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        empmgmtsubmitbtn = new javax.swing.JButton();
        emppicupld = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        empmgmtdeletetbtn = new javax.swing.JButton();
        empmgmtupdatebtn = new javax.swing.JButton();
        emppic = new javax.swing.JLabel();
        empemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        empname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");

        empaddrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaddrsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Phone");

        empphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empphoneActionPerformed(evt);
            }
        });

        empnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnidActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("NID");

        empmgmtsubmitbtn.setBackground(new java.awt.Color(51, 0, 153));
        empmgmtsubmitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empmgmtsubmitbtn.setForeground(new java.awt.Color(255, 255, 255));
        empmgmtsubmitbtn.setText("Add");
        empmgmtsubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empmgmtsubmitbtnActionPerformed(evt);
            }
        });

        emppicupld.setBackground(new java.awt.Color(51, 0, 153));
        emppicupld.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emppicupld.setForeground(new java.awt.Color(255, 255, 255));
        emppicupld.setText("Upload");
        emppicupld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppicupldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        empmgmtdeletetbtn.setBackground(new java.awt.Color(51, 0, 153));
        empmgmtdeletetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empmgmtdeletetbtn.setForeground(new java.awt.Color(255, 255, 255));
        empmgmtdeletetbtn.setText("Delete");
        empmgmtdeletetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empmgmtdeletetbtnActionPerformed(evt);
            }
        });

        empmgmtupdatebtn.setBackground(new java.awt.Color(51, 0, 153));
        empmgmtupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empmgmtupdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        empmgmtupdatebtn.setText("Update");
        empmgmtupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empmgmtupdatebtnActionPerformed(evt);
            }
        });

        emppic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        empemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empemailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 153));
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(empname))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(empnid, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(emppic, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(emppicupld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(empphone))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(empaddrs))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(empemail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(empmgmtsubmitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empmgmtupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empmgmtdeletetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emppic, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emppicupld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empaddrs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empnid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empmgmtsubmitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empmgmtupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empmgmtdeletetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Name", "Email", "Address", "Phone", "Nid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnameActionPerformed

    private void empaddrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaddrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empaddrsActionPerformed

    private void empphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empphoneActionPerformed

    private void empnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnidActionPerformed

    private void tableupdate() {                                         
        // TODO add your handling code here:               
        try {
               con=DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
               pst = con.prepareStatement("select * from employee");
               DefaultTableModel df=(DefaultTableModel) table.getModel();
               ResultSet rs=pst.executeQuery();
              
               df.setRowCount(0);
               while(rs.next()){
                   Object o[]={
                       rs.getString("ID"),
                       rs.getString("Name"),
                       rs.getString("Email"),
                       rs.getString("Address"),
                       rs.getString("Phone"),
                       rs.getString("nid")
                   };
                    df.addRow(o);
               }
               con.close();
        } catch (SQLException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void empmgmtsubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empmgmtsubmitbtnActionPerformed
        String name=empname.getText();
        String email=empemail.getText();
        String address=empaddrs.getText();
        String phone=empphone.getText();
        String nid=empnid.getText();
        
        try {
               con = DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
               pst = con.prepareStatement("insert into employee (Name,Email,Address,Phone,nid,image) values (?,?,?,?,?,?)");
               pst.setString(1,name);
               pst.setString(2,email);
               pst.setString(3,address);
               pst.setString(4,phone);
               pst.setString(5,nid);
               pst.setBytes(6,img);
               pst.execute();
               empname.setText("");
               empemail.setText("");
               empaddrs.setText(" ");
               empphone.setText("");
               empnid.setText(" ");
               emppic.setIcon(null);
               con.close();
               JOptionPane.showMessageDialog(this, "Information Added");
               tableupdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_empmgmtsubmitbtnActionPerformed

    String filename=null;
    byte[] img=null;
    private void emppicupldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppicupldActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(emppic.getWidth(),emppic.getHeight(),Image.SCALE_SMOOTH));
        emppic.setIcon(imageIcon);
        
        try{
            File image = new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buff=new byte[1024];
            
            for(int i;(i=fis.read(buff))!=-1;){
                bos.write(buff,0,i);
            }
            img=bos.toByteArray();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_emppicupldActionPerformed

    private void empmgmtdeletetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empmgmtdeletetbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df3 =(DefaultTableModel) table.getModel();
        int k=table.getSelectedRow();
        String id =df3.getValueAt(k,0).toString();
        
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
            pst=con.prepareStatement("delete from employee where id=?");
            pst.setString(1,id);
            pst.execute();
            empname.setText("");
            empemail.setText("");
            empaddrs.setText("");
            empphone.setText("");
            empnid.setText("");
            emppic.setIcon(null);
            con.close();
            JOptionPane.showMessageDialog(this, " Deleted ");
            tableupdate();
        }catch (SQLException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_empmgmtdeletetbtnActionPerformed


    private void empmgmtupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empmgmtupdatebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel) table.getModel();
        int j=table.getSelectedRow();
        String id =df.getValueAt(j,0).toString();
        String name=empname.getText();
        String email=empemail.getText();
        String address=empaddrs.getText();
        String phone=empphone.getText();
        String nid=empnid.getText();
         
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
            pst = con.prepareStatement("UPDATE `employee` SET `Name`=?,`Email`=?,`Address`=?,`Phone`=?,`nid`=?,`image`=? WHERE `id`=?");
            pst.setString(1,name);
            pst.setString(2,email);
            pst.setString(3,address);
            pst.setString(4,phone);
            pst.setString(5,nid);
            pst.setBytes(6,img);
            pst.setString(7,id);
            pst.execute();
            empname.setText("");
            empemail.setText("");
            empaddrs.setText(" ");
            empphone.setText("");
            empnid.setText(" ");
            emppic.setIcon(null);
            con.close();
            tableupdate();
            JOptionPane.showMessageDialog(this, " Updated ");
        }catch (SQLException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_empmgmtupdatebtnActionPerformed

    private void empemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empemailActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        admin ad=new admin();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dfl =(DefaultTableModel) table.getModel();
        int selectedindex=table.getSelectedRow();
        empname.setText(dfl.getValueAt(selectedindex,1).toString());
        empemail.setText(dfl.getValueAt(selectedindex,2).toString());
        empaddrs.setText(dfl.getValueAt(selectedindex,3).toString());
        empphone.setText(dfl.getValueAt(selectedindex,4).toString());
        empnid.setText(dfl.getValueAt(selectedindex,5).toString());
        
        String id=dfl.getValueAt(selectedindex,0).toString();
        try {
               con = DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
               pst = con.prepareStatement("select * from employee where id=?");
               pst.setString(1,id);
               ResultSet rs=pst.executeQuery();
               while(rs.next()){
                   byte[] imggg=rs.getBytes("image");
                   ImageIcon imageIcon=new ImageIcon(new ImageIcon(imggg).getImage().getScaledInstance(emppic.getWidth(),emppic.getHeight(),Image.SCALE_SMOOTH));
                   emppic.setIcon(imageIcon);
               }
               con.close();
        } catch (SQLException ex) {
            Logger.getLogger(empmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableMouseClicked

   
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
            java.util.logging.Logger.getLogger(empmanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empmanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empmanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empmanagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empmanagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField empaddrs;
    private javax.swing.JTextField empemail;
    private javax.swing.JButton empmgmtdeletetbtn;
    private javax.swing.JButton empmgmtsubmitbtn;
    private javax.swing.JButton empmgmtupdatebtn;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField empnid;
    private javax.swing.JTextField empphone;
    private javax.swing.JLabel emppic;
    private javax.swing.JButton emppicupld;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
