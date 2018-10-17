package pack2;
import java.util.Scanner;

import pack1.*;

public class B extends A {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("enter the A ");
				int a=s.nextInt();
				System.out.println("Enter the B");
				int b=s.nextInt();
				B obj=new B();
				obj.sum(a,b);
				s.close();
		    }

}
