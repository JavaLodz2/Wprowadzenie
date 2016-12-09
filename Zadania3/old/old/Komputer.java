package pl.zad.old;

public class Komputer {
	
	private int iloscRAM;
	private int szybkoscProcesora;
	
	/**
	 * @param iloscRAM
	 * @param szybkoscProcesora
	 */
	public Komputer(int iloscRAM, int szybkoscProcesora) {
		super();
		this.iloscRAM = iloscRAM;
		this.szybkoscProcesora = szybkoscProcesora;
	}
	
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
