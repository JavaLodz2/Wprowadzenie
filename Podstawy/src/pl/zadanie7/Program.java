package pl.zadanie7;

import pl.pomocnicy.StringHelper;

public class Program {

	/*
	 * 7. Pobierz dwa razy imi� i nazwisko od u�ytkownika. Sprawd�, czy
	 * u�ytkownik wpisa� dwa razy to samo. Je�eli tak, wypisz odpowiedni�
	 * informacj�.
	 */
	public static void main(String[] args) {

		// StringHelper help = new StringHelper();
		String name1 = StringHelper.getString("Podaj imi� i nazwisko oddzielone spacj�.");
		String name2 = StringHelper.getString("DLa sprawdzenia wpisz raz jeszcze");

		if (checkNames(name1, name2))
			System.out.println("Poda�e� te same dane.");
		else
			System.out.println("Chyba co� �le wpisa�e�.");

	}

	public static boolean checkNames(String name1, String name2) {
		String[] temp1 = name1.split(" ");
		String[] temp2 = name2.split(" ");

		if (temp1[0].equals(temp2[0]) && temp1[1].equals(temp2[1]))
			return true;
		else
			return false;
	}
}
