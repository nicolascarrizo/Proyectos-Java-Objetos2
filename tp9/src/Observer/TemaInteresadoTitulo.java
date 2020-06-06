package Observer;

public class TemaInteresadoTitulo extends TemaInteresado{

	public TemaInteresadoTitulo(String tema) {
		super(tema);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean esTemaSolicitado(Articulo articulo) {
		
		return super.getTema().equals(articulo.getTitulo());
	}
	
	
	
	

}
