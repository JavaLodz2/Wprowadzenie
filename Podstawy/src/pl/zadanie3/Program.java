package pl.zadanie3;

import java.io.IOException;
import java.util.Scanner;

public class Program {
	
//3. Pobierz od u¿ytkownika kolor. Napisz metodê sprawdzaj¹c¹, czy podany kolor istnieje. Wykorzystaj enum.
	
	private static Scanner s;

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = new Scanner(System.in);
		boolean isKnown = false;
		
		System.out.println("Podaj kolor:");
		String input = s.nextLine();
//		String input = br.readLine();
		
		for(Kolor kolor : Kolor.values()){
			if(kolor.toString().equals(input)) {
				System.out.println("Masz racjê! Znam taki kolor.");
				isKnown=true;
			}
		}
		if(!isKnown) System.out.println("Niestety nie znam."); 
	}

}
