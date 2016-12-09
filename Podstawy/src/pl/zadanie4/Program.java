package pl.zadanie4;

import pl.pomocnicy.StringHelper;

public class Program {

	/*
	4. Pobieraj od u¿ytkownika s³owa, dopóki nie wpisze koniec 
	(z ma³ych, du¿ych b¹dŸ mieszanych liter). 
	Wypisz na koniec wszystkie s³owa oddzielone spacj¹.
	*/
	
	public static void main(String[] args) {
		
		StringBuilder wordBuilder = new StringBuilder();
		//Poniewa¿ zmieni³em String Helpera na static nie trzeba tworzyæ nowego obiektu
		//StringHelper help = new StringHelper();
		
//		String[] words;
		System.out.println("Wpisuj s³owa i naciskaj ENTER. Aby zakoñczyæ wpisz koniec w dowolnej formie.");
		
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
