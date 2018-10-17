

public class Prime100 {
	public static void main(String ar[])
	{ Boolean check=true;
		for(int i=1;i<=100;i++)
		{ check=true;
			for(int j=2;j<i;j++)
			{ 
				if(i%j==0)
				{
					check=false;
					break;
				}
			}
			if(check==true)
			System.out.println(i);
			
		}
		
	}

}
