package wikipedia;

import java.util.ArrayList;



public class LinkEnComun extends Filtro{
	
	
	//metodo concreto 
	@Override
	public boolean esFiltrable(Wikipediapage page, Wikipediapage wikipage) {
		ArrayList<Wikipediapage> links = new ArrayList<Wikipediapage>(page.getLink());
		boolean linkEnComun = wikipage.getLink().contains(links.get(0));
		links.remove(0);
		while(!linkEnComun && !links.isEmpty()) {
			linkEnComun = wikipage.getLink().contains(links.get(0));
			links.remove(0);
		}
		
		return linkEnComun;
		
	}
		
}
	
	
