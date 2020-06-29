package observer;

public class TemaInteresadoClave extends TemaInteresado{

	public TemaInteresadoClave(String tema) {
		super(tema);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		// TODO Auto-generated method stub
		return super.getTema().equals(articulo.getPalabraClave());
	}

}
