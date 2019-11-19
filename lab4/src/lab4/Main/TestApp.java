package lab4.Main;

import java.util.ArrayList;

public class TestApp {
	public static void main(String arg[]) {
		ArrayList<Employee> els = new ArrayList<>();
		els.add(new Employee("1","Doku",20,3,1));
		els.add(new Employee("2","James",22,5,2));
		els.add(new Employee("3","William",15,0,5));
		els.add(new Employee("4","Max",37,2,6));
		els.add(new Employee("5","Sheldon",5,1,4));
		
		ArrayList<Employee> els2 = new ArrayList<>();
		els2.add(new Employee("1","Senna",6,1,1));
		els2.add(new Employee("2","Lucian",12,4,5));
		els2.add(new Employee("3","Lux",2,0,2));
		els2.add(new Employee("4","Yasuo",54,5,2));
		els2.add(new Employee("5","Zed",21,4,3));
		
		ProjectPrinter pj1 = new ProjectPrinter("001","19/11/2019","1/1/2020",els);
		pj1.start();
		ProjectPrinter pj2 = new ProjectPrinter("002","15/11/2019","20/2/2020",els2);
		pj2.start();
	}
}
