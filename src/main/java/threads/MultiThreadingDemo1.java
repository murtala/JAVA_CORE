
public class MultiThreadingDemo1 {
	
	public static void main(String[] args) {
		
		Runnable r  = new ChildThread1();
		
		Thread t = new Thread(r);
		
		t.start();
	}

}
