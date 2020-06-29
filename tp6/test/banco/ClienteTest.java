package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	private Cliente facundo;
	private Propiedad local;
	private SolicitudCreditoPersonal creditoPersonal;
	
	
	@BeforeEach
	public void setUp() {
		local = new Propiedad("Local comercial", "Cerrito", 450000);
		facundo = new Cliente("Facundo", "Carnuccio", "Bernal", 31, 60000, local);
		creditoPersonal = new SolicitudCreditoPersonal(facundo, 20000, 10);
	}

	@Test
	void sueldoNetoDeFacundoTest() {
		Integer sueldo = facundo.getSueldoNetoMensual();
		assertEquals(60000, sueldo);
	}
	
	@Test
	void valorFiscalDelLocalTest() {
		Integer valor = facundo.getPropiedad().getValorFiscal();
		assertEquals(450000, valor);
	}
	

}
