package pl.zadanie10;

import pl.pomocnicy.ValHelper;

public class Program {

	public static void main(String[] args) {

		double liczba1, liczba2;
		ValHelper val = new ValHelper();

		liczba1 = val.getDouble("Podaj liczbê nr 1 :");
		liczba2 = val.getDouble("Podaj liczbê nr 2 :");

		System.out.println("NWD liczby " + liczba1 + " i " + liczba2 + " to " + getNWD(liczba1, liczba2));
	}

	public static double getNWD(double a, double b) {

		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}
}
