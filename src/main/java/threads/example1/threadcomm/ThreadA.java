package threads.example1.threadcomm;

public class ThreadA {
	
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main Thread calling wait() ");
			try {
				b.wait();
				;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Main thread got notification");
			System.out.println(b.getTotal());
		}
		
	}

}
