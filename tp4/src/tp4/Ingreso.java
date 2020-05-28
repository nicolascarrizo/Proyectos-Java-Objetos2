package tp4;

public class Ingreso{

	private Integer mesDePercepcion; 
	private String concepto;
    private Integer montoPersibido;
    
	public Ingreso(Integer mesDePercepcion, String concepto, Integer montoPersibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPersibido = montoPersibido;
	}

	public Integer getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(Integer mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Integer getMontoPersibido() {
		return montoPersibido;
	}

	public void setMontoPersibido(Integer montoPersibido) {
		this.montoPersibido = montoPersibido;
	}
	
	
    
    
}
