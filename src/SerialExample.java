import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialExample {

	public static void main(String[] args) throws Exception {
		Worker w=new Worker();
		w.setName("shahrukh");
		w.setJob("manager");
		w.setSalary(10000);
		FileOutputStream fout=new FileOutputStream("E:\\objects");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(w);
		out.close();
		fout.close();
		Worker w1=null;
		FileInputStream fin =new FileInputStream("E:\\objects");
		ObjectInputStream objin=new ObjectInputStream(fin);
		w1=(Worker)objin.readObject();
		System.out.println("Name ::"+w1.getName());
		System.out.println("Job ::"+w1.getJob());
		System.out.println("Salary ::"+w1.getSalary());
		objin.close();
		fin.close();
		
		
		
		

	}

}
