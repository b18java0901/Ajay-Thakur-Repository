package myPack;


interface Stack{
	public void push(int I);

	public int pop();
}

public class FixedStack implements Stack{
	int size=7;
	public void push(int I)
	{ 
		if(I>size)
			System.out.println("stack overflow");
	}
	
	public int pop()
	{
		return(0);
	}

}

