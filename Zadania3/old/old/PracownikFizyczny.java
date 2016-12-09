package pl.zad.old;

import java.util.Date;

public class PracownikFizyczny extends Pracownik {

	public PracownikFizyczny(int numerIdentyfikacyjny, String imie, String nazwisko, String stanowisko,
			Date dataUrodzenia, GrupaKrwii grupaKrwii, Rozmiar rozmiar) {
		super(numerIdentyfikacyjny, imie, nazwisko, stanowisko, dataUrodzenia, grupaKrwii);
		this.rozmiar = rozmiar;
	}

	protected Rozmiar rozmiar;

	public Rozmiar getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(Rozmiar rozmiar) {
		this.rozmiar = rozmiar;
	}
	
//	public PracownikFizyczny(int numerIdentyfikacyjny, String imie, String nazwisko, String stanowisko, Date dataUrodzenia,
//			GrupaKrwii grupaKrwii, Dzial dzial, Rozmiar rozmiar) {
//		
//		this.numerIdentyfikacyjny = numerIdentyfikacyjny;
//		this.imie = imie;
//		this.nazwisko = nazwisko;
//		this.stanowisko = stanowisko;
//		this.dataUrodzenia = dataUrodzenia;
//		this.grupaKrwii = grupaKrwii;
//		this.dzial = dzial;
//		this.rozmiar = rozmiar;
//	}
}
