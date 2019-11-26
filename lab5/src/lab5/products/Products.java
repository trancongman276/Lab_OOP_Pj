package lab5.products;

import java.io.Serializable;

public class Products implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int amount;
	private String decription;
	
	public Products(String Name, int Amount) {
		name = Name;
		amount = Amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public String toString() {
		return name+" "+amount;
	}
	
}
