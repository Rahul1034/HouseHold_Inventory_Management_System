import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class sports extends JFrame implements ActionListener
{
    JLabel l1=new JLabel("Item_Id");
    JLabel l2=new JLabel("Item_name");
    JLabel l3=new JLabel("Item_cost");
    JTextField t1=new JTextField("");
    JTextField t2=new JTextField("");
    JTextField t3=new JTextField("");
    JButton btn1=new JButton("Save");
    JButton btn2=new JButton("Search");
    JButton btn3=new JButton("Delete");
    JButton btn4=new JButton("Update");
    Connection con;
    Statement st;
    sports()
    {
        setLayout(null);
        setTitle("Sports");
        l1.setBounds(650,135,150,60);
        l2.setBounds(650,235,150,60);
        l3.setBounds(650,335,150,60);
        t1.setBounds(750,150,150,40);
        t2.setBounds(750,250,150,40);
        t3.setBounds(750,350,150,40);
        btn1.setBounds(720,550,100,40);
        btn2.setBounds(720,600,100,40);
        btn3.setBounds(720,650,100,40);
        btn4.setBounds(720,700,100,40);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HouseHoldManagementSystem","root","Rahul@10032004");
            st=con.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn1)
        {
            try
            {
                st.execute("insert into Sports_Equipment values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')");
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        if(ae.getSource()==btn2)
        {
            try
            {
                ResultSet rs = st.executeQuery("Select * from Sports_Equipment where Item_Id="+t1.getText());
                if(rs.next()){
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        if(ae.getSource()==btn3)
        {
            try
            {
                st.execute("Delete from Sports_Equipment where Item_Id="+t1.getText());
                t1.setText("");
                t2.setText("");
                t3.setText("");

            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        if(ae.getSource()==btn4)
        {
            try
            {
                st.execute("Update Sports_Equipment set Item_name='"+t2.getText()+"', Item_cost='"+t3.getText()+"',where Item_Id="+t1.getText());
                t1.setText("");
                t2.setText("");
                t3.setText("");

            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String arg[])
    {
        sports s=new sports();
        s.setSize(1920,1080);
        s.setVisible(true);
    }

}
