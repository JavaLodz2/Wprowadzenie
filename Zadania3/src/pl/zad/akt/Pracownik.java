package pl.zad.akt;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pracownik {
	
	protected int numerIdentyfikacyjny;
	protected String imie, nazwisko, stanowisko;
	protected Date dataUrodzenia;
	protected GrupaKrwii grupaKrwii;
	protected ArrayList<String> listaZadan = new ArrayList<String>();
	
	/**
	 * @param numerIdentyfikacyjny
	 * @param imie
	 * @param nazwisko
	 * @param stanowisko
	 * @param dataUrodzenia
	 * @param grupaKrwii
	 * @param dzial
	 */
	public Pracownik(int numerIdentyfikacyjny, String imie, String nazwisko, String stanowisko, Date dataUrodzenia,
			GrupaKrwii grupaKrwii) {
		super();
		this.numerIdentyfikacyjny = numerIdentyfikacyjny;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stanowisko = stanowisko;
		this.dataUrodzenia = dataUrodzenia;
		this.grupaKrwii = grupaKrwii;
		
	}
	
	public String toString(){
		return ("ID:"+this.numerIdentyfikacyjny+" Imiê i nazwisko:"+this.imie + " " + this.nazwisko);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numerIdentyfikacyjny;
		return result;
	}

	//@Override
	public boolean equals(int obj) {
		
		if(this.numerIdentyfikacyjny==obj)
			return true;
		else return false;
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Pracownik other = (Pracownik) obj;
//		if (numerIdentyfikacyjny != other.numerIdentyfikacyjny)
//			return false;
//		return true;
	}
	
	public void addTask(String task){
		this.listaZadan.add(task);
	}
	
	public void clearTaskList(){
		this.listaZadan.clear();
	}
	
	public ArrayList<String> getTasks(){
		return this.listaZadan;
	}
	
	//public abstract String getValues(String field);

}


