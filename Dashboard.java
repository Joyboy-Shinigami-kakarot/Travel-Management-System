package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addPersonDetails,viewPersonDetails,updatePersonDetails,checkPackages,bookPackages,viewPackages,viewHotles,destination,bookHotel,viewBookedHotel,payments, deletPersonDetails;
    JButton calculator,notepad,about;
    Dashboard(String username){
        this.username = username;
        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonDetails = new JButton("Add Personal Details");
        addPersonDetails.setBounds(0,0,300,50);
        addPersonDetails.setBackground(new Color(0,0,102));
        addPersonDetails.setForeground(Color.white);
        addPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonDetails.setMargin(new Insets(0,0,0,30));
        addPersonDetails.addActionListener(this);
        p2.add(addPersonDetails);
        
        updatePersonDetails = new JButton("Update Personal Details");
        updatePersonDetails.setBounds(0,40,300,50);
        updatePersonDetails.setBackground(new Color(0,0,102));
        updatePersonDetails.setForeground(Color.white);
        updatePersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonDetails.setMargin(new Insets(0,0,0,8));
        updatePersonDetails.addActionListener(this);
        p2.add(updatePersonDetails);
        
        viewPersonDetails = new JButton("View Personal Details");
        viewPersonDetails.setBounds(0,80,300,50);
        viewPersonDetails.setBackground(new Color(0,0,102));
        viewPersonDetails.setForeground(Color.white);
        viewPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonDetails.setMargin(new Insets(0,0,0,30));
        viewPersonDetails.addActionListener(this);
        p2.add(viewPersonDetails);
        
        deletPersonDetails = new JButton("Delete Personal Details");
        deletPersonDetails.setBounds(0,120,300,50);
        deletPersonDetails.setBackground(new Color(0,0,102));
        deletPersonDetails.setForeground(Color.white);
        deletPersonDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletPersonDetails.setMargin(new Insets(0,0,0,12));
        deletPersonDetails.addActionListener(this);
        p2.add(deletPersonDetails);
        
        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,160,300,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.white);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,75));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,200,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.white);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,75));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0,240,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.white);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0,0,0,75));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);
        
        viewHotles = new JButton("View Hotels");
        viewHotles.setBounds(0,280,300,50);
        viewHotles.setBackground(new Color(0,0,102));
        viewHotles.setForeground(Color.white);
        viewHotles.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewHotles.setMargin(new Insets(0,0,0,100));
        viewHotles.addActionListener(this);
        p2.add(viewHotles);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0,320,300,50);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setForeground(Color.white);
        bookHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookHotel.setMargin(new Insets(0,0,0,100));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,360,300,50);
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.white);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,40));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0,400,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.white);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,100));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setBounds(0,440,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,110));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0,480,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,105));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,520,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,115));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,560,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,140));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1450,850);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1000,550);
        text.setForeground(Color.white);
        text.setFont(new Font("Ralway", Font.ITALIC,40));
        image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonDetails){
            new AddCustomer(username);
        }else if (ae.getSource() == viewPersonDetails){
            new ViewCustomer(username);
        }else if (ae.getSource() == updatePersonDetails){
            new UpdateCustomer(username);
        }else if (ae.getSource() == checkPackages){
            new CheckPackage();
        }else if (ae.getSource() == bookPackages){
            new BookPackage(username);
        }else if (ae.getSource()== viewPackages){
            new ViewPackage(username);
        }else if (ae.getSource() == viewHotles){
            new ViewHotels();
        }else if (ae.getSource() == destination){
            new Destination();
        }else if (ae.getSource() == bookHotel){
            new BookHotel(username);
        }else if (ae.getSource() == viewBookedHotel){
            new ViewBookHotel(username);
        }else if (ae.getSource() == payments){
            new Payment();
        }else if (ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == about){
            new About();
        }else if(ae.getSource() == deletPersonDetails){
            new DeleteDetails(username);
        }
    }
        public static void main(String[] args) {
        new AddCustomer("");
        }
        
}

