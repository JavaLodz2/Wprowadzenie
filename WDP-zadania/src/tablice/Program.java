package tablice;

import java.util.Random;

import other.Helper;

public class Program {

	public static void main(String[] args) {
	
		int[][] tablica;
		Helper help = new Helper();
		
		int sizeX=help.getValue("Wielkoœæ tablicy X");
		int sizeY=help.getValue("Wielkoœæ tablicy Y");
		
		if (sizeY<=0 || sizeX<=0){
			sizeY=1;
			sizeX=1;	
		}
		
		tablica=new int[sizeY][sizeX];
		
		fillTable(tablica, 10);
		showTable(tablica);
		sumTable(tablica);
	
	}	

	public static void fillTable(int[][] tablica, int max){
		Random generator = new Random(); 
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				tablica[i][j]=generator.nextInt(max);
			}
		}
	}

	public static void showTable(int[][] tablica){
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				System.out.print(tablica[i][j] + " " );
			}
			System.out.println( "" );
		}
		System.out.println( "" );
	}
	
	public static void sumTable(int[][] tablica){
		for (int i = 0; i < tablica.length; i++) {
			int suma=0;
			for (int j = 0; j < tablica[i].length; j++) {
				suma+=tablica[i][j];
			}
			System.out.println("Suma wierszy : "+suma);
			suma=0;
		}	
	}
}
