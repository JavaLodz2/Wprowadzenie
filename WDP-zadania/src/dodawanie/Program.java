package dodawanie;

import other.Helper;
import other.Mathematics;

public class Program {

	public static void main(String[] args) {
		Helper help = new Helper();
		Mathematics math = new Mathematics();
		
		int myVala = help.getValue("Podaj liczb� ca�kowit� A ");
		int myValb = help.getValue("Podaj liczb� ca�kowit� B ");
		
		System.out.println(myVala+" + "+myValb+" = "+math.getSum(myVala, myValb));

	}

}
