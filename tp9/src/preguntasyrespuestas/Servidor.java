package preguntasyrespuestas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Servidor {

	
	// subject - SUJETO
	
	private Set<ParticipanteOb> participantes;
	private Map<String, String> preguntas;
	private Map <ParticipanteOb, Integer> puntajes;
	private EstadoDeJuego estado;
	
	public Servidor() {
		this.participantes = new HashSet<ParticipanteOb>();
		this.preguntas = new HashMap<String, String>();
		this.puntajes = new HashMap<ParticipanteOb, Integer>();
		this.estado = new EstadoDeJuegoNoComenzado();
	}
	
	public void nuevoParticipante(ParticipanteOb participante) throws Exception{
		this.estado.agregarParticipanteAlJuego(this, participante);
	}
	
	public Boolean esRespuestaAprobable(String pregunta, String respuesta, Participante participante) throws Exception{
		return this.estado.esAprobableRespuesta(this, pregunta, respuesta, participante);
	}
	
	public void nuevasPreguntas(Map<String, String> preguntas) {
		this.preguntas = preguntas;
		this.empezarJuego();
				
	}

	private void empezarJuego() {
		this.estado = new EstadoJugando();
		//notificar a todos los observadores
		this.notificarParticipantes();
		
	}
	
	public void sumarPuntajeParticipante(Participante participante) {
		//dado un participante suma puntaje si respondio bien, cuando llega a 5 respuestas correctas el juego finaliza
		Integer puntajeParticipante = this.puntajes.get(participante);
		this.puntajes.put(participante, puntajeParticipante + 1);
		if(this.puntajes.get(participante) == 5) {
			this.juegoFinalizado();
			this.notificarGanador(participante);
		}
		
	}

	private void notificarParticipantes() {
		//notifica a todos los participantes con las preguntas para el juego
		ArrayList<String> preguntas = new ArrayList<String>(this.preguntas.keySet());
		for(ParticipanteOb participante : participantes) {
			//update , actualiza los estados 
			participante.cargarPreguntas(preguntas);
		}
		
	}
	
	
	private void notificarGanador(Participante participante) {
		String notificacion = "El usuario ganador es" + participante.getUsuario();
		
		for(ParticipanteOb participanteJuego : participantes) {
			participanteJuego.agregarNotificacion(notificacion);
		}
		
	}
	
	public void notificarRespuestaCorrectaAParticipantes() {
		String notificacion = "La respuesta fue respondida correctamente, por otro jugador";
		for (ParticipanteOb participante : this.participantes) {
			participante.agregarNotificacion(notificacion);
		}
		
	}
	
	
	

	public void participanteConPuntajeInicial(ParticipanteOb participante) {
		this.puntajes.put(participante, 0);
		
	}

	private void juegoFinalizado() {
		this.estado = new EstadoDeJuegoFinalizado();
		
	}

	
	public void agregarParticipanteAlServidor(ParticipanteOb participante) {
		participantes.add(participante);
	}
	
	
	public Set<ParticipanteOb> getParticipantes() {
		return participantes;
	}

	public Map<String, String> getPreguntas() {
		return preguntas;
	}

	public Map<ParticipanteOb, Integer> getPuntajes() {
		return puntajes;
	}

	public EstadoDeJuego getEstado() {
		return estado;
	}

	
	

}
