import java.util.Scanner;

public class Figure {
	Scanner s=new Scanner(System.in);
void findArea()
{
	
}
void findPerimeter()
{
	
}
//void tostring()
//{
//	
//}
	

	}
class Rectangle extends Figure
{
	void findArea()
	{
		System.out.println("Enter the length");
		int l=s.nextInt();
		System.out.println("Enter the breadth");
		int b=s.nextInt();
		System.out.println("Area :: "+l*b);
		
	}
	void findPerimeter()
	{System.out.println("Enter the length");
	int l=s.nextInt();
	System.out.println("Enter the breadth");
	int b=s.nextInt();
	System.out.println("perimeter :: "+2*(l+b));
		
	}
	
	public String toString()
	{   System.out.println("hello");
		return("Rectangle opposite sides are equal");
	}
}
class Circle extends Figure{
	void findArea()
	{
		System.out.println("Enter the radius");
		double r=s.nextInt();
		System.out.println("Area of circle is :: "+((3.14)*r*r));
		
		
	}
	void findPerimeter()
	{System.out.println("Enter the radius");
	int r=s.nextInt();
	System.out.println("perimeter of circle :: "+(2*(3.14)*r));
	
		
	}
	
  public String toString()
	{
		return("circle is round in shape");
	}
}
 class Triangle extends Figure{
	 void findArea()
		{
		System.out.println("Enter the base of the triangle");
		double b=s.nextInt();
		System.out.println("Enter the height of the triangle");
		double h=s.nextInt();
		double ar=(b*h)*0.5;
		System.out.println("Arear :: "+ar);
			
			
		}
		void findPerimeter()
		{System.out.println("Enter the side of triangle");
		int a=s.nextInt();
		System.out.println("Perimeter :: "+3*a);
		
			
		}
		
	public String toString()
		{
			return("the sum of all the angles of the triangle is 180 degree");
		}
	}
 


