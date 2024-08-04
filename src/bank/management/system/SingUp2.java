package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingUp2 extends JFrame implements ActionListener
{

      JComboBox Cb , cb1 , cb2, cb3 , cb4;

      JTextField Tpan,Tadh;

      JRadioButton R1,R2,R3,R4;

      String fFromno;

      JButton Bu;

     SingUp2(String fFromno)
     {
         super("Application From");


         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(60,5,100,100);
         add(image);

          this.fFromno= fFromno;

          JLabel ll = new JLabel("Page 2 :-");
          ll.setFont(new Font("Arial",Font.BOLD,20));
          ll.setForeground(Color.black);
          ll.setBounds(180,9,200,60);
          add(ll);


          JLabel ll1 = new JLabel("Additional Details");
         ll1.setFont(new Font("Arial",Font.BOLD,22));
         ll1.setForeground(Color.black);
         ll1.setBounds(180,40,500,60);
         add(ll1);



         JLabel ll2 = new JLabel("Religion");
         ll2.setFont(new Font("Arial",Font.BOLD,15));
         ll2.setForeground(Color.black);
         ll2.setBounds(90,150 ,200,60);
         add(ll2);


         String religion[]={"Hindu","Muslim","Tamil","Gujrati","Sikh","Christan"};
          Cb = new JComboBox(religion);
          Cb.setBackground(new Color(2,250,246));
          Cb.setFont(new Font("Arial",Font.PLAIN,15));
          Cb.setBounds(280,167,190,25);
          add(Cb);



         JLabel ll3 = new JLabel("Category");
         ll3.setFont(new Font("Arial",Font.BOLD,15));
         ll3.setForeground(Color.black);
         ll3.setBounds(90,200 ,200,60);
         add(ll3);

         String Categ[]={"Gentral","OBC","SCC","ST","Other"};
         cb1 = new JComboBox(Categ);
         cb1.setBackground(new Color(2,250,246));
         cb1.setFont(new Font("Arial",Font.PLAIN,15));
         cb1.setBounds(280,220,190,25);
         add(cb1);


         JLabel ll4 = new JLabel("Income");
         ll4.setFont(new Font("Arial",Font.BOLD,15));
         ll4.setForeground(Color.black);
         ll4.setBounds(92,250 ,200,60);
         add(ll4);


         String Income[]={"Null","<1,50,000","2,50,000","5,00,,000","Upto or Above 10,00,000"};
         cb2 = new JComboBox(Income);
         cb2.setBackground(new Color(2,250,246));
         cb2.setFont(new Font("Arial",Font.PLAIN,15));
         cb2.setBounds(280,270,190,25);
         add(cb2);


         JLabel ll5 = new JLabel("Education");
         ll5.setFont(new Font("Arial",Font.BOLD,15));
         ll5.setForeground(Color.black);
         ll5.setBounds(92,300 ,200,60);
         add(ll5);


         String Education[]={"10th","12th","Under Graduate","Graduate","Post Graduate","Master","Diploma","Other"};
         cb3 = new JComboBox(Education);
         cb3.setBackground(new Color(2,250,246));
         cb3.setFont(new Font("Arial",Font.PLAIN,15));
         cb3.setBounds(280,320,190,25);
         add(cb3);



         JLabel ll6 = new JLabel("Occupation");
         ll6.setFont(new Font("Arial",Font.BOLD,15));
         ll6.setForeground(Color.black);
         ll6.setBounds(92,350 ,200,60);
         add(ll6);


         String Occupation[]={"Salary","Self Employee","Business","Student","Retrirede","Other"};
         cb4 = new JComboBox(Occupation);
         cb4.setBackground(new Color(2,250,246));
         cb4.setFont(new Font("Arial",Font.PLAIN,15));
         cb4.setBounds(280,370,190,25);
         add(cb4);


         JLabel ll7 = new JLabel("Pan No.");
         ll7.setFont(new Font("Arial",Font.BOLD,15));
         ll7.setForeground(Color.black);
         ll7.setBounds(92,400 ,200,60);
         add(ll7);

          Tpan= new JTextField();
         Tpan.setFont(new Font("Arial",Font.PLAIN,14));
         Tpan.setBounds(280,420,190,28);
          add(Tpan);


         JLabel ll8 = new JLabel("Addhar Card No.");
         ll8.setFont(new Font("Arial",Font.BOLD,15));
         ll8.setForeground(Color.black);
         ll8.setBounds(92,455 ,200,60);
         add(ll8);

         Tadh= new JTextField();
         Tadh.setFont(new Font("Arial",Font.PLAIN,14));
         Tadh.setBounds(280,470,190,28);
         add(Tadh);



         JLabel ll9 = new JLabel("Senior Citizen");
         ll9.setFont(new Font("Arial",Font.BOLD,15));
         ll9.setForeground(Color.black);
         ll9.setBounds(92,500 ,200,60);
         add(ll9);

         R1 = new JRadioButton("Yes");
         R1.setFont(new Font("Arial",Font.BOLD,15));
         R1.setBackground(new Color(2,250,246));
         R1.setBounds(280,500 ,90,60);
         add(R1);

         R2 = new JRadioButton("No");
         R2.setFont(new Font("Arial",Font.BOLD,15));
         R2.setBackground(new Color(2,250,246));
         R2.setBounds(380,500 ,90,60);
         add(R2);


         ButtonGroup B = new ButtonGroup();
         B.add(R1);
         B.add(R2);



         JLabel ll10 = new JLabel("Existing Account ");
         ll10.setFont(new Font("Arial",Font.BOLD,15));
         ll10.setForeground(Color.black);
         ll10.setBounds(92,550 ,200,60);
         add(ll10);


         R3 = new JRadioButton("Yes");
         R3.setFont(new Font("Arial",Font.BOLD,15));
         R3.setBackground(new Color(2,250,246));
         R3.setBounds(280,550 ,90,60);
         add(R3);

         R4 = new JRadioButton("No");
         R4.setFont(new Font("Arial",Font.BOLD,15));
         R4.setBackground(new Color(2,250,246));
         R4.setBounds(380,550,90,60);
         add(R4);


         ButtonGroup B1 = new ButtonGroup();
         B1.add(R3);
         B1.add(R4);



         JLabel ll11 = new JLabel("From No. ");
         ll11.setFont(new Font("Arial",Font.BOLD,15));
         ll11.setForeground(Color.black);
         ll11.setBounds(380,15,200,60);
         add(ll11);

         JLabel ll12 = new JLabel(fFromno);
         ll12.setFont(new Font("Arial",Font.BOLD,15));
         ll12.setForeground(Color.black);
         ll12.setBounds(500,20 ,200,60);
         add(ll12);

         Bu= new JButton("Next");
         Bu.setFont(new Font("Arial",Font.BOLD,15));
         Bu.setForeground(Color.white);
         Bu.setBackground(Color.BLACK);
         Bu.setBounds(400,640,70,20);
         Bu.addActionListener(this);
         add(Bu);



         setSize(600,750);
         setLocation(500,90);
         getContentPane().setBackground(new Color(2,250,246));
         setLayout(null);
         setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String rel = (String) Cb.getSelectedItem();
        String cat = (String) cb1.getSelectedItem();
        String inc = (String) cb2.getSelectedItem();
        String edu = (String) cb3.getSelectedItem();
        String occ = (String) cb4.getSelectedItem();

        String pan = (String) Tpan.getText();
        String adh = (String) Tadh.getText();               //inc,edu,occ,pan,adh,sciti,Exa,

        String sciti = null;
        if((R1.isSelected()))
        {
            sciti ="Yes";

        }else if((R2.isSelected()))
        {
            sciti = "No";
        }

        String Exa = null;
        if((R3.isSelected()))
        {
            Exa="Yes";
        } else if (R4.isSelected())
        {
            Exa = "No";

        }
        //inc,edu,occ,pan,adh,sciti,Exa,
        try{
            if(Tpan.getText().equals("") || Tadh.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Fill all the requried fileds");
            }else
            {
                Conn c = new Conn();
                String q ="insert into singup2 values ('"+fFromno+"', '"+rel+"' , '"+cat+"' , '"+inc+"' , '"+edu+"' , '"+occ+"' , '"+pan+"' , '"+adh+"' , '"+sciti+"' , '"+Exa+"')";
                c.St.executeUpdate(q);
                new Singup3(fFromno);
                setVisible(false);

            }

        }catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
         new SingUp2("");
    }
}
