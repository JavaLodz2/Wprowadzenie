package pl.zad.old;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

	private static List<Pracownik> pracownicy = new ArrayList<Pracownik>();
	private static DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		String dataFile = "C:/Users/RENT/Documents/5.Wprowadzenie do Java/3/dane_pracownikow.txt";
		
		importData(dataFile);
		showData();

	}
	
	public static void importData(String fileName) throws FileNotFoundException, IOException, ParseException{
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			String line;
						
			int lineNumber=0;
			
			while ((line = br.readLine()) != null) {
				if(lineNumber>0){
					parseLineToPracownicy(line);
				}
				
				lineNumber++;
				
			}
		}
	}
	
	public static void parseLineToPracownicy(String line) throws ParseException {
		
		String[] danePracownika = line.split(",");
		Pracownik pracownik;
		
		if(danePracownika[4].equals("FIZ")){
			int id=Integer.parseInt(danePracownika[0]);
			String imie=danePracownika[1];
			String nazwisko=danePracownika[2];
			String stanowisko=danePracownika[3];
			
			GrupaKrwii grupa = GrupaKrwii.getValue(danePracownika[5]);
			
			
			//DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date dataUrodzenia = (Date)format.parse(danePracownika[6]);
//			Date dataUrodzenia = new Date();
			
			Rozmiar rozmiar = Rozmiar.valueOf(danePracownika[7]);
			
			pracownik = new PracownikFizyczny(id,imie,nazwisko,stanowisko,dataUrodzenia,grupa,rozmiar);
			
			pracownicy.add(pracownik);

													
		} else {
			int id=Integer.parseInt(danePracownika[0]);
			String imie=danePracownika[1];
			String nazwisko=danePracownika[2];
			String stanowisko=danePracownika[3];

			GrupaKrwii grupa = GrupaKrwii.getValue(danePracownika[5]);
			
			//DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date dataUrodzenia = format.parse(danePracownika[6]);
			
			String[] komp = danePracownika[8].split(";");
			
			Komputer komputer = new Komputer(Integer.parseInt(komp[0]),Integer.parseInt(komp[1]));
			
			pracownik = new PracownikBiurowy(id, imie, nazwisko, stanowisko, dataUrodzenia, grupa, komputer);
			
			pracownicy.add(pracownik);
			
		}
		
				
	}

	public static void showData(){
		for(Pracownik p : pracownicy){
			System.out.println("--------------------------------------------------------------------");
			System.out.println("ID:"+p.numerIdentyfikacyjny+" "+p.imie+" "+p.nazwisko+" "+p.stanowisko);
			System.out.println(p.dataUrodzenia+" "+p.grupaKrwii);
			System.out.println();
			
			//do wypisania pól z klas dziedzicz¹cych mozna uzyæ klasy akbstrakcyjnej i metody zwracaj¹cej dodatkowe parametry (w klasie pracownicy) klasy potomne nadpisz¹ t¹ metodê i zaimplementuj¹ swoje wypisywanie tych danych 
		}
	}

}
