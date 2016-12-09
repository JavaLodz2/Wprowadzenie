package pl.zad.old;

import java.util.Date;

public class Pracownik {
	
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
	protected int numerIdentyfikacyjny;
	protected String imie, nazwisko, stanowisko;
	protected Date dataUrodzenia;
	protected GrupaKrwii grupaKrwii;
	

}


