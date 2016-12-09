package pl.zad.akt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileService implements Service{

	private BufferedReader br;

	@Override
	public ArrayList<String> LoadData(String source) throws BadDataStructure {
		ArrayList<String> data= new ArrayList<String>();
		
		 try{
			br = new BufferedReader(new FileReader(source));
			boolean isFirstLine = true;
			String line;
			
			while ((line = br.readLine()) != null) {
				if(!isFirstLine){
					if(line.split(",").length>9) throw new BadDataStructure();
					data.add(line);
				}
				isFirstLine=false;
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Nie znaleziono pliku.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Blad input/output.");
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public void SaveData(ArrayList<String> data, String source) {
	//zapis do pliku.
		String header = "numerIdentyfikacyjny,imie,nazwisko,stanowisko,dział,grupa krwi,data urodzenia,rozmiar,komputer(szybkość procesora[MHz];RAM[GB])";
		
	}

}
