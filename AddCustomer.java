package travel.management.system;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener{
    JLabel labelusername, labelname;
    JComboBox<String> comboid;
    JTextField tfnumber, tfadd, tfcountry, tfem, tfph;
    JRadioButton rm, rf;
    JButton addButton, backButton;

    AddCustomer(String username) {
        setBounds(250, 150, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        labelusername = new JLabel("DefaultUser"); 
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        comboid = new JComboBox<>(new String[]{"Passport", "NID", "Ration Card", "Pan Card"});
        comboid.setBounds(220, 90, 150, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

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

        rm = new JRadioButton("Male");
        rm.setBounds(220, 210, 70, 25);
        rm.setBackground(Color.WHITE);
        add(rm);

        rf = new JRadioButton("Female");
        rf.setBounds(300, 210, 70, 25);
        rf.setBackground(Color.WHITE);
        add(rf);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rm);
        bg.add(rf);

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

        addButton = new JButton("Add");
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

        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 500);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addButton){
            String username = labelusername.getText();
            String id = (String)comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rm.isSelected()){
                gender = "Male";
            }
            else{
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfadd.getText();
            String phone = tfph.getText();
            String email = tfem.getText();
            
            try{
                Conn c = new Conn();
                String query ="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
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
        new AddCustomer("");
    }
}
