package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup3  extends JFrame implements ActionListener
{

    JRadioButton RSa, RFd, Rcu, Rrd;

    JCheckBox  Catm,Cmb,Ccb,Cib,Cem,Ces;

    JButton BSu,Bca;

    String formno;

    Singup3(String formno)
    {
        this.formno = formno;


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40,5,100,100);
        add(image);


        JLabel l = new JLabel("Page 3");
        l.setFont(new Font("Arial",Font.BOLD,25));
        l.setBounds(160,9,100,100);
        add(l);

        JLabel ll11 = new JLabel("From No. ");
        ll11.setFont(new Font("Arial",Font.BOLD,15));
        ll11.setForeground(Color.black);
        ll11.setBounds(380,15,200,60);
        add(ll11);

        JLabel l1 = new JLabel("Account Details");
        l1.setFont(new Font("Arial",Font.BOLD,25));
        l1.setBounds(160,40,200,100);
        add(l1);

        JLabel l2 = new JLabel("Account Types : ");
        l2.setFont(new Font("Arial",Font.BOLD,18));
        l2.setBounds(55,100,200,100);
        add(l2);

        RSa = new JRadioButton("Saving Account");
        RSa.setBackground(new Color(4, 200, 222));
        RSa.setFont(new Font("Arial",Font.BOLD,15));
        RSa.setBounds(65,180,170,40);
        add(RSa);


        RFd = new JRadioButton("Fixed Deposit Account");
        RFd.setBackground(new Color(4, 200, 222));
        RFd.setFont(new Font("Arial",Font.BOLD,15));
        RFd.setBounds(300,180,400,40);
        add(RFd);


        Rcu = new JRadioButton("Current Account");
        Rcu.setBackground(new Color(4, 200, 222));
        Rcu.setFont(new Font("Arial",Font.BOLD,15));
        Rcu.setBounds(65,230,150,40);
        add(Rcu);



        Rrd = new JRadioButton("Recurring Deposit Account");
        Rrd.setBackground(new Color(4, 200, 222));
        Rrd.setFont(new Font("Arial",Font.BOLD,15));
        Rrd.setBounds(300,230,400,40);
        add(Rrd);

        ButtonGroup b = new ButtonGroup();
        b.add(RSa);
        b.add(Rcu);
        b.add(RFd);
        b.add(Rrd);



        JLabel l3 = new JLabel("Card Number:  ");
        l3.setFont(new Font("Arial",Font.BOLD,18));
        l3.setBounds(55,290,200,50);
        add(l3);


        JLabel l4 = new JLabel("(Your 16-digit Card Number)");
        l4.setFont(new Font("Arial",Font.BOLD,12));
        l4.setBounds(55,310,400,50);
        add(l4);


        JLabel l5 = new JLabel("XXXX-XXXX-XXXX-2589");
        l5.setFont(new Font("Arial",Font.BOLD,15));
        l5.setBounds(300,290,400,50);
        add(l5);


        JLabel l6 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l6.setFont(new Font("Arial",Font.BOLD,12));
        l6.setBounds(300,310,800,50);
        add(l6);



        JLabel l7 = new JLabel("PIN : ");
        l7.setFont(new Font("Arial",Font.BOLD,18));
        l7.setBounds(55,350,200,50);
        add(l7);


        JLabel l8 = new JLabel("(4 Digit Password)");
        l8.setFont(new Font("Arial",Font.BOLD,12));
        l8.setBounds(55,370,400,50);
        add(l8);


        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Arial",Font.BOLD,15));
        l9.setBounds(300,350,200,50);
        add(l9);


        JLabel l10 = new JLabel("Services Requried: ");
        l10.setFont(new Font("Arial",Font.BOLD,18));
        l10.setBounds(55,420,200,50);
        add(l10);

       // Catm,Cmb,Ccb,Cib,Cem,Ces;


        Catm = new JCheckBox("ATM Card");
        Catm.setFont(new Font("Arial",Font.BOLD,15));
        Catm.setBackground(new Color(4, 200, 222));
        Catm.setBounds(70,470,150,45);
        add(Catm);


        Cmb = new JCheckBox("Mobile Banking");
        Cmb.setFont(new Font("Arial",Font.BOLD,15));
        Cmb.setBackground(new Color(4, 200, 222));
        Cmb.setBounds(70,510,150,45);
        add(Cmb);


        Ccb = new JCheckBox("Cheque Book");
        Ccb.setFont(new Font("Arial",Font.BOLD,15));
        Ccb.setBackground(new Color(4, 200, 222));
        Ccb.setBounds(70,550,150,45);
        add(Ccb);

        Cib = new JCheckBox("Internet Banking ");
        Cib.setFont(new Font("Arial",Font.BOLD,15));
        Cib.setBackground(new Color(4, 200, 222));
        Cib.setBounds(300,470,300,45);
        add(Cib);


        Cem = new JCheckBox("Email Alerts");
        Cem.setFont(new Font("Arial",Font.BOLD,15));
        Cem.setBackground(new Color(4, 200, 222));
        Cem.setBounds(300,510,200,45);
        add(Cem);



        Ces = new JCheckBox("E-Statemeant");
        Ces.setFont(new Font("Arial",Font.BOLD,15));
        Ces.setBackground(new Color(4, 200, 222));
        Ces.setBounds(300,550,150,45);
        add(Ces);


        JCheckBox ib = new JCheckBox("I herebay declares that the above entered details correct to the best of my knowledge",true);
        ib.setFont(new Font("Arial",Font.BOLD,12));
        ib.setBackground(new Color(4, 200, 222));
        ib.setBounds(70,610,550,45);
        add(ib);


        JLabel l11 = new JLabel("Form No. ");
        l11.setFont(new Font("Arial",Font.BOLD,15));
        l11.setForeground(Color.black);
        l11.setBounds(450,15,200,60);
        add(l11);

        JLabel l12 = new JLabel();
        l12.setFont(new Font("Arial",Font.BOLD,15));
        l12.setForeground(Color.black);
        l12.setBounds(500,20 ,200,60);
        add(l12);


        BSu = new JButton("Submit");
        BSu.setFont(new Font("Arial",Font.BOLD,12));
        BSu.setBackground(new  Color(1,12,13));
        BSu.setForeground(Color.white);
        BSu.setBounds(180,670,100,30);
        BSu.addActionListener(this);
        add(BSu);


        Bca = new JButton("Cancel");
        Bca.setFont(new Font("Arial",Font.BOLD,12));
        Bca.setBackground(new  Color(1,12,13));
        Bca.setForeground(Color.white);
        Bca.setBounds(450,670,100,30);
        Bca.addActionListener(this);
        add(Bca);


        getContentPane().setBackground(new Color(4, 200, 222));
        setSize(670,900);
        setLayout(null);
        setLocation(800,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
          String AccT= null;
          if(RSa.isSelected())
          {
              AccT = "Saving Account";
          } else if (RFd.isSelected())
          {
              AccT ="Fixed Deposit Account";
          } else if (Rcu.isSelected())
          {
             AccT = "Current Account";
          } else if (Rrd.isSelected())
          {
              AccT = "Recurring Deposit Account";
          }

        Random ran = new Random();
          long frist7=(ran.nextLong() % 90000000L) + 1409963000000000L;
          String cardn = " "+Math.abs(frist7);

          long frist3 = (ran.nextLong() % 9000L) + 1000L;
          String pin ="" +Math.abs(frist3);

        String servic ="";             //Catm,Cmb,Ccb,Cib,Cem,Ces
        if(Catm.isSelected())
        {
            servic += "ATM Card";
        }
        else if (Cmb.isSelected())
        {
           servic += "Mobile Banking";
        }
        else if (Ccb.isSelected())
        {
            servic += "Cheque Book";
        }
        else if (Cib.isSelected())
        {
            servic += "Internet Banking";
        }
        else if (Cem.isSelected())
        {
            servic += "Email Alerts";
        } else if (Ces.isSelected())
        {
            servic += "E - Statement";
        }

        try{       //AccT servic
                if(e.getSource()==BSu)
                {
                    if(AccT.equals(""))
                    {
                         JOptionPane.showMessageDialog(null,"Fill all the filed");
                    }else
                    {
                         Conn c2 = new Conn();

                          String q = "insert into singup3 values('"+formno+"','"+AccT+"', '"+cardn+"' , '"+pin+"' , '"+servic+"')";
                        String q1 = "insert into login values('"+formno+"', '"+cardn+"', '"+pin+"')";
                         c2.St.executeUpdate(q);
                         c2.St.executeUpdate(q1);
                          JOptionPane.showMessageDialog(null,"Card Number : "+ cardn + "\n Pin : " + pin );
                          new Diposite(pin);
                          setVisible(false);
                    }
                } else if (e.getSource()==Bca)
                {
                       System.exit(0);
                }

        }
        catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        new Singup3("");
    }
}
