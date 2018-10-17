import java.util.Scanner;

public class Minimum1dAr {

	public static void main(String[] args) {
		int min=0;
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("Enter the number of terms");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			min=arr[0];
		}
		
		
			for(int i=0;i<n;i++)
			{
				min=(arr[i]<min)?arr[i]:min;
			}
			System.out.println("minimium element in array is :: "+min);
		
		   System.out.println("Thanx for visiting");

	}

}
