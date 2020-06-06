package Observer;

public abstract class TemaInteresado {

	private String tema;

	public TemaInteresado(String tema) {
		super();
		this.tema = tema;
	}
	
	public Object getTema() {
		return this.tema;
	}
	
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public abstract Boolean esTemaSolicitado(Articulo articulo);
	
	
}
