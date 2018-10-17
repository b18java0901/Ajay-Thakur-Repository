package myPack;


	

	public class VariableStack implements Stack{
		int size=5;
		public void push(int I)
		{ 
			if(I>size)
				size=I;
		}
		
		public int pop()
		{ System.out.println("Task ends Interface working");
			return(0);
		}
	}
		

	


