package constructors;

public class ConstructorsDemo {
	public static void main(String[] args) {
		Emp emp = new Emp();
		//objects created with defaults values
		System.out.println(emp.getNo());
		System.out.println(emp.getName());
		System.out.println(emp.getLoc());
		System.out.println(emp.getDesig());
		
		//populate the object with some  data
		/*emp.setDesig("THY");
		emp.setLoc("NY");
		emp.setName("GOLO");
		emp.setNo(12);*/
		 // OR
		System.out.println("--------Parametrized constructor will be executed------");
		Emp emp1 = new Emp(10, "Samie", "CA", "Manager");
		
		System.out.println(emp.getNo());
		System.out.println(emp.getName());
		System.out.println(emp.getLoc());
		System.out.println(emp.getDesig());
		
		
	}

}
