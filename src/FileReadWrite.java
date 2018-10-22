import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {
		int a=10;
		File f=new File("E:\\testing.txt");
		FileOutputStream out=new FileOutputStream(f);
	
		byte[] a1= {'a','j','a','y','t','h','a','k','u','r'};
		out.write(a1);
		
			FileInputStream in=new FileInputStream(f);
			int x=0;
			   while(true)
			   { x=in.read();
			   if(x==-1)
				   break;
				   System.out.println((char)x);
				   
			   }
//		   int size=in.available();
//		   for(int i=0;i<size;i++)
//		   {
//			   System.out.println((char)in.read());
//		   }
		   
			
		
		

	}

}
