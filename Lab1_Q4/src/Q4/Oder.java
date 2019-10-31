package Q4;
import java.util.Scanner;
public class Oder {
	private String ID;
	private item items[];
	private int i;
	Scanner s = new Scanner(System.in);
	public Oder() {
		
		}
	
	public void inputItems() {
		int price;
		String name,itemID;
		System.out.println("Enter number of item: ");
		i= s.nextInt();
		items = new item[i];
		s.nextLine();

		for (int k=0; k<i;k++) {
			items[k] = new item();
			
			System.out.println("Enter name of item "+(k+1));
			name = s.nextLine();
			items[k].setName(name);
		
			System.out.println("Enter ID of item "+(k+1));
			ID = s.nextLine();
			items[k].setID(ID);
			
			System.out.println("Enter price of item "+(k+1));
			price = s.nextInt();
			items[k].setPrice(price);
			s.nextLine();
		}
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public item[] getItems() {
		return items;
	}
	public void setItems(item[] items) {
		this.items = items;
	}
	
	public double calculateAverageCost() {
		int cost=0;
		for(int k=0;k<i;k++) {
			cost+=items[k].getPrice();
		}
		return cost/i;
	}
}
