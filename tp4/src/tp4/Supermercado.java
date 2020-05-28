package tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	

	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		productos = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Integer getCantidadDeProductos() {
		Integer contador = 0;
		for (Integer x=0;x<productos.size();x++) {
			 contador++;
		}
		return contador;
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = 0.0;
		for (Integer x=0;x<productos.size();x++) {
			 precioTotal = precioTotal + productos.get(x).getPrecio();
		}
		return precioTotal;
	}

}
	
	
	
	

