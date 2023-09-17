package carsalesandmanagemantproject;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyQueryAdmin {

    //String aemail = String.valueOf("");
    String email = Admin_Profile_Test.lblDBEmail.getText();
    
    //String aemail = String.valueOf(Admin_Profile_Test.adminEmail);
    //JOptionPane.showMessageDialog(null, "email " + email + "\naemail " + aemail);
    //aemail = String.valueOf(Admin_Profile_Test.adminEmail);   
    //String email;

    public ArrayList<Product2> BindTable() {

        ArrayList<Product2> list = new ArrayList<Product2>();
        Connection con = null; ///////////////////////////////////////////////////////////////////////
        try {
            
            //con = DriverManager.getConnection("jdbc:sqlite:Car.db"); ////////////////////////////////
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb2", "root", "");
        //} catch (SQLException ex) {
        //}
        Statement st;
        ResultSet rs;
        
/////////////// Only bug : you have to login as admin first. Then everything works fine.
      /*  if ( !aemail.equals("")  ){
            JOptionPane.showMessageDialog(null, "email " + email + "\naemail " + aemail);
            email = aemail;
            JOptionPane.showMessageDialog(null, "email " + email + "\naemail " + aemail);
        }*/
///////////////////////////////////////////////        
        //try {
            st = con.createStatement();
            rs = st.executeQuery("select * from own where c_email = '" + email + "'");
            Product2 p;
            while (rs.next()) {
                p = new Product2(
                        rs.getString("c_email"),
                        rs.getString("plate_no"),
                        rs.getString("c_name"),
                        rs.getString("model"),
                        rs.getString("brand"),
                        rs.getBytes("carimage")
                );
                list.add(p);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException:\n" + e, "Error: ", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
}
