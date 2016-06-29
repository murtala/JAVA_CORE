package exercises.clone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Emp original = new Emp("John Public", 50000, 01, 01, 2000);
		//System.out.println("John Public " +" 50000,  01, 01, 2000");
		System.out.println(original.toString() );

		// shallow clone of original
		Emp Shallowcopy = (Emp) original.clone();
		Shallowcopy.raiseSalary(300);
		Shallowcopy.setHireDay(2001, 1, 1);
		System.out.println("Original Salary: " + original.getSalary());
		System.out.println("Original Date: " + original.getHireDay());

		System.out.println("After Shallow clone of original:\n New  Salary = "
				+ Shallowcopy.getSalary()+ "\n hire Day: "
				+ Shallowcopy.getHireDay());
		System.out.println("------------------------------------------");

		
		//Deep Clone				
		Emp DeepCopy = (Emp) original.DeepClone();
		DeepCopy.raiseSalary(300);
		DeepCopy.setHireDay(2003, 1, 1);

		System.out.println("Original Salary: " + original.getSalary());
		System.out.println("Original Date: " + original.getHireDay());
		System.out.println("After Deep clone of original:\n New Salary = "
				+ DeepCopy.getSalary() + "\n hire Day: "
				+ DeepCopy.getHireDay());
		System.out.println("------------------------------------------");
		
		/*
		// copy of original
				Emp copy = original;
				copy.raiseSalary(300); // also changed original
				copy.setHireDay(2002, 1, 1);
				System.out.println("Original Salary: " + original.getSalary());
				System.out.println("Original Date: " + original.getHireDay());
				System.out.println("After Copy of original:\n new Salary = "
						+ copy.getSalary() +"\n hire Day: "
						+ original.getHireDay());
				System.out.println("------------------------------------------");

*/
	}

}
