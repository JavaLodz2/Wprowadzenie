package pl.sda.wdp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Podaj liczbê:");
		String input = br.readLine();
		int number = Integer.parseInt(input);
		
		System.out.println("Podana liczba to: " + number);
		
		
	}

}
