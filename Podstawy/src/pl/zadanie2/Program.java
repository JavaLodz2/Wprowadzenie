package pl.zadanie2;

import pl.pomocnicy.ValHelper;

public class Program {

	//2. Napisz metod� przyjmuj�c� dwie liczby ca�kowite (typu integer), zwracaj�c� dok�adny wynik dzielenia tych dw�ch liczb.
	
	public static void main(String[] args) {
		
		//ValHelper help = new ValHelper();
		int a=ValHelper.getInt("Podaj mi liczb� A:");
		int b=ValHelper.getInt("Podaj mi liczb� B:");
		System.out.println("Wynik A/B to "+getDiv(a,b));

	}

	public static double getDiv(int a, int b){
		return (double)a/b;
	}
}
