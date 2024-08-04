package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener
{

    String pin;
    JButton B1;
    Mini(String pin)
    {

        this.pin=pin;

        getContentPane().setBackground(new Color(220,255,228));
        setLayout(null);
        setSize(500,650);
        setLocation(650,40);

        JLabel l= new JLabel();  ///date line
        l.setFont(new Font("Arial",Font.BOLD,12));
        l.setForeground(Color.BLACK);
        l.setBounds(40,55,520,450);
        add(l);




        JLabel l2= new JLabel();/// card No Line
        l2.setFont(new Font("Arial",Font.BOLD,16));
        l2.setForeground(Color.BLACK);
        l2.setBounds(52,20,500,35);
        add(l2);


        JLabel l3= new JLabel(); /// Balance Line
        l3.setFont(new Font("Arial",Font.BOLD,15));
        l3.setForeground(Color.BLACK);
        l3.setBounds(33,508,350,35);
        add(l3);



        try{
            Conn c4 = new Conn();
            ResultSet resultSet =c4.St.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next())
            {
                l2.setText("Card Number: "+ resultSet.getString("Card_No").substring(0,4)+ "XXXXXXXX" + resultSet.getString("Card_No").substring(12));
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            int balance = 0;
                Conn c1 =new Conn();

            ResultSet resultSet = c1.St.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()) {
                l.setText(l.getText() + "<html>" + resultSet.getString("date")+ "       " + "&nbsp,&nbsp,&nbsp,&nbsp,&nbsp," + resultSet.getString("type")+"          " + resultSet.getString("amount")+ "<br> <br> <br> <html>");
                if (resultSet.getString("type").equals("Deposite")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }


            l3.setText("Your Total Balance is Rs " + balance);


        }catch(Exception E)
        {
            E.printStackTrace();;
        }

        B1 = new JButton("Exit");
        B1.setBounds(20,550,100,25);
        add(B1);
        B1.addActionListener(this);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);

    }

    public static void main(String[] args) {

        new Mini("");
    }

}
