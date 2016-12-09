package pl.zadanie8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	//8. Utw�rz przyk�adowy plik na dysku C:/. Wczytaj w programie zawarto�� pliku. Wy�wietl zawarto�� w konsoli.
	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("C:/Users/RENT/Documents/5.Wprowadzenie do Java/zadania_java_1.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
