package sen_964;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class samples {

	static boolean valveState;
	static long duration;

	public static void main(String[] args) {

		valveState = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Delay ");
		long delay = sc.nextLong();
		delay = delay * 1000; // converts to seconds
		System.out.println("Enter Duration ");
		duration = sc.nextLong();
		duration = duration * 1000; // converts to seconds

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				valveState = true;
				System.out.println(" Valve is now on");
				valveState = false;

			}

		};

		timer.schedule(task, delay);

		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(" Valve is off");

	}

}
