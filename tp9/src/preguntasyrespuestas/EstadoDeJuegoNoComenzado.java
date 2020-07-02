package preguntasyrespuestas;

public class EstadoDeJuegoNoComenzado implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, ParticipanteOb participante) throws Exception {
		if(servidor.getParticipantes().size() != 5) {
			servidor.agregarParticipanteAlServidor(participante);
			servidor.participanteConPuntajeInicial(participante);
			
			
		}else {
			throw new Exception("No se puede agregar, participantes completos");
		}
		
	}

	@Override
	public Boolean esAprobableRespuesta(Servidor servidor, String pregunta, String respuesta, Participante participante)
			throws Exception {
		throw new Exception("No hay participantes"); 
	}

}
