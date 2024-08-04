package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.FieldPosition;
import java.util.Random;

public class SingUp extends JFrame implements ActionListener
{
    Random r = new Random();

    long f4 = (r.nextLong() % 9000L) + 1000L;

    String f = " " + Math.abs(f4);

    JTextField t1 , t2 , te , tm, tad, tci , tpin, tst;


    JDateChooser dateChooser;

    JRadioButton ro1,ro2,ro3,ro4,ro5;

    JButton Bnext;
    SingUp()
    {
        super("Application From");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,10,100,100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO." + f);
        l1.setBounds(200,20,600,40);
        l1.setFont(new Font("Arial",Font.BOLD,35));
        add(l1);

       JLabel l2 = new JLabel("Page 1");
       l2.setFont(new Font("Arial",Font.BOLD,22));
       l2.setBounds(370,70,600,70);
       add(l2);

       JLabel l3 =new JLabel("Personal Information");
       l3.setFont(new Font("Arial",Font.BOLD,25));
       l3.setBounds(280,120,400,35);
       add(l3);


        JLabel lName = new JLabel("Name");
        lName.setFont(new Font("Arial",Font.BOLD,20));
        lName.setBounds(100,190,100,30);
        add(lName);

       t1 =new JTextField();
       t1.setFont(new Font("Arial",Font.BOLD,25));
       t1.setBounds(300,190,300,27 );
       add(t1);


        JLabel lName1 = new JLabel("Father Name");
        lName1.setFont(new Font("Arial",Font.BOLD,22));
        lName1.setBounds(100,240,250,30);
        add(lName1);

        t2 =new JTextField();
        t2.setFont(new Font("Arial",Font.BOLD,25));
        t2.setBounds(300,240,300,27 );
        add(t2);


        JLabel DOB = new JLabel("Date of Brith");
        DOB.setFont(new Font("Arial",Font.BOLD,22));
        DOB.setBounds(100,290,250,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,250,30);
        add(dateChooser);


        JLabel Gen = new JLabel("Gender ");
        Gen.setFont(new Font("Arial",Font.BOLD,22));
        Gen.setBounds(100,340,250,30);
        add(Gen);


        ro1 = new JRadioButton("Male");
        ro1.setFont(new Font("Arial",Font.PLAIN,20));
        ro1.setBackground(new Color(222,255,228));
        ro1.setBounds(300,340,100,30);
        add(ro1);


        ro2 = new JRadioButton("Female");
        ro2.setFont(new Font("Arial",Font.PLAIN,20));
        ro2.setBackground(new Color(222,255,228));
        ro2.setBounds(450,340,110,30);
        add(ro2);

        ButtonGroup B = new ButtonGroup();
        B.add(ro1);
        B.add(ro2);


        JLabel Email = new JLabel("Email Id");
        Email.setFont(new Font("Arial",Font.BOLD,23));
        Email.setBounds(100,390,250,30);
        add(Email);

        te = new JTextField();
        te.setFont(new Font("Arial",Font.PLAIN,25));
        te.setBounds(300,390,300,30);
        add(te);


        JLabel mare = new JLabel("Marital Status ");
        mare.setFont(new Font("Arial",Font.BOLD,23));
        mare.setBounds(100,440,250,30);
        add(mare);


        ro3 = new JRadioButton("Married");
        ro3.setFont(new Font("Arial",Font.PLAIN,20));
        ro3.setBackground(new Color(222,255,228));
        ro3.setBounds(300,440,100,30);
        add(ro3);


        ro4 = new JRadioButton("Unmaried");
        ro4.setFont(new Font("Arial",Font.PLAIN,20));
        ro4.setBackground(new Color(222,255,228));
        ro4.setBounds(430,440,150,30);
        add(ro4);


        ro5 = new JRadioButton("Other");
        ro5.setFont(new Font("Arial",Font.PLAIN,20));
        ro5.setBackground(new Color(222,255,228));
        ro5.setBounds(580,440,160,30);
        add(ro5);



        ButtonGroup B1 = new ButtonGroup();
        B1.add(ro3);
        B1.add(ro4);
        B1.add(ro5);


        JLabel Addr = new JLabel("Address");
        Addr.setFont(new Font("Arial",Font.BOLD,23));
        Addr.setBounds(100,490,250,30);
        add(Addr);

        tad = new JTextField();
        tad.setFont(new Font("Arial",Font.PLAIN,25));
        tad.setBounds(300,490,300,30);
        add(tad);


        JLabel City = new JLabel("City");
        City.setFont(new Font("Arial",Font.BOLD,23));
        City.setBounds(100,540,250,30);
        add(City);

        tci = new JTextField();
        tci.setFont(new Font("Arial",Font.PLAIN,25));
        tci.setBounds(300,540,300,30);
        add(tci);


        JLabel lpin = new JLabel("Pin Code");
        lpin.setFont(new Font("Arial",Font.BOLD,23));
        lpin.setBounds(100,590,250,30);
        add(lpin);

        tpin = new JTextField();
        tpin.setFont(new Font("Arial",Font.PLAIN,25));
        tpin.setBounds(300,590,300,30);
        add(tpin);


        JLabel lst = new JLabel("State");
        lst.setFont(new Font("Arial",Font.BOLD,23));
        lst.setBounds(100,640,250,30);
        add(lst);

        tst = new JTextField();
        tst.setFont(new Font("Arial",Font.PLAIN,25));
        tst.setBounds(300,640,300,30);
        add(tst);


        Bnext= new JButton("Next");
        Bnext.setFont(new Font("Arial",Font.PLAIN,20));
        Bnext.setForeground(Color.white);
        Bnext.setBounds(600,680,80,35);
        Bnext.setBackground(new Color(9,2,2));
        Bnext.addActionListener(this);
        add(Bnext);





        getContentPane().setBackground(new Color(220,255,228));
         setLayout(null);
        setSize(800,800);
        setVisible(true);
        setLocation(360,40);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String Fromno = f;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(ro1.isSelected())
        {
            gender="Male";
        }else if(ro2.isSelected())
        {
            gender="Female";
        }

        String email = te.getText();
        String marital=null;
        if(ro3.isSelected())
        {
            marital="Married";
        } else if (ro4.isSelected())
        {
            marital="Unmarried";
        } else if (ro5.isSelected())
        {
            marital="Ohter";
        }

        String address = tad.getText();
        String City = tci.getText();
        String pincode = tpin.getText();
        String State = tst.getText();


        try
        {
            if(t1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill aii the fields");
            }
            else
            {
                 Conn  Co = new Conn();
                 String q = "insert into singup values('"+Fromno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+City+"', '"+pincode+"', '"+State+"')";
                 Co.St.executeUpdate(q);

                 new SingUp2(Fromno);
                 setVisible(false);
            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SingUp();
    }
}
