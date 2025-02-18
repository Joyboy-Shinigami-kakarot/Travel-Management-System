package travel.management.system;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel labelusername, labelname;
    JComboBox<String> comboid;
    JTextField tfnumber, tfadd, tfcountry, tfem, tfph,tfid,tfgender;
    JRadioButton rm, rf;
    JButton addButton, backButton;

    UpdateCustomer(String username) {
        setBounds(250, 150, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JLabel text = new JLabel("UPDATE CUTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        labelusername = new JLabel("DefaultUser"); 
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        labelname = new JLabel(); 
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);
        
        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladd = new JLabel("Address");
        lbladd.setBounds(30, 290, 150, 25);
        add(lbladd);

        tfadd = new JTextField();
        tfadd.setBounds(220, 290, 150, 25);
        add(tfadd);

        JLabel lblph = new JLabel("Phone");
        lblph.setBounds(30, 330, 150, 25);
        add(lblph);

        tfph = new JTextField();
        tfph.setBounds(220, 330, 150, 25);
        add(tfph);

        JLabel lblem = new JLabel("Email");
        lblem.setBounds(30, 370, 150, 25);
        add(lblem);

        tfem = new JTextField();
        tfem.setBounds(220, 370, 150, 25);
        add(tfem);

        addButton = new JButton("Update");
        addButton.setBackground(Color.BLACK); 
        addButton.setForeground(Color.WHITE);
        addButton.setBounds(70, 430, 100, 25);
        addButton.addActionListener(this);
        add(addButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(220, 430, 100, 25);
        backButton.addActionListener(this);
        add(backButton);

        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 500);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfadd.setText(rs.getString("address"));
                tfph.setText(rs.getString("phone"));
                tfem.setText(rs.getString("email"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addButton){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfadd.getText();
            String phone = tfph.getText();
            String email = tfem.getText();
            
            try{
                Conn c = new Conn();
                String query ="update customer set username='"+username+"',id = '"+id+"',number = '"+number+"',name = '"+name+"',gender = '"+gender+"',country ='"+country+"',address ='"+address+"',phone ='"+phone+"',email ='"+email+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}
