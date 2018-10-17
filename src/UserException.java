import java.util.Scanner;

public class UserException {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i=4;
		int j=0;
		System.out.println("enter the value");
		j=s.nextInt();
		int k=i+j;
		try {
		if(k<10)
		{
			throw new MyException("Errorrr");
		}
		}
catch(Exception e) {
	System.out.println(e);
}

		

}
}
class MyException extends Exception
{
	public MyException(String msg)
	{super(msg);
		System.out.println(" value less than 10");
	}
}
