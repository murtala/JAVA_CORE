package threads.example1.yield;

public class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Child Thread");
		}
	}

}
