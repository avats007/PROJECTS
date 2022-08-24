package com.mycompany.quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LFrame extends javax.swing.JFrame implements ActionListener{
    Container c;
     JLabel title;
     JLabel name;
     JTextField tname;
     JLabel pass;
     JPasswordField tpass;
     JButton sub;
     JButton reg;

     LFrame()
    {  
        
        setTitle("Login Page");
        setBounds(30,40,450,20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Login Page");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setSize(300, 80);
        title.setLocation(300, 30);
        c.add(title);
        
        name = new JLabel("Username");
        name.setForeground(Color.lightGray);
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 30);
        name.setLocation(200, 180);
        c.add(name);
 
        tname = new JTextField();
        tname.setBackground(Color.gray);
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(220, 30);
        tname.setLocation(350, 180);
        c.add(tname);
 
        pass = new JLabel("Password");
        pass.setForeground(Color.lightGray);
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 30);
        pass.setLocation(200, 280);
        c.add(pass);
 
        tpass = new JPasswordField();
        tpass.setBackground(Color.gray);
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(220, 30);
        tpass.setLocation(350, 280);
        c.add(tpass);
 
        sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.WHITE);
        sub.setFont(new Font("Serif", Font.BOLD, 15));
        sub.setSize(100, 30);
        sub.setLocation(200, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reg = new JButton("To Register");
        reg.setBackground(Color.RED);
        reg.setForeground(Color.WHITE);
        reg.setFont(new Font("Serif", Font.BOLD, 15));
        reg.setSize(200, 30);
        reg.setLocation(380, 450);
        reg.addActionListener(this);
        c.add(reg);
        
        setTitle("Please Login Here!");
        setSize(900,600);
        setLocation(300,100);
        setVisible(true);
        c.setBackground(new java.awt.Color(0,20,58));
        //c.setBackground(Color.red);
        //setBackground(Color.BLUE);
    }
     private void initComponents() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
  
     @Override
    public void actionPerformed(ActionEvent ae){
        String Username = tname.getText();
        String Password = tpass.getText();
        if(ae.getSource() == sub){
             if(Username.trim().equals("Aryan") && Password.trim().equals("Quiz")){
               QFrame j = new QFrame("Simple QuizApp");
               j.show();
            
               dispose();
             }
             else{
                JOptionPane.showMessageDialog(this,"Invalid Username");
             }
        }
        else if(ae.getSource() == reg){
            MyFrame f = new MyFrame("Registration Page");
            f.show();
            
            dispose();
        }
    }
}

class LoginPage
{
     public static void main(String args[]){
        LFrame f=new LFrame();
       
    }
}
