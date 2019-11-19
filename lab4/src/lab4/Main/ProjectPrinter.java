package lab4.Main;

import java.util.ArrayList;
import java.util.Collections;

public class ProjectPrinter implements Runnable{
	private Project project;
	private ArrayList<Employee> els;
	private int t=-1;
	private boolean running=true;
	private Thread thr;
	
	public void start() {
		if(thr == null) {
			thr = new Thread(this,"Project Printer");
			thr.start();
		}
	}
	
	private void init() {
		els = new ArrayList<>();
		els.add(new Employee("1","Doku",20,3,1));
		els.add(new Employee("2","James",22,5,2));
		els.add(new Employee("3","William",15,0,5));
		els.add(new Employee("4","Max",37,2,6));
		els.add(new Employee("5","Sheldon",5,1,4));
		Collections.sort(els);
		project = new Project("001","2019-11-19","2020-1-1",els);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		init();
		while(running) {
			try {
				System.out.println(toString());
				if(t==els.size()-1) running = false;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public String toString() {
		t++;
		return "[Project ID: "+ project.getProjectid()
	+" - Project Duration: "+ project.getStartDate()
				+" to "+ project.getEndDate()
	+" ][Name: "+ els.get(t).getEmployeeName() 
				+" - Salary Per Hour: "+els.get(t).getSalaryPerHour() 
				+" ]";
	}
	
}
