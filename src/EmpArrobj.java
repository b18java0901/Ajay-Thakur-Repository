import java.util.Scanner;

public class EmpArrobj {
   int id;
   String name;
   int salary;
   
   Scanner s=new Scanner(System.in);
   void Getdata()
   {  
	   System.out.println("Enter the ID");
	   id=Integer.parseInt(s.nextLine());
	   System.out.println("Enter the Name");
	   name=s.nextLine();
	   System.out.println("Enter the Salary");
	  salary=Integer.parseInt(s.nextLine());
   }
    void Putdata()
   {
	   System.out.println("ID :: "+id);
	   System.out.println("Name :: "+name);
	   System.out.println("salary :: "+salary);
   }
	public static void main(String[] args) {
		
		
		EmpArrobj[] Emp=new EmpArrobj[3];
		int i=0;
		for(i=0;i<3;i++)
			Emp[i]=new EmpArrobj();
		for(i=0;i<3;i++)
			Emp[i].Getdata();
		for(i=0;i<3;i++)
			Emp[i].Putdata();
		

	}

}
