package liczbabezwzgledna;

import java.io.IOException;
import java.util.Scanner;

import other.Mathematics;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Podaj liczbê ca³kowit¹ ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		Mathematics matematyka = new Mathematics();
		System.out.println("Liczba bezwzglêdna to "+matematyka.getAbs(num));
	}
	
}
