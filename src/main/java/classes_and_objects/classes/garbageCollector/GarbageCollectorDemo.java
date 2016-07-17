package classes_and_objects.classes.garbageCollector;

public class GarbageCollectorDemo {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		System.out.println("before creating objects");
		System.out.println(rt.totalMemory()); // total heap size
		System.out.println(rt.freeMemory()); // total used memory in the heap
		System.out.println(rt.totalMemory() - rt.freeMemory()); // total used
																// memory in the
																// heap

		Emp2 emp = null;
		for (int i = 0; i < 100000; i++) {
			emp = new Emp2(10, "emp1", "Developer", 2000);
		}  //gc will always delete this because its not referenced to anything(null), but it goes to finalze method im Emp first
		
		System.out.println("After creating objects");
		
		System.out.println(rt.totalMemory()); // total heap size
		System.out.println(rt.freeMemory()); // total used memory in the heap
		System.out.println(rt.totalMemory() - rt.freeMemory()); // total used
																// memory in the
																// heap

		System.gc();
		

		System.out.println("Calling the garbage collector");
		System.out.println(rt.totalMemory()); // total heap size
		System.out.println(rt.freeMemory()); // total used memory in the heap
		System.out.println(rt.totalMemory() - rt.freeMemory());
	}

}
