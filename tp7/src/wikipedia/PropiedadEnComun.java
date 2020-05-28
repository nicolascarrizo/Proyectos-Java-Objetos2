package wikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class PropiedadEnComun extends Wikipedia{
	
	public PropiedadEnComun(String title, List<Wikipediapage> links, Map<String, Wikipediapage> infobox) {
		super(title, links, infobox);
		// TODO Auto-generated constructor stub
	}

	public List<Wikipediapage> getSimilarPages(Wikipediapage page, List<Wikipediapage> wikipedia){
		ArrayList<Wikipediapage> paginasSimilares = new ArrayList<Wikipediapage>();
		for (Wikipediapage p: wikipedia) {
			if (page.getInfoBox().get(p) == p.getInfoBox().get(p)) {
					paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
	}
		
	}
	

