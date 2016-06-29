package samples.ex1.Package;

public class OperateBMW760i implements OperateCar {

	@Override
	public int signalTurn(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		// code to turn BMW's LEFT turn indicator lights on
	       // code to turn BMW's LEFT turn indicator lights off
	       // code to turn BMW's RIGHT turn indicator lights on
	       // code to turn BMW's RIGHT turn indicator lights off
		return 0;
	}

	@Override
	public int turn(Direction direction, double radius, double startspeed,
			double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeLanes(Direction direction, double startSpeed,
			double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
