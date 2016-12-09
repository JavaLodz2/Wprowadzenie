package pl.zadanie5;

import pl.pomocnicy.StringHelper;

public class Program {

	//5. Pobierz od u¿ytkownika zdanie. Zamieñ w zdaniu ka¿d¹ literê 'a' (ma³e i du¿e) na cyfrê 4.
	
	public static void main(String[] args) {
		
		//StringHelper help = new StringHelper();
		String sentence=StringHelper.getString("Wpisz zdanie a dokonam cudów.");
		
		System.out.println(changeLetters(sentence, "4"));

	}

	public static String changeLetters(String sentence, String pattern){
		return sentence.replace("a", pattern);
	}
}
