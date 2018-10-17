import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		Boolean check=true;
		Float a,b,c;
		do {
			System.out.println("enter 1 for addition");
			System.out.println("enter 2 for substraction");
			System.out.println("enter 3 for multiplication");
			System.out.println("enter 4 for division");
			System.out.println("enter 5 for modulus");
			int cal=S.nextInt();
			switch(cal)
			{
			case 1:
				System.out.println("enter a");
				a=S.nextFloat();
				System.out.println("enter b");
				b=S.nextFloat();
				c=a+b;
				System.out.println("sum = "+c);
				break;
			case 5:
				System.out.println("enter a");
				a=S.nextFloat();
				System.out.println("enter b");
				b=S.nextFloat();
				c=a%b;
				System.out.println("modulus = "+c);
				break;
			case 2:
				System.out.println("enter a");
				a=S.nextFloat();
				System.out.println("enter b");
				b=S.nextFloat();
				c=a-b;
				System.out.println("sub = "+c);
				break;
			case 3:
				System.out.println("enter a");
				a=S.nextFloat();
				System.out.println("enter b");
				b=S.nextFloat();
				c=a*b;
				System.out.println("product = "+c);
				break;
			case 4:
				System.out.println("enter a");
				a=S.nextFloat();
				System.out.println("enter b");
				b=S.nextFloat();
				c=a/b;
				System.out.println("div = "+c);
				break;
				default:
					System.out.println("Invalid Entry");
					
	
				
			}
			System.out.println("Do you want to continue , so enter 1");
			int res=S.nextInt();
			if(res!=1)
			{
				check=false;
				
			}
			
		}while(check==true);
		
		System.out.println("Thanks for using");
	}
	

}
