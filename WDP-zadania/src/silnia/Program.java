package silnia;

import other.Helper;

public class Program {

	public static void main(String[] args) {
		
		Helper help = new Helper();
		int i=help.getValue("Silnia dla warto�ci..");
		Silnia s = new Silnia();
		System.out.println("Wynosi rekurencja:"+s.silnia(i));
		System.out.println("Wynosi funkcja:"+s.silniaFunc(i));
	}
}
