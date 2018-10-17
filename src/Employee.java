import java.util.Scanner;

public class Employee {
	public void Calculate_bonus(Double basic,char Grade)
	{
		switch(Grade)
		{
		case 'm':
		case 'M':
			if(basic>=20000)
			{
				Double bonus=10000.00;
				System.out.println("your bonus is ::"+bonus);
			}
			else if(basic<20000)
			{
				Double bonus=7000.00;
				System.out.println("your bonus is ::"+bonus);
			}
			break;
		case 'E':
		case 'e':
			if(basic>=15000)
			{
				Double bonus=5000.00;
				System.out.println("your bonus is ::"+bonus);
			}
			else if(basic<15000)
			{
				Double bonus=3000.00;
				System.out.println("your bonus is ::"+bonus);
			}
			break;
		}
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Grade");
		char Grade=s.nextLine().charAt(0);
		System.out.println("Enter the Basics salary");
		Double basic=s.nextDouble();
		Employee obj=new Employee();
		obj.Calculate_bonus( basic,Grade);
		

	}

}
