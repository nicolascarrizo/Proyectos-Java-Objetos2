package observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import observer.Articulo;
import observer.Investigador;
import observer.Sistema;
import observer.TemaInteresadoTipo;

class InvestigadorTest {


	private Investigador investigador;
	@Mock private Sistema sistema;
	@Mock private Articulo articulo;
	@Mock private TemaInteresadoTipo tipoInteresado;
	
	@BeforeEach
	public void setUp() {
		sistema = mock(Sistema.class);
		tipoInteresado = mock(TemaInteresadoTipo.class);
		investigador = new Investigador(sistema);
		articulo = mock(Articulo.class);
	}
	
	@Test
	void cargarArticuloNuevoTest() {
		investigador.actualizacionDeArticulo(articulo);
		verify(sistema).agregarNuevoArticulo(articulo);
	}
	
	@Test
	void subscribirseASistemaTest() {
		investigador.subscribirseAlSistema(tipoInteresado);
		verify(sistema).agregarInvestigadorSistema(investigador, tipoInteresado);
	}

}
