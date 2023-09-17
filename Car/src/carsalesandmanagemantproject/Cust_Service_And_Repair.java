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

public class Cust_Service_And_Repair extends javax.swing.JFrame {

    public Cust_Service_And_Repair() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAvailableServices = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShowServiceAndRepairTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblVowcharID = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        txtVowcharID = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblGetTotal = new javax.swing.JLabel();
        lblGetName = new javax.swing.JLabel();
        btnCalculator = new javax.swing.JButton();
        lblConfirmEmail = new javax.swing.JLabel();
        txtConfirmCustomerEmail = new javax.swing.JTextField();
        jComboBox1Quantity = new javax.swing.JComboBox<>();
        lblServiceImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Service And Repair");

        btnAvailableServices.setBackground(java.awt.Color.yellow);
        btnAvailableServices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAvailableServices.setText("Available Services");
        btnAvailableServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableServicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnAvailableServices, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAvailableServices, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tblShowServiceAndRepairTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Service Name", "Quantity", "Per Unit Price", "Vowchar"
            }
        ));
        tblShowServiceAndRepairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowServiceAndRepairTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShowServiceAndRepairTable);

        lblVowcharID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblVowcharID.setText("Vowchar ID");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQuantity.setText("Quantity");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Name");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPrice.setText("Total Price");

        btnOrder.setBackground(java.awt.Color.yellow);
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
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

        lblGetTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblGetName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        btnCalculator.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCalculator.setText("Calculator");
        btnCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatorActionPerformed(evt);
            }
        });

        lblConfirmEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConfirmEmail.setText("Confirm email:");

        jComboBox1Quantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVowcharID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtVowcharID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(lblGetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGetTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConfirmCustomerEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1Quantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculator))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVowcharID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVowcharID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtConfirmCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblServiceImage.setText("jLabel1");
        lblServiceImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblServiceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailableServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableServicesActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tblShowServiceAndRepairTable.getModel();
        tableModel.setRowCount(0);
        try {

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select service_name, quantity, price, vowchar from serve_repair");

            while (myRS.next()) {
                String s_name = myRS.getString("service_name");
                String strQuantity = myRS.getString("quantity");
                String strPrice = myRS.getString("price");
                String vowchar = myRS.getString("vowchar");

                long quantity = Long.valueOf(strQuantity);
                long price = Long.valueOf(strPrice);
                //populate table row with database table "servr_repair" attribute values
                tableModel.addRow(new Object[]{s_name, quantity, price, vowchar});

            }
            //Closing Database Connection
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAvailableServicesActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        try {
            
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            long quantity, unitPrice, inventoryQuantity, totalPrice = 0;
            String strDBQuantity = null, strDBPrice = null, strDBServiceName = null;
            String strTotalPrice = null;
            String vowchar = txtVowcharID.getText();
            String chooseQuantity = jComboBox1Quantity.getSelectedItem().toString();

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select service_name, quantity, price from serve_repair where vowchar = '" + vowchar + "'");

            while (myRS.next()) {
                strDBQuantity = myRS.getString("quantity");
                strDBPrice = myRS.getString("price");
                strDBServiceName = myRS.getString("service_name");

            }

            unitPrice = Long.valueOf(strDBPrice);
            lblGetName.setText(strDBServiceName); // it works 

            quantity = Long.valueOf(chooseQuantity);
            inventoryQuantity = Long.valueOf(strDBQuantity);

            if (quantity <= inventoryQuantity) {
                totalPrice = unitPrice * quantity;
                strTotalPrice = String.valueOf(totalPrice);
                lblGetTotal.setText(strTotalPrice); // it works 
            } else {
                JOptionPane.showMessageDialog(null, " Check quantity !!!");
            }

            myStatement = myConnect.createStatement();
            myRS = myStatement.executeQuery("select vowchar, c_email from OrderService where vowchar = '" + txtVowcharID.getText() + "' and "
                    + "c_email = '" + txtConfirmCustomerEmail.getText() + "'");

            int flag = 0;

            while (myRS.next()) {
                if (myRS.getString(1).equals(txtVowcharID.getText()) && myRS.getString(2).equals(txtConfirmCustomerEmail.getText())) {
                    PreparedStatement myPS = myConnect.prepareStatement("update OrderService set quantityAsk = quantityAsk +" + quantity
                            + ", totalCost = totalCost + " + totalPrice + " where c_email = '" + txtConfirmCustomerEmail.getText() + "' and vowchar = '" + txtVowcharID.getText() + "'");
                    myPS.executeUpdate(); //execute and update
                    JOptionPane.showMessageDialog(null, "Request submitted to admin !!!");
                    flag = 1;
                }
            }
            if (flag == 0) {
                PreparedStatement myPS = myConnect.prepareStatement("insert into OrderService values ('" + txtConfirmCustomerEmail.getText() + "','"
                        + vowchar + "', " + totalPrice + " , " + quantity + " )");
                myPS.executeUpdate(); //execute and update
                JOptionPane.showMessageDialog(null, "Request submitted to admin !!!");
            }

            txtVowcharID.setText("");
            jComboBox1Quantity.setSelectedIndex(0);
            lblGetName.setText("");
            lblGetTotal.setText("");
            txtConfirmCustomerEmail.setText("");
            //Clearing textfield,combobox after executing Query
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatorActionPerformed
        try {

            long quantity, unitPrice, inventoryQuantity, totalPrice;
            String strDBQuantity = null, strDBPrice = null, strDBServiceName = null;
            String strTotalPrice = null;
            String vowchar = txtVowcharID.getText();
            String chooseQuantity = jComboBox1Quantity.getSelectedItem().toString();
            //chooseQuantity is the quantity we choose by using JComboBox
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select service_name, quantity, price from serve_repair where vowchar = '" + vowchar + "'");

            while (myRS.next()) {
                strDBQuantity = myRS.getString("quantity");
                strDBPrice = myRS.getString("price");
                strDBServiceName = myRS.getString("service_name");

            }
            //Price attribute is stored as unit price in database table "serve_repair"
            //In database table price comes as int type, but we need to convert it to
            //Long type for our calculation. That's why Long.valueOf() method
            unitPrice = Long.valueOf(strDBPrice);
            lblGetName.setText(strDBServiceName); // it works 
            //inventoryQuantity is the total quantity of the item
            quantity = Long.valueOf(chooseQuantity);
            inventoryQuantity = Long.valueOf(strDBQuantity);

            if (quantity <= inventoryQuantity) {
                totalPrice = unitPrice * quantity;
                strTotalPrice = String.valueOf(totalPrice);
                lblGetTotal.setText(strTotalPrice); // it works 
            } else {
                JOptionPane.showMessageDialog(null, " Check quantity !!!");
            }
            //Closing database connection
            myRS.close();
            myStatement.close();
            myConnect.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculatorActionPerformed

    private void tblShowServiceAndRepairTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowServiceAndRepairTableMouseClicked
        String upperIndex;
        
        //Populating textfield with mouse click
        int i = tblShowServiceAndRepairTable.getSelectedRow();
        TableModel model = tblShowServiceAndRepairTable.getModel();
        txtVowcharID.setText(model.getValueAt(i, 3).toString());
        upperIndex = model.getValueAt(i, 1).toString();
        Integer loopControlVariable = Integer.parseInt(upperIndex);
        jComboBox1Quantity.removeAllItems();//Befor for loop we empty the jComboBox like sum = 0 bfore doing sum
        for (int j = 1; j <= loopControlVariable; j++) {
            jComboBox1Quantity.addItem(String.valueOf(j));
            //adding number of items in JComboBox equal to the Quantity
        }
        //Dynamic ComboBox
        try {
            String brand = null, price = null, carModel = null;

            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");
            Statement myStatement = myConnect.createStatement();
            ResultSet myRS = myStatement.executeQuery("select ServiceImage from serve_repair where vowchar = '" + model.getValueAt(i, 3).toString() + "'");

            while (myRS.next()) {

                //String destinationLocation = "F:\\CourseReady\\Database\\MD Shafi Project\\CarSalesAndManagemantProject\\Image\\";
                String destinationLocation = "E:\\3-8-21\\Car\\Image2";
                String imgName = myRS.getString(1);
                String imgPath = destinationLocation + imgName;
                try {
                    //Linta madam code to show image in the JLabel
                    BufferedImage img = ImageIO.read(new File(imgPath));
                    ImageIcon convertImage = new ImageIcon(img);
                    Image rawImage = convertImage.getImage();
                    Image scaleImage = rawImage.getScaledInstance(lblServiceImage.getWidth(), lblServiceImage.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon finalImage = new ImageIcon(scaleImage);
                    lblServiceImage.setIcon(finalImage);

                } catch (IOException ex) {

                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_tblShowServiceAndRepairTableMouseClicked

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Customer_Index custIndex = new Customer_Index();
        custIndex.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
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
            java.util.logging.Logger.getLogger(Cust_Service_And_Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cust_Service_And_Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cust_Service_And_Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cust_Service_And_Repair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cust_Service_And_Repair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableServices;
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> jComboBox1Quantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmEmail;
    private javax.swing.JLabel lblGetName;
    private javax.swing.JLabel lblGetTotal;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblServiceImage;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblVowcharID;
    private javax.swing.JTable tblShowServiceAndRepairTable;
    private javax.swing.JTextField txtConfirmCustomerEmail;
    private javax.swing.JTextField txtVowcharID;
    // End of variables declaration//GEN-END:variables
}
