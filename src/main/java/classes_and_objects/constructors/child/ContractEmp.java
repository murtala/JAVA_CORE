package classes_and_objects.constructors.child;

import classes_and_objects.constructors.parent.Emp;

public class ContractEmp extends Emp {
	
	int noOfHoursPerDay;
	int hourlyRate;
	
	
	public ContractEmp() {
		super(10, "srinu", "Lean");
	}
	
	
	
	
	public String toString() {
		return "ContractEmp [noOfHoursPerDay=" + noOfHoursPerDay
				+ ", hourlyRate=" + hourlyRate + ", no=" + no + ", name="
				+ name + ", desig=" + desig + "]";
	}
	
	
	
	public int getNoOfHoursPerDay() {
		return noOfHoursPerDay;
	}
	public void setNoOfHoursPerDay(int noOfHoursPerDay) {
		this.noOfHoursPerDay = noOfHoursPerDay;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

}
