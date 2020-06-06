package Observer;

import java.util.ArrayList;
import java.util.List;

public class Sistema implements Observable{
	
	private List<Observer> investigadores;
	private List<Articulo> artiuculos;
	
	
	public Sistema() {
		this.artiuculos = new ArrayList<Articulo>();
		this.investigadores = new ArrayList<Observer>();
		
	}
	
	public void agregarNuevoArticulo(Articulo articulo) {
		this.artiuculos.add(articulo);
		this.notificarInvestigador(articulo);
	}
	
	@Override
	public void agregarInvestigadorSistema(Observer investigador, TemaInteresado temaInteresado) {
		this.investigadores.add(investigador);
		investigador.setTemaInteresado(temaInteresado);
	}

	@Override
	public void notificarInvestigador(Articulo articulo) {
		for(Observer observer : investigadores){
			observer.cargarNuevoArticulo(articulo);
			
		}
		
	}

	@Override
	public void sacarInvestigador(Observer investigador) {
		this.investigadores.remove(investigador);
		
	}
	

}
