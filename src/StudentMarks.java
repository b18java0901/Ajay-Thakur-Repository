import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 class MyMarks extends JFrame implements ItemListener{
Container c;
JComboBox combo;
MyMarks()
{
	c=this.getContentPane();
	c.setLayout(null);
	Font F=new Font("Arial",Font.BOLD,16);
    String[] Name= {"select your name ","Ajay","Rajat","Rahul","Pankaj","Shubham"};
    combo=new JComboBox(Name);
    combo.setBounds(114, 75, 133, 28);
    combo.addItemListener(this);
    combo.setFont(F);
    c.add(combo);
}


	public void itemStateChanged(ItemEvent e) {
		if(combo.getSelectedItem().toString()=="Ajay")
		{ 
			  JOptionPane.showMessageDialog(getContentPane(),"Ajay marks is 90");
			System.out.println("");
		}
		else if(combo.getSelectedItem().toString()=="Rajat")
		{
			 JOptionPane.showMessageDialog(getContentPane(),"Rajat marks is 70");
		}
		else if(combo.getSelectedItem().toString()=="Rahul")
		{
			 JOptionPane.showMessageDialog(getContentPane(),"Rahul marks is 57");
		}

		else if(combo.getSelectedItem().toString()=="Pankaj")
		{
			 JOptionPane.showMessageDialog(getContentPane(),"Pankaj marks is 60");
		}
		else if(combo.getSelectedItem().toString()=="Shubham")
		{
			 JOptionPane.showMessageDialog(getContentPane(),"Shubham marks is 95");
		}
		
		
	}
	
}





class StudentMarks {

	public static void main(String[] args) {
		MyMarks m=new MyMarks();
		m.setBounds(100,50,600,300);
        m.setVisible(true);
	}

}
