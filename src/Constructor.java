
public class Constructor {
	int x,y;
    Constructor()
    {
    	System.out.println("default constructor");
    }
    Constructor(int x,int y)
    {
    	this.x=x;
    	this.y=y;
    }
    void show()
    {
    	System.out.println("x :: "+x);
    	System.out.println("y :: "+y);
    }
	public static void main(String[] args) {
		Constructor obj1=new Constructor();
		Constructor obj2=new Constructor(5,2);
		obj1.show();
		obj2.show();

	}

}
