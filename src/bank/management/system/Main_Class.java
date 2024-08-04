package bank.management.system;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_Class extends JFrame implements ActionListener
{

    JButton Bdip, Bfca, Bpnc, Bcwd, Bmini, Bbin, Bexi;

    String pin;

    Main_Class(String pin)
     {
           this.pin=pin;

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
         Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l = new JLabel(i3);
         l.setBounds(0, 0, 1500, 830);
         add(l);


        Bdip =new JButton("Deposite");
        Bdip.setFont(new Font("Arial",Font.BOLD,18));
        Bdip.setBackground(Color.CYAN);
        Bdip.setForeground(Color.BLACK);
        Bdip.setBounds(410,275,150,35);
        Bdip.addActionListener(this);
        l.add(Bdip);


         Bfca =new JButton("Fast Cash");
         Bfca.setFont(new Font("Arial",Font.BOLD,18));
         Bfca.setBackground(Color.CYAN);
         Bfca.setForeground(Color.BLACK);
         Bfca.setBounds(410,325,150,35);
         Bfca.addActionListener(this);
         l.add(Bfca);


         Bpnc =new JButton("Pin Change");
         Bpnc.setFont(new Font("Arial",Font.BOLD,18));
         Bpnc.setBackground(Color.CYAN);
         Bpnc.setForeground(Color.BLACK);
         Bpnc.setBounds(410,375,150,35);
         Bpnc.addActionListener(this);
         l.add(Bpnc);


         Bcwd =new JButton("Cash Withdrawal");
         Bcwd.setFont(new Font("Arial",Font.BOLD,18));
         Bcwd.setBackground(Color.CYAN);
         Bcwd.setForeground(Color.BLACK);
         Bcwd.setBounds(650,275,190,35);
         Bcwd.addActionListener(this);
         l.add(Bcwd);

         Bmini =new JButton("Mini Statement");
         Bmini.setFont(new Font("Arial",Font.BOLD,18));
         Bmini.setBackground(Color.CYAN);
         Bmini.setForeground(Color.BLACK);
         Bmini.setBounds(650,325,190,35);
         Bmini.addActionListener(this);
         l.add(Bmini);

         Bbin=new JButton("Balance Enquriy");
         Bbin.setFont(new Font("Arial",Font.BOLD,18));
         Bbin.setBackground(Color.CYAN);
         Bbin.setForeground(Color.BLACK);
         Bbin.setBounds(650,375,190,35);
         Bbin.addActionListener(this);
         l.add(Bbin);

         Bexi=new JButton("Exit");
         Bexi.setFont(new Font("Arial",Font.BOLD,18));
         Bexi.setBackground(Color.CYAN);
         Bexi.setForeground(Color.BLACK);
         Bexi.setBounds(650,425,190,35);
         Bexi.addActionListener(this);
         l.add(Bexi);


        JLabel l1 =new JLabel(" Please Select Your Transaction:");
        l1.setFont(new Font("Arial", Font.BOLD,25));
        l1.setForeground(Color.CYAN);
        l1.setBounds(430,170,400,45);
        l.add(l1);


         setSize(1550,1080);
        getContentPane().setBackground(new Color(173, 247, 241));
         setLocation(0,0);
         setVisible(true);
         setLayout(null);
     }

    @Override
    public void actionPerformed(ActionEvent e)
    {
           if(e.getSource()==Bdip)
           {
               new Diposite(pin);
               setVisible(false);
           }
           else if (e.getSource()==Bexi)
           {
               System.exit(0);
           } else if (e.getSource()==Bcwd)
           {
              new Withdraw(pin);
              setVisible(false);
           } else if (e.getSource()==Bbin)
           {
                new Balance_Enquriy(pin);
                setVisible(false);
               
           } else if (e.getSource()==Bfca)
           {
               new Fast_Cash(pin);
               setVisible(false);

           } else if (e.getSource()==Bpnc)
           {
               new Rpin(pin);
               setVisible(false);

           } else if (e.getSource()==Bmini)
           {
                new Mini(pin);
           }


    }

    public static void main(String[] args)
    {
        new Main_Class("");
    }
}
