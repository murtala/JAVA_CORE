package threads.example1.threads;


public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Main Thread");
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());  // By default we have 5
		 // main thread
		Runnable r   = new MyThread();
		Thread t = new Thread(r);
		t.setName("Child Thread");
		System.out.println("Child Thead Priority " + t.getPriority());
		t.start(); // 
		
		Thread.currentThread().setPriority(9); 
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
		
		
		
		for (int i = 0 ; i < 10; i++) { 
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("main Thread");
		}
		
	}

}

