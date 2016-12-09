package pl.zadanie6;

import pl.pomocnicy.StringHelper;

public class Program {

	//6. Pobierz imiona i nazwisko od u¿ytkownika. Wyœwietl tylko nazwisko.
	public static void main(String[] args) {
		
		//StringHelper help = new StringHelper();
		String names = StringHelper.getString("Podaj swoje imiona i nazwisko.");
		
		String[] temp = names.split(" ");
		System.out.println("Twoje nazwisko to "+temp[temp.length-1]);

	}

}
