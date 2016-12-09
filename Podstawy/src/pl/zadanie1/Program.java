package pl.zadanie1;

import pl.pomocnicy.ValHelper;

public class Program {

	//1. Napisz metodê obliczaj¹c¹ pole powierzchni ko³a.
	
	public static void main(String[] args) {
		
		ValHelper help = new ValHelper();
		double result=help.getDouble("Podaj mi promieñ a obliczê pole powierzchni ko³¹:");
		System.out.println("Wynik to "+getSquare(result));

	}
	
	public static double getSquare(double r){
		double pole=Math.PI*(Math.pow(r,2));
		return pole;
	}

}
