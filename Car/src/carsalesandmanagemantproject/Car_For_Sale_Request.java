/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsalesandmanagemantproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Md Porom
 */
public class Car_For_Sale_Request extends JFrame{
    private Container c;
    private JButton btnPendingRequest;
    private JButton btnApproveRequest;
    private Font f;
    private JTable tb1,tb2,tb3;
    private JScrollPane scroll,scroll2,scroll3;
    private JLabel lbl1;
    private JLabel lbl2,lbl3, lbl4,lbl5;
    private JTextField txtCustEmail,txtAdminEmail,txtPlateNo;
    
    private String[] cols = {"plate","Brand","Model","Owner","Price","Cust_Name","Cust_Email","Cust_Address"};
    private String[][] rows ={ {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null}};
    
        private String[] cols2 = {"Cust_Email","Cust_Name","New Owner","Admin_Email"};
    private String[][] rows2 ={ {null,null,null,null},
                               {null,null,null,null},
                               {null,null,null,null},
                               {null,null,null,null}};
    
     private String[] cols3 = {"Cust_Email","Cust_Name","Plate No","Model","Brand","Owner"};
    private String[][] rows3 ={ {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null},
                               {null,null,null,null,null,null,null,null}};
    
    Car_For_Sale_Request(){
        initComponents();
    }
    private void btnPendingRequestActionPerformed(java.awt.event.ActionEvent e){
        //System.out.println("Looopmi");
    }
    private void btnApprovedRequestActionPerformed(java.awt.event.ActionEvent e){
        
    }
    
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        
        f = new Font("Tahoma",Font.BOLD,24);
        
        btnApproveRequest = new JButton("Approve"
                + "Request");
        btnApproveRequest.setBounds(560, 230, 300, 50);
        btnApproveRequest.setBackground(Color.YELLOW);
        btnApproveRequest.setFont(f);
        c.add(btnApproveRequest);
        
        tb1 = new JTable(rows,cols);
        scroll = new JScrollPane(tb1);
        scroll.setBounds(50, 100, 700, 86);
        c.add(scroll);
        
        
        btnPendingRequest = new JButton("Pending Request");
        btnPendingRequest.setBounds(250, 20, 350, 50);
        btnPendingRequest.setFont(f);
        btnPendingRequest.setBackground(Color.YELLOW);
        c.add(btnPendingRequest);
        
        lbl1 = new JLabel();
        lbl1.setText("Customer Email");
        lbl1.setBounds(50, 160, 200, 100);
        lbl1.setFont(f);
        c.add(lbl1);
        
        lbl2 = new JLabel();
        lbl2.setText("Admin Email");
        lbl2.setBounds(50, 200, 200, 100);
        lbl2.setFont(f);
        c.add(lbl2);
        
        lbl3 = new JLabel();
        lbl3.setText("Plate No");
        lbl3.setBounds(50, 240, 200, 100);
        lbl3.setFont(f);
        c.add(lbl3);
        
        txtCustEmail = new JTextField();
        txtCustEmail.setBounds(260, 200, 250, 20);
        c.add(txtCustEmail);
        
        txtAdminEmail = new JTextField();
        txtAdminEmail.setBounds(260, 240, 250, 20);
        c.add(txtAdminEmail);
        
        txtPlateNo = new JTextField();
        txtPlateNo.setBounds(260, 280, 250, 20);
        c.add(txtPlateNo);
        
         lbl4 = new JLabel();
        lbl4.setText("Admin Information Who Has Processed This Request");
        lbl4.setBounds(50, 275, 800, 100);
        lbl4.setFont(f);
        c.add(lbl4);
        
        tb2 = new JTable(rows2,cols2);
        scroll2 = new JScrollPane(tb2);
        scroll2.setBounds(50, 360, 700, 86);
        c.add(scroll2);
        
        lbl5 = new JLabel();
        lbl5.setText("Updated Car Ownership Information For Customers");
        lbl5.setBounds(50, 420, 800, 100);
        lbl5.setFont(f);
        c.add(lbl5);
        
        tb3 = new JTable(rows3,cols3);
        scroll3 = new JScrollPane(tb3);
        scroll3.setBounds(50, 500, 700, 86);
        c.add(scroll3);
        
        
            
        
        
    
}
    public static void main(String[] args) {
        Car_For_Sale_Request frame = new Car_For_Sale_Request();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(50, 80, 900, 630);
    }
}
