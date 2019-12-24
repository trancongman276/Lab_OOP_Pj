package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	private String name, address;
	private List<Account> listOfAccount;
	
	public Bank(String initName, String initAddress) {
		name = initName;
		address = initAddress;
		listOfAccount = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		try{
			listOfAccount.add(account);
			System.out.println("<"+account.customerID+"> <"+account.accountType+"> <"
					+account.accountID+"> was added successfully!");
		}catch(Exception e) {
			System.out.println("Couldn't add this account.");
		}
	}
	
	public String displayAccByCustomerID(String customerID) {
		String out="";
		for(Account acc : listOfAccount) {
			if(acc.getCustomerID().matches(customerID)) {
				out+=acc.toString()+"\n";
			}
		}
		if (out!="") return out; 
		else return "No result.";
	}
	
	public String displayAccByCustomerID(String customerID, String accountType) {
		String out="";
		for(Account acc : listOfAccount) {
			if(acc.getCustomerID().matches(customerID) 
					&& acc.getAccountType().matches(accountType)) {
				out+=acc.toString()+"\n";
			}
		}	
		if (out!="") return out; 
		else return "No result.";
	}
	
	public String toString() {
		return "Bank name: "+name+"; Bank address:"+address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getListOfAccount() {
		return listOfAccount;
	}

	public void setListOfAccount(List<Account> listOfAccount) {
		this.listOfAccount = listOfAccount;
	}
}

class Main{
	private static Bank bank;
	private static Scanner sc;
	public static void main(String arg[]) {
		bank = new Bank("Doku's bank","147");
		//cus001
			bank.addAccount(new SavingAccount("sa01", "cus001", "Savings Account", 3000, 0.03));
			bank.addAccount(new SavingAccount("sa05", "cus001", "Savings Account", 2000, 0.02));
			bank.addAccount(new CheckingAccount("ca01", "cus001", "Checking Account", 5000, 500));
		
		//cus002
			bank.addAccount(new CheckingAccount("ca02", "cus002", "Checking Account", 4000, 400));
	
		//cus003
			bank.addAccount(new SavingAccount("sa02", "cus003", "Savings Account", 2000, 0.02));
			bank.addAccount(new CheckingAccount("ca03", "cus003", "Checking Account", 2000, 200));
			
		//cus004
			bank.addAccount(new SavingAccount("sa03", "cus004", "Savings Account", 6000, 0.05));
			bank.addAccount(new CheckingAccount("ca04", "cus004", "Checking Account", 7000, 700));
			
		//cus005
			bank.addAccount(new SavingAccount("sa04", "cus005", "Savings Account", 8000, 0.05));
			bank.addAccount(new CheckingAccount("ca05", "cus005", "Checking Account", 5000, 500));
		
		//testing
		sc = new Scanner(System.in);
		String cusID, accType;
		int withdraw;
		System.out.print("Customer ID: "); cusID = sc.nextLine();
		System.out.println(bank.displayAccByCustomerID(cusID));
		
		System.out.print("Customer ID: "); cusID = sc.nextLine();
		System.out.print("Account Type: "); accType = sc.nextLine();
		System.out.println(bank.displayAccByCustomerID(cusID,accType));
		
		System.out.print("Withdraw amount: "); withdraw = sc.nextInt();
		System.out.println(bank.getListOfAccount().get(2).withdraw(withdraw)); //test Withdraw acc ca01
	}
}