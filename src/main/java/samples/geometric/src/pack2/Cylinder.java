package samples.geometric.src.pack2;

public class Cylinder extends Thread {
	int counter1;
	int counter2;
	int counter3;

	public void run() {
counter1 = 233;
	}

	public int getCounter1() {
		return counter1;
	}

	public synchronized void setCounter1(int counter1) {
		this.counter1 = counter1;
	}

	public synchronized int getCounter2() {
		return counter2;
	}

	public synchronized void setCounter2(int counter2) {
		this.counter2 = counter2;
	}

	public synchronized int getCounter3() {
		return counter3;
	}

	public synchronized void setCounter3(int counter3) {
		this.counter3 = counter3;
	}

}
