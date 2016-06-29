package threads.example2.synch;

public class Display {
	int total = 0;
	public  void wish(String name) {
		 total = 0;
		synchronized (this) {
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
