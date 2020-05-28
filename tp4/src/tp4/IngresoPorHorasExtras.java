package tp4;

public class IngresoPorHorasExtras extends Ingreso{
	 
	private Integer cantHorasExtras;

	public IngresoPorHorasExtras(Integer mesDePercepcion, String concepto, Integer montoPersibido,
			Integer cantHorasExtras) {
		super(mesDePercepcion, concepto, montoPersibido);
		this.cantHorasExtras = cantHorasExtras;
	}

	public Integer getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(Integer cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	
}
