import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :: ");
		String str=s.nextLine();
		String s1="";
	for(int i=str.length()-1;i>=0;i--)
	{
		s1=s1+str.charAt(i);
	}
		System.out.println(s1);
		if(s1.equals(str))
			System.out.println("string is palendrome");
		else
			System.out.println("string is not palendrome");
		s.close();

	}

}
