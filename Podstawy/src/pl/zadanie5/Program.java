package pl.zadanie5;

import pl.pomocnicy.StringHelper;

public class Program {

	//5. Pobierz od u�ytkownika zdanie. Zamie� w zdaniu ka�d� liter� 'a' (ma�e i du�e) na cyfr� 4.
	
	public static void main(String[] args) {
		
		//StringHelper help = new StringHelper();
		String sentence=StringHelper.getString("Wpisz zdanie a dokonam cud�w.");
		
		System.out.println(changeLetters(sentence, "4"));

	}

	public static String changeLetters(String sentence, String pattern){
		return sentence.replace("a", pattern);
	}
}
