package threads.example1.threadcomm;

public class ThreadB extends Thread {
	
	int total = 0;
	
	public void run () {
		synchronized (this) {
			System.out.println("Child Thread started calculation"); 
			for (int i = 0; i < 5; i++) {
				total = total + i;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Child Thread trying to give the notification");
			this.notifyAll();
		}
	}
	
	public int getTotal() {
		return total;
	}

}
