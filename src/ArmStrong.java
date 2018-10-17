import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the number");
	int n=s.nextInt();
	int org=n;
	
	int []ar=new int[9];
	for(int i=0;n>0;i++)
	{
		ar[i]=n%10;
		n=n/10;
	}
	for(int i=0;i<ar.length;i++)
	{
		sum=sum+ar[i]*ar[i]*ar[i];
	}
	
	if(org==sum)
		System.out.println("number is armstrong");
	else
		System.out.println("number is not armstrong");

	}

}
