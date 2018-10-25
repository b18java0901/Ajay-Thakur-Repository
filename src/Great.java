import java.util.ArrayList;
import java.util.Scanner;

public class Great {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=s.nextInt();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		int j=0;
		int c=0;
		Boolean check=true;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				ar.add(i);
				j++;
			}
		}
	for(int k=0;k<ar.size();k++)
	{c=ar.get(k);
		for(int i=2;i<c;i++)
		{
			if(c%i==0)
				{
				check=false;
				}
			
			}
		if(check==true)
			ar1.add(ar.get(k));
	}
	int largest=ar1.get(0);
	for(int i=0;i<ar1.size();i++)
	{
		largest=largest>ar1.get(i)?largest:ar1.get(i);
	}
	
	System.out.println("largest prime factor of "+n+" is ::"+largest);
	}
	
	

}
