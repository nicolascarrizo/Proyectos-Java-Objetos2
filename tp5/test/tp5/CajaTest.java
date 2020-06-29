package tp5;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mercado.Caja;
import mercado.Impuesto;
import mercado.ProductoCooperativa;
import mercado.ProductoTradicional;
import mercado.Servicio;


class CajaTest {
	
	private Servicio gas;
	private Impuesto ganancias;
	private ProductoCooperativa leche;
	private ProductoTradicional galletas;
	private Caja caja;
	
	
	@BeforeEach
	public void setUp() {
		gas = new Servicio("gas", 75d, 4d);
		ganancias = new Impuesto("ganancia", 20d);
		leche = new ProductoCooperativa(40d, 20);
		galletas = new ProductoTradicional(60d, 10);
		caja = new Caja(1);
	}

	@Test
	public void testConstructor() {
		assertEquals(1, caja.getId());
		assertEquals(0, caja.getCantidadDeProductos());
		assertEquals(0, caja.getCantidadDePagos());
		assertEquals(0, caja.getCantidadDeFacturas());
	}
	
	@Test
	public void testDeRegistrarCantidades() {
		caja.registrarProducto(leche);
		caja.registrarProducto(galletas);
		caja.registrarPago(gas);
		caja.registrarPago(ganancias);
		assertEquals(4, caja.getCantidadDePagos());
		assertEquals(2, caja.getCantidadDeProductos());
		assertEquals(2, caja.getCantidadDeFacturas());
	}


}