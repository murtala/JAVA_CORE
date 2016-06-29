package inheritance;

public class ContractEmp extends Emp {
	
	int maxHoursPerDay;
	int hourlyRate;
	
	
	
	
	public ContractEmp(int no, String name, String desig, int maxHoursPerDay,
			int hourlyRate) {
		super(no, name, desig); // will get constructors from EMp, the ones designated here
		this.maxHoursPerDay = maxHoursPerDay;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "ContractEmp [maxHoursPerDay=" + maxHoursPerDay
				+ ", hourlyRate=" + hourlyRate + ", no=" + no + ", name="
				+ name + ", desig=" + desig + "]";
	}
	public int getMaxHoursPerDay() {
		return maxHoursPerDay;
	}
	public void setMaxHoursPerDay(int maxHoursPerDay) {
		this.maxHoursPerDay = maxHoursPerDay;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
	
		

}
