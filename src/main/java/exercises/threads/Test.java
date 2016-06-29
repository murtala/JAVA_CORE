package exercises.threads;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Current Thread: "+Thread.currentThread().getName()+ "|State: " + Thread.currentThread().getState()+ "|Daemon: " +Thread.currentThread().isDaemon());
		task1 t1 = new task1();
		task2 t2 = new task2();
		task3 t3 = new task3();
		task4 t4 = new task4();
		
		//task3 t5  = new task1();

		Thread one = new Thread (t1);
		Thread two = new Thread (t2);
		//Thread three = new Thread(t3);
		//Thread four = new Thread(t4);
		Thread five = new Thread(t1);
		Thread six = new Thread(t1);
		
		/* priorities */
		//sets order, 10 highest. without it, order is most liekly random
		one.setPriority(10);
		two.setPriority(7);
		//three.setPriority(3);
		//four.setPriority(1);
		
		/*outputs */
		System.out.println("|Thread " + one.getName()+ "|State: " + one.getState() + "|Daemon: " + one.isDaemon());
		System.out.println("|Thread " + two.getName()+ "|State: "+ two.getState()+ "|Daemon: " + two.isDaemon());
		//System.out.println("|Thread " + three.getName()+ "|State: " + three.getState() + "|Daemon: " + three.isDaemon());
		//System.out.println("|Thread " + four.getName()+ "|State: "+ four.getState()+ "|Daemon: " + four.isDaemon());
		
		System.out.println("one start");
		one.start();
		System.out.println("two start");
		two.start();
		/*System.out.println("three start");
		three.start();
		System.out.println("four start");
		four.start();*/
		
		t3.getMessage();
		t4.getMessage();

		
		System.out.println(Thread.currentThread().getName()+" thread status: " + Thread.currentThread().isAlive());
		System.out.println(one.getName() +" status: " + one.isAlive());
		System.out.println(two.getName()+" status: " + two.isAlive());
		/*System.out.println(three.getName() +" status: " + three.isAlive());
		System.out.println(four.getName()+" status: " + four.isAlive());*/

		System.out.println("Exit "+Thread.currentThread().getName()+ " thread "+"-State: " + Thread.currentThread().getState());
	}
}

 class task1 implements Runnable{
	 
	 @Override
	public void run() { // one tread will execute while the other is sleeping. after sleeps ends, it resumes
	System.out.println(this.getClass() +" run()");
	System.out.println("Thread Name:" +Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName()+ " State: " + Thread.currentThread().getState());
	try {
		System.out.println(Thread.currentThread().getName() + " Sleeps");
		Thread.sleep(500);//sleep for 1 minutes
		System.out.println(this.getClass() +"Exit run()");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
 }
 
 class task2 implements Runnable{
	  @Override
	  public void run(){
		  System.out.println(this.getClass() +" run()");
			System.out.println("Thread Name:" +Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+ " State: " + Thread.currentThread().getState());
			try {
				System.out.println(Thread.currentThread().getName() + " Sleeps");
				Thread.sleep(500);//sleep for 1 minutes
				System.out.println(this.getClass()+ "Exit run()");

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	  }
 }
 
 
 class task3 {
	  
	  public synchronized void getMessage(){
		  System.out.println("Message Task3");
				
	  }
}
 
 
 class task4 {
	  public synchronized void getMessage(){
		  System.out.println("Message Task4");
		
	  }
	  
	 
}
 
 class task5 implements Runnable{
	  @Override
	  public void run(){
		  System.out.println(this.getClass() +" run()");
			System.out.println("Thread Name:" +Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+ " State: " + Thread.currentThread().getState());
			try {
				System.out.println(Thread.currentThread().getName() + " Sleeps");
				Thread.sleep(1*1000);//sleep for 1 minutes
				System.out.println(this.getClass()+ "Exit run()");

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	  }
}
 
 class task6 implements Runnable{
	  @Override
	  public void run(){
		  System.out.println(this.getClass() +" run()");
			System.out.println("Thread Name:" +Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName()+ " State: " + Thread.currentThread().getState());
			try {
				System.out.println(Thread.currentThread().getName() + " Sleeps");
				Thread.sleep(1*1000);//sleep for 1 minutes
				System.out.println(this.getClass()+ "Exit run()");

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	  }
}
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 class SyncTest {
	 public void doStuff() {
	 System.out.println("not synchronized");
	 synchronized(this) {
	 System.out.println("synchronized");
	 }
	 }
	 }
 
 
 
 class ThreadA {
	   public static void main(String [] args) {
	         ThreadB b = new ThreadB();
	         b.start();
	 
	         synchronized(b) {
	            try {
	               System.out.println("Waiting for b to complete...");
	               b.wait();
	            } catch (InterruptedException e) {}
	         }
	         System.out.println("Total is: " + b.total);
	      }
	   }
	 
	   class ThreadB extends Thread {
	      int total;
	 
	      public void run() {
	         synchronized(this) {
	            for(int i=0;i<100;i++) {
	               total += i;
	            }
	            notify();
	         }
	      }
	   }
	   
	   
