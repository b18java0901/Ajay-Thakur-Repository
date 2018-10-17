import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		Boolean check=true;
		for(int i=2;i<n;i++)
		{ 
			if(n%i==0)
			{
				check=false;
				break;
			}
		}
		if(check==true)
			System.out.println("number is prime");
		if(check==false)
			System.out.println("number is not a prime");

	}

}
