import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferClass {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String Roll_no;
	String Name;
	String Marks;
     BufferClass() throws IOException
     { System.out.println("Enter the roll number");
    	 Roll_no=br.readLine();
    	 System.out.println("Enter the name");
    	  Name=br.readLine();
    	  System.out.println("Enter the marks");
    	  Marks=br.readLine();
     }
     void show()
     {
    	int roll=Integer.parseInt(Roll_no);
    	String name=Name;
    	int Marks=Integer.parseInt(this.Marks);
    	System.out.println("roll number :: "+roll);
    	System.out.println("name of student :: "+name);
    	System.out.println("marks of a student  :: "+Marks);
    	
     }
	public static void main(String[] args) throws IOException {
		BufferClass obj=new BufferClass();
		BufferClass obj1=new BufferClass();
		obj.show();
		obj1.show();
		
	
	

	}

}
