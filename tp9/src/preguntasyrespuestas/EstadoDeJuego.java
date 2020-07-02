package preguntasyrespuestas;

public interface EstadoDeJuego {

	void agregarParticipanteAlJuego(Servidor servidor, ParticipanteOb participante) throws Exception;

	Boolean esAprobableRespuesta(Servidor servidor, String pregunta, String respuesta, Participante participante) throws Exception;

}
