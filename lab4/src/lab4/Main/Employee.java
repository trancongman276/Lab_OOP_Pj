package lab4.Main;


public class Employee implements Comparable<Employee>{
	private String employeeId,employeeName;
	private int salaryPerHour, noOfLeavingDay, noOfTravelDay;
	
	public Employee(String _employeeID, String _employeeName,int _salaryPerHour, int _noOfLeavingDay, int _noOfTravelDay) {
		employeeId = _employeeID;
		employeeName = _employeeName;
		salaryPerHour = _salaryPerHour;
		noOfLeavingDay = _noOfLeavingDay;
		noOfTravelDay = _noOfTravelDay;
	}
	
	public int calculateWeeklySalary() {
		return salaryPerHour*8*(5-noOfLeavingDay+noOfTravelDay/2);
	}
	
	@Override
	public String toString() {
		return "Name: " + employeeName +
				" - Salary Per Hour: "+ salaryPerHour +
				" -  Weekly Salary: "+calculateWeeklySalary();
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.noOfTravelDay>e.noOfTravelDay)  return 1;
		if(this.noOfTravelDay<e.noOfTravelDay) return -1;
		if(this.noOfTravelDay==e.noOfTravelDay) {
			if(this.noOfLeavingDay>e.noOfLeavingDay) return 1;
			if(this.noOfLeavingDay<e.noOfLeavingDay) return -1;
		}
		return 0;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getNoOfLeavingDay() {
		return noOfLeavingDay;
	}

	public void setNoOfLeavingDay(int noOfLeavingDay) {
		this.noOfLeavingDay = noOfLeavingDay;
	}

	public int getNoOfTravelDay() {
		return noOfTravelDay;
	}

	public void setNoOfTravelDay(int noOfTravelDay) {
		this.noOfTravelDay = noOfTravelDay;
	}
	
	
}
