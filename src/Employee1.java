import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee1 {
	String empId;

	String empName;

	int total_leaves;

	double total_salary;
	void calculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave) throws IOException
	{
		return true;
	}

	void calculate_salary() {
		
	}
}
class PermanentEmp extends Employee1 
{
	int paid_leave, sick_leave, casual_leave;
	
	BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	double basic, hra,pfa,deduction;
	 PermanentEmp() throws IOException
	 {  
		 System.out.println("Enter your employee id :: ");
	    empId=s.readLine();
	    System.out.println("Enter your name :: ");
	    empName=s.readLine();
	 
		 basic=20000.00;
		 hra=(50/100)*basic;
		 pfa=(12/100)*basic;
		 casual_leave=10;
		 sick_leave=10;
		 paid_leave=10;
		 
		 
	 }
	
	

	
	void print_leave_details() {
		 System.out.println("sick leaves :: "+sick_leave);
		 System.out.println("sick leaves :: "+paid_leave);
		 System.out.println("sick leaves :: "+casual_leave);
		
	}

	 void calculate_balance_leaves() {
		 
		total_leaves=sick_leave+paid_leave+casual_leave;
		System.out.println("your total available leaves is :: "+total_leaves);
		
		
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave)throws IOException{
		if(type_of_leave=='s' && no_of_leaves<=sick_leave)
		{
			sick_leave=sick_leave-no_of_leaves;
			System.out.println("your leave availed successfully");
			return true;
		}
		
		else if(type_of_leave=='c' && no_of_leaves<=casual_leave)
		{
			casual_leave=casual_leave-no_of_leaves;
			System.out.println("your leave availed successfully");
			return true;
		}
		
		else if(type_of_leave=='p' && no_of_leaves<=paid_leave)
		{	paid_leave=paid_leave-no_of_leaves;
		System.out.println("your leave availed successfully");
			return true;
		}
		
		else if(type_of_leave=='d')
		{ System.out.println("insufficient leaves , so your salary will be deducted");
			System.out.println("so you wish to avail enter Y");
			char ans=s.readLine().charAt(0);
			if(ans=='y')
			{ System.out.println("your deducted leave applied successfully");
			return false;
			}
		}
		return false;
}
		 
	 

	 void calculate_salary() {
		 total_salary= basic+hra-pfa-deduction;
		 System.out.println(total_salary);
		 
		 
	 }
}
class TemporaryEmp extends Employee1{
	BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	double deduction;
	double basic;
	TemporaryEmp()
	{
		total_leaves=10;
		basic =15000.00;
	}
	 void calculate_balance_leaves()
	 {
		 System.out.println("your total available leaves is :: "+total_leaves);
	 }
	 boolean avail_leave(int no_of_leaves, char type_of_leave) throws IOException
	 {
		 if(no_of_leaves>total_leaves && type_of_leave=='s')
		 {	 
			  System.out.println("insufficient leaves , so your salary will be deducted");
				System.out.println("so you wish to avail enter Y");
				char ans=s.readLine().charAt(0);
				if(ans=='y')
				{ System.out.println("your deducted leave applied successfully");
				return false;
				}
			}
		 else 
		 {  System.out.println("your leave avail successfully");
			 total_leaves=total_leaves-no_of_leaves;
			 return true;
		 }
		 return false;
	 }
	 void calculate_salary()
	 {
		 total_salary=basic-deduction;
		 System.out.println("net salary is :: "+total_salary);
	 }
	 
 }
	



	