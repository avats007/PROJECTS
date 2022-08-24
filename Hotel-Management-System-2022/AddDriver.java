package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    
    JButton add,cancel;
    JTextField tfname,tfage,tfcompany,tfmodel,tflocation;
    JComboBox typecombo,availablecombo,gencombo;
    AddDriver()
    {
     
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(150,10,200,20);
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblname.setBounds(60,50,120,30);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,50,150,30);
        add(tfname);
        
        JLabel lblage = new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(60,90,120,30);
        add(lblage); 
        
        tfage = new JTextField();
        tfage.setBounds(200,90,150,30);
        add(tfage);
        
        JLabel lblgen = new JLabel("Gender");
        lblgen.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblgen.setBounds(60,130,120,30);
        add(lblgen);
        
        String genOptions[] = {"Male", "Female"};
        gencombo = new JComboBox(genOptions);
        gencombo.setBounds(200,130,150,30);
        gencombo.setBackground(Color.WHITE);
        add(gencombo);
        
         
        JLabel lblcar= new JLabel("Car Company");
        lblcar.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblcar.setBounds(60,170,120,30);
        add(lblcar);
        
        tfcompany = new JTextField();
        tfcompany.setBounds(200,170,150,30);
        add(tfcompany);
        
        JLabel lblmodel = new JLabel("Car Model");
        lblmodel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblmodel.setBounds(60,210,120,30);
        add(lblmodel);
        
        tfmodel = new JTextField();
        tfmodel.setBounds(200,210,150,30);
        add(tfmodel);
        
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(60,250,120,30);
        add(lblavailable);
        
        String driverOptions[] = {"Available", "Busy"};
        availablecombo = new JComboBox(driverOptions);
        availablecombo.setBounds(200,250,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lbllocation = new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbllocation.setBounds(60,290,120,30);
        add(lbllocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200,290,150,30);
        add(tflocation);
        
        add = new JButton("Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(60,345,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(220,345,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);
        
        setBounds(300,200,980,470);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() == add)
       {
           String name = tfname.getText();
           String age= tfage.getText();
           String gender = (String)gencombo.getSelectedItem();
           String company = tfcompany.getText();
           String brand = tfmodel.getText();
           String available = (String)availablecombo.getSelectedItem();
           String location = tflocation.getText();
            try
           {
               Conn conn = new Conn();
               String str = "insert into driver values('"+name+"','"+age+"','"+gender+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";
           
               conn.s.executeUpdate(str);
               JOptionPane.showMessageDialog(null,"New Driver Added Successully");
               setVisible(false);
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       else
       {
           setVisible(false);
       }
    }
    public static void main(String[]args)
    {
        new AddDriver();
    }
}

