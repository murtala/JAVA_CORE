package threads.example1.daemon;

public class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Is the main thread daemon " + Thread.currentThread().isDaemon());
		
		
		Thread t = new MyThread();
		System.out.println("is the child thread daemon: " + t.isDaemon());
		t.setDaemon(true);
		System.out.println("is the child thread daemon: " + t.isDaemon());
		t.start();
		
		
		//Thread.currentThread().setDaemon(true);
		
		
		//System.out.println("Is the main thread daemon " + Thread.currentThread().isDaemon());
		
	}

}
