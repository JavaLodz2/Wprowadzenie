package pl.zad.akt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Program {

	private static List<Pracownik> pracownicy = new ArrayList<Pracownik>();
	private static DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	//true - file
	//false - db
	static boolean dataProvider = true;
	
	public static void main(String[] args) {
		
		String dataFile = "C:\\Users\\RENT\\workspace\\Zadania3\\src\\pl\\zad\\akt\\dane_pracownikow.txt";
		String command;
		
		importData(dataFile);

		while(true){
			emptyLine();
			command = StringHelper.getString("ID | KONIEC | ZADANIA | PRACOWNICY");
			if (command.equalsIgnoreCase("koniec")){
				break;	
			} 
			else if (command.equalsIgnoreCase("zadania")){
				showTasks();
			} else if (command.equalsIgnoreCase("pracownicy")){
				showData();
			}else{
				try {
					int id=Integer.parseInt(command);
					askWhatToDo(id);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.err.println("B³¹d. Nie poda³eœ ID.");
				}
			}
		}	
	}
	
	public static void importData(String fileName) {

		FileService fs = null;
		
		if(dataProvider){			
			fs = new FileService();
		} 
		if(fs!=null){
			ArrayList<String> temp;
				temp = new ArrayList<String>();
			try {
				temp = fs.LoadData(fileName);
				for(String s : temp) parseLineToPracownicy(s);
			} catch (BadDataStructure e) {
				// TODO Auto-generated catch block
				System.err.println("Struktura pliku jest z³a.");
				e.printStackTrace();
			}
		}
	}
	
	public static void parseLineToPracownicy(String line) {
		
		String[] danePracownika = line.split(",");
		Pracownik pracownik;
		
		int id=Integer.parseInt(danePracownika[0]);
		String imie=danePracownika[1];
		String nazwisko=danePracownika[2];
		String stanowisko=danePracownika[3];
		GrupaKrwii grupa = GrupaKrwii.getValue(danePracownika[5]);
		Date dataUrodzenia = null;
		try {
			dataUrodzenia = (Date)format.parse(danePracownika[6]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(danePracownika[4].equals("FIZ")){
						
			Rozmiar rozmiar = Rozmiar.valueOf(danePracownika[7]);			
			pracownik = new PracownikFizyczny(id,imie,nazwisko,stanowisko,dataUrodzenia,grupa,rozmiar);
			pracownicy.add(pracownik);
													
		} else {
	
			String[] komp = danePracownika[8].split(";");
			int iloscRAM=Integer.parseInt(komp[0]);
			int szybkoscProcesora=Integer.parseInt(komp[1]);
			//Komputer komputer = new Komputer(Integer.parseInt(komp[0]),Integer.parseInt(komp[1]));
			//pracownik = new PracownikBiurowy(id, imie, nazwisko, stanowisko, dataUrodzenia, grupa, komputer);
			
			pracownik = new PracownikBiurowy(id, imie, nazwisko, stanowisko, dataUrodzenia, grupa, iloscRAM, szybkoscProcesora);
			
			pracownicy.add(pracownik);
			
		}		
	}

	public static void showData(){
		for(Pracownik p : pracownicy){
			
			emptyLine();
			System.out.println("ID:"+p.numerIdentyfikacyjny);
			System.out.println(p.imie+" "+p.nazwisko);
			System.out.println("Stanowisko: "+p.stanowisko);
			System.out.println("Data urodzenia: "+p.dataUrodzenia+" "+p.grupaKrwii);
			System.out.println("Grupa krwii: "+p.grupaKrwii);
			if(p instanceof PracownikBiurowy){
				
				//System.out.println("Komputer posiada RAM :"+((PracownikBiurowy) p).getKomputer().getIloscRAM());
				//System.out.println("Komputer ma procesor :"+((PracownikBiurowy) p).getKomputer().getSzybkoscProcesora());
				
				System.out.println("Komputer posiada RAM :"+((PracownikBiurowy) p).getRam());
				System.out.println("Komputer ma procesor :"+((PracownikBiurowy) p).getProcesor());
				
			}
			else{
				System.out.println("Rozmiar ubrania roboczego : "+((PracownikFizyczny) p).getRozmiar());
			}				
		}
	}

	public static void askWhatToDo(int ID){
		String command;
		Pracownik pracownik = null;
		
		for(Pracownik p : pracownicy){
			if(p.equals(ID)){
				pracownik = p;
				break;
			}
		}
		
		if(pracownik!=null){
			command = StringHelper.getString("Zadania? [CZYSC]");
			if (command.equalsIgnoreCase("czysc")){
				System.out.println("<- Czyszczenie zadañ");
				pracownik.clearTaskList();
			} else if (command.equalsIgnoreCase("")){
				System.out.println("<- Powrót");
			}else{	
				pracownik.addTask(command);
			}			
		} else System.out.println("Z³y ID.");
	}

	public static void showTasks(){
		System.out.println("Lista zadañ dla pracowników.");
		for(Pracownik p : pracownicy){
			if(!p.getTasks().isEmpty()){
				System.out.println(p.toString());
				for(String t : p.getTasks()){
					System.out.println(t);
				}
				emptyLine();
			}		
		}
	}

	public static void emptyLine(){
		System.out.println("--------------------------------------------------------------------");
	}
}
