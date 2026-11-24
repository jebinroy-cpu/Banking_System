package Banking_System_Assignment;

import java.util.*;
import exception.*;

public class Deposit {
	double currentbalance;

	Scanner sc = new Scanner(System.in);
	private double depo_amount;

	public void setDepo_amount(double d) {
		this.depo_amount = d;
	}

	public double getDepo_amount() {
		return depo_amount;
	}

	void depositMoney(Create c) {

		
				System.out.println("Enter the Amount to be Added :");
				setDepo_amount(sc.nextDouble());
				
				
                try {
                if(getDepo_amount()>0) {	
                
				currentbalance = getDepo_amount() + c.getBalance();
				c.setBalance(currentbalance);

				System.out.println("\nDeposit SuccessFully Done");

				System.out.println("Current Balance : " + c.getBalance());
                }
                else {
                	throw new invalidAmountException("Enter a valid amount to deposit");
                }
                }
                catch(Exception e) {
                	System.out.println(e.getMessage());
                }
                
                
			}
		

	}

