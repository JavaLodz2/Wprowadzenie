package kalkulator;

import other.Helper;

public class Program {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		float liczbaA = help.getValueFloat("Podaj liczbê A");
		String dzialanie = help.getValueString("Podaj operacjê arytmetyczn¹: ");
		float liczbaB = help.getValueFloat("Podaj liczbê B");
		float wynik;

		switch (dzialanie) {
		case "+":
			wynik=liczbaA+liczbaB;
			break;
		case "-":
			wynik=liczbaA-liczbaB;
			break;
		case "*":
			wynik=liczbaA*liczbaB;
			break;
		case "/":
			wynik=liczbaA/liczbaB;
			break;
		default:
			System.out.println("Z³e dzia³anie.");
			wynik=0f;
			break;
		}
		System.out.println("Wynik ="+wynik);
	}

}
