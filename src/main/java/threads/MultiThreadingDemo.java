package threads;

public class MultiThreadingDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority());

		long startTime = System.currentTimeMillis();

		Thread t = new ChildThread();
		System.out.println(t.getName());
		t.setName("Child theread");
		System.out.println(t.getName());

		System.out.println(t.getPriority());
		t.setPriority(3);

		System.out.println(t.getPriority());

		t.start();

		Thread.currentThread().setPriority(10);

		System.out.println(Thread.currentThread().getPriority());

		/*
		 * ChildThread ct = new ChildThread();
		 * 
		 * ct.run();
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(" main thread is executing, i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		long endtime = System.currentTimeMillis();

		System.out.println(endtime - startTime);

	}

}
