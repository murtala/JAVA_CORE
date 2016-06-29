package map.hashtable;


public class Emp {
	
	int empno;
	String ename;
	String desig;
	
	
	
	
	public Emp(int empno, String ename, String desig) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.desig = desig;
	}
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", desig=" + desig
				+ "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
