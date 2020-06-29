package observer;

public interface Observable {
	
	public void agregarInvestigadorSistema(Observer investigador, TemaInteresado temaInteresado);
	public void notificarInvestigador(Articulo articulo);
	public void sacarInvestigador(Observer investigador);

}
