package pl.podstawy;

public enum Marka {
	
	OPEL(true), BMW(true), HONDA(true);
	
	boolean isCool;

	private Marka(boolean isCool) {
		this.isCool=isCool;
	}
}
