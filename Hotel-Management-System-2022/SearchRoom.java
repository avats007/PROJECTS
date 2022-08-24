
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame implements ActionListener{
 JTable table;
 JButton back,submit;
 JComboBox bedType;
 JCheckBox available;
    SearchRoom()
    {
     setLayout(null);
     getContentPane().setBackground(Color.WHITE);
     
     JLabel text = new JLabel("Search for Room");
     text.setFont(new Font("Tahoma",Font.PLAIN,20));
     text.setBounds(400,30,200,30);
     add(text);
     
     JLabel lblbed = new JLabel("Bed Type");
     lblbed.setBounds(50,100,100,20);
     add(lblbed);
     
     bedType = new JComboBox(new String[]{"Single Bed", "Double Bed"});
     bedType.setBounds(150,100,150,25);
     bedType.setBackground(Color.WHITE);
     add(bedType);
     
     available = new JCheckBox("Only display Available");
     available.setBounds(650,100,150,25);
     available.setBackground(Color.WHITE);
     add(available);
     
     JLabel l1 = new JLabel("Room Number");
     l1.setBounds(10,160,100,20);
     add(l1);
     
     JLabel l2 = new JLabel("Availability");
     l2.setBounds(270,160,100,20);
     add(l2);
     
     JLabel l3= new JLabel("Status");
     l3.setBounds(450,160,100,20);
     add(l3);
     
     JLabel l4 = new JLabel("Price");
     l4.setBounds(670,160,100,20);
     add(l4);
     
     JLabel l5 = new JLabel("Deposit");
     l5.setBounds(870,160,100,20);
     add(l5);
     
     submit = new JButton("SUBMIT");
     submit.setBackground(Color.BLACK);
     submit.setForeground(Color.WHITE);
     submit.setBounds(300,520,120,30);
     submit.addActionListener(this); 
     add(submit);
     
     back = new JButton("Back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.setBounds(500,520,120,30);
     back.addActionListener(this); 
     add(back);
     
     table = new JTable();
     table.setBounds(0,200,1000,400);
     add(table);
     
     try
     {
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("select * from room");
        
        //table class method
        table.setModel(DbUtils.resultSetToTableModel(rs));
        
     }
     catch(Exception e)
     {  
        e.printStackTrace();
     } 
    
   
     
     setBounds(300,200,1000,600);
     setVisible(true);
}
    
 @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
           try
           {
              String query1 = "Select * from room where bed_type = '"+bedType.getSelectedItem()+"'"; 
              String query2 = "Select * from room where availability = 'Available' AND bed_type = '"+bedType.getSelectedItem()+"'";
             
              Conn conn = new Conn();
              ResultSet rs;
              if(available.isSelected())
               rs = conn.s.executeQuery(query2);
              
              else
               rs = conn.s.executeQuery(query1);
              
             table.setModel(DbUtils.resultSetToTableModel(rs));
           }
           catch(Exception e)
           {
               // full Error stack print
               e.printStackTrace();
           }
        }
        
        else
        {
            setVisible(false);
            new Reception();
        }
    }
    public static void main(String[]args)
    {
        new SearchRoom();
    }
}
