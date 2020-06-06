package Observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;



class SistemaTest {
	
	private Sistema sistema;
	private Articulo articulo;
	private Investigador investigador;
	private TemaInteresadoTitulo temaInteresadoTitulo;
	//private Observer investigador;
	
	@Before
	public void setUp(){
		sistema = new Sistema();
		investigador = new Investigador(sistema);
		articulo = new Articulo("Introduccion a PHP", "Lucas Campos", "Universidad", "Programacion", "Argentina", "PHP");
		temaInteresadoTitulo = new TemaInteresadoTitulo("Introduccion a PHP");
		investigador.subscribirseAlSistema(temaInteresadoTitulo);
	}

	@Test
	public void notificarNuevoArticuloTest() {
		sistema.agregarNuevoArticulo(articulo);
		Integer cantArticulosInvestigador = investigador.getArticulosRecibidos().size();
		
		assertEquals(cantArticulosInvestigador,1);
		
	
	}
	
	@Test
	public void articuloNoInteresadoPorInvestigadorTest() {
		Articulo articulo1 = mock(Articulo.class);
		when(articulo1.getTitulo()).thenReturn("JavaScript");
		sistema.agregarNuevoArticulo(articulo1);
		Integer cantArt = investigador.getArticulosRecibidos().size();
		assertEquals(cantArt,0);
	}
	


}
