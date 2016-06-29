package constructors;

public class Emp {
	int no;
	String name;
	String loc;
	String desig;
	
	//default constructor
	//a contructor should have the same name as   class name. this is called default construuctor 
	public Emp(){
		
		// this(10, "SAMY", "AL", "leader");
		System.out.println("default constructor executed");
		no = 10;
		name = "jon";
		loc = "NJ";
		desig ="Master";				
		
	}
	// emp is called overloaded 
	//parametrized constructor
	public Emp(int no, String name, String loc, String desig) {
		this(); // this() keyword is used to call the overloaded constructor
		System.out.println("parametrized constructor executed");
		//super();
		this.no = no;
		this.name = name;
		this.loc = loc;
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", loc=" + loc + ", desig="
				+ desig + "]";
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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	

}
