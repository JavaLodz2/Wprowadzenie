package pl.zadanie1;

import pl.pomocnicy.ValHelper;

public class Program {

	//1. Napisz metod� obliczaj�c� pole powierzchni ko�a.
	
	public static void main(String[] args) {
		
		ValHelper help = new ValHelper();
		double result=help.getDouble("Podaj mi promie� a oblicz� pole powierzchni ko��:");
		System.out.println("Wynik to "+getSquare(result));

	}
	
	public static double getSquare(double r){
		double pole=Math.PI*(Math.pow(r,2));
		return pole;
	}

}
