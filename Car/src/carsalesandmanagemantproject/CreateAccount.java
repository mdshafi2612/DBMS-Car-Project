package carsalesandmanagemantproject;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateAccount extends javax.swing.JFrame {

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblResetPassword = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmailNo = new javax.swing.JTextField();
        pfRetypePassword = new javax.swing.JPasswordField();
        txtMobileNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lblAge = new javax.swing.JLabel();
        lblDateOfBirth1 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        lblOccupation = new javax.swing.JLabel();
        comboOccupation = new javax.swing.JComboBox<>();
        lblNationality = new javax.swing.JLabel();
        checkBoxBangladeshi = new javax.swing.JCheckBox();
        checkBoxOthers = new javax.swing.JCheckBox();
        lblFacbookInfo = new javax.swing.JLabel();
        comboSocialMedia = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");

        jPanel1.setBackground(java.awt.Color.white);

        lblName.setBackground(new java.awt.Color(255, 0, 239));
        lblName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblName.setText("Name :");

        lblEmail.setBackground(new java.awt.Color(255, 0, 237));
        lblEmail.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblEmail.setText("Email No :");

        lblPassword.setBackground(new java.awt.Color(255, 0, 212));
        lblPassword.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPassword.setText("Password :");

        lblResetPassword.setBackground(new java.awt.Color(255, 0, 239));
        lblResetPassword.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblResetPassword.setText("Retype Password :");

        lblMobileNo.setBackground(new java.awt.Color(255, 0, 214));
        lblMobileNo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblMobileNo.setText("Mobile No :");

        lblAddress.setBackground(new java.awt.Color(255, 0, 211));
        lblAddress.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblAddress.setText("Address :");

        lblDateOfBirth.setBackground(new java.awt.Color(255, 0, 225));
        lblDateOfBirth.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDateOfBirth.setText("Date Of Birth :");

        dateChooser.setFont(new java.awt.Font("Tahoma", 0, 18));

        lblAge.setBackground(new java.awt.Color(255, 0, 0));
        lblAge.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblDateOfBirth1.setBackground(new java.awt.Color(255, 0, 225));
        lblDateOfBirth1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDateOfBirth1.setText("Age :");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGender.setText(" Gender :");

        buttonGroup1.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnFemale.setText("Female");

        lblOccupation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOccupation.setText("Occupation :");

        comboOccupation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher", "Bank Officer", "Medical Officer", "Software Engineer", "Hardware Engineer", "Doctor", "Sports Person", "Others" }));

        lblNationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNationality.setText("Nationality :");

        checkBoxBangladeshi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxBangladeshi.setText("Bangladeshi");

        checkBoxOthers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxOthers.setText("Others");

        lblFacbookInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFacbookInfo.setText("Social Media :");

        comboSocialMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboSocialMedia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facebook", "Instagram", "Twitter", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailNo, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDateOfBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfRetypePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBoxBangladeshi)
                                .addGap(10, 10, 10)
                                .addComponent(checkBoxOthers)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFacbookInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboSocialMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnMale)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnFemale)
                                .addGap(18, 18, 18)
                                .addComponent(lblOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(comboOccupation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnMale, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(rbtnFemale))
                    .addComponent(lblOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboOccupation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNationality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBoxBangladeshi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(checkBoxOthers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFacbookInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboSocialMedia)
                        .addGap(2, 2, 2)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        btnSignUp.setBackground(new java.awt.Color(255, 238, 0));
        btnSignUp.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jButton1.setBackground(java.awt.Color.yellow);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        try {
            
            Connection myConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
            //Connection myConnect = DriverManager.getConnection("jdbc:sqlite:Car.db");

            String p = pfPassword.getText();
            String rP = pfRetypePassword.getText();
            String gender = null, nationality = "", occupation = null, socialURL = null;

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(dateChooser.getDate());
            String[] dob = date.split("-");
            int year = Integer.parseInt(dob[0]);
            int month = Integer.parseInt(dob[1]);
            int day = Integer.parseInt(dob[2]);

            LocalDate selectedDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            int resultYear = Period.between(selectedDate, currentDate).getYears();
            int resultMonth = Period.between(selectedDate, currentDate).getMonths();
            int resultDays = Period.between(selectedDate, currentDate).getDays();

            lblAge.setText(String.valueOf(resultYear) + " Years " + String.valueOf(resultMonth)
                    + " Months " + String.valueOf(resultDays) + " Days");

            JOptionPane.showMessageDialog(btnSignUp, dateChooser.getCalendar().getTime());

            if (p.equals(rP)) {

                PreparedStatement myPS = myConnect.prepareStatement("insert into customer "
                        + "(c_name, c_email, address, phone, password, dateofBirth, age) values "
                        + "('" + txtName.getText() + "','" + txtEmailNo.getText() + "','"
                        + txtAddress.getText() + "','" + txtMobileNo.getText() + "','"
                        + pfPassword.getText() + "','" + date + "'," + resultYear + ")"); //executing sql command line. 

                myPS.executeUpdate(); //execute and update

                PreparedStatement myPS1 = myConnect.prepareStatement("insert into custOtherInfo values (?,?,?,?,?)"); //executing sql command line. 
                myPS1.setString(1, txtEmailNo.getText());

                if (rbtnMale.isSelected()) { // For radio button
                    gender = "Male";
                }
                if (rbtnFemale.isSelected()) {
                    gender = "Female";
                }
                myPS1.setString(2, gender);

                if (checkBoxBangladeshi.isSelected()) // For checkbox
                {
                    nationality += checkBoxBangladeshi.getText() + " ";
                }
                if (checkBoxOthers.isSelected()) {
                    nationality += checkBoxOthers.getText() + " ";
                }
                myPS1.setString(3, nationality); //For combobox
                occupation = comboOccupation.getSelectedItem().toString();
                myPS1.setString(4, occupation);

                socialURL = comboSocialMedia.getSelectedItem().toString();
                myPS1.setString(5, socialURL);
                myPS1.executeUpdate(); //execute and update

                JOptionPane.showMessageDialog(this, "New customer account created");
                txtName.setText("");
                txtEmailNo.setText("");
                pfPassword.setText("");
                pfRetypePassword.setText("");
                txtMobileNo.setText("");
                txtAddress.setText("");
                dateChooser.setCalendar(null);
                buttonGroup1.clearSelection();
                buttonGroup1.clearSelection();
                checkBoxBangladeshi.setSelected(false);
                checkBoxOthers.setSelected(false);
                comboSocialMedia.setSelectedIndex(0);
                //Clearing TextField after query execution
                RootTest root = new RootTest();
                root.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password and retype password didn't match !!!");
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RootTest home = new RootTest();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed

    }//GEN-LAST:event_rbtnMaleActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxBangladeshi;
    private javax.swing.JCheckBox checkBoxOthers;
    private javax.swing.JComboBox<String> comboOccupation;
    private javax.swing.JComboBox<String> comboSocialMedia;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDateOfBirth1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFacbookInfo;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblResetPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPasswordField pfRetypePassword;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmailNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
