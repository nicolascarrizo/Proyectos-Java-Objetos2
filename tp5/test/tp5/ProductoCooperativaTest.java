package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mercado.ProductoCooperativa;

class ProductoCooperativaTest {

	private ProductoCooperativa fideos;
	
	@BeforeEach
	public void setUp() {
		fideos = new ProductoCooperativa(20.0d, 90);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(2d, fideos.getPrecio());
		assertEquals(90, fideos.getStock());
	}
		
	@Test
	public void testPrecioDescuento() {
		assertEquals(2d, fideos.getPrecio());
	}


}
