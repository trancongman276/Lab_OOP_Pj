package lab4.Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectPrinter extends Project implements Runnable{

	private Project project;
	private ArrayList<Employee> els;
	private int t=-1;
	private Thread thr;
	private SimpleDateFormat format;
	
	public ProjectPrinter(String _projectId, String _startDate, String _endDate, ArrayList<Employee> _listofEmployee) {
		super(_projectId, _startDate, _endDate, _listofEmployee);
		els = _listofEmployee;
		project = this;
		Collections.sort(els);
		format = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public void start() {
		if(thr == null) {
			thr = new Thread(this,project.getProjectid());
			thr.start();
		}
	}
	
	@Override
	public void run() {
		while(t!=els.size()-1) {
			try {
				System.out.println(toString());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
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
