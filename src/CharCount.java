import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		System.out.println("Enter the character you want to find :: ");
		char c=br.readLine().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				count++;
		}
		
		System.out.println("number of times "+c+"occurs :: "+count);

	}

}
