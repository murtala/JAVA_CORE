package clone;

import java.util.*;

class Emp implements Cloneable {
	// constructor
	public Emp(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = (Date) calendar.getTime();
	}

		
	public Emp(String n, int s) {
		name = n;
		salary = s;
		//GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		//hireDay = (Date) calendar.getTime();
	}

	// a method
	public String getName() {
		return name;
	}

	// more methods
	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(int year, int month, int day)
	   {
	      Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
	      
	      // Example of instance field mutation
	      hireDay.setTime(newHireDay.getTime());
	   }

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	
	
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
	

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", hireDay="
				+ hireDay + "]";
	}


	public Object DeepClone() throws CloneNotSupportedException{
		// call Object.clone()
	      Emp cloned = (Emp) super.clone(); 
	      // clone mutable fields
	      cloned.hireDay = (Date) hireDay.clone();
	     
		return cloned;
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	private String name;
	private double salary;
	private Date hireDay;
}