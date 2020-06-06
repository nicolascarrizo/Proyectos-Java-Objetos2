package Observer;


public class TemaInteresadoNulo extends TemaInteresado{

	public TemaInteresadoNulo(String tema) {
		super("Ninguno");
	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		return false;
	}
}
