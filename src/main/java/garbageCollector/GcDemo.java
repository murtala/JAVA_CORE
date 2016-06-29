package garbageCollector;

public class GcDemo {
	
	public static void main(String[] args) {
		
		Emp emp = null;
		
		Runtime  rt = Runtime.getRuntime();
		
		
		long totalHeapMemory = rt.totalMemory();
		
		long freeMemory = rt.freeMemory();
		
		long usedMemory1 = rt.totalMemory() - freeMemory;
		
		System.out.println(" totalHeapMemory  = " + totalHeapMemory);
		System.out.println(" freeMemory  = " + freeMemory);
		System.out.println(" usedMemory  = " + usedMemory1);
		
		
		for (int i = 0 ; i < 100000000; i ++) {
			emp = new Emp(i, "Srinu", "NJ");
		}
		
		totalHeapMemory = rt.totalMemory();
		
		freeMemory = rt.freeMemory();
		
		long usedMemory2 = rt.totalMemory() - freeMemory;
		
		long increasedMemory = usedMemory2 - usedMemory1;
		
		System.gc();
		
		System.out.println("After created some objects");
		
		System.out.println(" totalHeapMemory  = " + totalHeapMemory);
		System.out.println(" freeMemory  = " + freeMemory);
		System.out.println(" usedMemory  = " + usedMemory2);
		System.out.println(" increasedMemory  = " + increasedMemory);
		
		
		
		
	}

}
