package clone;

public class EmpClient {
	
		public static void main(String[] args) throws Exception {
			
			Emp emp = new Emp();
			emp.setNo(10);
			emp.setName("Name1");
			emp.setDesig("Desig 1");
			
		
			Emp emp1 = (Emp)emp.clone(); // emp1 is a clone of emp at this state (name1, desg 1), any other changes in emp will no longer affect emp1. conecpt of shallow cloning
			emp1.setName("Name2");
			
			System.out.println(emp);
			System.out.println(emp1);
			/*emp.setNo(100);
			emp.setName("Name3");
			emp.setDesig("Desig 3");
			
			System.out.println(emp);
			System.out.println(emp1);*/
			
			
	}

}
