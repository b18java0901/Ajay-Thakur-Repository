import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WordFqsub {

	public static void main(String[] args) throws IOException {
		int count=0;
		boolean check=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
        String s=br.readLine();
        System.out.println("Enter the  word to find");
        String s1=br.readLine();
        String s2="";
     int l=0;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)==' ')
        	{
        	s2=s.substring(l,i);
        	l=i+1;
        	if(s2.equals(s1))
    		{ 
        		System.out.println(s2);
    			count++;	
    		}		
        	
    		
         }
        	else if(i==s.length()-1)
        	{
        		s2=s.substring(l,s.length());
        		System.out.println(s2);
        		if(s2.equals(s1))
        			count++;
        	}
      

	

}
        System.out.println(" your word frequency is ::"+count);
	}
}
