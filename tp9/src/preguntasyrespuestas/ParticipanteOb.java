package preguntasyrespuestas;

import java.util.ArrayList;

public interface ParticipanteOb {
	
	// observer 

	void cargarPreguntas(ArrayList<String> preguntas);

	void agregarNotificacion(String notificacion);

}
