package wikipedia;

import java.util.ArrayList;


public class PropiedadEnComun extends Filtro{

	@Override
	public boolean esFiltrable(Wikipediapage page, Wikipediapage wikipage) {
		ArrayList<String> infobox = new ArrayList<String>();
		infobox.addAll(page.getInfoBox().keySet());
		
		boolean propiedadEnComun = wikipage.getInfoBox().keySet().contains(infobox.get(0));
		infobox.remove(0);
		
		while(!propiedadEnComun && !infobox.isEmpty()){
			propiedadEnComun = wikipage.getInfoBox().keySet().contains(infobox.get(0));
			infobox.remove(0);
		}
		
		return propiedadEnComun;
		
	}
	

}

