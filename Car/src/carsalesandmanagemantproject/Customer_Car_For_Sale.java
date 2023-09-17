package carsalesandmanagemantproject;

import java.awt.Image;
import java.io.*;
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
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Customer_Car_For_Sale extends javax.swing.JFrame {

    DefaultTableModel model;

    public Customer_Car_For_Sale() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ShowCustomerCarInformation = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblModel = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        txtPlateNo = new javax.swing.JTextField();
        btnBuyOrOrder = new javax.swing.JButton();
        lblDBPrice = new javax.swing.JLabel();
        lblTotalPrice1 = new javax.swing.JLabel();
        lblDBModel = new javax.swing.JLabel();
        lblDBBrand = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCustEmail = new javax.swing.JTextField();
        btnLoadCarTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblCarImage = new javax.swing.JLabel();
        lblsearchstring = new javax.swing.JLabel();
        txtsearchstring = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsearchprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Car For Sale");

        ShowCustomerCarInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Plate No,", "Brand", "Model", "Ownership", "Price"
            }
        ));
        ShowCustomerCarInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowCustomerCarInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShowCustomerCarInformation);

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblModel.setText("Plate No:");

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPrice.setText("Price");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPrice.setText("Model");

        btnBuyOrOrder.setBackground(java.awt.Color.yellow);
        btnBuyOrOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuyOrOrder.setText("Buy");
        btnBuyOrOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyOrOrderActionPerformed(evt);
            }
        });

        lblDBPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDBPrice.setForeground(new java.awt.Color(102, 102, 255));

        lblTotalPrice1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPrice1.setText("Brand");

        lblDBModel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDBModel.setForeground(new java.awt.Color(255, 102, 102));

        lblDBBrand.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDBBrand.setForeground(new java.awt.Color(0, 204, 0));

        btnCheck.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Confirm email to buy..");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblModel, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDBPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDBModel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(lblDBBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)))
                    .addComponent(btnBuyOrOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDBPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDBModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuyOrOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPrice1)
                    .addComponent(lblDBBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnLoadCarTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoadCarTable.setText("Show All Cars");
        btnLoadCarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCarTableActionPerformed(evt);
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

        btnLogOut.setBackground(java.awt.Color.yellow);
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        lblCarImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCarImage, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        lblsearchstring.setBackground(new java.awt.Color(255, 255, 102));
        lblsearchstring.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblsearchstring.setText("Enter Search String :");

        txtsearchstring.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchstringKeyReleased(evt);
            }
        });

        jLabel2.setText("Enter Price Range (Max.):");

        txtsearchprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchpriceKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLoadCarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblsearchstring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsearchstring, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtsearchprice, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnLoadCarTable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsearchstring, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsearchstring, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtsearchprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadCarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCarTableActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) ShowCustomerCarInformation.getModel();
        tableModel.setRowCount(0);
        try {

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            Statement myStatement = myConnect.createStatement();
            //Storing "car" table information in the ResultSet myRS
            ResultSet myRS = myStatement.executeQuery("select * from car");

            while (myRS.next()) {
                String pltNo = myRS.getString("plate_no");
                String brand = myRS.getString("Brand");
                String model = myRS.getString("Model");
                String owner = myRS.getString("Owner");
                String price = myRS.getString("price");
                //populate table row with database table "car" attributes
                tableModel.addRow(new Object[]{pltNo, brand, model, owner, price});
            }
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadCarTableActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login logOut = new Login();
        logOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Customer_Index dash = new Customer_Index();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        try {
            String brand = null, model = null, price = null;

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db"); // DB connection string
            Statement myStatement = myConnect.createStatement();
            // Writing sql statement
            ResultSet myRS = myStatement.executeQuery("select brand, model, price, CarImage from car where plate_no = '" + txtPlateNo.getText() + "'");
            // Fetching values from sql statements
            while (myRS.next()) {
                brand = myRS.getString("Brand");
                model = myRS.getString("Model");
                price = myRS.getString("price");
                byte[] imageByte = myRS.getBytes("CarImage");
                ImageIcon convertImage = new ImageIcon(imageByte);
                Image rawImage = convertImage.getImage();
                Image scaleImage = rawImage.getScaledInstance(lblCarImage.getWidth(), lblCarImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finalImage = new ImageIcon(scaleImage);
                lblCarImage.setIcon(finalImage);
                lblDBBrand.setText(String.valueOf(brand));
                lblDBModel.setText(String.valueOf(model));
                lblDBPrice.setText(String.valueOf(price));
                //As brand, model, price are "VARCHAR" in database, we need to convert it
                //to String type using String.valueOf() method

            }
            //Closing the database connection
            myRS.close();
            myStatement.close();
            myConnect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE); // Show 
            // Same exception handling command
            //JOptionPane.showMessageDialog(null, "SQLException:\n" + e.toString(), "Error: ", JOptionPane.ERROR_MESSAGE); 
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
            // Explains about type of exception
        }

    }//GEN-LAST:event_btnCheckActionPerformed
    public void search(String str) {
        model = (DefaultTableModel) ShowCustomerCarInformation.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        ShowCustomerCarInformation.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));

    }
    private void btnBuyOrOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyOrOrderActionPerformed
        try {

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            PreparedStatement myPS = myConnect.prepareStatement("insert into buy_cust_car values ('" + txtCustEmail.getText() + "','" + txtPlateNo.getText() + "')"); //executing sql command line. 
            myPS.executeUpdate(); //execute and update

            JOptionPane.showMessageDialog(this, "Request send !!!");
            txtPlateNo.setText(null);
            lblDBPrice.setText("");
            lblDBModel.setText("");
            lblDBBrand.setText("");

            myPS.close();
            myConnect.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + ex, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuyOrOrderActionPerformed

    private void ShowCustomerCarInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowCustomerCarInformationMouseClicked
        int i = ShowCustomerCarInformation.getSelectedRow();
        TableModel model = ShowCustomerCarInformation.getModel();
        //Populate the Plate No textfield with table column plate_no value
        txtPlateNo.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_ShowCustomerCarInformationMouseClicked

    private void txtsearchstringKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchstringKeyReleased
        String searchString = txtsearchstring.getText();
        search(searchString);


    }//GEN-LAST:event_txtsearchstringKeyReleased

    private void txtsearchpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchpriceKeyReleased
        DefaultTableModel tableModel = (DefaultTableModel) ShowCustomerCarInformation.getModel();
        tableModel.setRowCount(0);

        try {

            
            String searchString = txtsearchprice.getText();
            //JOptionPane.showMessageDialog(null, "SQLException:\n" + searchString);
            Integer unitPrice = Integer.valueOf(searchString);
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db"); // DB connection string
            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select * from car where price<=" + unitPrice);
            while (myRS.next()) {
                String pltNo = myRS.getString("plate_no");
                String brand = myRS.getString("Brand");
                String model = myRS.getString("Model");
                String owner = myRS.getString("Owner");
                String price = myRS.getString("price");
                //populate table row with database table "car" attributes
                tableModel.addRow(new Object[]{pltNo, brand, model, owner, price});
            }
            myRS.close();
            myStatement.close();
            myConnect.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + ex, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtsearchpriceKeyReleased

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
            java.util.logging.Logger.getLogger(Customer_Car_For_Sale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Car_For_Sale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Car_For_Sale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Car_For_Sale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Car_For_Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShowCustomerCarInformation;
    private javax.swing.JButton btnBuyOrOrder;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLoadCarTable;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarImage;
    private javax.swing.JLabel lblDBBrand;
    private javax.swing.JLabel lblDBModel;
    private javax.swing.JLabel lblDBPrice;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPrice1;
    private javax.swing.JLabel lblsearchstring;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtPlateNo;
    private javax.swing.JTextField txtsearchprice;
    private javax.swing.JTextField txtsearchstring;
    // End of variables declaration//GEN-END:variables
}
