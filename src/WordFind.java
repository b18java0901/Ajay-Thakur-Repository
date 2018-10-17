import java.util.Scanner;

public class WordFind {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the sentence");
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		System.out.println("enter the word to find");
		String find=s.nextLine();
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].equals(find))
			{
				count++;
			}
		}
	if(count==0)
	{
		System.out.println("your word is not available in the given sentence");
		}
		
		System.out.println(" the frequencey of the number is "+count);
		System.out.println(s2.length);

	

	}
}
