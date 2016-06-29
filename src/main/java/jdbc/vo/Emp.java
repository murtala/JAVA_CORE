package jdbc.vo;

import java.sql.Date;
public class Emp {

	long  empNo;
	String eName;
	String Job;
	long  mgr;
	Date hiredate;
	long sal;
	float comm;
	long deptno;
	
	
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", Job=" + Job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
	
	
	
	public Emp(long empNo, String eName, String job, long mgr, Date hiredate,
			long sal, float comm, long deptno) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		Job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}





	public Emp(int empNo2, String ename2, String job2, int mgr2, java.util.Date hiredate2, float sal2, float com,
			int deptNo2) {
		super();
		this.empNo = empNo2;
		this.eName = ename2;
		Job = job2;
		this.mgr = mgr2;
		this.hiredate = (Date) hiredate2;
		this.sal = (long) sal2;
		this.comm = com;
		this.deptno = deptNo2;
	}





	public long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public long getMgr() {
		return mgr;
	}
	public void setMgr(long mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	public long getDeptno() {
		return deptno;
	}
	public void setDeptno(long deptno) {
		this.deptno = deptno;
	}
		
}
