package pl.zad.akt;

import java.util.Date;

public class PracownikBiurowy extends Pracownik{
	
	private PracownikBiurowy.Komputer komp = this.new Komputer();
	
	private class Komputer{
		
		private int iloscRAM;
		private int szybkoscProcesora;
		
		public int getIloscRAM() {
			return iloscRAM;
		}
		public void setIloscRAM(int iloscRAM) {
			this.iloscRAM = iloscRAM;
		}
		public int getSzybkoscProcesora() {
			return szybkoscProcesora;
		}
		public void setSzybkoscProcesora(int szybkoscProcesora) {
			this.szybkoscProcesora = szybkoscProcesora;
		}
	}
	
	public PracownikBiurowy(int numerIdentyfikacyjny, String imie, String nazwisko, String stanowisko,
			Date dataUrodzenia, GrupaKrwii grupaKrwii, int iloscRAM, int szybkoscProcesora) {
		super(numerIdentyfikacyjny, imie, nazwisko, stanowisko, dataUrodzenia, grupaKrwii);
		//this.komputer=komputer;
		
		komp.setIloscRAM(iloscRAM);
		komp.setSzybkoscProcesora(szybkoscProcesora);
	}

	public int getRam(){
		return komp.getIloscRAM();
	}
	
	public int getProcesor(){
		return komp.getSzybkoscProcesora();
	}
	
	//protected Komputer komputer;

//	public Komputer getKomputer() {
//		return komputer;
//	}
//
//	public void setKomputer(Komputer komputer) {
//		this.komputer = komputer;
//	}
	
}
