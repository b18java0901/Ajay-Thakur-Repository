import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student{
	private String name;
	private int height;
	public Student(String name,int height)
	{
		this.name=name;
		this.height=height;
		
	}
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	
	
}
class HeightComparator implements Comparator<Student>/*sorting on the basis of height*/
{
	
	public int compare(Student s1,Student s2)
	{ int h1=s1.getHeight();
	int h2=s2.getHeight();
		
	
	if(h1<h2)
		return -1;
	else if(h1>h2)
		return 1;
	else
		return 0;
}

}

class NameComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		String n1=s1.getName();
		String n2=s2.getName();
		int i=n1.compareToIgnoreCase(n2);
		return i;
	}
}



public class ComparatorDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader ss=new BufferedReader(new InputStreamReader(System.in));
		Student s1=new Student("Ajay",185);
		Student s2=new Student("rajat",170);
		Student s3=new Student("pankaj",165);
		Student s4=new Student("rahul",180);
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		for(Student s:a1)
			System.out.println(s.getName()+" "+s.getHeight());
//		for(int i=0;i<a1.size();i++)
//		{
//			System.out.println(a1.get(i).getName()+" "+a1.get(i).getHeight());
//		}
		
		char check='y';
		while(check=='y')
		{System.out.println("what you want /n press 1 for height sorting /n press 2 for name sorting");
		char c=ss.readLine().charAt(0);
		switch(c)
		{
		case'1':
			HeightComparator hc=new HeightComparator();/*height comparison8*/
		    Collections.sort(a1,hc);
		    System.out.println("Here is the sorting list ");
	        for(Student s:a1)
			System.out.println(s.getName()+" "+s.getHeight());
	        break;
		case '2':
			NameComparator nc=new NameComparator();
			Collections.sort(a1,nc);
		    System.out.println("Here is the sorting list ");
	        for(Student s:a1)
			System.out.println(s.getName()+" "+s.getHeight());
	        break;
	        default:
	        	System.out.println("Invalid try");
	        	break;
	        	}
		System.out.println("do you want to continue enter y otherwise n");
		check=ss.readLine().charAt(0);
		System.out.println(a1.get(2).getName());
		
		

}
}
}
