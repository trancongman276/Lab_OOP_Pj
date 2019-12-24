package main;

public class CheckingAccount extends Account implements Comparable<CheckingAccount>{
	private double overdraftAmount;
	
	public CheckingAccount(String accID,String cusID, String accType, 
			double initBalance,double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
		accountID = accID;
		customerID = cusID;
		accountType = accType;
		balance = initBalance;
	}

	@Override
	public int compareTo(CheckingAccount acc) {
		// TODO Auto-generated method stub
		return Double.compare(acc.overdraftAmount, this.overdraftAmount);
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance < amount) {
			if((amount - balance) > overdraftAmount) {
				return false;
			}
			else {
				overdraftAmount -= (amount - balance);
				balance = 0;
				return true;
			}
		}
		else {
			balance -= amount;
			return true;
		}
	}
	
	public String toString() {
		return "accID: "+accountID+"; "+accountType+"; current balance: "+balance+";"
				+ " Interest Rate: "+overdraftAmount;
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
}
