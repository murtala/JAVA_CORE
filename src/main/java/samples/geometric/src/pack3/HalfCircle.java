package samples.geometric.src.pack3;

public class HalfCircle implements Runnable {

	public String circleA = "Circle A";
	public String circleB = "Circle B";
	public String circleC = "Circle C";

	public synchronized String getCircleA() {
		System.out.println(this.circleA);
		return circleA;
	}

	public synchronized void setCircleA(String circleA) {
		this.circleA = circleA;
	}

	public synchronized String getCircleB() {
		System.out.println(this.circleB);
		return circleB;
	}

	public synchronized void setCircleB(String circleB) {
		this.circleB = circleB;
	}

	public synchronized String getCircleC() {
		System.out.println(this.circleC);

		return circleC;
	}

	public synchronized void setCircleC(String circleC) {
		this.circleC = circleC;
	}

	public void run() {
		getCircleA();
		getCircleB();
		getCircleC();
		//this.notifyAll();

	}

}
