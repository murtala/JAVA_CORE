package threads.example2.threadcomm;

public class ThreadA {
	
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main Thread calling wait() ");
			try {
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}
		
	}

}
