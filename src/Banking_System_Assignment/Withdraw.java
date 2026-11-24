package Banking_System_Assignment;

import java.util.*;
import exception.*;

public class Withdraw {
	double currentbalance;
	Scanner sc = new Scanner(System.in);
	private double w_amount;

	public void setW_amount(double d) {
		this.w_amount = d;
	}

	public double getW_amount() {
		return w_amount;
	}

	void withdrawMoney(Create c) {

		
				System.out.println("Enter the Amount to be Withdraw :");
				setW_amount(sc.nextDouble());
				try {
					if (c.getBalance() > getW_amount()) {
						currentbalance = c.getBalance() - getW_amount();
						c.setBalance(currentbalance);
						System.out.println("\nWithdrawal SuccessFully Done");

						System.out.println("Current Balance : " + c.getBalance());
					} else {
						throw new InsufficientBalanceException("Withdrawal amount greater than your Balance");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} 

	}

