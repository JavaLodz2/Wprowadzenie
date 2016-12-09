package pl.java;

/**
 * @author Kamil Golis
 *
 */
public class Program {

	public static void main(String[] args) {

		// command - przechowuje wpisane komendy
		String command;
		Car car;

		System.out.println("Konsola klasy. Mamy auto. Wpisuj co chcesz zrobi�. Koniec ko�czy p�tle.");

		command = StringHelper.getString("Jaki model rozpatrujemy? Nowy czy stary?");

		// Sprawdzamy co jest wpisane (ignorujemy wielko�� liter)
		if (command.equalsIgnoreCase("stary")) {
			System.out.println("Mamy stare auto.");
			car = new OldCar(40, 2);
		} else {
			System.out.println("Mamy nowe auto.");
			car = new Car(80, 2);
		}

		showStatus(car);
		mainLoop(car);
	}

	/**
	 * G��wna p�tla.
	 * 
	 * @param car
	 *            Obiekt samochodu.
	 */
	private static void mainLoop(Car car) {
		String command;
		while (true) {
			showInstructions();

			// Odczytaj komendy z klawiatury
			command = StringHelper.getString("");

			// Je�eli wpisano koniec to wyjd� z p�tli while
			if (command.equalsIgnoreCase("koniec"))
				break;
			// Je�eli wpisano gear up to wykonaj metod� gearUp
			else if (command.equalsIgnoreCase("gear up"))
				car.gearUp();
			// Je�eli wpisano gear down to wykonaj metod� gearDown
			else if (command.equalsIgnoreCase("gear down"))
				car.gearDown();
			/**
			 * Poniewa� dla pr�dko��i musimy odczyta� jeszcze warto�� zmiany po
			 * ci�gu komend dlatego najpierw sprawdzamy czy w og�le wpisano
			 * jakie� komendy oddzielone spacj�
			 */
			else if (command.contains(" ")) {
				// Wpisano komendy wi�c podziel je na tablic� string�w
				String[] temp = command.split(" ");
				// Je�eli w tabliy s� wi�cej jak 2 elementy to znaczy �e wpisano
				// prawdopodobnie warto�� zmiany
				if (temp.length > 2) {
					// Sprawdzamy jakich komend u�yty - w tym wypadku czy jest
					// to speed down, je�eli tak to
					// parsuj to co w tablicy pod indeksem 2 na warto�� double i
					// wykonad metod� speedDownBy
					if ((temp[0] + " " + temp[1]).equalsIgnoreCase("speed down"))
						car.speedDown(Double.parseDouble(temp[2]));
					// To samo co wy�ej ale dla speed up
					else if ((temp[0] + " " + temp[1]).equalsIgnoreCase("speed up"))
						car.speedUp(Double.parseDouble(temp[2]));
				}
			} else
				// Co� �le wpisano wi�c nie wiemy
				System.out.println("Nie rozumiem...");
			showStatus(car);
		}
	}

	/**
	 * Poka� opis co mo�na
	 */
	public static void showInstructions() {
		System.out.println("Dost�pne mo�liwo�ci:");
		System.out.println("GEAR UP | GEAR DOWN | SPEED DOWN val | SPEED UP val");
	}

	/**
	 * Wy�wietla bie��ce dane o stanie pojazdu
	 * 
	 * @param car
	 *            Samoch�d kt�ry rozpatrujemy
	 */
	public static void showStatus(Car car) {
		System.out.println("STATUS:");
		System.out.println("BIEG :" + car.getGear());
		System.out.println("PR�DKO�� :" + car.getSpeed());
	}
}
