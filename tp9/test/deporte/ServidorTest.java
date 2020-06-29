package deporte;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorTest {
	
	private SistemaDeportivo sistema;
	private Partido partido;
	private Servidor servidor;
	
	
	@BeforeEach
	public void setUp() {
		
		this.sistema = new SistemaDeportivo();
		this.partido = new Partido("Ganador Messi", List.of("Kun", "Mascherano", "Cristiano", "Messi"), "Futbol");
		this.servidor = new Servidor();
	}

	@Test
	void servidorInteresadoPorDeporteTest() {
		servidor.subscribiseASistemaDeportivo(sistema, "Futbol");
		sistema.nuevoPartido(partido);
		
		assertTrue(servidor.getPartidos().contains(partido));
	}
	
	@Test
	void servidorInteresadoPorDeporteNatacionTest() {
		servidor.subscribiseASistemaDeportivo(sistema, "Natacion");
		sistema.nuevoPartido(partido);
		assertFalse(servidor.getPartidos().contains(partido));
	}
	
	@Test
	void cantDeInteresesDelServidorTest() {
		servidor.subscribiseASistemaDeportivo(sistema, "Messi");
		servidor.subscribiseASistemaDeportivo(sistema, "Tenis");
		servidor.subscribiseASistemaDeportivo(sistema, "Golf");
		servidor.subscribiseASistemaDeportivo(sistema, "Futbol");
		
		assertEquals(4, servidor.getIntereses().size());
		
		
	}
	
	@Test
	void cantDePartidosDelServidorTest() {
		servidor.subscribiseASistemaDeportivo(sistema, "Futbol");
		servidor.subscribiseASistemaDeportivo(sistema, "Messi");
		sistema.nuevoPartido(partido);
		assertEquals(2, servidor.getPartidos().size());
	}

}
