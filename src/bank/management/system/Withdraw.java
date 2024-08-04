package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener
{

    String pin;

    JTextField t1;

    JButton Bdep,Bcan;

    Withdraw(String pin)
    {
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        l.setBounds(0, 0, 1500, 830);
        add(l);

        JLabel l1 = new JLabel("Maximum Withdrawal Is Rs.10,000");
        l1.setFont(new Font("Arial", Font.ITALIC, 25));
        l1.setForeground(Color.white);
        l1.setBounds(420, 180, 400, 30);
        l.add(l1);

        JLabel l2 = new JLabel("Please Eenter your Amount");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setForeground(Color.white);
        l2.setBounds(420, 210, 400, 30);
        l.add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.BOLD, 16));
        t1.setForeground(Color.BLACK);
        t1.setBounds(420, 250, 350, 30);
        l.add(t1);


        Bdep = new JButton("Withdrawal");
        Bdep.setFont(new Font("Arial", Font.BOLD, 15));
        Bdep.setBackground(Color.CYAN);
        Bdep.setForeground(Color.BLACK);
        Bdep.setBounds(690, 360, 130, 40);
        Bdep.addActionListener(this);
        l.add(Bdep);


        Bcan = new JButton("Back");
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Bdep)
        {
            try {
                String amount = t1.getText();
                Date date = new Date();
                if (t1.getText().equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you withdraw");
                } else {
                    Conn c2 = new Conn();
                    ResultSet resultSet = c2.St.executeQuery("select * from bank where pin = '" +pin+ "'");
                    int balance = 0;
                    while (resultSet.next())
                    {
                        if (resultSet.getString("type").equals("Deposite"))
                        {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else
                        {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount))
                    {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c2.St.executeUpdate("insert into bank values('" + pin + "', '" + date + "','Withdrawal', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

                    setVisible(false);
                    new Main_Class(pin);
                }


            } catch (Exception E) {

                E.printStackTrace();

            }
    } else if (e.getSource()==Bcan)
    {
           setVisible(false);
           new Main_Class(pin);
            
        }

    }

    public static void main(String[] args) {
      new Withdraw("");
    }
}
