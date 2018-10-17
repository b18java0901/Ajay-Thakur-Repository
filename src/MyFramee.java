import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MyFramee extends JFrame implements ItemListener{

	private JPanel contentPane;
	JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFramee frame = new MyFramee();
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
	public MyFramee() {
		setTitle("ItemListener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		Color[] clr={Color.RED,Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.MAGENTA,Color.YELLOW};
		 comboBox = new JComboBox(clr);
		comboBox.setBounds(114, 75, 133, 28);
		comboBox.addItemListener(this);
		contentPane.add(comboBox);
		setResizable(false);
		JLabel lblBackgroundChanger = new JLabel("Background changer");
		lblBackgroundChanger.setBounds(135, 11, 147, 14);
		contentPane.add(lblBackgroundChanger);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	Color selectedcolor=(Color)comboBox.getSelectedItem();
		contentPane.setBackground(selectedcolor);
	}
}
