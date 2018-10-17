import java.util.Scanner;

public class PrimePattern {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int count=1;
	 Boolean check=true;
	 System.out.println("Enter the number of terms");
	 int n=s.nextInt();
	 for(int i=1;i<=n;i++)
	 { count=1;
		 for(int j=1;count<=i;j++)
		 {
			 for(int k=2;k<j;k++)
			 { check=true;
				 if(j%k==0)
				 {	 check=false;
				 break;}
			 }
			 if(check==true)
			 {	 System.out.print(j);
			   count++;
			 }
		 }
		 System.out.println();
	 }

	}

}
