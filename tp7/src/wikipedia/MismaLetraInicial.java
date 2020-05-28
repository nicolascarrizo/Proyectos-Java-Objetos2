package wikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MismaLetraInicial extends Wikipedia{
	
	
	public MismaLetraInicial(String title, List<Wikipediapage> links, Map<String, Wikipediapage> infobox) {
		super(title, links, infobox);
		// TODO Auto-generated constructor stub
	}

	public List<Wikipediapage> getSimilarPages(Wikipediapage page, List<Wikipediapage> wikipedia){
		ArrayList<Wikipediapage> paginasSimilares = new ArrayList<Wikipediapage>();
		
		for(Wikipediapage p: wikipedia) {
			//charAt agarra la primer letra inicial
			if (page.getTitle().charAt(0) == p.getTitle().charAt(0)) {
				paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
		}

		
}
	


