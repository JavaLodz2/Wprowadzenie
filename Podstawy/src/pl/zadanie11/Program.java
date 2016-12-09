package pl.zadanie11;

import java.util.Random;

import pl.pomocnicy.ValHelper;

public class Program {

	public static void main(String[] args) {

		int[] tab;

		System.out.println("Sortowanie b�belkowe. Najpierw podaj wielko�� tablicy a ja wylosuj� losowe warto�ci.");

		int size = ValHelper.getInt("Wielko�� tablicy");
		tab = new int[size];
		int maxVal = ValHelper.getInt("Maksymalna warto��");

		fillRandom(tab, maxVal);
		System.out.println("Tablica ");
		showTab(tab);
		System.out.println("Po sortowaniu");
		showTab(bubbleSort(tab));
	}

	public static void fillRandom(int[] tab, int maxval) {

		Random generator = new Random();
		for (int i = 0; i < tab.length; i++) {

			tab[i] = generator.nextInt(maxval) + 1;
		}
	}

	public static void showTab(int[] tab) {
		for (int i : tab) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] bubbleSort(int[] tab) {

		boolean isOk;
		do {
			isOk = false;
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					int temp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = temp;
					isOk = true;
				}
			}
		} while (isOk);
		return tab;
	}
}
