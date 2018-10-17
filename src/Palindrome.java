import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=s.nextLine();
		String palen="";
		char rev;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=str.charAt(i);
			System.out.println(rev);
			palen=palen+rev;
			
		}
		System.out.println(palen);
		if(palen.equals(str))
			System.out.println("number is palendrome");
		else 
			System.out.println("number is not palendrome");
		
		

	}

}
