package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mercado.Impuesto;


class ImpuestoTest {

	private Impuesto iva;
	
	@BeforeEach
	public void setUp() {
		iva = new Impuesto("iva", 90d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(90, iva.getPrecio());
	}
		
	@Test
	public void testMontoAPagar() {
		assertEquals(90, iva.getMontoAPager());
	}

}

