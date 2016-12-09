package pl.java;

/**
 * @author Kamil Golis
 *
 */
public class OldCar extends Car {

	// Modyfikator "staroœci" auta. Ma byæ jako final i prywatny
	private final double OLD_MODIFICATOR = 2;

	public OldCar(double speed, int gear) {

		this.speed = speed;
		this.gear = gear;
	}

	// Nadpisujemy metodê z klasy Car, aby uwzglêdniæ modyfikator "staroœci"
	// auta
	@Override
	public void speedUp(double val) {
		this.speed += divideSpeed(val);
	}

	@Override
	public void speedDown(double val) {
		if ((this.speed - val) < 0)
			this.speed = 0;
		else
			this.speed -= divideSpeed(val);
	}
	
	private double divideSpeed(double val){
		return val/OLD_MODIFICATOR;
	}
}
