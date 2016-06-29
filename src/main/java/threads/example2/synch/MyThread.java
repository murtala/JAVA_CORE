package threads.example2.synch;

public class MyThread extends Thread {
	
	Display d;
	String name;
	
	MyThread(Display d, String name) {
		this.name = name;
		this.d = d;
	}
	
	public void run () {
		d.wish(name);
	}

}
