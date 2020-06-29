package deporte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaDeportivo {
	private List<Partido> listPartidos;
			// contricante
			// deporte
	private Map<String, ArrayList<Observer>> servidoresSubscriptos;
	
	public SistemaDeportivo() {
		this.listPartidos = new ArrayList<Partido>();
		this.servidoresSubscriptos = new HashMap<String, ArrayList<Observer>>();
	}
	
	public void nuevoPartido(Partido partido) {
		this.listPartidos.add(partido);
		this.notificarDeporte(partido, partido.getDeporte());
		this.notificarContricantes(partido, partido.getContrincantes());
		
	}

	private void notificarContricantes(Partido partido, List<String> contrincantes) {
		for (String string : contrincantes) {
			if(this.servidoresSubscriptos.keySet().contains(string)) {
				this.notificarServidor(this.servidoresSubscriptos.get(string), partido, string);
			}
		}
			
		
	}
	
	private void notificarDeporte(Partido partido, String deporte) {
		if(this.servidoresSubscriptos.keySet().contains(partido.getDeporte())){
			this.notificarServidor(this.servidoresSubscriptos.get(deporte), partido, deporte);
			
		}
	}
	
	
	private void notificarServidor(ArrayList<Observer> servidores, Partido partido, String depocont) {
		for(Observer servidor : servidores) {
			servidor.cargar(partido, depocont);
		}
	}
	
	public void agregarServidor(Observer servidor, String depocont) {
		if(this.servidoresSubscriptos.get(depocont) == null) {
			this.servidoresSubscriptos.put(depocont, new ArrayList<Observer>());
		}
		
		this.servidoresSubscriptos.get(depocont).add(servidor);
	}

	public List<Partido> getListPartidos() {
		return listPartidos;
	}
	
	

}
