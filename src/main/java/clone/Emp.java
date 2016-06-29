package clone;

public class Emp implements Cloneable {
	int no;
	String name;
	String desig;
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", desig=" + desig + "]";
	}

	public Emp(){
		
	}
	
	public Emp(int no, String name, String desig) {
		super();
		this.no = no;
		this.name = name;
		this.desig = desig;
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
	
	

}
