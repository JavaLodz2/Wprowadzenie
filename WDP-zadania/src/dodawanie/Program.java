package dodawanie;

import other.Helper;
import other.Mathematics;

public class Program {

	public static void main(String[] args) {
		Helper help = new Helper();
		Mathematics math = new Mathematics();
		
		int myVala = help.getValue("Podaj liczbê ca³kowit¹ A ");
		int myValb = help.getValue("Podaj liczbê ca³kowit¹ B ");
		
		System.out.println(myVala+" + "+myValb+" = "+math.getSum(myVala, myValb));

	}

}
