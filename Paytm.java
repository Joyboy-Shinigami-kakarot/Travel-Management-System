/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener{
    Paytm(){
        setBounds(190,100,800,600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);   

        try {
            pane.setPage("https://paytm.com/rent-payment");
        }catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load,Error 404</html>");
        } 

        JScrollPane sp = new JScrollPane(pane);     
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
            setVisible(false);
            new Payment();
    }
    public static void main(String[] args){
        new Paytm();
    }
}