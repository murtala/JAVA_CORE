package threads.example1.synch;

public class Display {
	int total = 0;
	public   void wish(String name) {
		
		synchronized (this) {
		 total = 0;
			for (int i = 0; i < 10; i++) {
				total = total + i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("total = " + total);
		}
	}

}
