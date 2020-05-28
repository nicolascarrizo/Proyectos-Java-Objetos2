package wikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class LinkEnComun extends Wikipedia{
	
	public LinkEnComun(String title, List<Wikipediapage> links, Map<String, Wikipediapage> infobox) {
		super(title, links, infobox);
		// TODO Auto-generated constructor stub
	}

	public List<Wikipediapage> getSimilarPages(Wikipediapage page, List<Wikipediapage> wikipedia){
		
		ArrayList<Wikipediapage> paginasSimilares = new ArrayList<Wikipediapage>();
		
		for(Wikipediapage p: wikipedia) {
			if(this.tienenLinksEnComun(p, page)) {
				paginasSimilares.add(p);
			}
		}
		return paginasSimilares;
		
	}
	
	public Boolean tienenLinksEnComun(Wikipediapage p, Wikipediapage page) {
		
			Boolean tienenMismaPag = false;
			for (Wikipediapage l:page.getLink()) {
				tienenMismaPag = tienenMismaPag || p.getLink().contains(l);
			}
			return tienenMismaPag;
		}
		
	}
	
	
