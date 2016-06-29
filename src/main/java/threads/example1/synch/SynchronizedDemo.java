package threads.example1.synch;

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread t1 = new MyThread(d1, "Srinu");
		MyThread t2 = new MyThread(d1, "Ramu");
		t1.start();
		t2.start();
	}

}
