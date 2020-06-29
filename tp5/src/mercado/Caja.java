package mercado;

import java.util.ArrayList;

public class Caja implements Agencia{
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	private Integer id;

	
	public Caja(Integer id) {
		super();
		this.setId(id);
	}
	
	

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
	public void registrarProducto(Producto producto) {
		this.productos.add(producto);
		producto.decrementarStock();
		
	}
	
	public void registrarPago(Factura factura) {
		this.facturas.add(factura);
		factura.notificarAgencia();
	}
	
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public int getCantidadDeFacturas() {
		return this.facturas.size();
	}
	
	public int getCantidadDePagos() {
		return this.productos.size() + this.facturas.size();
	}
	
	public double getMontoTotalAPagar() {
		double sumaPrecios = 0;
		for (Producto prod : this.productos) {
			 sumaPrecios += prod.getPrecio();
		}
		for (Factura fac : this.facturas) {
			 sumaPrecios += fac.getMontoAPager();
		}
		return sumaPrecios;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	

}
