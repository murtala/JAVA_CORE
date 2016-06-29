package threads.example1.deadlocks;

public class ChildThread implements Runnable { 
	

	A a = null;
	B b = null;
	
	ChildThread(A a , B b) {
		this.a = a;
		this.b = b;
	}
	
	
	

	@Override
	public void run() {
		b.m3(a);
		
	}

}
