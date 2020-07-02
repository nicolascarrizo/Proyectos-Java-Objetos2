package preguntasyrespuestas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

class ServidorTest {
	
	
	private Servidor servidorJugando;
	private Map<String, String> preguntas;
	@Mock private Participante participante1;
	@Mock private Participante participante2;
	@Mock private Participante participante3;
	@Mock private Participante participante4;
	@Mock private Participante participante5;
	
	@BeforeEach
	public void setUp() throws Exception{
		servidorJugando = new Servidor();
		preguntas = new HashMap<String, String>();
		
		preguntas.put("pregunta 1", "A");
		preguntas.put("pregunta 2", "B");
		preguntas.put("pregunta 3", "C");
		preguntas.put("pregunta 4", "D");
		preguntas.put("pregunta 5", "E");
		
		participante1 = mock(Participante.class);
		participante2 = mock(Participante.class);
		participante3 = mock(Participante.class);
		participante4 = mock(Participante.class);
		participante5 = mock(Participante.class);
		
		servidorJugando.nuevoParticipante(participante1);
		servidorJugando.nuevoParticipante(participante2);
		servidorJugando.nuevoParticipante(participante3);
		servidorJugando.nuevoParticipante(participante4);
		servidorJugando.nuevoParticipante(participante5);
		servidorJugando.nuevasPreguntas(preguntas);
		
		
	}
	
	@Test
	void cantDePreguntasEnJuegoTest() {
		assertEquals(5, servidorJugando.getPreguntas().size());
	}
	
	@Test
	void cantPartcipantesEnJuegoTest() {
		assertEquals(5, servidorJugando.getParticipantes().size());
	}
	
	@Test
	void servidorDe5ParticipantesAgregoUnoNuevoTest() throws Exception{
		Participante participante6 = mock(Participante.class);
		assertThrows(Exception.class, () -> servidorJugando.nuevoParticipante(participante6));
	}
	
	@Test
	void participante4RealizaUnaRespuestaCorrectaTest() throws Exception{
		assertTrue(servidorJugando.esRespuestaAprobable("pregunta 4", "D", participante4));
	}
	
	@Test
	void participante2NoRealizaUnaRespuestaCorrectaTest() throws Exception{
		assertFalse(servidorJugando.esRespuestaAprobable("pregunta 5", "A", participante2));
	}
	
	@Test
	void laPartidaTerminaNoSePuedenAgregarJugadoresTest() throws Exception{
		Participante participante6 = mock(Participante.class);
		servidorJugando.esRespuestaAprobable("pregunta 1", "A", participante1);
		servidorJugando.esRespuestaAprobable("pregunta 2", "B", participante1);
		servidorJugando.esRespuestaAprobable("pregunta 3", "C", participante1);
		servidorJugando.esRespuestaAprobable("pregunta 4", "D", participante1);
		servidorJugando.esRespuestaAprobable("pregunta 5", "E", participante1);
		
		assertThrows(Exception.class, () -> servidorJugando.nuevoParticipante(participante6));
	}
	
	@Test
	void notificarAOtrosJugadoresRespuestaCorrectaTest() throws Exception{
		String notificacion = "La respuesta fue respondida correctamente, por otro jugador";
		servidorJugando.esRespuestaAprobable("pregunta 4", "D", participante4);
		verify(participante2).agregarNotificacion(notificacion);
	}
	
	/*
	@Test
	void notificarJugadorGanadorALosParticipantesTest() throws Exception{
		String notificacion1 = "El usuario ganador es Cristian";
		when(participante5.getUsuario()).thenReturn("Cristian");
		

		servidorJugando.esRespuestaAprobable("pregunta 1", "A", participante5);
		servidorJugando.esRespuestaAprobable("pregunta 2", "B", participante5);
		servidorJugando.esRespuestaAprobable("pregunta 3", "C", participante5);
		servidorJugando.esRespuestaAprobable("pregunta 4", "D", participante5);
		servidorJugando.esRespuestaAprobable("pregunta 5", "E", participante5);
		
		verify(participante1).agregarNotificacion(notificacion1);

	}*/
	
}
