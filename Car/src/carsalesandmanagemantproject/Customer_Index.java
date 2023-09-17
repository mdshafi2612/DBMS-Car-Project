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

public class Customer_Index extends javax.swing.JFrame {

    public static String custEmail;//Instance Variable Declaration
    public static String name, email, address, phone, dateOfBirth, age;

    public Customer_Index() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnNewAdminRequest = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Index");
        setBackground(new java.awt.Color(51, 51, 255));

        btnHome.setBackground(java.awt.Color.yellow);
        btnHome.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDashboard.setBackground(java.awt.Color.yellow);
        btnDashboard.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnDashboard.setText("Account Information");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnNewAdminRequest.setBackground(java.awt.Color.yellow);
        btnNewAdminRequest.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnNewAdminRequest.setText("New Admin Request");
        btnNewAdminRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAdminRequestActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome, ");

        lblCustName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(51, 51, 255));
        lblCustName.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewAdminRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(lblCustName)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewAdminRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCustName))
                .addGap(12, 12, 12)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        Customer_Home customerHome = new Customer_Home();
        customerHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed

        Customer_Dashboard_Test custDash = new Customer_Dashboard_Test();
        custDash.setVisible(true);
        this.dispose();
        try {
            
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select c_name, c_email, address, phone, dateOfBirth, age from customer where c_email = '" + custEmail + "'");

            while (myRS.next()) {
                name = myRS.getString(1);
                email = myRS.getString(2);
                address = myRS.getString(3);
                phone = myRS.getString(4);
                dateOfBirth = myRS.getString(5);
                age = myRS.getString(6);

            }

            Customer_Dashboard_Test.lblDBName.setText(Customer_Index.name);//Passing values from customerIndex jframe to customerDasboardTest jFrame
            Customer_Dashboard_Test.lblDBEmail.setText(Customer_Index.email);
            Customer_Dashboard_Test.lblDBAddress.setText(Customer_Index.address);
            Customer_Dashboard_Test.lblDBPhone.setText(Customer_Index.phone);
            Customer_Dashboard_Test.lblDBDateOfBirth.setText(Customer_Index.dateOfBirth);
            Customer_Dashboard_Test.lblDBAge.setText(Customer_Index.age);

            email = Customer_Dashboard_Test.lblDBEmail.getText();
            custDash.customer_Car(email);

            myRS.close();
            myStatement.close();
            myConnect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnNewAdminRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAdminRequestActionPerformed
        Customer_Admin_Request custAdReq = new Customer_Admin_Request();
        custAdReq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewAdminRequestActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login logOut = new Login();
        logOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNewAdminRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblCustName;
    // End of variables declaration//GEN-END:variables
}
