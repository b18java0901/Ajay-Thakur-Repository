import java.util.Scanner;

public class Strudent {
	int rollno;

	String name;

	char grade;

	double eng_marks, math_marks, sci_marks, total_marks, average;
	
	Strudent()
	{   System.out.println("enter name");
	name=s.nextLine();
		System.out.println("enter the roll no");
		rollno=s.nextInt();
		
		System.out.println("enter english marks");
		eng_marks=s.nextDouble();
		System.out.println("enter math marks");
		math_marks=s.nextDouble();
		System.out.println("enter science marks");
		sci_marks=s.nextDouble();
		
		
	}
	public void cal_total()
	{
		total_marks=eng_marks+math_marks+sci_marks;
		System.out.println(total_marks);
	}
	public void average()
	{
		average=total_marks/3;
		System.out.println(average);
		
	}
	public void grade()
	
	{
		if(average<40.00)
		{
			grade='f';
		}
		else if(average>=40 && average<=60)
		{
			grade='d';
		}
		else if(average>60&&average<=80)
		{
			grade='c';
		}
		else if(average>80&&average<=90)
		{
			grade='b';
		}
		else if(average>90&&average<=100)
		{
			grade='a';
		}
		switch(grade)
		{
		case 'f':
			System.out.println("fail");
			break;
		case 'd':
		System.out.println("average score");
		break;
		case 'c':
			System.out.println("good");
			break;
		case 'b':
			System.out.println("verygood");
			break;
		case 'a':
			System.out.println("Excellent");
			break;
		}
	}
Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		Strudent stu1=new Strudent();
		Strudent stu2=new Strudent();
		Strudent stu3=new Strudent();
		Strudent stu4=new Strudent();
		Strudent stu5=new Strudent();
		stu1.cal_total();
		stu1.average();
		stu1.grade();
	
		stu2.cal_total();
		stu2.average();
		stu2.grade();
		stu3.cal_total();
		stu3.average();
		stu3.grade();
		stu4.cal_total();
		stu4.average();
		stu4.grade();
		stu5.cal_total();
		stu5.average();
		stu5.grade();
	

	}

}
