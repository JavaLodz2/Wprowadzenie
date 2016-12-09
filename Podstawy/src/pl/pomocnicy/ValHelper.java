package pl.pomocnicy;

import java.util.Scanner;

public class ValHelper {

	static Scanner s = new Scanner(System.in);

	public static int getInt(String question) {
		try {
			System.out.println(question);
			int input = s.nextInt();
			return input;

		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return 0;
		}
	}

	public double getDouble(String question) {
		try {
			System.out.println(question);
			double input = s.nextDouble();
			return input;

		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return 0;
		}
	}
}
