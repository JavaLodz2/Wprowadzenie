package pl.java;

import java.util.Scanner;

public class StringHelper {

	static Scanner s = new Scanner(System.in);

	public static String getString(String question) {
		try {
			System.out.println(question);
			String input = s.nextLine();
			return input;

		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return "";
		}
	}
}
