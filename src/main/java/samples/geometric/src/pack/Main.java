package samples.geometric.src.pack;

import samples.geometric.pack1.Circle;
import samples.geometric.pack1.Square;
import samples.geometric.pack2.Cylinder;
import samples.geometric.pack2.Triangle;
import samples.geometric.pack3.HalfCircle;
import samples.geometric.pack3.Rectangle;

public class Main {

	/* static ininitialisers */
	public static final int radius = 3;
	public static  int height = 5;
	public static int width = 7;
	
	static{ /* static initialiser block*/
		int A;
		int B;
	}

	public static void main(String[] args) throws Exception { /* main, constructor */
		
		//Print main thread
		System.out.println("Main Thread: " + Thread.currentThread().getName() + "|State: "+ Thread.currentThread().getState());

		/* use new for static lass loading */
		Circle c = new Circle();
		Triangle tr = new Triangle();

		Square s = new Square();
		s.setArea(height, width);
		
		Rectangle r = new Rectangle();
		Cylinder cy = new Cylinder();
		HalfCircle hf = new HalfCircle();

		Thread t = new Thread(c);
		Thread t1 = new Thread (tr);
		Thread t2 = new Thread (hf);
		Thread t3 = new Thread(cy);
		System.out.println("Created " +  t.getName() + "|State: " + t.getState());
		System.out.println("Created " +  t1.getName() + "|State: " + t1.getState());

		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Started " + c.getClass()+ " "+  t.getName() + "|State: " + t.getState());
		System.out.println("Started " + c.getClass()+ " "+  t1.getName() + "|State: " + t1.getState());
		
		// make thread 3 and 4 print circle at the same time
		
		System.out.println("Area of Square:" + s.getArea()); // print area of the square
		
		/* Dynamic class loading */
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Exited " + Thread.currentThread().getName());


	}

}
