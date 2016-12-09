package pl.zadanie9;

import java.io.*;

import pl.pomocnicy.StringHelper;

public class Program {

	// 9. Pobierz tekst od u¿ytkownika. Zapisz tekst do pliku.

	public static void main(String[] args) throws IOException {

		// StringBuilder wordBuilder = new StringBuilder();
		//StringHelper help = new StringHelper();

		File file = new File("C:/Users/RENT/Documents/5.Wprowadzenie do Java/zad9.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		System.out.println(
				"Wpisuj s³owa i naciskaj ENTER. Aby zakoñczyæ wpisz koniec w dowolnej formie. Wyniki zostan¹ zapisane do pliku");

		while (true) {
			String temp = StringHelper.getString("");
			if (temp.equalsIgnoreCase("koniec"))
				break;
			else {
				// wordBuilder.append(temp);
				// wordBuilder.append(" ");
				writer.write(temp);
				writer.newLine();
			}

		}

		writer.close();
		// showWords(wordBuilder.toString(), " ");

	}

}
