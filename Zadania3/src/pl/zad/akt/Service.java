package pl.zad.akt;

import java.util.ArrayList;

public interface Service {

	public ArrayList<String> LoadData(String source) throws BadDataStructure;
	public void SaveData(ArrayList<String> data, String source);
	
}
