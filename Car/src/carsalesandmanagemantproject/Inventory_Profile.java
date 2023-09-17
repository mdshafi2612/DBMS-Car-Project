package carsalesandmanagemantproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;

public class Inventory_Profile extends javax.swing.JFrame {

    public Inventory_Profile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnShowCustomerInformation = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowCarInfo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnShowServiceAndRepairInfo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblShowServiceAndRepairInfo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        lblShowCarImage = new javax.swing.JLabel();
        lblShowServiceImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Profile");

        btnShowCustomerInformation.setBackground(java.awt.Color.yellow);
        btnShowCustomerInformation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnShowCustomerInformation.setText("Show Car Information");
        btnShowCustomerInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCustomerInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnShowCustomerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnShowCustomerInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        tblShowCarInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Plate no", "Brand", "Model", "Owner", "Price"
            }
        ));
        tblShowCarInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowCarInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShowCarInfo);

        btnShowServiceAndRepairInfo.setBackground(java.awt.Color.yellow);
        btnShowServiceAndRepairInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnShowServiceAndRepairInfo.setText("Show Service And Repair Information");
        btnShowServiceAndRepairInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowServiceAndRepairInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnShowServiceAndRepairInfo)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnShowServiceAndRepairInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tblShowServiceAndRepairInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Service Name", "Quantity", "Price", "Vowchar"
            }
        ));
        tblShowServiceAndRepairInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowServiceAndRepairInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblShowServiceAndRepairInfo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogOut.setBackground(java.awt.Color.yellow);
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnDashboard.setBackground(java.awt.Color.yellow);
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        lblShowCarImage.setText("jLabel1");
        lblShowCarImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblShowServiceImage.setText("jLabel2");
        lblShowServiceImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowServiceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblShowCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblShowServiceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Admin_Index adDash = new Admin_Index();
        adDash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnShowCustomerInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCustomerInformationActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) tblShowCarInfo.getModel();
        tableModel.setRowCount(0);

        try {

            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            
            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select * from car");

            while (myRS.next()) {
                String pltNo = myRS.getString("plate_no");
                String brand = myRS.getString("Brand");
                String model = myRS.getString("Model");
                String owner = myRS.getString("Owner");
                String price = myRS.getString("price");

                tableModel.addRow(new Object[]{pltNo, brand, model, owner, price});

            }
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowCustomerInformationActionPerformed

    private void btnShowServiceAndRepairInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowServiceAndRepairInfoActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) tblShowServiceAndRepairInfo.getModel();
        tableModel.setRowCount(0);

        try {

            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            
            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select * from serve_repair");

            while (myRS.next()) {
                String service_name = myRS.getString("service_name");
                String quantity = myRS.getString("quantity");
                String price = myRS.getString("price");
                String vowchar = myRS.getString("vowchar");

                tableModel.addRow(new Object[]{service_name, quantity, price, vowchar});

            }
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowServiceAndRepairInfoActionPerformed

    private void tblShowCarInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowCarInfoMouseClicked
        int i = tblShowCarInfo.getSelectedRow();
        TableModel model = tblShowCarInfo.getModel();
        //Populating textfield with mose click
        try {
            String brand = null, price = null, carModel = null;

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select CarImage from car where car.plate_no = '" + model.getValueAt(i, 0).toString() + "'");

            while (myRS.next()) {

                byte[] imageByte = myRS.getBytes("CarImage");
                ImageIcon convertImage = new ImageIcon(imageByte);
                Image rawImage = convertImage.getImage();
                Image scaleImage = rawImage.getScaledInstance(lblShowCarImage.getWidth(), lblShowCarImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finalImage = new ImageIcon(scaleImage);
                lblShowCarImage.setIcon(finalImage);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblShowCarInfoMouseClicked

    private void tblShowServiceAndRepairInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowServiceAndRepairInfoMouseClicked
        int i = tblShowServiceAndRepairInfo.getSelectedRow();
        TableModel model = tblShowServiceAndRepairInfo.getModel();
        //Populating textfield with mose click
        try {
            String brand = null, price = null, carModel = null;

            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            
            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select ServiceImage from serve_repair where vowchar = '" + model.getValueAt(i, 3).toString() + "'");

            while (myRS.next()) {

                //String destinationLocation = "F:\\CourseReady\\Database\\MD Shafi Project\\CarSalesAndManagemantProject\\Image\\";
                String destinationLocation = "E:\\3-8-21\\Car\\Image2";
                String imgName = myRS.getString(1);
                String imgPath = destinationLocation + imgName;
                try {
                    BufferedImage img = ImageIO.read(new File(imgPath));
                    ImageIcon convertImage = new ImageIcon(img);
                    Image rawImage = convertImage.getImage();
                    Image scaleImage = rawImage.getScaledInstance(lblShowServiceImage.getWidth(), lblShowServiceImage.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon finalImage = new ImageIcon(scaleImage);
                    lblShowServiceImage.setIcon(finalImage);

                } catch (IOException ex) {

                }

            }
        } catch (SQLException e) {
            //Logger.getLogger(database1jframe.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_tblShowServiceAndRepairInfoMouseClicked

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
            java.util.logging.Logger.getLogger(Inventory_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnShowCustomerInformation;
    private javax.swing.JButton btnShowServiceAndRepairInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblShowCarImage;
    private javax.swing.JLabel lblShowServiceImage;
    private javax.swing.JTable tblShowCarInfo;
    private javax.swing.JTable tblShowServiceAndRepairInfo;
    // End of variables declaration//GEN-END:variables
}
