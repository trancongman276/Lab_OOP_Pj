package main;

public class SavingAccount extends Account implements Comparable<SavingAccount>{
	
	private double interestRate;
	
	public SavingAccount(String accID, String cusID, String accType,
			double initBalance, double interestRate) {
		this.interestRate = interestRate; 
		accountID = accID;
		customerID = cusID;
		accountType = accType;
		balance = initBalance;
	}
	@Override
	public int compareTo(SavingAccount acc) {
		// TODO Auto-generated method stub
		return Double.compare(acc.interestRate, this.interestRate);
	}
	
	public String toString() {
		return "accID: "+accountID+"; "+accountType+"; current balance: "+balance+";"
				+ " Interest Rate: "+interestRate;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
