package observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;


class SistemaTest{
	
	private Sistema sistema;
	private Articulo articulo;
	private Investigador investigador;
	private TemaInteresadoTitulo temaInteresadoTitulo;
	
	@BeforeEach
	public void setUp() {
		sistema = new Sistema();
		investigador = new Investigador(sistema);
		articulo = new Articulo("Introduccion a PHP", "Lucas Campos", "Universidad", "Programacion", "Argentina", "PHP");
		temaInteresadoTitulo = new TemaInteresadoTitulo("Introduccion a PHP");
		investigador.subscribirseAlSistema(temaInteresadoTitulo);
		
	}
	
	@Test
	public void notificarArticuloNuevoConInvestigadorInteresadoTest() {
		sistema.agregarNuevoArticulo(articulo);
		Integer cantidadArticulos = investigador.getArticulosRecibidos().size();
		assertEquals(1,cantidadArticulos);
	}
	
	@Test
	public void notificarArticuloNuevoConInvestigadorNoInteresadoTest() {
		Articulo articulo1 = mock(Articulo.class);
		when(articulo1.getTitulo()).thenReturn("JavaScript");
		sistema.agregarNuevoArticulo(articulo1);
		Integer cantArticulos = investigador.getArticulosRecibidos().size();
		
		assertEquals(0, cantArticulos);
				
	}
	
	
}