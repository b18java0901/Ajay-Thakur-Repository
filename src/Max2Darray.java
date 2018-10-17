import java.util.Scanner;

public class Max2Darray {

	public static void main(String[] args) {
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=s.nextInt();
		System.out.println("Enter the number of columns");
		int m=s.nextInt();
		int[][] ar=new int[n][m];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ar[i][j]=s.nextInt();
				max=ar[0][0];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				max=(ar[i][j]>max)?ar[i][j]:max;
			}
		}
		System.out.println("Maximum element in 2d array is :: "+max);

	}

}
