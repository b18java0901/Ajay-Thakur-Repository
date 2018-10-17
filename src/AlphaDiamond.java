
public class AlphaDiamond {

	public static void main(String[] args) {
		int x=97;
		int y;
	for(int i=1;i<=3;i++)
	{  x=97;
		for(int j=3;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print((char)x);
			x++;
		}
		x=x-2;
		for(int l=2;l<=i;l++)
		{
			
			System.out.print((char)x);
			x--;
		}
		
		System.out.println();
	}

	for(int i=1;i<=2;i++)
	{ 	x=97;
		for(int j=0;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=2;k>=i;k--)
		{
			System.out.print((char)x);
			x++;
		}
		for(int l=2;l>i;l--)
		{ x=97;
			System.out.print((char)x);
		}
		System.out.println();
	}
	

	}

}
