
public class Emp {
	
	int no;
	String name;
	String loc;
	
	
	
	
	public Emp(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
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
	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method executed..........");
	}
	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", loc=" + loc + "]";
	}
	
	
	
	
	

}
