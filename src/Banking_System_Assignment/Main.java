package Banking_System_Assignment;
import java.util.*;
import exception.InvalidInputException;


public class Main {
	static boolean repeat = true;
	
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("========================================================="); 
System.out.println("BANKING APPLICATION");
System.out.println("========================================================="); 
System.out.println("\n 1.Create Account");
System.out.println("\n 2.Deposit Money");
System.out.println("\n 3.Withdraw Money");
System.out.println("\n 4.Balance Enquiry");
System.out.println("\n 5.Exit");

Create c = new Create();
Deposit d = new Deposit();
Withdraw w = new Withdraw();
Balance b = new Balance();

while(repeat) {
System.out.println("\nEnter Your Choice :");
int n = sc.nextInt();
try {
if(n<1||n>5) {
	throw new InvalidInputException("Select Between 1 to 5");
}
}
catch(Exception e) {
	System.out.println(e.getMessage());
}

switch(n) {
case 1 : c.createAccount();
break;
case 2 : d.depositMoney(c);
break;
case 3 : w.withdrawMoney(c);
break;
case 4 : b.balanceCheck(c);
break;
case 5 : System.out.println("Thank You for Using Banking Application");
repeat = false;
}
}


	}

}
