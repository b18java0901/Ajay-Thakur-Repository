import java.util.Scanner;

class InvalidAge extends Exception
{
	InvalidAge(String s)
	{
		super(s);
	}
}




public class OwnException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		if(age<18||age>120)
		{
			try {
				throw new InvalidAge("Invalid age entered");
			} catch (InvalidAge e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Hello");

	}

}
