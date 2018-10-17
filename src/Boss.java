import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boss {

	public static void main(String[] args)throws IOException {
		PermanentEmp pmp=new PermanentEmp();
		TemporaryEmp temp=new TemporaryEmp();
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		char ch='y';
		char res='y';
		do {
	
		
		System.out.println("enter 1 for permanent employee \n 2 for temporary employee");
		int e=Integer.parseInt(s.readLine());
		switch(e)
		{
		case 1:
		do {
			System.out.println("Enrter 1 for print leave details \n 2 for calculate balance leaves \n 3 for avail leave \n 4 for calculate salary");
		    int choice=Integer.parseInt(s.readLine());	
		    switch(choice)
		    {
		    case 1: pmp.print_leave_details();
		    break;
		    case 2: pmp.calculate_balance_leaves();
		    break;
		    case 3: 
		    	System.out.println("Enter the type of leave you want \n enter s for sick leave \n c for casual leave \n p for paid leave \n d for deducted leave");
		    	char leave=s.readLine().charAt(0);
		    	System.out.println("enter the number of leaves");
		    	int n=Integer.parseInt(s.readLine());
		    	boolean check=pmp.avail_leave(n,leave);
		    	if(check==false)
		    		pmp.deduction=(pmp.basic/30)*n;
		    	break;
		    case 4: 
		    	pmp.calculate_salary();
		    	break;
		    }
		    System.out.println(" enter y for continue and n for exit ");
		    ch=s.readLine().charAt(0);
		    }while(ch=='y');
		break;
		case 2:
			do {
				System.out.println("Enrter  1 for calculate balance leaves \n 2 for avail leave \n 3 for calculate salary");
			    int choice=Integer.parseInt(s.readLine());	
			    switch(choice)
			    {
			    
			 
			    case 1: temp.calculate_balance_leaves();
			    break;
			    case 2: 
			    	System.out.println("Enter s for simple leave");
			    	
			    	char leave=s.readLine().charAt(0);
			    	System.out.println("enter the number of leaves");
			    	int n=Integer.parseInt(s.readLine());
			    	boolean check=temp.avail_leave(n,leave);
			    	if(check==false)
			    		temp.deduction=(temp.basic/30)*n;
			    	break;
			    case 3: 
			    	temp.calculate_salary();
			    	break;
			    }
			    System.out.println(" enter y for continue and n for exit ");
			    ch=s.readLine().charAt(0);
			    }while(ch=='y');
			
		}
		}while(res=='y');
			
		if(ch!='y')
		{
			System.out.println("Thanx for using");
		}
	}
}
		
		
		


