package observer;

public class TemaInteresadoAutor extends TemaInteresado{
	
	

	public TemaInteresadoAutor(String tema) {
		super(tema);

	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		// TODO Auto-generated method stub
		return super.getTema().equals(articulo.getAutor());
	}
	
	
	

}
