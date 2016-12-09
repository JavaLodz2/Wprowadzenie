package other;

import java.util.Scanner;

public class Helper {

	private Scanner in;

	public int getValue(String question){
		try {
			System.out.println(question);
			in = new Scanner(System.in);
			int num = in.nextInt();
			return num;
			
		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return 0;
		}
		
	}
	
	public double getValueDouble(String question){
		try {
			System.out.println(question);
			in = new Scanner(System.in);
			double num = in.nextDouble();
			return num;
			
		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return 0d;
		}
		
	}
	
	public float getValueFloat(String question){
		try {
			System.out.println(question);
			in = new Scanner(System.in);
			float num = in.nextFloat();
			return num;
			
		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return 0f;
		}
		
	}
	
	public String getValueString(String question){
		try {
			System.out.println(question);
			in = new Scanner(System.in);
			String num = in.nextLine();
			return num;
			
		} catch (Exception e) {
			System.out.println("Coœ nie tak...");
			return "";
		}
		
	}
}
