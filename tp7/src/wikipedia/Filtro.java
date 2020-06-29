package wikipedia;

import java.util.ArrayList;

public abstract class Filtro {

	
	// METODO PLANTILLA
	public ArrayList<Wikipediapage> getSimilarPages(Wikipediapage page, ArrayList<Wikipediapage> wikipedia){
		ArrayList<Wikipediapage> paginasSimilares = new ArrayList<Wikipediapage>();
		
		for(Wikipediapage wikipage: wikipedia) {
			if(this.esFiltrable(page, wikipage)) {
				paginasSimilares.add(wikipage);
			}
		}
		
		return paginasSimilares;
	}
	
	// hook method
	public abstract boolean esFiltrable(Wikipediapage page, Wikipediapage wikipage);
}
