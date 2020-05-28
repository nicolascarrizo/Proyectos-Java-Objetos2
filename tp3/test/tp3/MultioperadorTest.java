package tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	
	private Multioperador multioperador;
	
	
	@BeforeEach
	public void setUp(){
		
		multioperador = new Multioperador();
		
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		
	}
	
	@Test
	public void testSumarNumeros() {
		
	
		int sumaNumeros = multioperador.sumarNumeros();
		assertEquals(sumaNumeros, 9);
		
		
	}
	
	@Test
	public void testRestarNumeros() {
		int restaNumeros = multioperador.restaNumeros();
		assertEquals(restaNumeros, -9);
		
	}
	
	@Test
	public void testMultiplicarNumeros() {
		int multiNumeros = multioperador.multiplicarNumeros();
		assertEquals(multiNumeros, 15);
		
	}


}
