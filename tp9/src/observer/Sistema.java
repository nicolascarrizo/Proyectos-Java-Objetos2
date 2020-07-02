package observer;

import java.util.ArrayList;
import java.util.List;

public class Sistema implements Observable{
	
	// subject - SUJETO -- Sujeto concreto
	
	private List<Observer> investigadores;
	private List<Articulo> artiuculos;
	
	
	public Sistema() {
		this.artiuculos = new ArrayList<Articulo>();
		this.investigadores = new ArrayList<Observer>();
		
		
	}
	
	public void agregarNuevoArticulo(Articulo articulo) {
		this.artiuculos.add(articulo);
		// notificar a todos los observadores 
		this.notificarInvestigador(articulo);
	}
	
	
	
	public List<Observer> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Observer> observer) {
		this.investigadores = observer;
	}

	@Override
	public void agregarInvestigadorSistema(Observer investigador, TemaInteresado temaInteresado) {
		this.investigadores.add(investigador);
		investigador.setTemaInteresado(temaInteresado);
	}

	@Override
	public void notificarInvestigador(Articulo articulo) {
		for(Observer observer : investigadores){
			//update , actualiza los estados 
			observer.cargarNuevoArticulo(articulo);
			
		}
		
	}

	@Override
	public void sacarInvestigador(Observer investigador) {
		this.investigadores.remove(investigador);
		
	}
	

}
