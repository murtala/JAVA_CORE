package threads.example1.deadlocks;

class B {
	public synchronized void m3(A a) {
		System.out.println("Thread 2 starts execution of m2");
		try {
			Thread.sleep(5000);  
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread 2 trying to call the A's m2() method ");
		a.m2();
	}

	public synchronized void m4() {
		System.out.println("Inside B's display");
	}

}