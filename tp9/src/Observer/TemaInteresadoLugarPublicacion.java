package Observer;

public class TemaInteresadoLugarPublicacion extends TemaInteresado{

	public TemaInteresadoLugarPublicacion(String tema) {
		super(tema);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		// TODO Auto-generated method stub
		return super.getTema().equals(articulo.getLugarPublicacion());
	}
	

}
