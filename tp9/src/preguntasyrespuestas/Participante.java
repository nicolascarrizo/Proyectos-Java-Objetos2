package preguntasyrespuestas;

import java.util.ArrayList;
import java.util.List;

public class Participante implements ParticipanteOb{
	
	//esta es mi clase observadora 
		
	private String usuario;
	private List<String> preguntasRecibidas;
	private List<String> notificaciones;
	private Integer cantPreguntas;
	private Servidor servidor;
	
	public Participante (String usuario) {
		this.usuario = usuario;
		this.preguntasRecibidas = new ArrayList<String>();
		this.notificaciones = new ArrayList<String>();
		this.cantPreguntas = 0;
	}

	@Override
	public void cargarPreguntas(ArrayList<String> preguntas) {
		this.preguntasRecibidas = preguntas;
		
	}
	
	@Override
	public void agregarNotificacion(String notificacion) {
		this.notificaciones.add(notificacion);
		
	}
	
	public void responderPregunta(String respuesta) throws Exception{
		if(this.servidor != null) {
			String pregunta = this.preguntasRecibidas.get(this.cantPreguntas);
			this.servidor.esRespuestaAprobable(pregunta, respuesta, this);
		}else {
			throw new Exception("Este participante no esta en el juego");
		}
	}
	
	public void entrarAPartida(Servidor servidor) throws Exception {
		this.servidor = servidor;
		this.servidor.nuevoParticipante(this);
	}
	

	public void siguientePregunta() {
		this.cantPreguntas++;
		
	}

	public void respuestaIncorrecta() {
		this.agregarNotificacion("Respuesta fue incorrecta");
		
	}

	public String getUsuario() {
		return usuario;
	}

	public List<String> getNotificaciones() {
		return notificaciones;
	}

	public List<String> getPreguntasRecibidas() {
		return preguntasRecibidas;
	}

	
	
	
	
	
	
	
	
	
	


}
