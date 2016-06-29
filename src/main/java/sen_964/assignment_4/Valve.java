package assignment_4;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import lecture_4.RunMeTask;

public class Valve {

	boolean valveState;
	float onDuration;
	long delay;
	long duration;
	static Timer valveTimer;

	public long getDuration() {
		return duration * 1000;
	}

	public void setDuration(long duration) {

		this.duration = duration;
	}

	public long getDelay() {
		return delay * 1000;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public Valve() {

	}

	public Valve(boolean ValveState) {

	}

	public Valve(boolean ValveState, float onDuration) {

	}

	public void valve(Long delay, Long duration) {
		Timer timer = new Timer();
		valveTimer = timer;
		// timer.cancel();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				setValveState(true);
				timer.cancel();
				getValveState();

			}
		};

		// timer.schedule(task, delay, duration);
		timer.schedule(task, delay);

	}

	public Valve(float onDuration) {

	}

	public boolean getValveState() {

		if (valveState == false) {
			System.out.println("The valve state is: OFF");
		} else {
			System.out.println("The valve state is: ON");
		}

		return valveState;
	}

	public void setValveState(boolean valveState) {
		// System.out.println("You set the The valve state to : " + valveState);

		this.valveState = valveState;
	}

	public float getOnDuration() {
		System.out.println("The duration is: " + onDuration);

		return totalDuration;
	}

	static float totalDuration = 0;

	public void setOnDuration(float onDuration) {
		if (onDuration > 1 || onDuration < 0) {
			System.out.println("Day must be 1 or less and at least 0");
		} else {
			System.out.println("Set the duration to  duration is: "+ onDuration);

			totalDuration = +onDuration;
		}

	}

	public static void main(String[] args) {
		Valve v = new Valve();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Delay ");
		v.setDelay(sc.nextLong());
		System.out.println("Enter Duration ");
		v.setDuration(sc.nextLong());
		v.valve(v.getDelay(), v.getDuration());

		// wait for 10 seconds
		try {

			Thread.sleep(v.getDuration());
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		v.setValveState(false);

		// v.setValveState(true);
		v.getValveState();
		// v.setOnDuration(0);
		// v.getOnDuration();

	}

}
