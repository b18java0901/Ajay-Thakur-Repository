import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class SelFrame extends JFrame{
private JPanel mypanel;
private JTextField textfield;
private JPasswordField passwordfield;
/* launch the application*/
public static void main(String ar[])
{
  EventQueue.invokeLater(new Runnable()
{
public void run()
{
try{
SelFrame frame=new SelFrame();
frame.setVisible(true);
}
catch(Exception e)
{
e.printStackTrace();}
}
});
}

public SelFrame()
{
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100,100,600,400);
mypanel=new JPanel();
mypanel.setBackground(SystemColor.inactiveCaption);
mypanel.setBorder(new EmptyBorder(5,5,5,5));
mypanel.setLayout(null);
setContentPane(mypanel);
JLabel user=new JLabel("username");
user.setBounds(64, 57, 60, 14);
mypanel.add(user);
textfield=new JTextField();
textfield.setBounds(180, 54, 86, 20);
textfield.setColumns(10);
mypanel.add(textfield);
JLabel login=new JLabel("LOGIN FORM");
login.setBounds(200,0,240,20);
login.setFont(new Font("Times New Roman",Font.BOLD,18));
mypanel.add(login);
JLabel password=new JLabel("password");
password.setBounds(64, 126, 80, 14);
mypanel.add(password);
passwordfield =new JPasswordField();
passwordfield.setColumns(20);
passwordfield.setBounds(180, 123, 86, 20);
mypanel.add(passwordfield);
JButton btn=new JButton("Login");
btn.setFont(new Font("Times New Roman",Font.BOLD,16));
btn.setBounds(137, 209, 89, 23);
mypanel.add(btn);
btn.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{  try {
	//loading the driver
		Class.forName("com.mysql.jdbc.Driver");
		// creating the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproj", "root" , "");
		// create statement
//		Statement st=con.createStatement();
//		//execute the query
//		ResultSet rs=st.executeQuery("select * from user");
//		while(rs.next())
//		if(textfield.getText().equals(rs.getString(2))&&passwordfield.getText().equals(rs.getString(3)))
//				{
//			JOptionPane.showMessageDialog(mypanel,"Great Login successful");
//				}
		PreparedStatement ps=con.prepareStatement("select * from user where name=? and email=?");
		ps.setString(1,textfield.getText());
		ps.setString(2,passwordfield.getText());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{ JOptionPane.showMessageDialog(mypanel,"Great Login Successful");
		}
		else
         {JOptionPane.showMessageDialog(mypanel,"oops login unsuccessful");
         }
}
       
catch(Exception e1)
{
	e1.printStackTrace();
}
     }
});
 
}
}



