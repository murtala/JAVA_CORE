package threads.example1.yield;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		//Thread.currentThread().setPriority(10);

		for (int i = 0; i < 10; i++) {
			 Thread.yield();
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread");
		}

	}

}

