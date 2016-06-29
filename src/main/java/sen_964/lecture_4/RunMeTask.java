package sen_964.lecture_4;

import java.util.Timer;
import java.util.TimerTask;

public class RunMeTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("Run Me ~");
	}

	public static void main(String[] args) {

		TimerTask task = new RunMeTask();
		Timer timer = new Timer();
		timer.schedule(task, 6000, 1000);
		
	}
}
