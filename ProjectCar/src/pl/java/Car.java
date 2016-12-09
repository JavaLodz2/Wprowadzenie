package pl.java;

/**
 * @author Kamil Golis
 *
 */
public class Car {

	protected double speed = 0;
	protected int gear = 1;
	
	/**
	 * Konstruktor przyjmuj¹cy parametry pocz¹tkowe
	 * 
	 * @param speed
	 *            Prêdkoœæ
	 * @param gear
	 *            Bieg
	 */
	public Car(double speed, int gear) {

		this.speed = speed;
		this.gear = gear;
	}

	// Domyœlny konstruktor
	public Car() {
	}


	/**
	 * Zwiêksza bieg auta
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
	 * Zmniejsza prêdkoœæ auta o zadan¹ wartoœæ
	 * 
	 * @param val
	 *            Wartoœæ zmiany prêdkoœci
	 */
	public void speedDown(double val) {
		if ((this.speed - val) < 0)
			this.speed = 0;
		else
			this.speed -= val;
	}

	/**
	 * Zwiêksza prêdkoœæ auta o zadan¹ wartoœæ
	 * 
	 * @param val
	 *            Wartoœæ zmiany prêdkoœci
	 */
	public void speedUp(double val) {
		this.speed += val;
	}

	/**
	 * Zwraca aktualn¹ prêdkoœæ auta
	 * 
	 * @return Prêdkoœæ
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
