package lab4.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Project extends ProjectPrinter{
	private String projectId;
	private Date startDate,endDate;
	private ArrayList<Employee> listofEmployee;
	
	public Project(String _projectId, String _startDate, String _endDate, ArrayList<Employee> _listofEmployee) {
		projectId = _projectId;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			startDate = format.parse(_startDate);
			endDate = format.parse(_endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		listofEmployee = _listofEmployee;
	}
	
	public int estimateBudget() {
		int S=0;
		for(Employee e: listofEmployee) {
			S+=e.getSalaryPerHour()*8*(
					TimeUnit.DAYS.convert(endDate.getTime()-startDate.getTime(),TimeUnit.MILLISECONDS));
		}
		return S;
	}
	
	@Override
	public String toString() {
		String t="";
		for(Employee e : listofEmployee) {
			t+=e.toString()+"\n";
		}
		return t;
	}

	public String getProjectid() {
		return projectId;
	}

	public void setProjectid(String projectid) {
		this.projectId = projectid;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Employee> getListofEmployee() {
		return listofEmployee;
	}

	public void setListofEmployee(ArrayList<Employee> listofEmployee) {
		this.listofEmployee = listofEmployee;
	}
	
	
}
