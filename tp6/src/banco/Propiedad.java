package banco;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private Integer valorFiscal;
	
	public Propiedad(String descripcion, String direccion, Integer valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(Integer valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
	

}
