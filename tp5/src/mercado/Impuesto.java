package mercado;

public class Impuesto extends Factura{



	public Impuesto(String nombre, Double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getMontoAPager() {
		return this.getPrecio();
	}

}
