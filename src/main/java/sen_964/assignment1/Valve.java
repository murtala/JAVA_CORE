package sen_964.assignment1;

public class Valve {

	boolean valveState;
	float onDuration;
	
	public Valve() {
		
	}
	
	public Valve( boolean ValveState) {
		
	}
	
	public Valve( boolean ValveState, float onDuration) {
		
	}

	public Valve(float onDuration) {
		
	}
	
	
	public boolean getValveState() {
		System.out.println("The valve state is: " + valveState);
		return valveState;
	}

	public void setValveState(boolean valveState) {
		System.out.println("You set the The valve state to : " + valveState);

		this.valveState = valveState;
	}

	public float getOnDuration() {
		System.out.println("The duration is: " + onDuration);

		return totalDuration;
	}

	static float totalDuration =0;
	public void setOnDuration(float onDuration) {
		if (onDuration >1 || onDuration <0) {
			System.out.println("Day must be 1 or less and at least 0");
		}else{
			System.out.println("Set the duration to  duration is: " + onDuration);

			totalDuration = + onDuration;
		}
		
	}

	public static void main(String[] args) {
		Valve v = new Valve();
		v.setValveState(true);
		v.getValveState();
		v.setOnDuration(0);
		v.getOnDuration();
		

	}

}
