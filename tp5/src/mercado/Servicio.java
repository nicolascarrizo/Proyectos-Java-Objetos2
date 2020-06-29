package mercado;

public class Servicio extends Factura{

	private Double cantidad;
	

	public Servicio(String nombre, Double precio, Double cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public Double getMontoAPager() {
		return this.getCantidad() * this.getPrecio();
	}
	
	
	

}
