import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayObject {
 String name;
 int Marks;
 int j;
 public void show()
 {
	 System.out.println("Name :: "+name);
	 System.out.println("Marks :: "+Marks);
 }
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String marks=null;
	System.out.println("Enter the number of entries ayou want");
		String n=br.readLine();
		int m=Integer.parseInt(n);
	ArrayObject[] ar=new ArrayObject[m];
	for(int i=0;i<m;i++)
	{
		ar[i]=new ArrayObject();
	}
	for(int i=0;i<m;i++)
	{    System.out.println("Enter the name");
		 ar[i].name=br.readLine();
         System.out.println("Enter the Marks");
         marks=br.readLine();
         ar[i].Marks=Integer.parseInt(marks);
	}
	for(int j=0;j<m;j++)
	{
		ar[j].show();
	}

	}

}
