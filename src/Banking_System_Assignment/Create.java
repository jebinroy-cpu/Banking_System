package Banking_System_Assignment;
import java.util.*;
import exception.*;

public class Create {
	private String c_name;
	private long account_no;
	private double balance;
	Scanner sc = new Scanner(System.in);

	
	public void setName(String cn) {
		this.c_name = cn;
	}
	
	public String getName() {
		return c_name;
	}
	
	public void setAccount_no(long ac) {
		this.account_no = ac;
	}
	public long getAccount_no() {
		return account_no;
	}
	
	public  void setBalance(double b) {
		this.balance = b;
	}
	public double getBalance() {
		return balance;
	}
	
	 
	void createAccount(){
		
		try {
			
		System.out.println("Enter the name :");
		String n = sc.next();
		if(!n.matches("[A-Za-z]+")) {
			throw new InvalidInputException("Name must be in letters");
		}
		setName(n);
		
		
		
		System.out.println("Enter the Account Number :");
		long m =sc.nextLong();
		setAccount_no(m);
		
		
		System.out.println("Enter the Initial Balance Amount :");
		double l = sc.nextDouble();
		if(l<0) {
			throw new InvalidInputException("Enter Valid Amount");
		}
		setBalance(l);
		
		System.out.println("\n......Thank you Your Account is Created ......");
		System.out.println("...... Account Details...... \n");
		System.out.println(" Name : " + getName());
		System.out.println(" Account Number : " + getAccount_no());
		System.out.println(" Balance : " + getBalance());

		}
		
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
}
