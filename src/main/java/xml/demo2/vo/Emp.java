package xml.demo2.vo;

import java.util.Date;

public class Emp {

	int empNo;
	String ename;
	String job;
	int mgr;
	Date hireDate;
	float sal;
	float com;
	int deptNo;

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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public float getCom() {
		return com;
	}

	public void setCom(float com) {
		this.com = com;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hireDate=" + hireDate + ", sal=" + sal
				+ ", com=" + com + ", deptNo=" + deptNo + "]";
	}
	
	

}
