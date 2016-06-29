package threads.example2.threadcomm;

public class ThreadB extends Thread {
	
	int total = 0;
	
	public void run () {
		synchronized (this) {
			System.out.println("Child Thread started calculation"); 
			for (int i = 0; i < 100; i++) {
				total = total + i;
			}
			System.out.println("Child Thread trying to give the notification");
			this.notifyAll();
		}
	}

}
