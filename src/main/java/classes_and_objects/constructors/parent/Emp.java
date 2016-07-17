package classes_and_objects.constructors.parent;

public class Emp {
	
	public int no;
	public String name;
	public String desig;
	
	public Emp() {
		this(10, "srinu" , "Developer");
		
	}
	
	
	
	public Emp(int no, String name, String desig) {
		this(no, name);
		System.out.println("parameterized constructor");
		
		this.no = no;
		this.name = name;
		this.desig = desig;
	}

	
	public Emp(int no, String name) {
		System.out.println("parameterized constructor");
		this.no = no;
		this.name = name;
		this.desig = desig;
	}



	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", desig=" + desig + "]";
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
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp);
	}
	
	

}
