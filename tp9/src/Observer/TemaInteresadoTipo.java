package Observer;

public class TemaInteresadoTipo extends TemaInteresado{

	public TemaInteresadoTipo(String tema) {
		super(tema);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		return super.getTema().equals(articulo.getTipoArticulo());
	}
	

}
