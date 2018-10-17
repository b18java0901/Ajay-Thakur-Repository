
public class MethodCreation {
	int x=5;
	int y=2;
   void sum(int x,int y)
   { System.out.println("method taking something and returning nothing");
	   System.out.println(x+y);
   }
   int sum1(int x,int y)
   { System.out.println("method taking something and returning something");
	   return(x+y);
	   
   }
   int sum()
   {  System.out.println("method taking nothing returning something");
	   return(x+y);
	   
   }
   void sum1()
   {
	   x=12;
	   y=4;
	   
	   System.out.println("method taking nothing returning nothing");
	   System.out.println(x+y);
   }
	public static void main(String[] args) {
		MethodCreation obj1=new MethodCreation();
		obj1.sum(5,2);
		int result=obj1.sum1(10,15);
		System.out.println(result);
		
		int sum=obj1.sum();
		System.out.println(sum);
		obj1.sum1();
	}

}
