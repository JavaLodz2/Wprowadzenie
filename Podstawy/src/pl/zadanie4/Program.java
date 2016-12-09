package pl.zadanie4;

import pl.pomocnicy.StringHelper;

public class Program {

	/*
	4. Pobieraj od u�ytkownika s�owa, dop�ki nie wpisze koniec 
	(z ma�ych, du�ych b�d� mieszanych liter). 
	Wypisz na koniec wszystkie s�owa oddzielone spacj�.
	*/
	
	public static void main(String[] args) {
		
		StringBuilder wordBuilder = new StringBuilder();
		//Poniewa� zmieni�em String Helpera na static nie trzeba tworzy� nowego obiektu
		//StringHelper help = new StringHelper();
		
//		String[] words;
		System.out.println("Wpisuj s�owa i naciskaj ENTER. Aby zako�czy� wpisz koniec w dowolnej formie.");
		
		while(true){
			String temp=StringHelper.getString("");
			if(temp.equalsIgnoreCase("koniec")) break;
			else {
				wordBuilder.append(temp);
				wordBuilder.append(" ");
			}
			
		}
		
		showWords(wordBuilder.toString(), " ");
		

	}

	public static void showWords(String s, String pattern){
		String[] temp = s.split(pattern);
		for (String st : temp) {
			System.out.print(st+" ");
			
		}
	}
}
