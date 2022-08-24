package hotel.management.system;

import java.sql.*;
public class Conn {
    Connection c;
   
    Statement s;
    Conn()
    {
        try
        {
          //Register the driver class

           Class.forName("com.mysql.cj.jdbc.Driver"); 
           
         // Creating the Connection String
         
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","wEB07.Sh@eLl");
         
         // Creating the Statement
         
           s = c.createStatement();
           
         //  Executing MySQL Queries
        
        }
        catch(Exception e)
         {
             e.printStackTrace();
         }
    }
}
