import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.ScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class WeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConverter frame = new WeightConverter();
//					UIManager.put("JFrame.activeTitleBackground", Color.red);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WeightConverter() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		setResizable(false);
		

	//	contentPane = new JPanel();
//		contentPane.setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(new BorderLayout());
	    setContentPane(new JLabel(new ImageIcon("C:\\Users\\hp\\Downloads\\New folder\\spacee1.jpg")));
	   setTitle("Ajay Thakur Project");
		//contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//contentPane.setLayout(null);
//	    setContentPane(contentPane);
		getContentPane().setLayout(null);
		JLabel lblWeightConverter = new JLabel("Weight Converter");
		lblWeightConverter.setBackground(new Color(255, 0, 0));
		lblWeightConverter.setForeground(new Color(255, 0, 0));
		lblWeightConverter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeightConverter.setBounds(141, 11, 113, 29);
		getContentPane().add(lblWeightConverter);
		
		JLabel lblEnterYourWeight = new JLabel("Enter Your Weight");
		lblEnterYourWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterYourWeight.setForeground(new Color(255, 0, 0));
		lblEnterYourWeight.setBackground(Color.CYAN);
		lblEnterYourWeight.setBounds(34, 49, 124, 22);
		getContentPane().add(lblEnterYourWeight);
		
		textField = new JTextField();
		textField.setBounds(271, 50, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Mars");
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(34, 115, 90, 22);
		getContentPane().add(button);

		TextField textField_1 = new TextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(273, 115, 84, 22);
		getContentPane().add(textField_1);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{  try {
				
				Float MarWeigh=0.0f;
				MarWeigh=(float) ((float)(Float.parseFloat(textField.getText())/9.81)*3.711);
				textField_1.setText(String.valueOf(MarWeigh));
			}				
			       
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			     }
			});
		TextField textField_2 = new TextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(271, 169, 86, 22);
		getContentPane().add(textField_2);
		
		
		Button button_1 = new Button("Moon");
		button_1.setBackground(new Color(192, 192, 192));
		button_1.setBounds(34, 169, 90, 22);
		getContentPane().add(button_1);
		Button button_2 = new Button("Jupiter");
		button_2.setBackground(new Color(139, 69, 19));
		button_2.setBounds(34, 217, 90, 22);
		getContentPane().add(button_2);
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{  try {
				
				Float MoonWeigh=0.0f;
				MoonWeigh=(float) ((float)(Float.parseFloat(textField.getText())/9.81)*1.622);
				textField_2.setText(String.valueOf(MoonWeigh));
			}
			
					
				   
			       
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			     }
			});
		TextField textField_3 = new TextField();
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setBounds(271, 217, 86, 22);
		getContentPane().add(textField_3);
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{  try {
				
				Float JupWeigh=0.0f;
				JupWeigh=(float) ((float)(Float.parseFloat(textField.getText())/9.81)*24.79);
				textField_3.setText(String.valueOf(JupWeigh));
			}
			
					
				   
			       
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			     }
			});
		
		
		
		
		
		
	}
}
