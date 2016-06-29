package threads.example1.deadlocks;

class A {
	public synchronized void m1(B b) {
		System.out.println("Thread 1 starts execution of m1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread 1 trying to call the B's m4() method ");
		b.m4();
	}

	public synchronized void m2() {
		System.out.println("Inside A's m2 method");
	}

}