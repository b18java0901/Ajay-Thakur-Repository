import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class AtmException extends Exception{
	AtmException(String x)
	{
		super(x);
	}
}

public class Atm {

	public static void main(String[] args) throws IOException {
		int pin=1596;
		int w;
		int d;
		char check;
		Double Balance=70000.00;
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your pin");
        int user=Integer.parseInt(s.readLine());
        if(user==pin)
        { 
        }
        	do {System.out.println("enter 1 for withdraw");
        	System.out.println("enter 2 for deposit");
        	System.out.println("enter 3 for balance enquiry");
        	int cas=Integer.parseInt(s.readLine());
        	switch(cas)
        	{ case 1:
        		System.out.println("enter the amount to withdraw");
        		w=Integer.parseInt(s.readLine());
        		if(w>Balance)
					try {
						throw new AtmException("insufficient funds");
					} catch (AtmException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.exit(0);
					}
        		else if(Balance<10000)
                {
                	try {
        				throw new AtmException("Your Balance is less than 10000 \n please maintain balance");
        			} catch (AtmException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        				System.exit(1);
        			}
                }
        		
        		Balance=Balance-w;
        		System.out.println("take your cash");
        		break;
        	case 2:
        		System.out.println("enter the amount to deposit");
        		d=Integer.parseInt(s.readLine());
        		Balance=Balance+d;
        		System.out.println("deposit sucessful");
        		break;
        	case 3:
        		System.out.println("Your balance is :: "+Balance);
        		break;
        		default:
        			System.out.println("invalid entry");
        	
        	}
        	System.out.println("enter y for continue and n for stop");
        	check=s.readLine().charAt(0);
        		
        	}while(check=='y');
        	System.out.println("Thanks for using");
//        	System.exit(0);
        }
        
        {
        	try {
				throw new AtmException("invalid pin");
			} catch (AtmException e) {
				
				e.printStackTrace();
			}
        }
        
}    
	
