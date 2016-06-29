package threads.example1.threads;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("Child thread");
		}
	}

}
