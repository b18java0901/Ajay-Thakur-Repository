

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel lblName,lblPassword;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrame frame = new MyFrame();
                //frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.inactiveCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        setVisible(true);
        
        lblName = new JLabel("Username");
        lblName.setBounds(64, 57, 60, 14);
        contentPane.add(lblName);
        
        textField = new JTextField();
        textField.setBounds(180, 54, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setColumns(20);
        passwordField.setBounds(180, 123, 86, 20);
        contentPane.add(passwordField);
        
        lblPassword = new JLabel("Password");
        lblPassword.setBounds(64, 126, 80, 14);
        contentPane.add(lblPassword);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try
                {//Step 1: Loading the Driver
                    Class.forName("com.mysql.jdbc.Driver");
                //Step 2: Establishing the connection
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproj", "root" , "");
                //Step 3: Creating the Statement
                Statement st=con.createStatement();
                //Step 4: Executing the Query
                ResultSet rs=st.executeQuery("select * from user");
                //Step 5: Processing the Results
                rs.next();
                if(textField.getText().equals(rs.getString(2))&&passwordField.getText().equals(rs.getString(3)))
                {
            JOptionPane.showMessageDialog(contentPane,"Login Succesful");
              
                
                }
        else
        {
            JOptionPane.showMessageDialog(contentPane,"Login Unsuccesful");
        }

                
                }
                catch(Exception e1)
                {
                    System.out.println(e1);
                }
                
                            }
        });
        btnLogin.setBounds(137, 209, 89, 23);
        contentPane.add(btnLogin);
        
        JLabel lblLoginForm = new JLabel("Login Form");
        lblLoginForm.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblLoginForm.setBounds(170, 11, 89, 14);
        contentPane.add(lblLoginForm);
    }
}
