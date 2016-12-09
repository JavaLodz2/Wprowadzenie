package pl.zadanie7;

import pl.pomocnicy.StringHelper;

public class Program {

	/*
	 * 7. Pobierz dwa razy imiê i nazwisko od u¿ytkownika. SprawdŸ, czy
	 * u¿ytkownik wpisa³ dwa razy to samo. Je¿eli tak, wypisz odpowiedni¹
	 * informacjê.
	 */
	public static void main(String[] args) {

		// StringHelper help = new StringHelper();
		String name1 = StringHelper.getString("Podaj imiê i nazwisko oddzielone spacj¹.");
		String name2 = StringHelper.getString("DLa sprawdzenia wpisz raz jeszcze");

		if (checkNames(name1, name2))
			System.out.println("Poda³eœ te same dane.");
		else
			System.out.println("Chyba coœ Ÿle wpisa³eœ.");

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
