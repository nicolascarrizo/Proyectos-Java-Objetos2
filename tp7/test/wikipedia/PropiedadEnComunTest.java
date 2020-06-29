package wikipedia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTest {
	
	private Wikipedia wiki1;
	private Wikipedia wiki2;
	private Wikipedia wiki3;
	private ArrayList<Wikipediapage> pages;
	private PropiedadEnComun filtro;

	
	@BeforeEach
	public void setUp() {
		wiki1 = new Wikipedia("La Plata");
		wiki2 = new Wikipedia("Mendoza");
		wiki3 = new Wikipedia("Lomas");
		pages = new ArrayList<Wikipediapage>();
		filtro = new PropiedadEnComun();
	}
	
	@Test
	void propiedadEnComunTest() {
		pages.add(wiki2);
		pages.add(wiki3);
		
		wiki1.agregarEnInfoBox("Lomas", wiki3);
		wiki1.agregarEnInfoBox("Mendoza", wiki2);
		wiki2.agregarEnInfoBox("Lomas", wiki3);
		
		assertEquals(filtro.getSimilarPages(wiki1, pages).get(0), wiki2);
		assertEquals(filtro.getSimilarPages(wiki1, pages).size(), 1);
		
	}

}
