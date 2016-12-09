package pl.zad.akt;

import java.util.Iterator;

public enum GrupaKrwii {

	A, AB, B, ZERO;
	
	//napisaæ metodê do zwracania enuma na podst. stringa
	public static GrupaKrwii getValue(String grupa){
		
		if(grupa.equals("0")){
			return ZERO;
		}
		
		for(GrupaKrwii gk : GrupaKrwii.values()){
			if(grupa.equals(gk.toString())){
				return gk;
			}
		}
		
		return null;
	}
}


