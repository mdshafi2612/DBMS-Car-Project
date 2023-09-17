package carsalesandmanagemantproject;

import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;

public class Customer_Sell_Your_Car extends javax.swing.JFrame {

    public Customer_Sell_Your_Car() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblConfirmEmailAddress = new javax.swing.JLabel();
        txtConfirmEmailAddress = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAvailableCar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSellCar = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblPlateNumberOfSellingCar = new javax.swing.JLabel();
        txtPlateNumberOfSellingCar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblCustEmail = new javax.swing.JLabel();
        btnSellRequest = new javax.swing.JButton();
        lblUpdatedPrice1 = new javax.swing.JLabel();
        txtUpdatedPrice = new javax.swing.JTextField();
        lblConfirmEmail = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblCarImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Sell Your Car");

        lblConfirmEmailAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConfirmEmailAddress.setText("   Confirm Email Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConfirmEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblConfirmEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConfirmEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnAvailableCar.setBackground(java.awt.Color.yellow);
        btnAvailableCar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAvailableCar.setText("Available Car");
        btnAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        tblSellCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cust_Email", "Plate No", "Cust_Name", "Model", "Brand"
            }
        ));
        tblSellCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSellCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSellCar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvailableCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        lblPlateNumberOfSellingCar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPlateNumberOfSellingCar.setText("     Plate Number Of Selling Car");

        lblCustEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCustEmail.setText("Confirm Email");

        btnSellRequest.setBackground(java.awt.Color.yellow);
        btnSellRequest.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSellRequest.setText("Sell Request");
        btnSellRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellRequestActionPerformed(evt);
            }
        });

        lblUpdatedPrice1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUpdatedPrice1.setText("Updated Price");

        lblConfirmEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblConfirmEmail.setForeground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtUpdatedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSellRequest)
                .addGap(60, 60, 60))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lblUpdatedPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(435, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSellRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtUpdatedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblUpdatedPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(83, 83, 83)))
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblCarImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPlateNumberOfSellingCar, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(txtPlateNumberOfSellingCar)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPlateNumberOfSellingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlateNumberOfSellingCar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Customer_Index dash = new Customer_Index();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableCarActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tblSellCar.getModel();
        tableModel.setRowCount(0);
        //Populating ConfirmEmail JLabel with the txtConfirmEmailAddress.getText() value
        //when the AvailableCar button is clicked, this action will be performed
        lblConfirmEmail.setText(txtConfirmEmailAddress.getText());

        try {

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select customer.c_email, own.plate_no, customer.c_name, own.model, own.brand from customer inner join own " + "on customer.c_email = own.c_email where customer.c_email ='" + txtConfirmEmailAddress.getText() + "'");

            while (myRS.next()) {

                String plate_no = myRS.getString("plate_no");
                String brand = myRS.getString("brand");
                String model = myRS.getString("model");
                String c_name = myRS.getString("c_name");
                String c_email = myRS.getString("c_email");
                //populate table row with database joinedtables "customer" and "own" attributes
                tableModel.addRow(new Object[]{c_email, plate_no, c_name, model, brand});

            }
            //Closing Database Connection
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAvailableCarActionPerformed

    private void btnSellRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellRequestActionPerformed
        try {
            
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            String c_email = txtConfirmEmailAddress.getText();
            String plate_no = txtPlateNumberOfSellingCar.getText();
            String price = txtUpdatedPrice.getText();
            long numPrice = Long.valueOf(price);
            JOptionPane.showMessageDialog(null, "Request has been send to admin for further processing... ");
            PreparedStatement myPS = myConnect.prepareStatement("insert into sell_cust_car values ('" + c_email + "','" + txtPlateNumberOfSellingCar.getText() + "'," + numPrice + ")");
            JOptionPane.showMessageDialog(null, "Request pending... ");
            myPS.executeUpdate(); //execute and update
            JOptionPane.showMessageDialog(null, "Request executed !!! ");
            txtPlateNumberOfSellingCar.setText("");
            txtUpdatedPrice.setText("");
            lblConfirmEmail.setText("");
            //Clearing textfield after executing query
            myPS.close();
            myConnect.close();
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_btnSellRequestActionPerformed

    private void tblSellCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSellCarMouseClicked
        int i = tblSellCar.getSelectedRow();
        TableModel model = tblSellCar.getModel();
        //Populating PlateNumberOfSellingCar textField with Table column "Plate_no" value
        txtPlateNumberOfSellingCar.setText(model.getValueAt(i, 1).toString());
        try {
            String brand = null, price = null, carModel = null;

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select brand, model, CarImage from customer inner join own on "
                    + "customer.c_email = own.c_email where own.c_email = '" + txtConfirmEmailAddress.getText()
                    + "' and plate_no ='" + txtPlateNumberOfSellingCar.getText() + "'");

            while (myRS.next()) {
                brand = myRS.getString("Brand");
                carModel = myRS.getString("Model");
                //Linta madam code for image view on JLabel
                byte[] imageByte = myRS.getBytes("CarImage");
                ImageIcon convertImage = new ImageIcon(imageByte);
                Image rawImage = convertImage.getImage();
                Image scaleImage = rawImage.getScaledInstance(lblCarImage.getWidth(), lblCarImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finalImage = new ImageIcon(scaleImage);
                lblCarImage.setIcon(finalImage);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblSellCarMouseClicked

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
            java.util.logging.Logger.getLogger(Customer_Sell_Your_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Sell_Your_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Sell_Your_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Sell_Your_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Sell_Your_Car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableCar;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSellRequest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarImage;
    private javax.swing.JLabel lblConfirmEmail;
    private javax.swing.JLabel lblConfirmEmailAddress;
    private javax.swing.JLabel lblCustEmail;
    private javax.swing.JLabel lblPlateNumberOfSellingCar;
    private javax.swing.JLabel lblUpdatedPrice1;
    private javax.swing.JTable tblSellCar;
    private javax.swing.JTextField txtConfirmEmailAddress;
    private javax.swing.JTextField txtPlateNumberOfSellingCar;
    private javax.swing.JTextField txtUpdatedPrice;
    // End of variables declaration//GEN-END:variables
}
