package bank.management.system;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Diposite extends JFrame implements ActionListener
{
       String pin;

       JTextField t1;

       JButton Bdep,Bcan;
     Diposite(String pin) {
         this.pin = pin;

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
         Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l = new JLabel(i3);
         l.setBounds(0, 0, 1500, 830);
         add(l);

         JLabel l1 = new JLabel("Enter amount you want to deposit");
         l1.setFont(new Font("Arial", Font.ITALIC, 25));
         l1.setForeground(Color.white);
         l1.setBounds(420, 180, 400, 30);
         l.add(l1);

         t1 = new JTextField();
         t1.setFont(new Font("Arial", Font.BOLD, 16));
         t1.setForeground(Color.BLACK);
         t1.setBounds(420, 230, 350, 30);
         l.add(t1);


         Bdep = new JButton("Deposite");
         Bdep.setFont(new Font("Arial", Font.BOLD, 15));
         Bdep.setBackground(Color.CYAN);
         Bdep.setForeground(Color.BLACK);
         Bdep.setBounds(720, 360, 100, 40);
         Bdep.addActionListener(this);
         l.add(Bdep);


         Bcan = new JButton("Cancel");
         Bcan.setFont(new Font("Arial", Font.BOLD, 15));
         Bcan.setBackground(Color.CYAN);
         Bcan.setForeground(Color.BLACK);
         Bcan.setBounds(720, 408, 100, 40);
         Bcan.addActionListener(this);
         l.add(Bcan);


         setSize(1500, 1150);
         setLocation(0, 0);
         setLayout(null);
         setVisible(true);

     }
         @Override
         public void actionPerformed (ActionEvent e)
         {
            try {
                String amou = t1.getText();
                Date date = new Date();

                if(e.getSource()==Bdep)
                {
                    if (t1.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposite");
                    }else
                    {
                       Conn c4 =new Conn();
                       c4.St.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposite' , '"+amou+"')");
                       JOptionPane.showMessageDialog(null,"Rs."+amou+ " Deposite Sucessfully");
                       setVisible(false);
                       new Main_Class(pin);

                    }
                }else if(e.getSource()==Bcan)
                {
                    setVisible(false);
                }




            }catch (Exception E)
            {
                E.printStackTrace();
            }



         }

    public static void main(String[] args) {
        new Diposite("");
    }
}
