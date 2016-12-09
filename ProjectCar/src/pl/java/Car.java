package pl.java;

/**
 * @author Kamil Golis
 *
 */
public class Car {

	protected double speed = 0;
	protected int gear = 1;
	
	/**
	 * Konstruktor przyjmuj�cy parametry pocz�tkowe
	 * 
	 * @param speed
	 *            Pr�dko��
	 * @param gear
	 *            Bieg
	 */
	public Car(double speed, int gear) {

		this.speed = speed;
		this.gear = gear;
	}

	// Domy�lny konstruktor
	public Car() {
	}


	/**
	 * Zwi�ksza bieg auta
	 */
	public void gearUp() {
		this.gear++;
	}

	/**
	 * Zmniejsza bieg auta
	 */
	public void gearDown() {
		if (this.gear > 0)
			this.gear--;
	}

	/**
	 * Zmniejsza pr�dko�� auta o zadan� warto��
	 * 
	 * @param val
	 *            Warto�� zmiany pr�dko�ci
	 */
	public void speedDown(double val) {
		if ((this.speed - val) < 0)
			this.speed = 0;
		else
			this.speed -= val;
	}

	/**
	 * Zwi�ksza pr�dko�� auta o zadan� warto��
	 * 
	 * @param val
	 *            Warto�� zmiany pr�dko�ci
	 */
	public void speedUp(double val) {
		this.speed += val;
	}

	/**
	 * Zwraca aktualn� pr�dko�� auta
	 * 
	 * @return Pr�dko��
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * Zwraca aktualny bieg
	 * 
	 * @return Bieg
	 */
	public int getGear() {
		if (gear > 0)
			return gear;
		else
			return 1;
	}
}
