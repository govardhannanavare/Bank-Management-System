package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fast_Cash  extends JFrame implements ActionListener
{

    JButton B100, B500, B1K, B2K, B5K, B10K, Bbc;

    String pin;

    Fast_Cash(String pin)
    {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        l.setBounds(0, 0, 1500, 830);
        add(l);


        JLabel l1 = new JLabel("Please Select Your Withdraw Amonut");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setForeground(Color.cyan);
        l1.setBounds(450, 180, 400, 30);
        l.add(l1);


        B100 =new JButton(" Rs. 100");
        B100.setFont(new Font("Arial",Font.BOLD,18));
        B100.setBackground(Color.CYAN);
        B100.setForeground(Color.black);
        B100.setBounds(410,275,150,35);
        B100.addActionListener(this);
        l.add(B100);


        B500 =new JButton("Rs. 500");
        B500.setFont(new Font("Arial",Font.BOLD,18));
        B500.setBackground(Color.CYAN);
        B500.setForeground(Color.BLACK);
        B500.setBounds(410,325,150,35);
        B500.addActionListener(this);
        l.add(B500);


        B1K =new JButton("Rs. 1000");
        B1K.setFont(new Font("Arial",Font.BOLD,18));
        B1K.setBackground(Color.CYAN);
        B1K.setForeground(Color.BLACK);
        B1K.setBounds(410,375,150,35);
        B1K.addActionListener(this);
        l.add(B1K);


        B2K =new JButton("Rs. 2000");
        B2K.setFont(new Font("Arial",Font.BOLD,18));
        B2K.setBackground(Color.CYAN);
        B2K.setForeground(Color.BLACK);
        B2K.setBounds(650,275,190,35);
        B2K.addActionListener(this);
        l.add(B2K);

        B5K =new JButton("Rs. 5000");
        B5K.setFont(new Font("Arial",Font.BOLD,18));
        B5K.setBackground(Color.CYAN);
        B5K.setForeground(Color.BLACK);
        B5K.setBounds(650,325,190,35);
        B5K.addActionListener(this);
        l.add(B5K);

        B10K =new JButton("Rs. 10,000");
        B10K.setFont(new Font("Arial",Font.BOLD,18));
        B10K.setBackground(Color.CYAN);
        B10K.setForeground(Color.BLACK);
        B10K.setBounds(650,375,190,35);
        B10K.addActionListener(this);
        l.add(B10K);

        Bbc =new JButton("Back");
        Bbc.setFont(new Font("Arial",Font.BOLD,18));
        Bbc.setBackground(Color.CYAN);
        Bbc.setForeground(Color.BLACK);
        Bbc.setBounds(650,425,190,35);
        Bbc.addActionListener(this);
        l.add(Bbc);





        setSize(1550,1080);
        getContentPane().setBackground(new Color(173, 247, 241));
        setLocation(0,0);
        setVisible(true);
        setLayout(null);


    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Bbc)
        {
            setVisible(false);
            new Fast_Cash(pin);
        }else
        {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn C5 = new Conn();
            Date date = new Date();

            try
            {
                ResultSet resultSet = C5.St.executeQuery("select * from bank where pin = '"+pin+"'");
               int Balance = 0;
                while (resultSet.next())
                {
                    if(resultSet.getString("type").equals("Deposite"))
                    {
                        Balance += Integer.parseInt(resultSet.getString("amount"));
                    }
                    else
                    {
                        Balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }String num = "17";

                if(e.getSource() != Bbc && Balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insuffient Balance");
                    return;
                }

                C5.St.executeUpdate("insert into bank values('" + pin + "', '" + date + "','Withdrawal', '" + amount + "')");
                JOptionPane.showMessageDialog(null,"Rs. "+ amount + "Debited Successfully");
            }
            catch (Exception E)
            {
                E.printStackTrace();
            }

            setVisible(false);
            new Main_Class(pin);

        }

    }

    public static void main(String[] args) {
        new Fast_Cash("");
    }
}
