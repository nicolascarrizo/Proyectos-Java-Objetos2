package wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTest {
	
	
	private Wikipedia wiki1;
	private Wikipedia wiki2;
	private Wikipedia wiki3;
	private Wikipedia wiki4;
	private List<Wikipediapage> link;
	private Map<String, Wikipediapage> infobox;
	private MismaLetraInicial mismaLetra;
	private ArrayList<Wikipediapage> paginasWiki = new ArrayList<Wikipediapage>();
	private ArrayList<Wikipediapage> paginasWiki2 = new ArrayList<Wikipediapage>();
	

	
	@BeforeEach
	public void setUp() {
		
		
		
			
	}
	@Test
	public void mismaLetraInicialTest(){
		

		wiki1 = new Wikipedia("Naturaleza", link, infobox);
		wiki2 = new Wikipedia("La Plata", link, infobox);
		wiki3 = new Wikipedia("Lucas Art", link, infobox);
		wiki4 = new Wikipedia("Lobo", link, infobox);
		
		paginasWiki.add(wiki1);
		paginasWiki.add(wiki2);
		paginasWiki.add(wiki3);
		
		paginasWiki2.add(wiki2);
		paginasWiki2.add(wiki3);
		
		assertEquals(paginasWiki2, mismaLetra.getSimilarPages(wiki4, paginasWiki));
		
	}

}
