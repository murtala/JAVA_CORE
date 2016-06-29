package samples.ex1.Package;

/**
 * Created with IntelliJ IDEA.
 * User: Murtala
 * Date: 5/22/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bicycle {
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public Bicycle() {
		// TODO Auto-generated constructor stub
	}

	// the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}

