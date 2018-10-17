import java.util.Scanner;

public class CompStringBuffer {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string :: ");
	String s1=s.nextLine();
	StringBuffer sb=new StringBuffer(s1);
	System.out.println("Enter the string to compare :: ");
	String s2=s.nextLine();
	StringBuffer sbf=new StringBuffer(s2);
	String c1=sbf.toString();
	String c2=sb.toString();
	if(c1.equals(c2))
		System.out.println("strings are equal");
	else
		System.out.println("strings are not equal");
	s.close();

	}

}
