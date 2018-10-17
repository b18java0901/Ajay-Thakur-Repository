import java.util.Scanner;

public class JaggedArray {
    
	public static void main(String[] args) {
		int a=0,b=0;
		 int m=0;
		 Boolean check=true;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of Rows");
		int n=s.nextInt();
		int[][]ar=new int[3][];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number of columns for "+(i+1)+" row");
			m=s.nextInt();
			ar[i]=new int[m];
		}
		System.out.println("Enter the elements of Jagged array");
		for(int i=0;i<n;i++)
		{ System.out.println("Enter the elements of "+(i+1)+" row");
			for(int j=0;j<ar[i].length;j++)
			{ ar[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Enter the element to find");
		int find=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				if(ar[i][j]==find)
				{	check=false;
					a=i;
					b=j;
					break;
			    }
				if(check==false)
				{
					break;
				}
		   }

	

	    }
		System.out.println("position of your number is :: ("+a+","+b+")");
}
}
