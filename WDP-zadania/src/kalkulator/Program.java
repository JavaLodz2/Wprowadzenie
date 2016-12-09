package kalkulator;

import other.Helper;

public class Program {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		
		float liczbaA = help.getValueFloat("Podaj liczb� A");
		String dzialanie = help.getValueString("Podaj operacj� arytmetyczn�: ");
		float liczbaB = help.getValueFloat("Podaj liczb� B");
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
			System.out.println("Z�e dzia�anie.");
			wynik=0f;
			break;
		}
		System.out.println("Wynik ="+wynik);
	}

}
