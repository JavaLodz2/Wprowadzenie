package pl.zad.old;

import java.util.Date;

public class PracownikBiurowy extends Pracownik{
	
	public PracownikBiurowy(int numerIdentyfikacyjny, String imie, String nazwisko, String stanowisko,
			Date dataUrodzenia, GrupaKrwii grupaKrwii, Komputer komputer) {
		super(numerIdentyfikacyjny, imie, nazwisko, stanowisko, dataUrodzenia, grupaKrwii);
		this.komputer=komputer;
	}

	protected Komputer komputer;

	public Komputer getKomputer() {
		return komputer;
	}

	public void setKomputer(Komputer komputer) {
		this.komputer = komputer;
	}
	
}
