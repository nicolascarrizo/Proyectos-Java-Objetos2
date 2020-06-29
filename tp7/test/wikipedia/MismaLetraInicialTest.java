package wikipedia;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MismaLetraInicialTest {
	
	
	private Wikipedia wiki1;
	private Wikipedia wiki2;
	private Wikipedia wiki3;
	private Wikipedia wiki4;
	private MismaLetraInicial filtro;

	
	@BeforeEach
	public void setUp() {
		wiki1 = new Wikipedia("La Plata");
		wiki2 = new Wikipedia("Mendoza");
		wiki3 = new Wikipedia("Lomas");
		filtro = new MismaLetraInicial();

			
	}
	@Test
	public void mismaLetraInicialTest(){
		ArrayList<Wikipediapage> pages = new ArrayList<Wikipediapage>();
		
		pages.add(wiki1);
		pages.add(wiki2);
		pages.add(wiki3);
		
		assertEquals(filtro.getSimilarPages(wiki1, pages).size(), 2);
		
	}

}
