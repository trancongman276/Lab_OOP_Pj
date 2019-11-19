package lab4.Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectPrinter implements Runnable{
	private Project project;
	private ArrayList<Employee> els;
	private int t=-1;
	private boolean running=true;
	private Thread thr;
	private SimpleDateFormat format;
	
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
		project = new Project("001","19/11/2019","1/1/2020",els);
		format = new SimpleDateFormat("dd/MM/yyyy");
	}
	@Override
	public void run() {
		init();
		while(running) {
			try {
				System.out.println(toString());
				if(t==els.size()-1) running = false;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		System.out.println(project.estimateBudget());
	}
	
	public String toString() {
		t++;
		return "[Project ID: "+ project.getProjectid()
	+" - Project Duration: "+ format.format(project.getStartDate())
				+" to "+ format.format(project.getEndDate())
	+" ][Name: "+ els.get(t).getEmployeeName() 
				+" - Salary Per Hour: "+els.get(t).getSalaryPerHour() 
				+" ]";
	}
	
}
