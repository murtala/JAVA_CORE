package p1;

public class Emp {

	int no;
	String name;
	String desig;
	static int counter = 10;

	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", desig=" + desig + "]";
	}

	public Emp(int no, String name, String desig) {
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

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Emp.counter = counter;
	}

	public static void main(String[] args) {
		Emp emp = new Emp(10, "Srinu", "developer");
		Emp emp1 = new Emp(20, "ramu", "Lead");
		Emp emp2 = new Emp(30, "Raj", "Mgr");
		
		getCounter();
		
	

		emp.setCounter(20);
		emp1.setCounter(30);
		emp2.setCounter(50);

		System.out.println(emp);
		System.out.println(emp.getCounter());
		System.out.println("-------------------------------------");
		System.out.println(emp1);
		System.out.println(emp1.getCounter());
		System.out.println("-------------------------------------");
		System.out.println(emp2);
		System.out.println(emp2.getCounter());

	}

}
