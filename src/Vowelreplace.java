import java.util.Scanner;

public class Vowelreplace {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String s1=s.nextLine();
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
			s1.charAt(i)=='o'||s1.charAt(i)=='u')
	{
		s1=s1.replace(s1.charAt(i),'$') ; 
	}
	}
System.out.println("now your new string is :: "+s1);

}
}
