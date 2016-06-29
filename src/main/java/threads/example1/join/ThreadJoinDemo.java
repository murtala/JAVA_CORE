package threads.example1.join;

public class ThreadJoinDemo {
	
	public static void main(String[] args) {
		MyThead t = new MyThead();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i =0; i< 20; i++) {
			
			System.out.println("Main Thead");
			System.out.println("Main thread status " + Thread.currentThread().isAlive());
			System.out.println("Child thread status " + t.isAlive());
		}
		System.out.println(Thread.currentThread().isAlive());
		
	}

}
