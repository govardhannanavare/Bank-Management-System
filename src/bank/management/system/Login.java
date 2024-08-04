package bank.management.system;
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.TrustAnchor;
import java.sql.ResultSet;

public class Login  extends JFrame implements ActionListener
{
      JLabel La1,L2,L3;
      JTextField T1;
      JPasswordField Jp2;
      JButton b1,b2,b3;


      Login()
      {

           super("Bank Management System");
           ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
          Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel image = new JLabel(i3);
          image.setBounds(350,10,100,100);
          add(image);

          ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
          Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon ii3 = new ImageIcon(ii2);
          JLabel iimage = new JLabel(ii3);
          iimage.setBounds(630,310,100,100);
          add(iimage);

          La1 = new JLabel("WELCOME TO ATM");
          La1.setForeground(Color.black);
          La1.setFont(new Font("Aril",Font.BOLD,  40));
          La1.setBounds(215,125,450,40);
          add(La1);

          L2= new JLabel("CARD NUMBER : ");
          L2.setFont(new Font("Ralway",Font.BOLD,20));
          L2.setForeground(Color.black);
          L2.setBounds(150,190,375,20);
          add(L2);

           T1 = new JTextField(15);
           T1.setBounds(325,187,230,30);
           T1.setFont(new Font("Arial", Font.BOLD,14));
           add(T1);

          L3 = new JLabel("PIN :");
          L3.setFont(new Font("Ralway",Font.BOLD,20));
          L3.setForeground(Color.BLACK);
          L3.setBounds(150,230,375,20);
          add(L3);

          Jp2 = new JPasswordField(12);
          Jp2.setFont(new Font("Arial",Font.BOLD,19));
          Jp2.setForeground(Color.BLACK);
          Jp2.setBounds(325,230,230,28);
          add(Jp2);

           b1 = new JButton("SIGN IN");
           b1.setFont(new Font("Arial",Font.BOLD,18));
           b1.setBackground(Color.black);
           b1.setForeground(Color.white);
           b1.setBounds(325,300,100,30);
           b1.addActionListener(this);
           add(b1);

           b2 = new JButton("Clear");
           b2.setFont(new Font("Arial",Font.BOLD,19));
           b2.setBackground(Color.BLACK);
           b2.setForeground(Color.white);
           b2.setBounds(470,300,100,30);
           b2.addActionListener(this);
           add(b2);

          b3 = new JButton("SIGN UP");
          b3.setFont(new Font("Arial",Font.BOLD,18));
          b3.setBackground(Color.black);
          b3.setForeground(Color.white);
          b3.setBounds(325,350,250,25);
          b3.addActionListener(this);
          add(b3);

          ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
          Image iii2 = iii1.getImage().getScaledInstance(800,450,Image.SCALE_DEFAULT);
          ImageIcon iii3 = new ImageIcon(iii2);
          JLabel iiimage = new JLabel(iii3);
          iiimage.setBounds(0,0,800,450);
          add(iiimage);



           setLayout(null);
          setSize(800,450);

          setVisible(true);
          setLocation(555,220);
      }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try{
              if(e.getSource()==b1)  // Sing in
              {
                  Conn c2 =new Conn();
                 String CardNo = T1.getText();
                 String pin = Jp2.getText();
                 String q = "select * from Login where Card_No = '"+CardNo+"' and pin = '"+pin+"' ";
                 ResultSet resultSet = c2.St.executeQuery(q);

                 if(resultSet.next())
                 {
                     setVisible(false);
                     new Main_Class(pin);
                 }else
                 {
                     JOptionPane.showMessageDialog(null,"Incorrect Card Number Or Pin");
                 }


              }else if(e.getSource()==b2) // Clear
              {
                      T1.setText("");
                      Jp2.setText("");
              } else if (e.getSource()==b3)   //Sign up
              {
                    new SingUp();
                    setVisible(false);
              }


        }catch(Exception E)
        {
             E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
         new Login();
    }
}
