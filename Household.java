import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

class Household extends JFrame implements ActionListener
{
    JButton btn1=new JButton("Vehicle");
    JButton btn2=new JButton("SmartGadgets");
    JButton btn3=new JButton("Electronics");
    JButton btn4=new JButton("Medical");
    JButton btn5=new JButton("Attire");
    JButton btn6=new JButton("Cleaning");
    JButton btn7=new JButton("Furniture");
    JButton btn8=new JButton("Grocery");
    JButton btn9=new JButton("Kitchen");
    JButton btn10=new JButton("Sports");
    JPanel p = new JPanel();
    JLabel l = new JLabel();
    Household() {
        setLayout(null);
        setTitle("Household");
        setSize(1920,1080);
        l.setBounds(0,0,1720,800);
        p.setBounds(0,0,1920,1080);
        p.setLayout(null);
        btn1.setBounds(400,150,250,50);
        btn2.setBounds(400,250,250,50);
        btn3.setBounds(400,350,250,50);
        btn4.setBounds(400,450,250,50);
        btn5.setBounds(400,550,250,50);
        btn6.setBounds(800,150,250,50);
        btn7.setBounds(800,250,250,50);
        btn8.setBounds(800,350,250,50);
        btn9.setBounds(800,450,250,50);
        btn10.setBounds(800,550,250,50);
        btn1.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn2.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn3.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn4.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn5.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn6.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn7.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn8.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn9.setFont(new Font("Times New Roman",Font.BOLD, 22));
        btn10.setFont(new Font("Times New Roman",Font.BOLD, 22));


        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn10);
        p.add(l);
        add(p);
        l.setIcon(new ImageIcon("C:\\IMS_Hackathon\\0.jpg"));
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn1)
        {
            vehicle g1=new vehicle();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn2)
        {
            smartGadgets g1=new smartGadgets();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn3)
        {
            Electronics g1=new Electronics();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn4)
        {
            Medical g1=new Medical();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn5)
        {
            Attire g1=new Attire();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn6)
        {
            Cleaning g1=new Cleaning();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn7)
        {
            furniture g1=new furniture();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn8)
        {
            grocery g1=new grocery();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn9)
        {
            kitchen g1=new kitchen();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
        if(ae.getSource()==btn10)
        {
            sports g1=new sports();
            g1.setSize(1920,1080);
            g1.setVisible(true);
        }
    }
    public static void main(String arg[]) {
        Household f=new Household();
        f.setSize(1920,1080);
        f.setVisible(true);

    }
}
