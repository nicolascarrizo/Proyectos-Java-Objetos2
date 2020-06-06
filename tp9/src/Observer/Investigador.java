package Observer;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Observer{
	
	// esta es mi clase observadora
	
	private List<Articulo> articulosRecibidos;
	private Sistema sistema;
	private TemaInteresado temaInteresado;
	
	public void actualizacionDeArticulo(Articulo articulo) {
		articulosRecibidos.add(articulo);
	}
	
	public Investigador(Sistema sistema){
		this.sistema = sistema; 
		articulosRecibidos = new ArrayList<Articulo>();
		this.temaInteresado = new TemaInteresadoNulo("Ninguno");
		
	}

	@Override
	public void setTemaInteresado(TemaInteresado temaInteresado) {
		this.temaInteresado = temaInteresado;
		
	}

	@Override
	public void cargarNuevoArticulo(Articulo articulo) {
		if(this.temaInteresado.esTemaSolicitado(articulo)) {
			this.articulosRecibidos.add(articulo);
		}
		
	}
	
	public void subscribirseAlSistema(TemaInteresado temaInteresado) {
		this.sistema.agregarInvestigadorSistema(this, temaInteresado);
	}
	
	public List<Articulo> getArticulosRecibidos() {
		return this.articulosRecibidos;
	}
	
	
	

}
