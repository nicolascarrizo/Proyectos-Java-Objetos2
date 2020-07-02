package preguntasyrespuestas;

public class EstadoJugando implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, ParticipanteOb participante) throws Exception{
		throw new Exception("El juego ya comenzo, no se pueden agregar participantes");
	}

	@Override
	public Boolean esAprobableRespuesta(Servidor servidor, String pregunta, String respuesta, Participante participante)
			throws Exception {
		
		Boolean aprobar = true;
		
		if(servidor.getPreguntas().get(pregunta).equals(respuesta)) {
			aprobar = true;
			participante.siguientePregunta();
			servidor.sumarPuntajeParticipante(participante);
			servidor.notificarRespuestaCorrectaAParticipantes();
		}else {
			participante.respuestaIncorrecta();
			aprobar = false;
		}
		
		return aprobar;
		
	}

}
