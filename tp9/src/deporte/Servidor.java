package deporte;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observer{
	
	private List<String> intereses;
	private List<Partido> partidos;
	
	public Servidor() {
		this.intereses = new ArrayList<String>();
		this.partidos = new ArrayList<Partido>();
	}

	@Override
	public void cargar(Partido partido, String depocont) {
		if(this.intereses.contains(depocont)) {
			this.nuevoPartidoDeInteres(partido);
		}
		
	}
	
	private void nuevoPartidoDeInteres(Partido partido) {
		partidos.add(partido);
	}
	
	public void subscribiseASistemaDeportivo(SistemaDeportivo sistema, String depocont) {
		sistema.agregarServidor(this, depocont);
		this.intereses.add(depocont);
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
	
	

}
