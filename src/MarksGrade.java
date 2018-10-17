import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your grade");
		char Grade=s.nextLine().charAt(0);
		switch(Grade)
		{
		case 'A':
		case 'a':
			System.out.println("your marks lies between 91 to 100");
			break;
		case 'B':
		case 'b':
			System.out.println("your marks lies between 75 to 90");
			break;
		case 'c':
		case 'C':
			System.out.println("your marks lies between 60 to 74");
			break;
		case 'd':
		case 'D':
			System.out.println("your marks lies between 40 to 59");
			break;
		case 'E':
		case 'e':
			System.out.println("sorry you are fail");
			break;
			default:
				System.out.println("Invalid Entry");
			
			
		}

	}

}
