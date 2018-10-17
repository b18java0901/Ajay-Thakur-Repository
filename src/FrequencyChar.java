import java.util.Scanner;

public class FrequencyChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter the char for which you want to find the frequency :: ");
		char c1=s.nextLine().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c1)
				count++;
		}
			System.out.println(" frequency of :: "+c1+" = "+count);
		

	}

}
