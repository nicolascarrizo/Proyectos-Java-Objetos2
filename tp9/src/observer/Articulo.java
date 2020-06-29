package observer;

public class Articulo {
	
	private String titulo;
	private String autor;
	private String filiacion;
	private String tipoArticulo;
	private String lugarPublicacion;
	private String palabraClave;
	
	public Articulo(String titulo, String autor, String filiacion, String tipoArticulo, String lugarPublicacion,
			String palabraClave) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.filiacion = filiacion;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabraClave = palabraClave;
	}

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}


	public String getLugarPublicacion() {
		return lugarPublicacion;
	}


	public String getPalabraClave() {
		return palabraClave;
	}

	
	

}
