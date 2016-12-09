package pl.zadanie2;

import pl.pomocnicy.ValHelper;

public class Program {

	//2. Napisz metodê przyjmuj¹c¹ dwie liczby ca³kowite (typu integer), zwracaj¹c¹ dok³adny wynik dzielenia tych dwóch liczb.
	
	public static void main(String[] args) {
		
		//ValHelper help = new ValHelper();
		int a=ValHelper.getInt("Podaj mi liczbê A:");
		int b=ValHelper.getInt("Podaj mi liczbê B:");
		System.out.println("Wynik A/B to "+getDiv(a,b));

	}

	public static double getDiv(int a, int b){
		return (double)a/b;
	}
}
