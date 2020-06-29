package wikipedia;

import java.util.ArrayList;
import java.util.HashMap;


public class Wikipedia implements Wikipediapage{
	
	private String title;
	private ArrayList<Wikipediapage> links;
	private HashMap<String, Wikipediapage> infobox;
	
	

	public Wikipedia(String title) {
		this.title = title;
		this.links = new ArrayList<Wikipediapage>();
		this.infobox = new HashMap<String, Wikipediapage>();
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public ArrayList<Wikipediapage> getLink() {
		// TODO Auto-generated method stub
		return links;
	}

	@Override
	public HashMap<String, Wikipediapage> getInfoBox() {
		// TODO Auto-generated method stub
		return infobox;
	}
	
	public void agregarLink(Wikipediapage page) {
		links.add(page);
	}
	
	public void agregarEnInfoBox(String propiedadK, Wikipediapage propiedadV) {
		this.infobox.putIfAbsent(propiedadK, propiedadV);
	}
	
	
	
	

}
