import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your marks");
	    Byte marks=s.nextByte();
	    if(marks<40)
	    {
	    	System.out.println("you are fail");
	    }
	    else if(marks>=40&&marks<60)
	    	System.out.println("your marks is average");
	    else if(marks>=60&&marks<80)
	    	System.out.println("your marks is good");
	    else if(marks>=80&&marks<90)
	    	System.out.println("your marks is very good");
	    else if(marks>=90&&marks<100)
	    	System.out.println("your marks is excellent");
	    else if(marks==100)
	    	System.out.println("you are Genius");

	}

}
