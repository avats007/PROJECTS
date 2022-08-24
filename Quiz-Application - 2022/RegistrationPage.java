package com.mycompany.quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class MyFrame extends JFrame implements ActionListener {
 
    // Components of the Form
     Container c;
     JLabel title;
     JLabel name;
     JTextField tname;
     JLabel mno;
     JTextField tmno;
     JLabel gender;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;
    JLabel dob;
    JComboBox date;
    JComboBox month;
    JComboBox year;
    JLabel add;
    JTextArea tadd;
    JCheckBox term;
    JButton sub;
    JButton reset;
    JTextArea tout;
   JLabel res;
   JTextArea resadd;
   JButton blogin;
    String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
    // constructor, to initialize the components
    // with default values.
     MyFrame(String s)
    {
        super(s); 
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Registration Form");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 35));
        title.setSize(300, 40);
        title.setLocation(300, 40);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setBackground(Color.LIGHT_GRAY);
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        mno = new JLabel("Mobile");
        mno.setForeground(Color.WHITE);
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setBackground(Color.LIGHT_GRAY);
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);
 
        gender = new JLabel("Gender");
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
 
        male = new JRadioButton("Male");
        name.setBackground(Color.LIGHT_GRAY);
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setBackground(Color.LIGHT_GRAY);
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB");
        dob.setForeground(Color.WHITE);
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setBackground(Color.LIGHT_GRAY);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
 
        month = new JComboBox(months);
        month.setBackground(Color.LIGHT_GRAY);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);
 
        year = new JComboBox(years);
        year.setBackground(Color.LIGHT_GRAY);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);
 
        add = new JLabel("Address");
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setBackground(Color.LIGHT_GRAY);
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setBackground(Color.LIGHT_GRAY);
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setBackground(Color.red);
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
        
        blogin = new JButton("Back To Login");
        blogin.setBackground(Color.YELLOW);
        blogin.setFont(new Font("Arial", Font.PLAIN, 15));
        blogin.setSize(220, 20);
        blogin.setLocation(150, 480);
        blogin.addActionListener(this);
        c.add(blogin);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
        c.setBackground(new java.awt.Color(102,0,0));
        setSize(900,600);
        setVisible(true);
    }

    MyFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
     @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
        else if(e.getSource() == blogin){
            LFrame f = new LFrame();
            f.show();
            
            dispose();
        }
        
    }
}
 
// Driver Code
class RegistrationPage {
 
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame("Registration Page");
        
    }
}
