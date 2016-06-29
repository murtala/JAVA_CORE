package jdbc.vo;

public class Employee {
	
	int empNo;
	String ename;
	String desig;
	
	
	public Employee(int empNo, String ename, String desig) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", desig="
				+ desig + "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	

}
