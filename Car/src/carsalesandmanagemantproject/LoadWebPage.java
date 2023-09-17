/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsalesandmanagemantproject;

/**
 *
 * @author Md Porom
 */
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class LoadWebPage extends JFrame {

    public LoadWebPage() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(620, 440);
        JScrollPane sp = new JScrollPane();
        JTextPane tp = new JTextPane();
        tp.setEditable(false);
        URL myurl = null;
        try {
            myurl = new URL("http://www.cars.com");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        sp.setViewportView(tp);
        add(sp);
        try {
            tp.setPage(myurl);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {
        new LoadWebPage().setVisible(true);
    }

}
