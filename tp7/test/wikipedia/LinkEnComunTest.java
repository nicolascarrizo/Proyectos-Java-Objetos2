package wikipedia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;


public class LinkEnComunTest {
	
	private Wikipedia wiki1;
	private Wikipedia wiki2;
	private Wikipedia wiki3;
	private ArrayList<Wikipediapage> pages;
	private LinkEnComun filtro;
	
	@BeforeEach
	public void setUp() {
		wiki1 = new Wikipedia("La Plata");
		wiki2 = new Wikipedia("Mendoza");
		wiki3 = new Wikipedia("Lomas");
		pages = new ArrayList<Wikipediapage>();
		filtro = new LinkEnComun();
	}
	
	@Test
	public void linkEnComunTest() {
		pages.add(wiki2);
		pages.add(wiki3);
		
		wiki1.agregarLink(wiki3);
		wiki1.agregarLink(wiki2);
		wiki2.agregarLink(wiki3);
		
													//wiki3, wiki2
		assertEquals(filtro.getSimilarPages(wiki1, pages).get(0), wiki2);
		assertEquals(filtro.getSimilarPages(wiki1, pages).size(), 1);
										//wik1 sus links son wiki3, wiki2
	}
	
	
	
}