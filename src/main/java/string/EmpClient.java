
public class EmpClient {
	
	public static void main(String[] args) {		
		
		
		int a = 10;
		int  b = 20;
		
		if(a == b) {
			System.out.println("  a and b are equal");
		} else {
			System.out.println(" a and b are not equal");
		}
		
		String str = new String("javatraining");
		
		String str1 = new String("javatraining");
		
		/*if(str == str1) {
			System.out.println("both are equal");
		} else {
			System.out.println("not equal");
		}
		*/
		
		if(str.equals(str1)) {
			System.out.println("both are equal");
		} else {
			System.out.println("not equal");
		}
		
		
		Emp emp1 = new Emp(10, "Srinu", "NJ");
		Emp emp2 = new Emp(10, "Srinu", "NJ");
		
		if (emp1.equals(emp2)) {
			System.out.println("both emps are equal");
		} else {
			System.out.println("both emp objects are not equal");
		}
		
		
		
	}

}
