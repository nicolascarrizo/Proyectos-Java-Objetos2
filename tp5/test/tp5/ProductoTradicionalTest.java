package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mercado.ProductoTradicional;

class ProductoTradicionalTest {

	private ProductoTradicional fideos;
	
	@BeforeEach
	public void setUp() {
		fideos = new ProductoTradicional(20.0d, 90);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(20.0d, fideos.getPrecio());
		assertEquals(90, fideos.getStock());
	}
		
	@Test
	public void testPrecioDescuento() {
		assertEquals(20.0d, fideos.getPrecio());
	}


}


