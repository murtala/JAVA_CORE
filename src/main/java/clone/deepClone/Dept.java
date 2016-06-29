package clone.deepClone;

public class Dept implements Cloneable {
	
	int deptid;
	String name;
	/*Address addr;
	
	
	
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", name=" + name + ", addr=" + addr +" ]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address addr = new Address(this.addr.city, this.addr.hno, this.addr.zip, this.addr.street);
		Dept dept  = new Dept (this.deptid, this.name, addr);
		return dept;
	}*/
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	
	

}
