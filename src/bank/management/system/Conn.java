package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Collection;
import java.util.Collections;

public class Conn
{
     Connection Con;
     Statement St;
     public Conn()
     {
         try
         {


              Con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "12345");
              St = Con.createStatement();

         }catch (Exception e)
         {
             e.printStackTrace();
         }

     }
}
