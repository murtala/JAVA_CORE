package threads.example1.deadlocks;

public class DeadLock implements Runnable {

	A a = new A();
	B b = new B();
	
	public void run () {
		b.m3(a);
	}

	public DeadLock() {
		
		Runnable r = new ChildThread(a, b);
		Thread t = new Thread(r);
		t.start();
		
		a.m1(b);
		
		
	}

	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		
		
	}

}
