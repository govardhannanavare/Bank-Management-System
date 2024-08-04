package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Balance_Enquriy extends JFrame implements ActionListener

{
     JLabel l2;

     String pin;

     JButton B1;


     Balance_Enquriy(String pin)
     {

         this.pin=pin;
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
         Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l = new JLabel(i3);
         l.setBounds(0, 0, 1500, 830);
         add(l);

         JLabel l1 = new JLabel("Your Current Balance is Rs.");
         l1.setFont(new Font("Arial", Font.ITALIC, 25));
         l1.setForeground(Color.white);
         l1.setBounds(400, 180, 400, 30);
         l.add(l1);

         l2 = new JLabel();
         l2.setFont(new Font("Arial", Font.BOLD, 20));
         l2.setForeground(Color.white);
         l2.setBounds(400, 210, 400, 30);
         l.add(l2);

         B1 = new JButton("Back");
         B1.setFont(new Font("Arial", Font.BOLD, 15));
         B1.setBackground(Color.CYAN);
         B1.setForeground(Color.BLACK);
         B1.setBounds(690, 360, 130, 40);
         B1.addActionListener(this);
         l.add(B1);


      int Balance = 0;
      try{
          Conn c1 =new Conn();
          ResultSet re = c1.St.executeQuery("select * from bank where pin = '"+pin+"'");

          while (re.next())
          {
              if(re.getString("type").equals("Deposite"))
              {
                  Balance += Integer.parseInt(re.getString("amount"));
              }
              else
              {
                  Balance -= Integer.parseInt(re.getString("amount"));
              }

          }

      }catch(Exception e)
      {
          e.printStackTrace();;
      }


      l2.setText(""+Balance);

         setSize(1500, 1150);
         setLocation(0, 0);
         setLayout(null);
         setVisible(true);


     }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         setVisible(false);
         new Main_Class(pin);

    }

    public static void main(String[] args) {
        new Balance_Enquriy("");
    }
}


