package Banking_System_Assignment;
import exception.*;


public class Balance {
	void balanceCheck(Create c) {
		
		System.out.println("=======================================");
		
		System.out.println("ACCOUNT DETAILS");
		
		System.out.println("=======================================");
		
		System.out.println("Customer Name : " + c.getName());
		
		System.out.println("Account Number : " + c.getAccount_no());

		System.out.println("Your Current Balance : " + c.getBalance());
		
		System.out.println("=======================================");
		System.out.println("=======================================");
		}
	
	}

