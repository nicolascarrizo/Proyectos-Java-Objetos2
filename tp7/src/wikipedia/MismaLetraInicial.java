package wikipedia;

public class MismaLetraInicial extends Filtro{

	@Override
	public boolean esFiltrable(Wikipediapage page, Wikipediapage wikipage) {
		return page.getTitle().toLowerCase().charAt(0) == wikipage.getTitle().toLowerCase().charAt(0);
	}
	
	

		
}
	


