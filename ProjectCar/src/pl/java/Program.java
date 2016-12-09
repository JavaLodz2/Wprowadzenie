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

		System.out.println("Konsola klasy. Mamy auto. Wpisuj co chcesz zrobiæ. Koniec koñczy pêtle.");

		command = StringHelper.getString("Jaki model rozpatrujemy? Nowy czy stary?");

		// Sprawdzamy co jest wpisane (ignorujemy wielkoœæ liter)
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
	 * G³ówna pêtla.
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

			// Je¿eli wpisano koniec to wyjdŸ z pêtli while
			if (command.equalsIgnoreCase("koniec"))
				break;
			// Je¿eli wpisano gear up to wykonaj metodê gearUp
			else if (command.equalsIgnoreCase("gear up"))
				car.gearUp();
			// Je¿eli wpisano gear down to wykonaj metodê gearDown
			else if (command.equalsIgnoreCase("gear down"))
				car.gearDown();
			/**
			 * Poniewa¿ dla prêdkoœæi musimy odczytaæ jeszcze wartoœæ zmiany po
			 * ci¹gu komend dlatego najpierw sprawdzamy czy w ogóle wpisano
			 * jakieœ komendy oddzielone spacj¹
			 */
			else if (command.contains(" ")) {
				// Wpisano komendy wiêc podziel je na tablicê stringów
				String[] temp = command.split(" ");
				// Je¿eli w tabliy s¹ wiêcej jak 2 elementy to znaczy ¿e wpisano
				// prawdopodobnie wartoœæ zmiany
				if (temp.length > 2) {
					// Sprawdzamy jakich komend u¿yty - w tym wypadku czy jest
					// to speed down, je¿eli tak to
					// parsuj to co w tablicy pod indeksem 2 na wartoœæ double i
					// wykonad metodê speedDownBy
					if ((temp[0] + " " + temp[1]).equalsIgnoreCase("speed down"))
						car.speedDown(Double.parseDouble(temp[2]));
					// To samo co wy¿ej ale dla speed up
					else if ((temp[0] + " " + temp[1]).equalsIgnoreCase("speed up"))
						car.speedUp(Double.parseDouble(temp[2]));
				}
			} else
				// Coœ Ÿle wpisano wiêc nie wiemy
				System.out.println("Nie rozumiem...");
			showStatus(car);
		}
	}

	/**
	 * Poka¿ opis co mo¿na
	 */
	public static void showInstructions() {
		System.out.println("Dostêpne mo¿liwoœci:");
		System.out.println("GEAR UP | GEAR DOWN | SPEED DOWN val | SPEED UP val");
	}

	/**
	 * Wyœwietla bie¿¹ce dane o stanie pojazdu
	 * 
	 * @param car
	 *            Samochód który rozpatrujemy
	 */
	public static void showStatus(Car car) {
		System.out.println("STATUS:");
		System.out.println("BIEG :" + car.getGear());
		System.out.println("PRÊDKOŒÆ :" + car.getSpeed());
	}
}
