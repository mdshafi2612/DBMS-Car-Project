package carsalesandmanagemantproject;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class New_Admin_Request extends javax.swing.JFrame {

    public New_Admin_Request() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPendingRequest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowAdminRequestTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblAdminEmail = new javax.swing.JLabel();
        lblCustomerEmail = new javax.swing.JLabel();
        lblTrackingNumber = new javax.swing.JLabel();
        txtAdminEmail = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        txtTrackingNumber = new javax.swing.JTextField();
        btnApproveRequest = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Admin Request");

        btnPendingRequest.setBackground(java.awt.Color.yellow);
        btnPendingRequest.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPendingRequest.setText("Pending Request");
        btnPendingRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnPendingRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnPendingRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tblShowAdminRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cust_Name", "Cust_Email", "Address", "Phone", "Tracking  Number"
            }
        ));
        tblShowAdminRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowAdminRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShowAdminRequestTable);

        lblAdminEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdminEmail.setText("Admin Email");

        lblCustomerEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCustomerEmail.setText("Customer Email");

        lblTrackingNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTrackingNumber.setText("Tracking Number");

        btnApproveRequest.setBackground(java.awt.Color.yellow);
        btnApproveRequest.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnApproveRequest.setText("Approve Request");
        btnApproveRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAdminEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTrackingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdminEmail)
                            .addComponent(txtCustomerEmail)
                            .addComponent(txtTrackingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnApproveRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminEmail))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomerEmail))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTrackingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txtTrackingNumber))
                .addGap(41, 41, 41)
                .addComponent(btnApproveRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        btnDashboard.setBackground(java.awt.Color.yellow);
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(java.awt.Color.yellow);
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Admin_Index dash = new Admin_Index();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPendingRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingRequestActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) tblShowAdminRequestTable.getModel();
        tableModel.setRowCount(0);

        try {

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");


            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select customer.c_name, ProcessNewAdminRequest.c_email, "
                    + "customer.address, customer.phone, ProcessNewAdminRequest.tracking_no, "
                    + "ProcessNewAdminRequest.a_email  from ProcessNewAdminRequest join customer on "
                    + "ProcessNewAdminRequest.c_email = customer.c_email");
            //JOptionPane.showMessageDialog(null, "1");
            while (myRS.next()) {
                String c_name = myRS.getString(1);
                String c_email = myRS.getString(2);
                String address = myRS.getString(3);
                String phone = myRS.getString(4);
                String tracking_no = myRS.getString(5);
                String a_email = myRS.getString(6);
                //JOptionPane.showMessageDialog(null, "2");
                if (null == a_email) {
                    //JOptionPane.showMessageDialog(null, "3");
                    tableModel.addRow(new Object[]{c_name, c_email, address, phone, tracking_no});
                }

            }
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPendingRequestActionPerformed

    private void btnApproveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveRequestActionPerformed
        try {

            String admin_approve_email = txtAdminEmail.getText();
            String c_email = txtCustomerEmail.getText();
            String tracking_no = txtTrackingNumber.getText();
            String a_email = null, c_name = null, address = null, phone = null, password = null, a_dateOfBirth = null, a_Age = null;
            String c_gender = null, c_nationality = null, c_occupation = null, c_socialURL = null;

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            

            Statement myStatement = myConnect.createStatement();

            ResultSet myRS = myStatement.executeQuery("select customer.c_name, ProcessNewAdminRequest.c_email, "
                    + "customer.address, customer.phone, ProcessNewAdminRequest.tracking_no, "
                    + "ProcessNewAdminRequest.a_email, customer.password, customer.dateOfBirth, customer.age  from ProcessNewAdminRequest inner join "
                    + "customer on ProcessNewAdminRequest.c_email = customer.c_email where customer.c_email = '" + c_email + "'");
             
            
            JOptionPane.showMessageDialog(null, "C: "+ c_email +" A:"+ a_email +" ");
            
            

            while (myRS.next()) {
                c_name = myRS.getString(1);
                //c_email = myRS.getString(2);
                address = myRS.getString(3);
                phone = myRS.getString(4);
                a_email = myRS.getString(6);
                password = myRS.getString(7);
                a_dateOfBirth = myRS.getString(8);
                a_Age = myRS.getString(9);
                //c_gender = myRS.getString(10);
                //c_nationality = myRS.getString(11);
                //c_occupation = myRS.getString(12);
                //c_socialURL = myRS.getString(13);

                if (!"".equals(a_email)) {
                    PreparedStatement myPS = myConnect.prepareStatement("update ProcessNewAdminRequest set a_email ="
                            + " '" + admin_approve_email + "' where tracking_no = '" + txtTrackingNumber.getText() + "' and "
                            + "c_email = '" + txtCustomerEmail.getText() + "'"); //executing sql command line. 
                    myPS.executeUpdate(); //execute and update

                    myPS = myConnect.prepareStatement("insert into admin values ('" + c_name + "','" + c_email + "',"
                            + "'" + address + "'," + phone + ",'" + password + "','" + a_dateOfBirth + "'," + Integer.parseInt(a_Age) + ")"); //executing sql command line. 
                    myPS.executeUpdate(); //execute and update

                    myPS.close();
                }
                JOptionPane.showMessageDialog(this, "New Admin created !!!");
                
                
                
                //txtAdminEmail.setText("");
                //txtCustomerEmail.setText("");
                //txtTrackingNumber.setText("");
                //Clearing textfield after executing query
                //myRS.close();
                //myStatement.close();
                //myConnect.close();
            }
            
            JOptionPane.showMessageDialog(null, "C: "+ c_email +" A:"+ a_email +" ");
            
            myRS = myStatement.executeQuery("select customer.c_name, customer.c_email, "
                    + "custotherinfo.gender, custotherinfo.nationality, custotherinfo.occupation, "
                    + "custotherinfo.socialURL from customer inner join custotherinfo on "
                    + "customer.c_email = custotherinfo.c_email where customer.c_email = '" + c_email + "'");
             
            
            JOptionPane.showMessageDialog(null, "C: "+ c_email +" A:"+ a_email +" ");
            
            while (myRS.next()) {
                
                c_email = myRS.getString(2);
                c_gender = myRS.getString(3);
                c_nationality = myRS.getString(4);
                c_occupation = myRS.getString(5);
                c_socialURL = myRS.getString(6);

                if (!"".equals(a_email)) {                    
                    //As null is not equal to empty string, so if condition will be true
                    PreparedStatement myPS = myConnect.prepareStatement("insert into adminotherinfo values ('" + c_email + "','" + c_gender + "',"
                            + "'" + c_nationality + "','" + c_occupation + "','" + c_socialURL + "')"); //executing sql command line. 
                    myPS.executeUpdate(); //execute and update

                    myPS.close();
                }
            }
            txtAdminEmail.setText("");
            txtCustomerEmail.setText("");
            txtTrackingNumber.setText("");
            //Clearing textfield after executing query
            myRS.close();
            myStatement.close();
            myConnect.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + ex, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveRequestActionPerformed

    private void tblShowAdminRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowAdminRequestTableMouseClicked
        int i = tblShowAdminRequestTable.getSelectedRow();
        TableModel model = tblShowAdminRequestTable.getModel();
        txtCustomerEmail.setText(model.getValueAt(i, 1).toString());
        txtTrackingNumber.setText(model.getValueAt(i, 4).toString());
        //Populate textfield from selected rows with mouse click
    }//GEN-LAST:event_tblShowAdminRequestTableMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(New_Admin_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Admin_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Admin_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Admin_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Admin_Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveRequest;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPendingRequest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminEmail;
    private javax.swing.JLabel lblCustomerEmail;
    private javax.swing.JLabel lblTrackingNumber;
    private javax.swing.JTable tblShowAdminRequestTable;
    private javax.swing.JTextField txtAdminEmail;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtTrackingNumber;
    // End of variables declaration//GEN-END:variables
}
