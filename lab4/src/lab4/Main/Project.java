package lab4.Main;

import java.util.ArrayList;
import java.sql.Date;

public class Project extends ProjectPrinter{
	private String projectId;
	private Date startDate,endDate;
	private ArrayList<Employee> listofEmployee;
	
	public Project(String _projectId, String _startDate, String _endDate, ArrayList<Employee> _listofEmployee) {
		projectId = _projectId;
		startDate = Date.valueOf(_startDate);
		endDate = Date.valueOf(_endDate);
		listofEmployee = _listofEmployee;
	}
	
	public int estimateBudget() {
		int S=0;
		for(Employee e: listofEmployee) {
			S+=e.getSalaryPerHour()*8*(endDate.compareTo(startDate));
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
