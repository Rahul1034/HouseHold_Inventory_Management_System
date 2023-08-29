import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class abc extends JFrame implements ActionListener
{
    JLabel l1=new JLabel("rep_Id");
    JLabel l2=new JLabel("rep_name");
    JLabel l3=new JLabel("rep_cost");
    JLabel l4=new JLabel("rep_expiry");
    JTextField t1=new JTextField("");
    JTextField t2=new JTextField("");
    JTextField t3=new JTextField("");
    JTextField t4=new JTextField("");
    JButton btn1=new JButton("Save");
    JButton btn2=new JButton("Search");
    JButton btn3=new JButton("Delete");
    JButton btn4=new JButton("Update");
    Connection con;
    Statement st;
    abc()
    {
        setLayout(null);
        l1.setBounds(650,135,150,60);
        l2.setBounds(650,235,150,60);
        l3.setBounds(650,335,150,60);
        l4.setBounds(650,435,150,60);
        t1.setBounds(750,150,150,40);
        t2.setBounds(750,250,150,40);
        t3.setBounds(750,350,150,40);
        t4.setBounds(750,450,150,40);
        btn1.setBounds(720,550,100,40);
        btn2.setBounds(720,600,100,40);
        btn3.setBounds(720,650,100,40);
        btn4.setBounds(720,700,100,40);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
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
                st.execute("insert into tab values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
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
                ResultSet rs = st.executeQuery("Select * from tab where rep_Id="+t1.getText());
                if(rs.next()){
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
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
                st.execute("Delete from tab where rep_Id="+t1.getText());
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

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
                st.execute("Update tab set rep_name='"+t2.getText()+"', rep_cost='"+t3.getText()+"', rep_expiry='"+t4.getText()+"', where rep_Id="+t1.getText());
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String arg[])
    {
        abc s=new abc();
        s.setSize(1920,1080);
        s.setVisible(true);
    }

}
