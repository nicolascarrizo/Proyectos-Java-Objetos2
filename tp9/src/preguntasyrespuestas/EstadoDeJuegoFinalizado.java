package preguntasyrespuestas;

public class EstadoDeJuegoFinalizado implements EstadoDeJuego{

	@Override
	public void agregarParticipanteAlJuego(Servidor servidor, ParticipanteOb participante) throws Exception {
		throw new Exception("No se pueden agregar participantes, juego finalizado");
		
	}

	@Override
	public Boolean esAprobableRespuesta(Servidor servidor, String pregunta, String respuesta, Participante participante)
			throws Exception {
		throw new Exception("Juego finalizado");
	}

}
