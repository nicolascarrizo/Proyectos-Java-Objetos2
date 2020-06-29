package wikipedia;


import java.util.ArrayList;
import java.util.HashMap;



public interface Wikipediapage {

	public String getTitle();
	
	public ArrayList<Wikipediapage> getLink();
	
	public HashMap<String, Wikipediapage> getInfoBox();
}
