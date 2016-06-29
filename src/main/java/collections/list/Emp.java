package collections.list;

public class Emp {

	int no;
	String name;
	String desig;
	float sal;
	
	
	public Emp(int no, String name, String desig, float sal) {
		super();
		this.no = no;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", desig=" + desig
				+ ", sal=" + sal + "]";
	}
	
	
	
	
}
