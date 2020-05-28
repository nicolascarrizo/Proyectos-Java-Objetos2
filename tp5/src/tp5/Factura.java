package tp5;

public abstract class Factura {

	private String nombre;
	private Double precio;
	
	public Factura(String nombre, Double precio) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void notificarAgencia() {

	}
	
	public abstract Double getMontoAPager();
}
