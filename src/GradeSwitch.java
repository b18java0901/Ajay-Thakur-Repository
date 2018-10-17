import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your marks");
	int marks=s.nextInt();
	marks=marks/10;
	System.out.println(marks);
	
	
	switch(marks)
	{
	case 1:
	case 2:
	case 3:
	System.out.println("sorry you are fail");
     break;
	case 4:
	case 5:
		System.out.println("your marks is average");
		break;
	case 6:
	case 7:
		System.out.println("your marks is good");
		break;
	case 8:
		System.out.println("your marks is very good");
		break;
	case 9:
		System.out.println("your marks is excellent");
		break;
	case 10:
		System.out.println("you are genius");
	
	}

	}

}
