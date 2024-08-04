package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rpin extends JFrame implements ActionListener
{
    JButton B1,B2;

    JPasswordField P,P1;
    String pin;

    Rpin(String pin)
    {
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l = new JLabel(i3);
        l.setBounds(0, 0, 1500, 830);
        add(l);

        JLabel l1 = new JLabel("Change Your Pin");
        l1.setFont(new Font("Arial", Font.BOLD, 27));
        l1.setForeground(Color.white);
        l1.setBounds(500, 180, 250, 30);
        l.add(l1);

        JLabel l2 = new JLabel(" Enter Your New Pin");
        l2.setFont(new Font("Arial", Font.ITALIC, 16));
        l2.setForeground(Color.white);
        l2.setBounds(420, 250, 400, 30);
        l.add(l2);

        P= new JPasswordField();
        P.setFont(new Font("Arial", Font.BOLD, 16));
        P.setForeground(Color.BLACK);
        P.setBounds(630, 253, 185, 25);
        l.add(P);



        JLabel l3 = new JLabel(" R-Enter Your New Pin");
        l3.setFont(new Font("Arial", Font.ITALIC, 16));
        l3.setForeground(Color.white);
        l3.setBounds(420, 300, 400, 30);
        l.add(l3);

        P1= new JPasswordField();
        P1.setFont(new Font("Arial", Font.BOLD, 16));
        P1.setForeground(Color.BLACK);
        P1.setBounds(630, 300, 185, 25);
        l.add(P1);



        B1 = new JButton("Confrim");
        B1.setFont(new Font("Arial", Font.BOLD, 15));
        B1.setBackground(Color.CYAN);
        B1.setForeground(Color.BLACK);
        B1.setBounds(720, 360, 100, 40);
       B1.addActionListener(this);
        l.add(B1);


        B2 = new JButton("Back");
        B2.setFont(new Font("Arial", Font.BOLD, 15));
        B2.setBackground(Color.CYAN);
        B2.setForeground(Color.BLACK);
        B2.setBounds(720, 408, 100, 40);
       B2.addActionListener(this);
        l.add(B2);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String NewP = P.getText();
            String Newpp = P1.getText();

            if(!NewP.equals(Newpp))
            {
                 JOptionPane.showMessageDialog(null,"Entered Pin Does Not Match");
                 return;
            }
            if (e.getSource()==B1)
            {
                if (P.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter the New Pin");
                      return;
                }

                if (P1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please R-Enter the New Pin");
                    return;
                }

                Conn c = new Conn();
                String q = "update bank set pin = '" + Newpp + "' where pin = '" + pin + "'";

                String q1 = "update Login set pin = '" + Newpp + "' where pin = '" + pin + "'";

                String q2 = "update singup3 set pin = '" + Newpp + "' where pin = '" + pin + "'";

                c.St.executeUpdate(q);
                c.St.executeUpdate(q1);
                c.St.executeUpdate(q2);

                JOptionPane.showMessageDialog(null, "Change Pin Successfully");

                setVisible(false);
                new Main_Class(pin);

            } else if (e.getSource()==B2)
            {
                 setVisible(false);
                 new Main_Class(pin);
            }


        }
        catch (Exception E)
        {
            E.printStackTrace();
        }

    }




    public static void main(String[] args) {
        new Rpin("");
    }
}
