package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoDePrimeraNecesidadTest {

	private ProductoDePrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoDePrimeraNecesidad("Leche", 8d, false);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.precioPrimeraNecesidad());
	}
}

