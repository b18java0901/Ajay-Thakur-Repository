import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeStar {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String ");
		String s=br.readLine();
		
		String[] s1=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals("an")||s1[i].equals("a")||s1[i].equals("the"))
			{
				s2=s2+"*** ";
			}
			else
				s2=s2+s1[i]+" ";
		}
		
		System.out.println(s2);

	}

}
